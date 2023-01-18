package abstractFactory

import abstractFactory.model.abstractt.Chair
import abstractFactory.model.abstractt.Table

interface FurnitureFactory {
    fun createChair(): Chair
    fun createTable(): Table
}