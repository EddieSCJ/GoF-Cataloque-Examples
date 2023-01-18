package abstractFactory.model.victorian

import abstractFactory.model.abstractt.Chair

class VictorianChair(override val color: String = "Brown", override val material: String = "Wood") : Chair() {
    override fun numberOfLegs(): Int {
        return 4
    }

    override fun sitUp() {
        println("Sit up on Victorian Chair")
    }
}