---
source: [Audio.java](../../../../src/haven/Audio.java)
created: 2026-06-13
updated: 2026-06-14
---

# Audio

Implements audio playback, mixing, and resampling support.

## Nested Types

### CS

- Role: Represents one audio clip source.
- Description: Shared clip-stream interface for audio playback sources.

### Clip

- Role: Base type for audio clips.
- Description: Abstract clip contract consumed by mixers and players.

### LDump

- Role: Dumps audio load state for debugging.
- Description: Helper used to inspect or dump audio clip loading state.

### Mixer

- Role: Mixes multiple audio sources.
- Description: Clip implementation that combines child sources into a single stream.

### Monitor

- Role: Observes an audio stream.
- Description: Clip wrapper used to inspect or tap audio output without changing it.

### PCMClip

- Role: Plays raw PCM data.
- Description: Clip implementation backed by a PCM input stream.

### Player

- Role: Runs the audio playback thread.
- Description: Background thread that feeds decoded audio to the output device.

### Repeater

- Role: Repeats a clip indefinitely.
- Description: Abstract clip wrapper that loops its child audio source.

### Resampler

- Role: Resamples audio to the output format.
- Description: Clip wrapper that converts sample rate and format on the fly.

### VolAdjust

- Role: Applies volume scaling.
- Description: Clip wrapper that multiplies sample amplitude by a gain factor.

### VorbisClip

- Role: Decodes Vorbis audio.
- Description: Clip implementation backed by a Vorbis decoder.

## Members

### Constants

#### `public static final Config.Variable<String> outname = Config.Variable.prop("haven.audio-output", "")`
- Role: Implements the outname operation.
- Description: Implements the prop operation.
- Value: `Config.Variable.prop("haven.audio-output", "")`

#### `public static final AudioFormat fmt = new AudioFormat(44100, 16, 2, true, false)`
- Role: Implements the fmt operation.
- Description: Implements the audio format operation.
- Value: `new AudioFormat(44100, 16, 2, true, false)`

#### `public static final Class<Clip> clip = Clip.class`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.
- Value: `Clip.class`

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Caches the un8 value.
- Description: Caches the `UN8` value for reuse.
- Value: `0, SN8 = 1, SN16 = 2, SN32 = 3`

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Caches the un8 value.
- Description: Caches the `UN8` value for reuse.
- Value: `0, SN8 = 1, SN16 = 2, SN32 = 3`

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Caches the un8 value.
- Description: Caches the `UN8` value for reuse.
- Value: `0, SN8 = 1, SN16 = 2, SN32 = 3`

#### `public static final int UN8 = 0, SN8 = 1, SN16 = 2, SN32 = 3`
- Role: Caches the un8 value.
- Description: Caches the `UN8` value for reuse.
- Value: `0, SN8 = 1, SN16 = 2, SN32 = 3`

### Fields

#### `public static boolean enabled = true`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public static double volume = Double.parseDouble(Utils.getpref("sfxvol", "1.0"))`
- Role: Implements the volume operation.
- Description: Implements the getpref operation.

#### `private static int bufsize = Utils.getprefi("audiobuf", Math.round(fmt.getSampleRate() * 0.05f)) * fmt.getFrameSize()`
- Role: Implements the bufsize operation.
- Description: Implements the get frame size operation.

#### `private static Player player`
- Role: Caches the player value.
- Description: Caches the `player` value for reuse.

#### `public final boolean cont`
- Role: Tracks the cont flag.
- Description: Caches the `cont` value for reuse.

#### `private final Collection<CS> clips = new LinkedList<CS>()`
- Role: Implements the clips operation.
- Description: Implements the private final collection<cs> clips = new linked list<cs>() operation.

#### `public final InputStream clip`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.

#### `public final int sch, sfmt, ssz`
- Role: Caches the ssz value.
- Description: Caches the `ssz` value for reuse.

#### `public final int sch, sfmt, ssz`
- Role: Caches the ssz value.
- Description: Caches the `ssz` value for reuse.

#### `public final int sch, sfmt, ssz`
- Role: Caches the ssz value.
- Description: Caches the `ssz` value for reuse.

#### `public int size = -1`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `private final byte[] dbuf = new byte[256]`
- Role: Caches the dbuf value.
- Description: Caches the `dbuf` value for reuse.

#### `private int head = 0, tail = 0`
- Role: Caches the head value.
- Description: Caches the `head` value for reuse.

#### `private int head = 0, tail = 0`
- Role: Caches the head value.
- Description: Caches the `head` value for reuse.

#### `private boolean eof = false`
- Role: Tracks the eof flag.
- Description: Caches the `eof` value for reuse.

#### `public final VorbisStream clip`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.

#### `private float[][] data = new float[1][0]`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private int dp = 0`
- Role: Caches the dp value.
- Description: Caches the `dp` value for reuse.

#### `public final CS bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public double vol = 1.0, bal = 0.0`
- Role: Caches the vol value.
- Description: Caches the `vol` value for reuse.

#### `public double vol = 1.0, bal = 0.0`
- Role: Caches the vol value.
- Description: Caches the `vol` value for reuse.

#### `private double[] cvol =`
- Role: Stores the audio state.
- Description: Caches the `cvol` value for reuse.

#### `public final CS bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public double irate, orate`
- Role: Caches the orate value.
- Description: Caches the `orate` value for reuse.

#### `public double irate, orate`
- Role: Caches the orate value.
- Description: Caches the `orate` value for reuse.

#### `public double sp = 1.0`
- Role: Caches the sp value.
- Description: Caches the `sp` value for reuse.

#### `private double ack`
- Role: Caches the ack value.
- Description: Caches the `ack` value for reuse.

#### `private double[] lval =`
- Role: Stores the audio state.
- Description: Caches the `lval` value for reuse.

#### `private double[] lval =`
- Role: Stores the audio state.
- Description: Caches the `lval` value for reuse.

#### `private double[][] data =`
- Role: Stores the audio state.
- Description: Caches the `data` value for reuse.

#### `private int dp = 0, dl = 0`
- Role: Caches the dp value.
- Description: Caches the `dp` value for reuse.

#### `private int dp = 0, dl = 0`
- Role: Caches the dp value.
- Description: Caches the `dp` value for reuse.

#### `public final CS bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public boolean eof = false`
- Role: Tracks the eof flag.
- Description: Caches the `eof` value for reuse.

#### `private CS cur = null`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `public final CS bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `private double val = 0.0`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private int n = 0, iv`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private int n = 0, iv`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `private final CS stream`
- Role: Caches the stream value.
- Description: Caches the `stream` value for reuse.

#### `private final int nch`
- Role: Caches the nch value.
- Description: Caches the `nch` value for reuse.

#### `private volatile boolean reopen = false`
- Role: Tracks whether reopen is open.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static Map<Resource, Clip> resclips = new HashMap<>()`
- Role: Implements the resclips operation.
- Description: Implements the private static map<resource, clip> resclips = new hash map<>() operation.

### Methods

#### `public static void setvolume(double volume)`
- Role: Handles the setvolume path.
- Description: Updates the volume.

#### `public int get(double[][] buf, int len)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public CS stream()`
- Role: Handles the stream path.
- Description: Implements the stream operation.

#### `public default String layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public default double bvol()`
- Role: Handles the bvol path.
- Description: Implements the bvol operation.

#### `public Mixer(boolean continuous)`
- Role: Handles the mixer path.
- Description: Implements the mixer operation.

#### `public Mixer()`
- Role: Handles the mixer path.
- Description: Implements the mixer operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void add(CS clip)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void stop(CS clip)`
- Role: Stops the current workflow.
- Description: Implements the stop operation.

#### `public boolean playing(CS clip)`
- Role: Handles the playing path.
- Description: Implements the playing operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public boolean empty()`
- Role: Handles the empty path.
- Description: Implements the empty operation.

#### `public Collection<CS> current()`
- Role: Handles the current path.
- Description: Implements the current operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public PCMClip(InputStream clip, int nch, int sfmt)`
- Role: Handles the pcmclip path.
- Description: Implements the pcm clip operation.

#### `public PCMClip size(int size)`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `private int read(byte[] buf, int off, int len)`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static CS fromwav(InputStream clip) throws IOException`
- Role: Handles the fromwav workflow.
- Description: Implements the fromwav operation.

#### `private static int u8(InputStream clip) throws IOException`
- Role: Handles the u8 workflow.
- Description: Implements the u8 operation.

#### `private static int u16(InputStream clip) throws IOException`
- Role: Handles the u16 workflow.
- Description: Implements the u16 operation.

#### `private static int s32(InputStream clip) throws IOException`
- Role: Handles the s32 workflow.
- Description: Implements the s32 operation.

#### `public VorbisClip(VorbisStream clip)`
- Role: Handles the vorbis clip path.
- Description: Implements the vorbis clip operation.

#### `public VorbisClip(InputStream bs) throws IOException`
- Role: Handles the vorbis clip workflow.
- Description: Implements the vorbis clip operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public VolAdjust(CS bk, double vol)`
- Role: Handles the vol adjust path.
- Description: Implements the vol adjust operation.

#### `public VolAdjust(CS bk)`
- Role: Handles the vol adjust path.
- Description: Implements the vol adjust operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Resampler(CS bk, double irate, double orate)`
- Role: Handles the resampler path.
- Description: Implements the resampler operation.

#### `public Resampler(CS bk, double irate)`
- Role: Handles the resampler path.
- Description: Implements the resampler operation.

#### `public Resampler(CS bk)`
- Role: Handles the resampler path.
- Description: Implements the resampler operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Resampler sp(double sp)`
- Role: Handles the sp path.
- Description: Implements the sp operation.

#### `public Monitor(CS bk)`
- Role: Handles the monitor path.
- Description: Implements the monitor operation.

#### `public int get(double[][] dst, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `protected void eof()`
- Role: Handles the eof path.
- Description: Implements the eof operation.

#### `public void finwait() throws InterruptedException`
- Role: Handles the finwait workflow.
- Description: Implements the finwait operation.

#### `public int get(double[][] buf, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `protected abstract CS cons()`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public LDump(CS bk, int iv)`
- Role: Handles the ldump path.
- Description: Implements the l dump operation.

#### `public LDump(CS bk)`
- Role: Handles the ldump path.
- Description: Implements the l dump operation.

#### `public int get(double[][] buf, int ns)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `Player(CS stream)`
- Role: Handles the player workflow.
- Description: Implements the player operation.

#### `private int fillbuf(byte[] dst, int off, int len)`
- Role: Handles the fillbuf path.
- Description: Implements the fillbuf operation.

#### `static SourceDataLine getline() throws LineUnavailableException`
- Role: Returns the line.
- Description: Returns the line.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `void reopen(boolean async)`
- Role: Handles the reopen path.
- Description: Implements the reopen operation.

#### `private static Player ckpl(boolean creat)`
- Role: Handles the ckpl path.
- Description: Implements the ckpl operation.

#### `public static void play(CS clip)`
- Role: Handles the play path.
- Description: Implements the play operation.

#### `public static void stop(CS clip)`
- Role: Stops the current workflow.
- Description: Implements the stop operation.

#### `public static Clip resclip(Resource res)`
- Role: Handles the resclip path.
- Description: Implements the resclip operation.

#### `public static CS fromres(Resource res)`
- Role: Handles the fromres path.
- Description: Implements the fromres operation.

#### `public static void play(Resource res)`
- Role: Handles the play path.
- Description: Implements the play operation.

#### `public static int bufsize()`
- Role: Handles the bufsize path.
- Description: Implements the bufsize operation.

#### `public static void bufsize(int nsz, boolean async)`
- Role: Handles the bufsize path.
- Description: Implements the bufsize operation.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.