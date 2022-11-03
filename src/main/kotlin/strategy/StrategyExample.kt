package strategy

import strategy.enums.PersonType

object StrategyExample {
    fun run() {
        val individualIncome = 10000.0
        println("Running Tax Calculator for Individual. Income: $individualIncome")
        println("Tax value: ${TaxIncomeCalculator.calculateTax(individualIncome, PersonType.INDIVIDUAL)}")

        val companyIncome = 10000.0
        println("Running Tax Calculator for Company. Income: $companyIncome")
        println("Tax value: ${TaxIncomeCalculator.calculateTax(companyIncome, PersonType.COMPANY)}")
    }
}