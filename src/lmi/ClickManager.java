package lmi;

import haven.Gob;
import haven.Coord;

import lmi.Constant.Message;
import static lmi.Constant.ExceptionReason.*;

public class ClickManager {
  // Field
  public static volatile boolean isGobClickMode;
  public static volatile boolean isAreaSelectMode;

  private static haven.ClickData _clickData;
  private static Rect _selectedArea;

  // Getter Setter
  public static void setClickData(haven.ClickData clickData) { _clickData = clickData; }
  public static void setSelectedArea(Rect area) { _selectedArea = area; }

  public static void reset() {
    isGobClickMode = false;
    isAreaSelectMode = false;
  }

  // Public Method
  public static Gob getGob() {
    isGobClickMode = true;

    while (isGobClickMode) WaitManager.sleepPolling();

    final haven.Clickable clickable = _clickData.ci;
    Gob clickedGob = null;
    if (clickable.getClass() == Gob.GobClick.class) {
      final Gob.GobClick gobClick = (Gob.GobClick)clickable;
      clickedGob = gobClick.gob;
    } else if (clickable.getClass() == haven.Composited.CompositeClick.class) {
      final haven.Composited.CompositeClick compositeClick = (haven.Composited.CompositeClick)clickable;
      final Gob.GobClick gobClick = compositeClick.gi;
      clickedGob = gobClick.gob;
    }

    return clickedGob;
  }

  public static Rect getArea() {
    isAreaSelectMode = true;
    AppContext.mapView().newSelector();


    while (isAreaSelectMode) WaitManager.sleepPolling();

    AppContext.mapView().destroySelector();

    return _selectedArea;
  }
}
