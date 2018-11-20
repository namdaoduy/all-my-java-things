package main;

public class Side {
	
	private int value;
	private double ratio;
	private static final double lowRatio = 0.16;
	private static final double highRatio = 0.2;

	public static void main(String[] args) {
		System.out.println("Side");
	}
	
	public Side(int val) {
		super();
		this.setValue(val);
		this.setRatio(lowRatio);
	}
	
	public Side(int val, boolean specialSide) {
		this(val);
		this.setRatio(highRatio);
	}
	
	public int getValue() {
		return this.value;
	}
	
	private void setValue(int val) {
		this.value = val;
	}
	
	public double getRatio() {
		return this.ratio;
	}
	
	private void setRatio(double rat) {
		this.ratio = rat;
	}

}
