import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = 761250751
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 964305567
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 3297605902831572423L
	)
	public static long field3195;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1897511423
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -732248525
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -513904171
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -370784475
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lia;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lkj;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -602672523
	)
	public static int field3207;
	@ObfuscatedName("y")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[Lil;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("g")
	public static byte field3210;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1412570605
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1701913817
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3207 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3210 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "-111"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
