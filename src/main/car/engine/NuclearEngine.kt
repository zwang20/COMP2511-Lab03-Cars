package car.engine

import car.Manufacturer
import car.isPrime

class NuclearEngine(producer: Manufacturer, maxSpeed: Int = 223) : Engine(producer, maxSpeed) {
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(speed) {
            if (isPrime(speed))
                super.maxSpeed = speed
        }
}