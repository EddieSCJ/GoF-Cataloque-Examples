package composite.graphics

class Text(override val parent: GraphicComponent, override val boundLimit: Int = 50) : GraphicComponent {

    override fun draw(): String {
        val text =
            "This is a text about a story of something, it may be too big so i can tast if its line breaking is working or not"
        val result = StringBuilder()

        var unprocessedChars = text.length
        var i = 0
        while (unprocessedChars > 0) {
            if (i >= boundLimit) {
                result.appendLine()
                i = 0
            }

            result.append(text[text.length - unprocessedChars])
            i++
            unprocessedChars--
        }

        return result.toString()

    }
}