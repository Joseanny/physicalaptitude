package Neuromuscular;

public class ImpulsionHorizontal {

	private double distance1;
	private double distance2;

	public double calculationImpulsionHorizontal() {

		double result;

		if (distance1 >= distance2) {
			result = distance1;
		} else {
			result = distance2;
		}

		return result;
	}

	public double getdistance1() {
		return distance1;
	}

	public void setdistance1(double distance1) {
		this.distance1 = distance1;
	}

	public double getdistance2() {
		return distance2;
	}

	public void setdistance2(double distance2) {
		this.distance2 = distance2;
	}
}
