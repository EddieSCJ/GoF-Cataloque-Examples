package abstractFactory.model.abstractt

abstract class Chair {
    abstract fun numberOfLegs(): Int
    abstract fun sitUp();

    override fun toString(): String {
        return "${this.javaClass.simpleName}(color='$color', material='$material')"
    }

    abstract val color : String;

    abstract val material : String;
}