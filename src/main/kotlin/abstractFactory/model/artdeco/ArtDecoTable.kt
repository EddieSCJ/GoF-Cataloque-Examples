package abstractFactory.model.artdeco

import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table

class ArtDecoTable(override val color: String = "Red", override val material: String = "Stew") : Table() {
    override fun numberOfLegs(): Int {
        return 4
    }

    override fun meet() {
        println("Meet on ArtDecoTable")
    }
}