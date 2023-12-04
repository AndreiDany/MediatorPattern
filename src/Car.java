import java.util.Scanner;

public class Car {

	private int id;
	private String driverName;
	private boolean inProgress = false;
	private int distance;
	private int comfort;
	
	public Car(int id, String driverName, int distance, int comfort) {
		this.id = id;
		this.driverName = driverName;
		this.distance = distance;
		this.comfort = comfort;
	}
	
	public boolean acceptance(Client client) {
		
		System.out.println("Acceptati (ca sofer) comanda de la clientul: " + client.getName());
		System.out.println("[1] accepta");
		System.out.println("[2] respinge");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		if(option == 1)
			return true;
		else
			return false;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public boolean isInProgress() {
		return inProgress;
	}

	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
