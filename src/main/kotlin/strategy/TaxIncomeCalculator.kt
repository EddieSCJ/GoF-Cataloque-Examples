package strategy

import strategy.enums.PersonType
import strategy.impl.CompanyTaxCalculatorStrategy
import strategy.impl.IndividualTaxCalculatorStrategy


object TaxIncomeCalculator {


    fun calculateTax(income: Double, personType: PersonType): Double {
        val strategy = getStrategy(personType)
        return strategy.calculateTax(income)
    }

    private fun getStrategy(personType: PersonType): TaxCalculatorStrategy {
        return when (personType) {
            PersonType.INDIVIDUAL -> IndividualTaxCalculatorStrategy()
            PersonType.COMPANY -> CompanyTaxCalculatorStrategy()
        }
    }
}