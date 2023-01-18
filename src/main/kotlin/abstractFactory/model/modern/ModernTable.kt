package abstractFactory.model.modern

import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table

class ModernTable(override val color: String = "White", override val material: String = "Aluminium") : Table() {
    override fun numberOfLegs(): Int {
        return 4
    }

    override fun meet() {
        println("Meet on ModernTable")
    }
}