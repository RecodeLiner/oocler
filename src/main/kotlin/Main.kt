import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


fun main(args: Array<String>) {
    while (true) {
        val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val date = Date()
        val dateval = dateFormat.format(date).split(" ")
        val currentdate = dateval[0]
        val currenttime = dateval[1]

        var res = Res(currentdate, currenttime, 0, 0, 0, 0, 0)

        val tempres = ooklacli()
        if (tempres != null) {
            res = jsonparser(tempres)
        }
        postAtFile(res)
        Thread.sleep(600000)
    }
}
