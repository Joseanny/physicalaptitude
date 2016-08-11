package Neuromuscular;

public class DynamometerManual {

	double measureFirstTimeRightHand;
	double measureSecondTimeRightHard;

	double measureFirstTimeLeftHard;
	double measureSecondTimeLeftHard;

	double bestResultRight;
	double bestResultLeft;

	public double comparisonHardRight() {

		if (measureFirstTimeRightHand >= measureSecondTimeRightHard) {
			bestResultRight = measureFirstTimeRightHand;
		} else {
			bestResultRight = measureSecondTimeRightHard;
		}

		return bestResultRight;
	}

	public double comparisonHardLeft() {

		if (measureFirstTimeLeftHard >= measureSecondTimeLeftHard) {
			bestResultLeft = measureFirstTimeLeftHard;
		} else {
			bestResultLeft = measureSecondTimeLeftHard;
		}

		return bestResultLeft;
	}

	public double calculationDynamometer() {

		double generalResult = bestResultLeft + bestResultRight;
		return generalResult;

	}

	public double getMeasureFirstTimeRightHand() {
		return measureFirstTimeRightHand;
	}

	public void setMeasureFirstTimeRightHand(double measureFirstTimeRightHand) {
		this.measureFirstTimeRightHand = measureFirstTimeRightHand;
	}

	public double getMeasureSecondTimeRightHard() {
		return measureSecondTimeRightHard;
	}

	public void setMeasureSecondTimeRightHard(double measureSecondTimeRightHard) {
		this.measureSecondTimeRightHard = measureSecondTimeRightHard;
	}

	public double getMeasureFirstTimeLeftHard() {
		return measureFirstTimeLeftHard;
	}

	public void setMeasureFirstTimeLeftHard(double measureFirstTimeLeftHard) {
		this.measureFirstTimeLeftHard = measureFirstTimeLeftHard;
	}

	public double getMeasureSecondTimeLeftHard() {
		return measureSecondTimeLeftHard;
	}

	public void setMeasureSecondTimeLeftHard(double measureSecondTimeLeftHard) {
		this.measureSecondTimeLeftHard = measureSecondTimeLeftHard;
	}
}
