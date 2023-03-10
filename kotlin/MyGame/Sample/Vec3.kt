// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Sample

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Vector in three dimensions
 */
@Suppress("unused")
class Vec3 : Struct() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Vec3 {
        __init(_i, _bb)
        return this
    }
    /**
     * East-west direction
     */
    val x : Float get() = bb.getFloat(bb_pos + 0)
    /**
     * North-south direction
     */
    val y : Float get() = bb.getFloat(bb_pos + 4)
    /**
     * Up-down direction
     */
    val z : Float get() = bb.getFloat(bb_pos + 8)
    companion object {
        fun createVec3(builder: FlatBufferBuilder, x: Float, y: Float, z: Float) : Int {
            builder.prep(4, 12)
            builder.putFloat(z)
            builder.putFloat(y)
            builder.putFloat(x)
            return builder.offset()
        }
    }
}
