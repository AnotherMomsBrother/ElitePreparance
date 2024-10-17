package October10.Abstract_Classes/* В самих абстрактных классах можно не реализовывать методы, но они ДОЛЖНЫ быть реализованы
   в дочерних классах. Также дочерние классы обязаны иметь признаки родительского (здесь: material) */
abstract class Furniture (var material:String, )
{
    abstract fun create()
}