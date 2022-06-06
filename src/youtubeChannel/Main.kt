package youtubeChannel

import youtubeChannel.model.Channel
import youtubeChannel.model.User
import youtubeChannel.model.Video

import java.util.*

fun main(){

    val sonia = User("1aaf","Sonia R","sonia@gmail.com")

    val irene = User("2aaf","Irene R","irene@gmail.com")

    val video = Video("1bcd","Learning Observer Pattern Kotlin",
        "https://www.youtube.com", Date())

    val channel = Channel("1acr4","Learn Kotlin Channel", video)

    println("*** Subscribing users ***")
    channel.subscribe(sonia)
    channel.subscribe(irene)

    println("\n*** Uploading a video ***")
    channel.uploadVideo(video)

    channel.unsubscribe(sonia)
    channel.uploadVideo(video)

}
