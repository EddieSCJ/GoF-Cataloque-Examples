package strategy.impl

import strategy.TaxCalculatorStrategy

class IndividualTaxCalculatorStrategy : TaxCalculatorStrategy {
    override fun calculateTax(income: Double): Double {
        return when {
            income < 10000 -> income * 0.2
            income < 100000 -> income * 0.4
            else -> income * 0.5
        }
    }
}