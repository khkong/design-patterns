package observerpattern

import java.util.*


class EventSource : Runnable {

    private var list: MutableList<Observer> = mutableListOf()

    fun add(observer: Observer) {
        list.add(observer)
    }

    fun observerNotify(any: Any) {
        for (l in list) {
            l.update(any);
        }
    }

    override fun run() {
        while (true) {
            val response = Scanner(System.`in`).next()
            observerNotify(response)
        }
    }

}