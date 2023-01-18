package abstractFactory.model.artdeco

import abstractFactory.model.abstractt.Chair

class ArtDecoChair(override val color: String = "Red", override val material: String = "Stew") : Chair() {
    override fun numberOfLegs(): Int {
        return 4
    }

    override fun sitUp() {
        println("Sit up on ArtDecoChair")
    }
}