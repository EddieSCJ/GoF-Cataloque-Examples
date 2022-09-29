package composite.graphics

import java.lang.StringBuilder

class Rectangle : Graphic() {

    override fun draw() : String {
        var finalValue = StringBuilder()
        finalValue.appendLine("Rectangle: ")
        val upDownSide = "|".plus("*".repeat(super.boundLimit)).plus("|")
        finalValue.appendLine(upDownSide)

        super.graphics
            .forEach {
                val inside = it.draw();
                val missingLength = unsigned(upDownSide.length - inside.length)
                finalValue.appendLine(padEnd(inside, missingLength, ' '))
            }
        finalValue.appendLine(upDownSide)
        finalValue.append("End Rectangle")
        return finalValue.toString()
    }
}