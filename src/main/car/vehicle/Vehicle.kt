package car.vehicle

interface Vehicle {
    var x: Int
    var y: Int

    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}