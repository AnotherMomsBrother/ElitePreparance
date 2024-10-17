package October10.RPG

class Knight(health: Double, power: Double, shield: Double) : Human(health, power) {
    override fun heal(health: Double) {

    }

    override fun hit(power: Double) {

    }

    fun ShieldsUp(shield: Double) { // Герой дважды за битву может поднять щит, отразив следующую атаку по себе
        // Пока у героя есть щит, урон по нему уменьшен на 25%

    }
}