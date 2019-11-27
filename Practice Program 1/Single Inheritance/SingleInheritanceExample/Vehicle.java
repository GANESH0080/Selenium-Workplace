package SingleInheritanceExample;


class Vehicle
{
	int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle
{
	int maxSpeed = 180;

	void display()
	{
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + maxSpeed);
		System.out.println("Maximum Speed: " + super.maxSpeed);
	}
}
