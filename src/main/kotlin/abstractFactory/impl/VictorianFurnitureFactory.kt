package abstractFactory.impl

import abstractFactory.FurnitureFactory
import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table
import abstractFactory.model.victorian.VictorianChair
import abstractFactory.model.victorian.VictorianTable

class VictorianFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return VictorianChair();
    }

    override fun createTable(): Table {
        return VictorianTable();
    }
}