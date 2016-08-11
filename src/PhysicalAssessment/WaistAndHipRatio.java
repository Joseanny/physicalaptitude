package PhysicalAssessment;

public class WaistAndHipRatio {

	private double waist;
	private double hip;

	public double calculationWaistAndHipRatio() {

		double result = waist / hip;

		return result;
	}

	public double getwaist() {
		return waist;
	}

	public void setwaist(double waist) {
		this.waist = waist;
	}

	public double gethip() {
		return hip;
	}

	public void sethip(double hip) {
		this.hip = hip;
	}

}
