package strategy.impl

import strategy.TaxCalculatorStrategy

class CompanyTaxCalculatorStrategy : TaxCalculatorStrategy {
    override fun calculateTax(income: Double): Double {
        return when {
            income < 10000 -> income * 0.1
            income < 100000 -> income * 0.2
            else -> income * 0.3
        }
    }
}