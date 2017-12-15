package decoratorpattern

class VerticalScrollBarDecorator(decoratedWindow: Window) : WindowDecorator(decoratedWindow) {

    override fun draw() {
        drawVerticalScrollBar()
        decoratedWindow?.draw()
    }

    override fun getDescription(): String {
        return decoratedWindow?.getDescription() + ", including vertical scrollbars"
    }

    private fun drawVerticalScrollBar() {
        //draw the verticla scrollbar
    }

}
