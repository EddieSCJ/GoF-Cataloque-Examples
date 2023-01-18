package abstractFactory.impl

import abstractFactory.FurnitureFactory
import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table
import abstractFactory.model.artdeco.ArtDecoChair
import abstractFactory.model.artdeco.ArtDecoTable
import abstractFactory.model.victorian.VictorianChair
import abstractFactory.model.victorian.VictorianTable

class ArtDecoFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ArtDecoChair();
    }

    override fun createTable(): Table {
        return ArtDecoTable();
    }
}