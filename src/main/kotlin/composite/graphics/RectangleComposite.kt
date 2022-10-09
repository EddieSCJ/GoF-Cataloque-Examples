package composite.graphics

import java.lang.StringBuilder

class RectangleComposite(override val parent: GraphicComponent? = null, override val boundLimit: Int = 50) : GraphicComposite(parent, boundLimit) {

    override fun draw() : String {
        val finalValue = StringBuilder()
        finalValue.appendLine("Rectangle: ")

        val upDownSide = "|".plus("*".repeat(super.boundLimit)).plus("|")
        finalValue.appendLine(upDownSide)

        super.compounds()
            .forEach {
                val inside = it.draw()
                val missingLength = unsigned(upDownSide.length - inside.length)
                finalValue.appendLine(padEnd(inside, missingLength, ' '))
            }
        finalValue.appendLine(upDownSide)
        finalValue.append("End Rectangle")
        return finalValue.toString()
    }
}