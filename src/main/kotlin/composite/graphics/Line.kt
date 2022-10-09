package composite.graphics

import kotlin.math.round

class Line(override val parent: GraphicComponent, override val boundLimit: Int =  50) : GraphicComponent {

    override fun draw() : String {
        return "_".repeat(round(boundLimit.toDouble() * 0.8).toInt())
    }

}