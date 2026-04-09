package lmi;

import haven.Gob;
import haven.Coord;

import lmi.Constant.Message;
import lmi.Constant.Signal;
import static lmi.Constant.ExceptionType.*;
import static lmi.Constant.Signal.*;

public class ClickManager {
  // Field
  private static haven.ClickData _clickData;
  private static Rect _selectedArea;

  // Getter Setter
  public static void setClickData(haven.ClickData clickData) { _clickData = clickData; }
  public static void setSelectedArea(Rect area) { _selectedArea = area; }

  // Public Method
  public static Gob getGob() {
    WaitManager.waitSignal(S_OBJECT_DID_CLICKED);

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
    AppContext.mapView.newSelector();
    WaitManager.waitSignal(S_AREA_DID_SELECTED);
    AppContext.mapView.destroySelector();

    return _selectedArea;
  }
}
