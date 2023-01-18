import abstractFactory.AbstractFactoryExample
import composite.CompositeExample
import strategy.StrategyExample

fun main() {

    // Composite pattern example
    println("-------------------- Composite pattern example --------------------")
    CompositeExample.run();
    println()

    println("-------------------- Strategy pattern example --------------------")
    // Strategy pattern example
    StrategyExample.run();
    println()

    println("-------------------- Abstract Factory pattern example --------------------")
    // Abstract Factory pattern example
    AbstractFactoryExample.run();
}