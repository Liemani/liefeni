package haven;

import java.util.List;

public class LMI {
    public static List<LayerMeter.Meter> meterValues(IMeter meter) {
        if (meter == null) return null;
        return meter.meters;
    }
}
