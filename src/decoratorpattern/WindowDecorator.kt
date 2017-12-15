package decoratorpattern

// abstract decorator class - note that it implements Window
abstract class WindowDecorator(decoratedWinodw: Window) : Window {
    protected var decoratedWindow: Window? = null

    init {
        this.decoratedWindow = decoratedWinodw
    }
}