data class DataMap(
    var download: Download,
    var `interface`: Interface,
    var isp: String,
    var packetLoss: Int,
    var ping: Ping,
    var result: Result,
    var server: Server,
    var timestamp: String,
    var type: String,
    var upload: Upload
) {
    data class Download(
        var bandwidth: Int,
        var bytes: Int,
        var elapsed: Int,
        var latency: Latency
    ) {
        data class Latency(
            var high: Double,
            var iqm: Double,
            var jitter: Double,
            var low: Double
        )
    }

    data class Interface(
        var externalIp: String,
        var internalIp: String,
        var isVpn: Boolean,
        var macAddr: String,
        var name: String
    )

    data class Ping(
        var high: Double,
        var jitter: Double,
        var latency: Double,
        var low: Double
    )

    data class Result(
        var id: String,
        var persisted: Boolean,
        var url: String
    )

    data class Server(
        var country: String,
        var host: String,
        var id: Int,
        var ip: String,
        var location: String,
        var name: String,
        var port: Int
    )

    data class Upload(
        var bandwidth: Int,
        var bytes: Int,
        var elapsed: Int,
        var latency: Latency
    ) {
        data class Latency(
            var high: Double,
            var iqm: Double,
            var jitter: Double,
            var low: Double
        )
    }
}