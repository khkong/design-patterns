package singletonpattern

class Singleton {
    companion object {
        private var instance: Singleton ?= null

        fun  getSingletonObject(): Singleton {
            if (instance == null) { // NOT thread safe!
                instance = Singleton()
            }
            return instance!!
        }
    }
}