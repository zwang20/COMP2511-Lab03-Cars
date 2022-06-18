package car.engine

import car.Manufacturer

class ThermalEngine(producer: Manufacturer, maxSpeed: Int = 114) : Engine(producer, maxSpeed) {
     override var maxSpeed: Int
        get() = super.maxSpeed
        set(speed) {
            if (speed in (100..250))
                super.maxSpeed = speed
        }
}