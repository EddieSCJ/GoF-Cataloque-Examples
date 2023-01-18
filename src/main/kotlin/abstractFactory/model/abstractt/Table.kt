package abstractFactory.model.abstractt

abstract class Table {
    abstract fun numberOfLegs(): Int
    abstract fun meet();
    override fun toString(): String {
        return "${this.javaClass.simpleName}(color='$color', material='$material')"
    }

    abstract val color : String;
    abstract val material : String;


}