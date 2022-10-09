package composite.graphics

abstract class GraphicComposite
(
    override val parent: GraphicComponent?,
    override val boundLimit: Int,
    private var graphicCompounds: Collection<GraphicComponent> = mutableListOf()
) : GraphicComponent {

    abstract override fun draw(): String

    fun compounds(): Collection<GraphicComponent> = this.graphicCompounds

    fun add(graphicCompound: GraphicComponent) {
        this.graphicCompounds = this.graphicCompounds.plusElement(graphicCompound)
    }

    fun remove(graphicCompound: GraphicComponent) {
        this.graphicCompounds = graphicCompounds.minusElement(graphicCompound)
    }

    fun getChild(index: Int): GraphicComponent? = graphicCompounds.elementAtOrNull(index)


    protected fun unsigned(value: Int) = if (value < 0) -value else value

    protected fun padEnd(string: String, length: Int, char: Char): String {
        val builder = StringBuilder(string)
        for (i in 0..length) {
            builder.append(char)
        }

        return builder.toString()
    }
}