package decoratorpattern

// the second concrete decorator which adds horizontal scrollbar functionality
class HorizontalScrollBarDecorator(decoratedWinodw: Window) : WindowDecorator(decoratedWinodw) {
    override fun draw() {
        drawHorizontalScrollBar()
        decoratedWindow?.draw()
    }

    override fun getDescription(): String {
        return decoratedWindow?.getDescription() + ", including horizontal scrollbars"
    }

    private fun drawHorizontalScrollBar() {
        // draw the horizontal scrollbar
    }
}