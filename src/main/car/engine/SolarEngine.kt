package car.engine

import car.Manufacturer

class SolarEngine(producer: Manufacturer, maxSpeed: Int = 90) : Engine(producer, maxSpeed) {
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(speed) {
            if (speed <= 150)
                super.maxSpeed = speed
        }
}