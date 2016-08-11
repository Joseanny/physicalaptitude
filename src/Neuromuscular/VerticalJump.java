package Neuromuscular;

public class VerticalJump {

	private double weight;
	private double greaterDistance;
	private double smallerDistance;
	private double difference;

	public double makeDifference() {

		difference = greaterDistance - smallerDistance;

		return difference;
	}

	public double calculationVerticalJump() {

		double result = 2.21 * weight * Math.sqrt(difference);

		return result;

	}

	public double getweight() {
		return weight;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}

	public double getgreaterDistance() {
		return greaterDistance;
	}

	public void setgreaterDistance(double greaterDistance) {
		this.greaterDistance = greaterDistance;
	}

	public double getsmallerDistance() {
		return smallerDistance;
	}

	public void setsmallerDistance(double smallerDistance) {
		this.smallerDistance = smallerDistance;
	}

}
