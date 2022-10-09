package composite.graphics

class PictureComposite(override val parent: GraphicComponent? = null, override val boundLimit: Int = 50) : GraphicComposite(parent, boundLimit) {
    override fun draw() : String {
        val finalValue = StringBuilder()
        finalValue.appendLine("Picture: ")
        val upDownSide = "-_".repeat(boundLimit)

        finalValue.appendLine(upDownSide)
        super.compounds().forEach{ finalValue.appendLine(it.draw()) }
        finalValue.appendLine(upDownSide)

        return finalValue.toString()
    }
}