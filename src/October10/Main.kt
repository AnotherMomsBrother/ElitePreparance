package October10

import October10.Classes.Cabriolette
import October10.Classes.Car
import java.awt.Color
import java.util.*

fun main() {

    val Machine1 = Car(Color.BLUE, 123, "Lada")
    val Machine2 = Car(Color.BLUE, 123, "Lada")
    val Machine3 = Car(Color.BLUE, 123, "Lada")
    val Machine4 = Car(Color.BLUE, 123, "Lada")

    val NoRoofMachine = Cabriolette(Color.RED, 777, "Porsche", false, Destination.West)

    Machine1.signal()
    println(Car.count)
    Machine2.signal()
    println(Car.count)
    Machine3.signal()
    println(Car.count)
    Machine4.signal()
    println(Car.count)
    /* Значение count было бы отдельным для каждого объекта (у каждой машины был бы равен 1
       Однако из-за того, что count изменяется методом в составе companion object,
       его значение растёт при каждом вызове метода countIncrease с помощью метода класса signal */

    Car.countIncrease() /* К методам companion object можно обратиться лишь напрямую через класс Classes.Car */

    NoRoofMachine.signal() /* Так как класс Classes.Cabriolette является дочерним, его объекты могут выполнять
    signal() родительского класса */

    NoRoofMachine.changeStateRoof() /* Особый метод для Classes.Cabriolette, который не может выполнить Classes.Car */

    print(Machine1.toString())


    var dest = NoRoofMachine.dest

    when(dest) {
        Destination.East -> { println("East")}
        Destination.West -> { println("West")}
        Destination.South -> { println("South")}
        Destination.North -> { println("North")}
    }

    val carArray = arrayOf(
        Car(Color.BLUE, 123, "Lada Grante"),
        Car(Color.BLUE, 111, "Lada Kalina"),
        Car(Color.BLUE, 312, "Lada Pidor"),
        Car(Color.BLUE, 331, "Lada Ebuchi")
    )

    println("-----------------------------------------")
    println(carArray.contentToString())
    Arrays.sort(carArray)
    println(carArray.contentToString())
}