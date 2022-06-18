package car.vehicle

import car.Manufacturer
import car.Owner
import car.engine.Engine

class FlyingCar(engine: List<Engine>, producer: Manufacturer, owner: Owner, x: Int, y: Int, override var z: Int) : Car(engine, producer, owner, x, y), FlyingVehicle