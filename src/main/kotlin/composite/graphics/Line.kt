package composite.graphics

import kotlin.math.round

class Line : Graphic() {
    override fun draw() : String {
        return "_".repeat(round( super.boundLimit.toDouble() * 0.8).toInt())
    }

}