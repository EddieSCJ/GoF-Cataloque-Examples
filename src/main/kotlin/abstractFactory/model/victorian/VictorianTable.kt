package abstractFactory.model.victorian

import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table

class VictorianTable(override val color: String = "Brown", override val material: String = "Wood") : Table() {
    override fun numberOfLegs(): Int {
        return 4
    }

    override fun meet() {
        println("Meet on Victorian Table")
    }
}