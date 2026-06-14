package lmi.core;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public final class DebugUtil {
  private DebugUtil() {}

  public static void debugPrintObjectFields(Object object) {
    if (object == null) {
      Util.debugPrint("null");
      return;
    }

    Class<?> classObject = object.getClass();
    Util.debugPrintHeader(classObject.getName());
    _debugPrintObjectFields(object, classObject, 0, new HashSet<Object>());
  }

  private static void _debugPrintObjectFields(Object object, Class<?> classObject, int depth, Set<Object> visited) {
    if (object == null) {
      Util.insertIndent(depth);
      System.out.println("null");
      return;
    }
    if (visited.contains(object)) {
      Util.insertIndent(depth);
      System.out.println("<visited>");
      return;
    }
    visited.add(object);

    for (; classObject != null && classObject != Object.class; classObject = classObject.getSuperclass()) {
      Field[] fields = classObject.getDeclaredFields();
      for (Field field : fields) {
        if (Modifier.isStatic(field.getModifiers()))
          continue;
        try {
          field.setAccessible(true);
          Object value = field.get(object);
          Util.insertIndent(depth);
          System.out.println(field.getName() + " (" + field.getType().getSimpleName() + ") = " + _formatValue(field, value));
        } catch (Exception e) {
          Util.insertIndent(depth);
          System.out.println(field.getName() + " (" + field.getType().getSimpleName() + ") = <error: " + e.getClass().getSimpleName() + ">");
        }
      }
    }
  }

  private static String _formatValue(Field field, Object value) {
    if (value == null)
      return "null";
    if (field.getType() == long.class || field.getType() == Long.class) {
      long longValue = ((Number)value).longValue();
      return longValue + " (0x" + Long.toUnsignedString(longValue, 16) + ")";
    }
    return String.valueOf(value);
  }
}
