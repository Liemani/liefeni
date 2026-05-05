package agent.debug.tool;

import agent.Job;

import haven.GAttrib;
import haven.Gob;
import haven.Speaking;
import lmi.AgentContext;
import lmi.Api;
import lmi.Array;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class DescribeGobTextSourceJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.alert("텍스트를 확인할 gob 을 클릭해 주세요");
    Gob gob = Api.getGob();

    Api.message("gob.id: " + gob.id());
    Api.message("gob.resname: " + gob.resourceName());
    Api.message("gob.buddyName: " + gob.buddyName());
    Api.message("gob.buddyGroup: " + gob.buddyGroup());

    _describeSpeaking(gob);
    _describeAttributes(gob);
    _describeOverlays(gob);
    _describeDrawable(gob);
  }

  public static String info() {
    return "Describes possible text sources attached to a clicked gob.";
  }

  private static void _describeSpeaking(Gob gob) {
    Speaking speaking = gob.getattr(Speaking.class);
    if (speaking == null) {
      Api.message("Speaking: null");
      return;
    }

    Api.message("Speaking.class: " + speaking.getClass().getName());
    Api.message("Speaking.text: " + _readTextField(speaking));
  }

  private static void _describeAttributes(Gob gob) {
    try {
      Field field = Gob.class.getDeclaredField("attr");
      field.setAccessible(true);
      Object raw = field.get(gob);
      if (!(raw instanceof Map<?, ?>)) {
        Api.message("attr: " + String.valueOf(raw));
        return;
      }

      Map<?, ?> attrMap = (Map<?, ?>)raw;
      Api.message("attr.count: " + attrMap.size());
      int index = 0;
      for (Object entry : attrMap.values()) {
        if (!(entry instanceof GAttrib)) continue;
        GAttrib attr = (GAttrib)entry;
        Api.message("attr[" + index + "].class: " + attr.getClass().getName());
        _describeTextCandidates("attr[" + index + "]", attr);
        ++index;
      }
    } catch (Exception e) {
      Api.message("attr inspect failed: " + e.getClass().getSimpleName());
    }
  }

  private static void _describeOverlays(Gob gob) {
    int index = 0;
    for (Gob.Overlay overlay : gob.ols) {
      Api.message("overlay[" + index + "].id: " + overlay.id);
      Api.message("overlay[" + index + "].class: " + overlay.getClass().getName());
      _describeTextCandidates("overlay[" + index + "]", overlay);
      ++index;
    }
    if (index == 0)
      Api.message("overlay: empty");
  }

  private static void _describeDrawable(Gob gob) {
    Object drawable = gob.getattr(haven.Drawable.class);
    if (drawable == null) {
      Api.message("Drawable: null");
      return;
    }

    Api.message("Drawable.class: " + drawable.getClass().getName());
    _describeTextCandidates("Drawable", drawable);
  }

  private static String _readTextField(Speaking speaking) {
    try {
      Field field = Speaking.class.getDeclaredField("text");
      field.setAccessible(true);
      Object text = field.get(speaking);
      return _stringifyTextLike(text);
    } catch (Exception e) {
      return "read failed: " + e.getClass().getSimpleName();
    }
  }

  private static void _describeTextCandidates(String label, Object object) {
    Array<String> lines = new Array<>();
    Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<>());
    _collectTextCandidates(label, object, 0, 2, visited, lines);
    if (lines.isEmpty()) {
      Api.message(label + ".text: <none>");
      return;
    }

    for (String line : lines)
      Api.message(line);
  }

  private static void _collectTextCandidates(String path, Object object, int depth, int maxDepth, Set<Object> visited, Array<String> lines) {
    if (object == null) return;
    if (depth > maxDepth) return;
    if (visited.contains(object)) return;
    visited.add(object);

    if (object instanceof String) {
      String value = (String)object;
      if (!value.isEmpty())
        lines.append(path + ": " + value);
      return;
    }

    String textLike = _stringifyTextLike(object);
    if (textLike != null) {
      lines.append(path + ": " + textLike);
      return;
    }

    Class<?> c = object.getClass();
    for (; c != Object.class; c = c.getSuperclass()) {
      Field[] fields = c.getDeclaredFields();
      for (Field field : fields) {
        try {
          field.setAccessible(true);
          Object value = field.get(object);
          _collectTextCandidates(path + "." + field.getName(), value, depth + 1, maxDepth, visited, lines);
        } catch (Exception ignored) {}
      }
    }
  }

  private static String _stringifyTextLike(Object object) {
    if (object == null) return null;
    if (object instanceof haven.Text)
      return ((haven.Text)object).text;

    String className = object.getClass().getName();
    if (!className.contains("Text") && !className.contains("Tex"))
      return null;

    try {
      Field field = object.getClass().getField("text");
      Object value = field.get(object);
      if (value instanceof String) return (String)value;
    } catch (Exception ignored) {}

    try {
      Method method = object.getClass().getMethod("text");
      Object value = method.invoke(object);
      if (value instanceof String) return (String)value;
    } catch (Exception ignored) {}

    return String.valueOf(object);
  }
}
