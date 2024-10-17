package October10.Shapes

class Triangle(val height: Int, val base: Int) : Geometry() {
    override fun area(): Double {
        return (base * 0.5 * height).toDouble()
    }
}