import org.apache.commons.codec.digest.MurmurHash3
import java.util.*
import kotlin.math.abs

class BloomFilter(
    private val size: Int,
    private val numberOfHashes: Int,
) {

    private val bitSet: BitSet = BitSet(size)

    fun add(value: ByteArray) {
        for (i in 0 until numberOfHashes) {
            val hash = MurmurHash3.hash32x86(value + (i + 1).toByte())
            bitSet.set(abs(hash) % size)
        }
    }

    fun mightContains(value: ByteArray): Boolean {
        for (i in 0 until numberOfHashes) {
            val hash = MurmurHash3.hash32x86(value + (i + 1).toByte())
            if (!bitSet.get(abs(hash) % size)) return false
        }
        return true
    }
}