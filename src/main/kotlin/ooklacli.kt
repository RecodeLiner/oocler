import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream


@Throws(IOException::class)
fun asString(`is`: InputStream, charsetName: String?): String? {
    val temp = ByteArrayOutputStream()
    val buffer = ByteArray(1024)
    var bytesRead: Int
    while (`is`.read(buffer).also { bytesRead = it } > 0) {
        temp.write(buffer, 0, bytesRead)
    }
    return temp.toString(charsetName)
}

fun ooklacli(): String? {
    val charseter = "cp866"
    val pb = ProcessBuilder("speedtest.exe", "--f=json-pretty")
    val proc = pb.start()
    pb.redirectErrorStream(true)
    val tempos = asString(proc.inputStream, charseter)
    return (tempos)
}