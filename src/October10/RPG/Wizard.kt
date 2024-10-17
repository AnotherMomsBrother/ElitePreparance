package October10.RPG

class Wizard (health : Double, power : Double, var mana : Int) : Human(health, power) {
    override fun heal(health: Double) {

    }

    override fun hit(power: Double) {

    }
    fun Exhaust (mana: Int) { // Понижает значения power у врагов (костыль: увеличивает своё здоровье (1 мана = 0.75 здоровья)
        val num = (1..mana).random()
        if (mana != 0) {
            power += num * mana * 0.2
            mana -= num
        } else {
            power = 0.0
        }
    }
}