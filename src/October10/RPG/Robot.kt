package October10.RPG

class Robot(health: Double, power: Double, var battery: Int) : Human(health, power) {
    override fun heal(health: Double) {

    }

    override fun hit(power: Double) {

    }

    fun Overcharge(battery: Int) { // Повышает значения power на 1 удар ценой заряда (1 заряд даёт 0.2 к силе)
        val num = (1..battery).random()
        if (battery != 0) {
            power += num * battery * 0.2
            this.battery -= num
        } else {
            power = 0.0
        }
    }
}

// some comments