package car.vehicle

import java.time.LocalDateTime

interface TimeTravelVehicle: Vehicle {
    var time: LocalDateTime

    fun timeTravel(time: LocalDateTime) {
        this.time = time
    }
}