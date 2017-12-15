package decoratorpattern


fun main(args: Array<String>) {
    // create a decorated Window with horizontal and vertical scrollbars
    var decoratedWinodw : Window ?= HorizontalScrollBarDecorator(VerticalScrollBarDecorator(SimpleWindow()))
    // print the Window's description
    println(decoratedWinodw?.getDescription())
}