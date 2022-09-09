import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


fun main(args: Array<String>) {
    while (true) {
        val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val date = Date()
        val dateval = dateFormat.format(date).split(" ")
        val temp = CurrentTime(dateval[0], dateval[1])

        var res = Res(temp.date, temp.time, 0, 0, 0, 0, 0)

        val tempres = ooklacli()
        if (tempres != null) {
            res = jsonparser(tempres)
        }
        postAtFile(res)
        Thread.sleep(600000)
    }
}

data class CurrentTime(
    var date: String,
    var time: String
)