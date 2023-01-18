package abstractFactory.model.modern

import abstractFactory.model.abstractt.Chair

class ModernChair(override val color: String = "White", override val material: String = "Aluminium") : Chair() {
    override fun numberOfLegs(): Int {
        return 0
    }

    override fun sitUp() {
        println("Sit up on Modern Chair")
    }
}