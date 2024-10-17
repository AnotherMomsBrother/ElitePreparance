package October10.Shapes

class Rectangle(val weight : Int, val height: Int) : Geometry() {
    override fun area():Double {
        return (weight * height).toDouble()
    }
}