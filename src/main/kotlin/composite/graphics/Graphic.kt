package composite.graphics

abstract class Graphic {
    protected val graphics = mutableListOf<Graphic>()
    protected val boundLimit = 50

    abstract fun draw() : String

    fun add(graphic: Graphic) {
        graphics.add(graphic)
    }

    fun remove(graphic: Graphic) {
        graphics.remove(graphic)
    }

    fun getChild(index: Int): Graphic {
        return graphics[index]
    }

    protected fun unsigned(value: Int) = if (value < 0) -value else value

    protected fun padEnd(string: String, length: Int, char: Char): String {
        val builder = StringBuilder(string)
        for(i in 0..length) {
                builder.append(char)
        }

        return builder.toString()
    }
}