package haven;

import java.util.List;

public class LMI {
    public static List<LayerMeter.Meter> gaugeWidgetGaugeArray(IMeter meter) {
        if (meter == null) return null;
        return meter.meters;
    }
}
