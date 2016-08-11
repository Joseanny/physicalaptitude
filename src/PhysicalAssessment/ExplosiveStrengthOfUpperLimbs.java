package PhysicalAssessment;

public class ExplosiveStrengthOfUpperLimbs {

	private double firstThrow;
	private double secondThrow;

	public double calculationExplosiveStrengthOfUpperLimbs() {

		double res;

		if (firstThrow >= secondThrow) {

			res = firstThrow;

		} else {

			res = secondThrow;
		}

		return res;
	}

	public double getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(double firstThrow) {
		this.firstThrow = firstThrow;
	}

	public double getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(double secondThrow) {
		this.secondThrow = secondThrow;
	}

}
