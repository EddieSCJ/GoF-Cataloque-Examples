package strategy

interface TaxCalculatorStrategy {
    fun calculateTax(income: Double): Double;
}