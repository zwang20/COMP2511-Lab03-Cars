package car.vehicle

import car.Manufacturer
import car.Owner
import car.engine.Engine
import java.time.LocalDateTime

class TimeTravelCar(engine: List<Engine>, producer: Manufacturer, owner: Owner, x: Int, y: Int, override var time: LocalDateTime): Car(engine, producer, owner, x, y), TimeTravelVehicle