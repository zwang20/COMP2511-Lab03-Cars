package car.engine

import car.Manufacturer

class ElecricalEngine(producer: Manufacturer, maxSpeed: Int = 180) : Engine(producer, maxSpeed) {
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(speed) {
            if (speed <= 180 && speed % 6 > 0)
                super.maxSpeed = speed
        }
}