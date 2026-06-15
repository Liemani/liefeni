# Audio

This file documents the responsibilities and members of `Audio`.

## Meta

- Source: [Audio.java](../../../src/haven/Audio.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles audio device and playback support.

## Nested Types

### CS

- Description: TODO

### Clip

- Description: TODO

### LDump

- Description: TODO

### Mixer

- Description: TODO

### Monitor

- Description: TODO

### PCMClip

- Description: TODO

### Player

- Description: TODO

### Repeater

- Description: TODO

### Resampler

- Description: TODO

### VolAdjust

- Description: TODO

### VorbisClip

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<String> outname = Config.Variable.prop("haven.audio-output", "")`

- Description: TODO

#### `public static final AudioFormat fmt = new AudioFormat(44100, 16, 2, true, false)`

- Description: TODO

#### `public static final Class<Clip> clip = Clip.class`

- Description: TODO

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`

- Description: TODO

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`

- Description: TODO

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`

- Description: TODO

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`

- Description: TODO

### Fields

#### `public static boolean enabled = true`

- Description: TODO

#### `public static double volume = Double.parseDouble(Utils.getpref("sfxvol", "1.0"))`

- Description: TODO

#### `private static int bufsize = Utils.getprefi("audiobuf", Math.round(fmt.getSampleRate() * 0.05f)) * fmt.getFrameSize()`

- Description: TODO

#### `private static Player player`

- Description: TODO

#### `public final boolean cont`

- Description: TODO

#### `private final Collection<CS> clips = new LinkedList<CS>()`

- Description: TODO

#### `public final InputStream clip`

- Description: TODO

#### `public final int sch, sfmt, ssz`

- Description: TODO

#### `public final int sch, sfmt, ssz`

- Description: TODO

#### `public final int sch, sfmt, ssz`

- Description: TODO

#### `public int size = -1`

- Description: TODO

#### `private final byte[] dbuf = new byte[256]`

- Description: TODO

#### `private int head = 0, tail = 0`

- Description: TODO

#### `private int head = 0, tail = 0`

- Description: TODO

#### `private boolean eof = false`

- Description: TODO

#### `public final VorbisStream clip`

- Description: TODO

#### `private float[][] data = new float[1][0]`

- Description: TODO

#### `private int dp = 0`

- Description: TODO

#### `public final CS bk`

- Description: TODO

#### `public double vol = 1.0, bal = 0.0`

- Description: TODO

#### `public double vol = 1.0, bal = 0.0`

- Description: TODO

#### `private double[] cvol =`

- Description: TODO

#### `public final CS bk`

- Description: TODO

#### `public double irate, orate`

- Description: TODO

#### `public double irate, orate`

- Description: TODO

#### `public double sp = 1.0`

- Description: TODO

#### `private double ack`

- Description: TODO

#### `private double[] lval =`

- Description: TODO

#### `private double[] lval =`

- Description: TODO

#### `private double[][] data =`

- Description: TODO

#### `private int dp = 0, dl = 0`

- Description: TODO

#### `private int dp = 0, dl = 0`

- Description: TODO

#### `public final CS bk`

- Description: TODO

#### `public boolean eof = false`

- Description: TODO

#### `private CS cur = null`

- Description: TODO

#### `public final CS bk`

- Description: TODO

#### `private double val = 0.0`

- Description: TODO

#### `private int n = 0, iv`

- Description: TODO

#### `private int n = 0, iv`

- Description: TODO

#### `private final CS stream`

- Description: TODO

#### `private final int nch`

- Description: TODO

#### `private volatile boolean reopen = false`

- Description: TODO

#### `private static Map<Resource, Clip> resclips = new HashMap<>()`

- Description: TODO

### Methods

#### `public static void setvolume(double volume)`

- Description: TODO

#### `public int get(double[][] buf, int len)`

- Description: TODO

#### `public CS stream()`

- Description: TODO

#### `public default String layerid()`

- Description: TODO

#### `public default double bvol()`

- Description: TODO

#### `public Mixer(boolean continuous)`

- Description: TODO

#### `public Mixer()`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `public void add(CS clip)`

- Description: TODO

#### `public void stop(CS clip)`

- Description: TODO

#### `public boolean playing(CS clip)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public boolean empty()`

- Description: TODO

#### `public Collection<CS> current()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public PCMClip(InputStream clip, int nch, int sfmt)`

- Description: TODO

#### `public PCMClip size(int size)`

- Description: TODO

#### `private int read(byte[] buf, int off, int len)`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `public static CS fromwav(InputStream clip) throws IOException`

- Description: TODO

#### `private static int u8(InputStream clip) throws IOException`

- Description: TODO

#### `private static int u16(InputStream clip) throws IOException`

- Description: TODO

#### `private static int s32(InputStream clip) throws IOException`

- Description: TODO

#### `public VorbisClip(VorbisStream clip)`

- Description: TODO

#### `public VorbisClip(InputStream bs) throws IOException`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `public VolAdjust(CS bk, double vol)`

- Description: TODO

#### `public VolAdjust(CS bk)`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `public Resampler(CS bk, double irate, double orate)`

- Description: TODO

#### `public Resampler(CS bk, double irate)`

- Description: TODO

#### `public Resampler(CS bk)`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `public Resampler sp(double sp)`

- Description: TODO

#### `public Monitor(CS bk)`

- Description: TODO

#### `public int get(double[][] dst, int ns)`

- Description: TODO

#### `protected void eof()`

- Description: TODO

#### `public void finwait() throws InterruptedException`

- Description: TODO

#### `public int get(double[][] buf, int ns)`

- Description: TODO

#### `protected abstract CS cons()`

- Description: TODO

#### `public LDump(CS bk, int iv)`

- Description: TODO

#### `public LDump(CS bk)`

- Description: TODO

#### `public int get(double[][] buf, int ns)`

- Description: TODO

#### `Player(CS stream)`

- Description: TODO

#### `private int fillbuf(byte[] dst, int off, int len)`

- Description: TODO

#### `static SourceDataLine getline() throws LineUnavailableException`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `void reopen(boolean async)`

- Description: TODO

#### `private static Player ckpl(boolean creat)`

- Description: TODO

#### `public static void play(CS clip)`

- Description: TODO

#### `public static void stop(CS clip)`

- Description: TODO

#### `public static Clip resclip(Resource res)`

- Description: TODO

#### `public static CS fromres(Resource res)`

- Description: TODO

#### `public static void play(Resource res)`

- Description: TODO

#### `public static int bufsize()`

- Description: TODO

#### `public static void bufsize(int nsz, boolean async)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
