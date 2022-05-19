
public class CarTest {

	public static void main(String[] args) {
		Piston pistObj = new Piston();
		Engine engObj = new Engine(pistObj);
		Car carObj = new Car(engObj);
		carObj.startCar();
		
		Driver driver1= new Driver();
		driver1.driveTheCar();

	}

}

class Car{
	
	Engine engObj;
	
	Car(Engine x){
		engObj=x;
	}
	
	void startCar() {
		engObj.igniteTheEngine();
		System.out.println("Car is started....");
	}
}
class Engine{
	Piston pistObj;
	Engine(Piston x){
		pistObj=x;
	}
	void igniteTheEngine() {
		pistObj.firePiston();
		System.out.println("Igniting the engine.....");
	}
}
class Piston{
	
	void firePiston() {
		System.out.println("Firing the piston.....");
	}
}
class Driver{
	
	static void driveTheCar() {
		System.out.println("Driving.....");
	}
}
