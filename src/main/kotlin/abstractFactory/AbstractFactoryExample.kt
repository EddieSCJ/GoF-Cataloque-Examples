package abstractFactory

import abstractFactory.impl.ArtDecoFurnitureFactory
import abstractFactory.impl.ModernFurnitureFactory
import abstractFactory.impl.VictorianFurnitureFactory

object AbstractFactoryExample {
    fun run() {
        val factory: FurnitureFactory = ArtDecoFurnitureFactory()

        val artDecoChair = factory.createChair()
        println("Created chair: $artDecoChair")
        println("Chair has ${artDecoChair.numberOfLegs()} legs")
        artDecoChair.sitUp()
        println()

        val artDecoTable = factory.createTable()
        println("Created table: $artDecoTable")
        println("Table has ${artDecoTable.numberOfLegs()} legs")
        artDecoTable.meet()
        println()

        println("=================================================================================")
        val factory2: FurnitureFactory = VictorianFurnitureFactory()

        val victorianChair = factory2.createChair()
        println("Created chair: $victorianChair")
        println("Chair has ${victorianChair.numberOfLegs()} legs")
        victorianChair.sitUp()
        println()

        val victorianTable = factory2.createTable()
        println("Created table: $victorianTable")
        println("Table has ${victorianTable.numberOfLegs()} legs")
        victorianTable.meet()
        println()

        println("=================================================================================")
        val factory3: FurnitureFactory = ModernFurnitureFactory()

        val modernChair = factory3.createChair()
        println("Created chair: $modernChair")
        println("Chair has ${modernChair.numberOfLegs()} legs")
        modernChair.sitUp()
        println()

        val modernTable = factory3.createTable()
        println("Created table: $modernTable")
        println("Table has ${modernTable.numberOfLegs()} legs")
        modernTable.meet()

    }
}