package composite.graphics

abstract class Graphic {
    protected val graphics = mutableListOf<Graphic>()

    abstract fun draw();

    fun add(graphic: Graphic) {
        graphics.add(graphic)
    }

    fun remove(graphic: Graphic) {
        graphics.remove(graphic)
    }

    fun getChild(index: Int): Graphic {
        return graphics[index]
    }
}