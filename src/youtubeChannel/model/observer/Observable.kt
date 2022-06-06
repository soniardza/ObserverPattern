package youtubeChannel.model.observer

import java.util.ArrayList

abstract class Observable{
    private val subscribedObserver = ArrayList<Observer>()

    fun subscribe(observer: Observer) {
        subscribedObserver.add(observer)
        println("User subscribed")
    }

    fun unsubscribe(observer: Observer) {
        subscribedObserver.remove(observer)
        println("User has been unsubscribed")
    }

    fun notifyObservers() {
        subscribedObserver.forEach{
            observer -> observer.update()
        }
    }


}
