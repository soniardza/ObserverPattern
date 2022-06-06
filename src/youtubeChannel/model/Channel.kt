package youtubeChannel.model

import youtubeChannel.model.observer.Observable

class Channel(val id:String, val name:String, video: Video): Observable() {
    fun uploadVideo(video: Video){
        notifyObservers()
        println("New video added to channel\n")
    }
}
