
package PhysicalAssessment;

public class BodyMassIndex { //Avaliação Física IMC
	
	double bodyWeight, heightInMeters;

	public double getBodyWeight() {
		return bodyWeight;
	}

	public void setBodyWeight(double bodyWeight) {
		this.bodyWeight = bodyWeight;
	}

	public double getHeightInMeters() {
		return heightInMeters;
	}

	public void setHeightInMeters(double heightInMeters) {
		this.heightInMeters = heightInMeters;
	}
	
	public double calculateBodyMassIndex() {
		
		double resultOfBodyMassIndexToCalculate = bodyWeight/Math.pow(heightInMeters,2);
		
		return resultOfBodyMassIndexToCalculate;
	}
	
	
}