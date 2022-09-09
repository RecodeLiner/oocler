import com.google.gson.Gson
import kotlin.math.roundToInt

fun jsonparser(response: String, temp: CurrentTime): Res {
    val gson = Gson()
    val mMineUserEntity = gson.fromJson(response, DataMap::class.java)

    val data = temp.date
    val time = temp.time

    val idlelatency = mMineUserEntity.ping.latency.roundToInt()
    val downloadlatency = mMineUserEntity.download.latency.iqm.roundToInt()
    val uploadlatency = mMineUserEntity.upload.latency.iqm.roundToInt()

    val downspeed = mMineUserEntity.download.bandwidth / 125000
    val uplspeed = mMineUserEntity.upload.bandwidth / 125000

    return Res(data, time, idlelatency, downloadlatency, uploadlatency, downspeed, uplspeed)
}

data class Res(
    var data: String,
    var time: String,
    var idlelatency: Int,
    var downloadlatency: Int,
    var uploadlatency: Int,
    var download: Int,
    var upload: Int
)