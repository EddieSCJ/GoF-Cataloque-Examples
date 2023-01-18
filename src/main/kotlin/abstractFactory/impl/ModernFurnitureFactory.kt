package abstractFactory.impl

import abstractFactory.FurnitureFactory
import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table
import abstractFactory.model.modern.ModernChair
import abstractFactory.model.modern.ModernTable
import abstractFactory.model.victorian.VictorianChair
import abstractFactory.model.victorian.VictorianTable

class ModernFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ModernChair();
    }

    override fun createTable(): Table {
        return ModernTable();
    }
}