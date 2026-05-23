Functional Requriements =>
---------------------------

1) Support multiple parking floors, each with a configurable number of parking spots.
2) Support multiple vehicle types, including bikes, cars, and trucks
3) Classify parking spots by size (e.g., Small, Medium, Large) and match them with appropriate vehicle types
4) Automatically assign parking spots based on availability
5) Issue a parking ticket upon vehicle entry and track entry and exit times
6) Calculate parking fees based on duration of stay and support different pricing strategies, such as flat-rate or vehicle-type-based pricing.
7) Support querying and displaying real-time availability of parking spots, grouped by floor and spot size.
8) Parking requests can be hardcoded in a driver/demo class for simulation purpose.

Non-Functional Requirements =>
-------------------------------

1) The design should follow object-oriented principles with clear separation of concerns
2) The system should handle concurrent entry/exit events without race conditions
3) The system should be modular and extensible to support future enhancements
4) The code should be thread-safe for concurrent access
5) The components should be testable in isolation

Core Classes =>
----------------

1) ParkingLot
2) ParkingFloor
3) ParkingSpot

Data Classes =>
----------------

1) Vehicle
2) ParkingTicket

Interfaces =>
----------------

1) FeeStrategy
2) SpotAllocationStrategy

Enums =>
----------------

1) VehicleSize (SMALL, MEDIUM, LARGE) - This single enum serves double duty: it describes both vehicle sizes and spot sizes.

Custom Exceptions =>
----------------------

1) ParkingException - Base exception for parking-related errors


-------------------------------------------------------------------------------------------------
* Entity	             Type	                                    Responsibility
-------------------------------------------------------------------------------------------------
* VehicleSize	         Enum	                    Vehicle/spot sizes: SMALL, MEDIUM, LARGE
* Vehicle	         Abstract Class	                Base class with license plate and size
* Bike, Car, Truck	  Data Classes	                Concrete vehicle types
* ParkingSpot	       Core Class	                Manages individual spot state
* ParkingFloor	       Core Class	                 Groups spots by floor
* ParkingLot	       Core Class (Singleton)	     Orchestrates entire system
* ParkingTicket	       Data Class	                 Tracks parking session
* FeeStrategy	        Interface	                 Contract for fee calculation
* SpotAllocationStrategy	Interface	             Contract for spot selection

