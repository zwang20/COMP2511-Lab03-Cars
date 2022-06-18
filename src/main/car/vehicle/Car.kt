package car.vehicle

import car.Manufacturer
import car.Owner
import car.engine.Engine

open class Car(var engine: List<Engine>, var producer: Manufacturer, var owner: Owner, override var x: Int, override var y: Int): Vehicle