---
source: [Audio.java](../../../src/haven/Audio.java)
created: 2026-06-13
updated: 2026-06-14
---

# Audio

Implements audio playback, mixing, and resampling support.

## Nested Types

### CS

- Role: Represents cs within Audio.
- Description: Describes the nested cs type used by the enclosing class.

### Clip

- Role: Represents clip within Audio.
- Description: Describes the nested clip type used by the enclosing class.

### LDump

- Role: Represents ldump within Audio.
- Description: Describes the nested ldump type used by the enclosing class.

### Mixer

- Role: Represents mixer within Audio.
- Description: Describes the nested mixer type used by the enclosing class.

### Monitor

- Role: Represents monitor within Audio.
- Description: Describes the nested monitor type used by the enclosing class.

### PCMClip

- Role: Represents pcmclip within Audio.
- Description: Describes the nested pcmclip type used by the enclosing class.

### Player

- Role: Represents player within Audio.
- Description: Describes the nested player type used by the enclosing class.

### Repeater

- Role: Represents repeater within Audio.
- Description: Describes the nested repeater type used by the enclosing class.

### Resampler

- Role: Represents resampler within Audio.
- Description: Describes the nested resampler type used by the enclosing class.

### VolAdjust

- Role: Represents vol adjust within Audio.
- Description: Describes the nested vol adjust type used by the enclosing class.

### VorbisClip

- Role: Represents vorbis clip within Audio.
- Description: Describes the nested vorbis clip type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<String> outname = Config.Variable.prop("haven.audio-output", "")`
- Role: Defines the shared outname constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AudioFormat fmt = new AudioFormat(44100, 16, 2, true, false)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Class<Clip> clip = Clip.class`
- Role: Defines the shared clip constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Defines the shared un8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Defines the shared un8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Defines the shared un8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Defines the shared un8 constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean enabled = true`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public static double volume = Double.parseDouble(Utils.getpref("sfxvol", "1.0"))`
- Role: Stores the volume value.
- Description: Backs the cached state for this file.

#### `private static int bufsize = Utils.getprefi("audiobuf", Math.round(fmt.getSampleRate() * 0.05f)) * fmt.getFrameSize()`
- Role: Stores the bufsize value.
- Description: Backs the cached state for this file.

#### `private static Player player`
- Role: Holds the player state.
- Description: Backs the cached state for this file.

#### `public final boolean cont`
- Role: Tracks the cont flag.
- Description: Supports the cont operation used by the surrounding class.

#### `private final Collection<CS> clips = new LinkedList<CS>()`
- Role: Caches clips entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final InputStream clip`
- Role: Holds the clip state.
- Description: Backs the cached state for this file.

#### `public final int sch, sfmt, ssz`
- Role: Stores the ssz value.
- Description: Backs the cached state for this file.

#### `public final int sch, sfmt, ssz`
- Role: Stores the ssz value.
- Description: Backs the cached state for this file.

#### `public final int sch, sfmt, ssz`
- Role: Stores the ssz value.
- Description: Backs the cached state for this file.

#### `public int size = -1`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `private final byte[] dbuf = new byte[256]`
- Role: Stores the dbuf value.
- Description: Backs the cached state for this file.

#### `private int head = 0, tail = 0`
- Role: Stores the head value.
- Description: Backs the cached state for this file.

#### `private int head = 0, tail = 0`
- Role: Stores the head value.
- Description: Backs the cached state for this file.

#### `private boolean eof = false`
- Role: Tracks the eof flag.
- Description: Supports the eof operation used by the surrounding class.

#### `public final VorbisStream clip`
- Role: Holds the clip state.
- Description: Backs the cached state for this file.

#### `private float[][] data = new float[1][0]`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private int dp = 0`
- Role: Stores the dp value.
- Description: Backs the cached state for this file.

#### `public final CS bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public double vol = 1.0, bal = 0.0`
- Role: Stores the vol value.
- Description: Backs the cached state for this file.

#### `public double vol = 1.0, bal = 0.0`
- Role: Stores the vol value.
- Description: Backs the cached state for this file.

#### `private double[] cvol =`
- Role: Stores the audio state.
- Description: Backs the cached state for this file.

#### `public final CS bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public double irate, orate`
- Role: Stores the orate value.
- Description: Backs the cached state for this file.

#### `public double irate, orate`
- Role: Stores the orate value.
- Description: Backs the cached state for this file.

#### `public double sp = 1.0`
- Role: Stores the sp value.
- Description: Backs the cached state for this file.

#### `private double ack`
- Role: Stores the ack value.
- Description: Backs the cached state for this file.

#### `private double[] lval =`
- Role: Stores the audio state.
- Description: Backs the cached state for this file.

#### `private double[] lval =`
- Role: Stores the audio state.
- Description: Backs the cached state for this file.

#### `private double[][] data =`
- Role: Stores the audio state.
- Description: Backs the cached state for this file.

#### `private int dp = 0, dl = 0`
- Role: Stores the dp value.
- Description: Backs the cached state for this file.

#### `private int dp = 0, dl = 0`
- Role: Stores the dp value.
- Description: Backs the cached state for this file.

#### `public final CS bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public boolean eof = false`
- Role: Tracks the eof flag.
- Description: Supports the eof operation used by the surrounding class.

#### `private CS cur = null`
- Role: Holds the cur state.
- Description: Backs the cached state for this file.

#### `public final CS bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `private double val = 0.0`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

#### `private int n = 0, iv`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private int n = 0, iv`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `private final CS stream`
- Role: Holds the stream state.
- Description: Backs the cached state for this file.

#### `private final int nch`
- Role: Stores the nch value.
- Description: Backs the cached state for this file.

#### `private volatile boolean reopen = false`
- Role: Tracks whether reopen is open.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static Map<Resource, Clip> resclips = new HashMap<>()`
- Role: Caches resclips entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public static void setvolume(double volume)`
- Role: Performs setvolume.
- Description: Supports the setvolume operation used by the surrounding class.

#### `public int get(double[][] buf, int len)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public CS stream()`
- Role: Performs stream.
- Description: Supports the stream operation used by the surrounding class.

#### `public default String layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public default double bvol()`
- Role: Performs bvol.
- Description: Supports the bvol operation used by the surrounding class.

#### `public Mixer(boolean continuous)`
- Role: Performs mixer.
- Description: Supports the mixer operation used by the surrounding class.

#### `public Mixer()`
- Role: Performs mixer.
- Description: Supports the mixer operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void add(CS clip)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void stop(CS clip)`
- Role: Stops the current workflow.
- Description: Supports the stop operation used by the surrounding class.

#### `public boolean playing(CS clip)`
- Role: Performs playing.
- Description: Supports the playing operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public boolean empty()`
- Role: Performs empty.
- Description: Supports the empty operation used by the surrounding class.

#### `public Collection<CS> current()`
- Role: Performs current.
- Description: Supports the current operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public PCMClip(InputStream clip, int nch, int sfmt)`
- Role: Performs pcmclip.
- Description: Supports the pcmclip operation used by the surrounding class.

#### `public PCMClip size(int size)`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `private int read(byte[] buf, int off, int len)`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static CS fromwav(InputStream clip) throws IOException`
- Role: Handles the fromwav workflow.
- Description: Supports the fromwav operation used by the surrounding class.

#### `private static int u8(InputStream clip) throws IOException`
- Role: Handles the u8 workflow.
- Description: Supports the u8 operation used by the surrounding class.

#### `private static int u16(InputStream clip) throws IOException`
- Role: Handles the u16 workflow.
- Description: Supports the u16 operation used by the surrounding class.

#### `private static int s32(InputStream clip) throws IOException`
- Role: Handles the s32 workflow.
- Description: Supports the s32 operation used by the surrounding class.

#### `public VorbisClip(VorbisStream clip)`
- Role: Performs vorbis clip.
- Description: Supports the vorbis clip operation used by the surrounding class.

#### `public VorbisClip(InputStream bs) throws IOException`
- Role: Handles the vorbis clip workflow.
- Description: Supports the vorbis clip operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public VolAdjust(CS bk, double vol)`
- Role: Performs vol adjust.
- Description: Supports the vol adjust operation used by the surrounding class.

#### `public VolAdjust(CS bk)`
- Role: Performs vol adjust.
- Description: Supports the vol adjust operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Resampler(CS bk, double irate, double orate)`
- Role: Performs resampler.
- Description: Supports the resampler operation used by the surrounding class.

#### `public Resampler(CS bk, double irate)`
- Role: Performs resampler.
- Description: Supports the resampler operation used by the surrounding class.

#### `public Resampler(CS bk)`
- Role: Performs resampler.
- Description: Supports the resampler operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Resampler sp(double sp)`
- Role: Performs sp.
- Description: Supports the sp operation used by the surrounding class.

#### `public Monitor(CS bk)`
- Role: Performs monitor.
- Description: Supports the monitor operation used by the surrounding class.

#### `public int get(double[][] dst, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `protected void eof()`
- Role: Performs eof.
- Description: Supports the eof operation used by the surrounding class.

#### `public void finwait() throws InterruptedException`
- Role: Handles the finwait workflow.
- Description: Supports the finwait operation used by the surrounding class.

#### `public int get(double[][] buf, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `protected abstract CS cons()`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public LDump(CS bk, int iv)`
- Role: Performs ldump.
- Description: Supports the ldump operation used by the surrounding class.

#### `public LDump(CS bk)`
- Role: Performs ldump.
- Description: Supports the ldump operation used by the surrounding class.

#### `public int get(double[][] buf, int ns)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `Player(CS stream)`
- Role: Handles the player workflow.
- Description: Supports the player operation used by the surrounding class.

#### `private int fillbuf(byte[] dst, int off, int len)`
- Role: Performs fillbuf.
- Description: Supports the fillbuf operation used by the surrounding class.

#### `static SourceDataLine getline() throws LineUnavailableException`
- Role: Returns the line value.
- Description: Exposes the requested value without mutating state.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `void reopen(boolean async)`
- Role: Performs reopen.
- Description: Supports the reopen operation used by the surrounding class.

#### `private static Player ckpl(boolean creat)`
- Role: Performs ckpl.
- Description: Supports the ckpl operation used by the surrounding class.

#### `public static void play(CS clip)`
- Role: Performs play.
- Description: Supports the play operation used by the surrounding class.

#### `public static void stop(CS clip)`
- Role: Stops the current workflow.
- Description: Supports the stop operation used by the surrounding class.

#### `public static Clip resclip(Resource res)`
- Role: Performs resclip.
- Description: Supports the resclip operation used by the surrounding class.

#### `public static CS fromres(Resource res)`
- Role: Performs fromres.
- Description: Supports the fromres operation used by the surrounding class.

#### `public static void play(Resource res)`
- Role: Performs play.
- Description: Supports the play operation used by the surrounding class.

#### `public static int bufsize()`
- Role: Performs bufsize.
- Description: Supports the bufsize operation used by the surrounding class.

#### `public static void bufsize(int nsz, boolean async)`
- Role: Performs bufsize.
- Description: Supports the bufsize operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
