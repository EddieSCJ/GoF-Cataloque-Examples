import composite.graphics.Line
import composite.graphics.Picture
import composite.graphics.Rectangle
import composite.graphics.Text

fun main(args: Array<String>) {
    val picture = Picture()
    val firstRectangle = Rectangle()

    firstRectangle.add(Text())
    firstRectangle.add(Line())
    firstRectangle.add(Text())
    firstRectangle.add(Line())
    firstRectangle.add(Text())
    firstRectangle.add(Line())

    val secondRectangle = Rectangle()
    secondRectangle.add(firstRectangle)
    secondRectangle.add(Line())
    secondRectangle.add(Text())
    secondRectangle.add(Line())

    picture.add(firstRectangle)
    picture.add(secondRectangle)

    println(picture.draw())


}