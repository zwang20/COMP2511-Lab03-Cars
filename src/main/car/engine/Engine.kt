package car.engine

import car.Manufacturer

abstract class Engine(val producer: Manufacturer, open var maxSpeed: Int)