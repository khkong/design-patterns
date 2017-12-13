package observerpattern


fun main(args: Array<String>) {
    println("Enter Text: ")
    val eventSource = EventSource()
    eventSource.add(object : observerpattern.Observer {
        override fun update(any: Any) {
            println("Received response: " + any)
        }
    })
    Thread(eventSource).start()

}

