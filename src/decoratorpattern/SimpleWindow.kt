package decoratorpattern


// implementation of a simple Window without any scrollbars
class SimpleWindow : Window {
    override fun draw() {
        //draw window
    }

    override fun getDescription(): String {
        return "simple window";
    }
}