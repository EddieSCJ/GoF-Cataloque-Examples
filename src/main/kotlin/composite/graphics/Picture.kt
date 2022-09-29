package composite.graphics

class Picture : Graphic() {
    override fun draw() : String {
        val finalValue = StringBuilder()
        finalValue.appendLine("Picture: ")
        val upDownSide = "-_".repeat(super.boundLimit)

        finalValue.appendLine(upDownSide)
        super.graphics.forEach{ finalValue.appendLine(it.draw()) }
        finalValue.appendLine(upDownSide)

        return finalValue.toString()
    }
}