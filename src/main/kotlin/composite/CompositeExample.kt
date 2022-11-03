package composite

import composite.graphics.Line
import composite.graphics.PictureComposite
import composite.graphics.RectangleComposite
import composite.graphics.Text

object CompositeExample {

    fun run() {
        val pictureCompound = PictureComposite()
        val firstRectangleComposite = RectangleComposite(parent = pictureCompound)

        firstRectangleComposite.add(Text(parent = firstRectangleComposite))
        firstRectangleComposite.add(Line(parent = firstRectangleComposite))
        firstRectangleComposite.add(Text(parent = firstRectangleComposite))
        firstRectangleComposite.add(Line(parent = firstRectangleComposite))
        firstRectangleComposite.add(Text(parent = firstRectangleComposite))
        firstRectangleComposite.add(Line(parent = firstRectangleComposite))

        val secondRectangleComposite = RectangleComposite(parent = firstRectangleComposite)
        firstRectangleComposite.add(secondRectangleComposite)

        secondRectangleComposite.add(Line(parent = secondRectangleComposite))
        secondRectangleComposite.add(Text(parent = secondRectangleComposite))
        secondRectangleComposite.add(Line(parent = secondRectangleComposite))

        pictureCompound.add(firstRectangleComposite)

        println(pictureCompound.draw())

    }
}
