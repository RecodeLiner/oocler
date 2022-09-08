import java.io.File
import java.io.FileWriter

fun postAtFile(res: Res) {
    val current =
        res.data + " " + res.time + " | " + res.idlelatency + " " + res.downloadlatency + " " + res.uploadlatency + " | " + res.download + " " + res.upload + " | " + "\n"
    val file = File("list.txt")
    val writer = FileWriter(file, true)
    writer.use { it.write(current) }
}