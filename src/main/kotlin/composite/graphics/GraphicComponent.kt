package composite.graphics

interface GraphicComponent {
    val boundLimit: Int?
    val parent: GraphicComponent?
    fun draw() : String
}