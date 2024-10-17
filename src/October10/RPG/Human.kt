package October10.RPG

abstract class Human (var health : Double, var power : Double) {
    abstract fun heal(health: Double)

    abstract fun hit(power: Double)
}