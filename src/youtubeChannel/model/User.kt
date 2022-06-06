package youtubeChannel.model

import youtubeChannel.model.observer.Observer


class User(val id:String, val name:String, val email:String): Observer {

    override fun update() {
        println("User $name")
        println("New video Posted")

    }


}