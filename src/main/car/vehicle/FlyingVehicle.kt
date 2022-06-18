package car.vehicle

interface FlyingVehicle: Vehicle {
    var z: Int

    fun fly(x: Int, y: Int, z: Int) {
        this.x = x
        this.y = y
        this.z = z
    }
}