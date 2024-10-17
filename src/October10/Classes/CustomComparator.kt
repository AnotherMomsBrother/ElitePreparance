package October10.Classes

/* Собственная реализация класса Comparator */
class CustomComparator: Comparator<Car> {
    override fun compare(o1: Car?, o2: Car?): Int {
        if (o1!!.carNum == o2!!.carNum) {
            return 0
        } else if (o1?.carNum!! > o2?.carNum!!){
            return -1
        }
        return 1
    }
}