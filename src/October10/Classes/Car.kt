package October10.Classes

import October10.Interface.ISwim
import java.awt.Color

/* Тег open позволяет наследоваться от класса Car */
open class Car (private var carColor: Color, var carNum: Int, private var model: String):
    ISwim, Comparable<Car>{ // Comparable<ClassName> - Сравнит объекты Car и ClassName
    /* Описание методов класса Car */
    companion object {
        var count:Int = 0

        fun countIncrease() {
            count++
        }
    }

    fun openBaggage() {
        carColor = Color.RED
    }

    /* Тег open позволяет переопределять метод signal */
    open fun signal() {
        // Функционал метода
        println("Би-би, съеби с дороги")
        countIncrease()
    }

    override fun toString(): String {
        // Генерируем toString() с помощью ПКМ -> Generate -> toString
        return "Classes.Car(carColor=$carColor, carNum=$carNum, model='$model')"
    }

    override fun swim() { // Добавили машине возможность "Плавать"
    }

    override fun compareTo(other: Car): Int {
        if (carNum == other.carNum) {
            return 0
        } else if(carNum > other.carNum){
            return 1
        }
        return -1
    }

}

/* Определения: */
/*
1. Инкапсуляция - это принцип в программировании, согласно которому внутреннее устройство сущностей нужно
 объединять в специальной «оболочке» и скрывать от вмешательств извне.

2. Наследование - способность дочерних классов сохранять методы родительского класса. При этом зависимый класс
 может содержать и свои методы внутри себя

3. Полиморфизм - Полиморфизм — это концепция, которая позволяет разным сущностям выполнять одни и
те же действия. При этом неважно, как эти сущности устроены внутри и чем они различаются.
 */