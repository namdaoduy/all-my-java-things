package main;

public class Dice {
	
	private static final int numberOfSide = 6;
	private Side[] side = new Side[numberOfSide];
	
	public static void main(String[] args) {
		System.out.println("Dice");
	}
	
	public Dice(int specialSide) {
		super();
		for (int i = 0; i < numberOfSide; i++) {
			if (specialSide == i+1) {
				this.setSideById(i, new Side(i+1, true));
			}
			else {
				this.setSideById(i, new Side(i+1));
			}
		}
	}
	
	public Side getSideById(int id) {
		return this.side[id];
	}
	
	public Side getSideByValue(int val) {
		return this.side[val - 1];
	}
	
	private void setSideById(int id, Side val) {
		this.side[id] = val;
	}
}
