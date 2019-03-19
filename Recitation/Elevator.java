public class Elevator{
	int topFloor;
	int currentFloor;
	int capacity;
	int numRiders;

	public Elevator(int topFloor, int capacity){ //contructor
		this.topFloor = tFloor;
		this.capacity = cap;
		currentFloor = 0;
		numRiders = 0;
	}

	public void moveUp(int floors){
		if(currentFloor + floors <= topFloor){
			currentFloor += floors;
		}
		else{
			currentFloor = topFloor;
		}
	}

	public void moveDown(int floors){
		if(currentFloor - floors >= 0){
			currentFloor -= floors;
		}
		else{
			currentFloor = 0;
		}
	}

	public void addRiders(int riders){
		if(numRiders + riders <= capacity){
			numRiders += riders;
		}
		else{
			numRiders = capacity;
		}
	}

	public void removeRiders(int riders){
		if(numRiders - riders >= 0){
			numRiders -= riders;
		}
		else{
			numRiders = 0;
		}
	}

	public void printinfo(){ 
		System.out.println("Top Floor:" + topFloor);
	}
}