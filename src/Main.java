
public class Main {

	public static void main(String[] args) {
		
		Client client1 = new Client("Dani", 5);
		Client client2 = new Client("Raul", 5);
		
		Car car1 = new Car(1, "sofer1", 50, 3);
		Car car2 = new Car(2, "sofer2", 30, 3);
		Car car3 = new Car(3, "sofer3", 20, 3);
		Car car4 = new Car(4, "sofer4", 10, 3);
		
		Mediator.RegisterCar(car1);
		Mediator.RegisterCar(car2);
		Mediator.RegisterCar(car3);
		Mediator.RegisterCar(car4);
		
		client1.sendRequest();
		client2.sendRequest();

	}

}
