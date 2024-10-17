package October10.Classes

import October10.Destination
import java.awt.Color

/* Формат:
class childClass(features) : Parent(features) {}
*/

class Cabriolette(carColor: Color, carNum:Int, model: String, var stateRoof: Boolean, var dest : Destination):
    Car(carColor, carNum, model) {
        fun changeStateRoof() {
            if (stateRoof)
                println("Закрываем крышу")
            else
                println("Открываем крышу")
        }
    /* С помощью override мы переопределяем функционал open метода signal класса Classes.Car
       Результат выполнения signal() у Classes.Cabriolette отличается от signal() у Classes.Car*/
    override fun signal() {
        println("Би-би, брысь с дороги")
    }
}