
package PhysicalAssessment;


public class Flexibility { // Avaliação Física Flexibilidade
    private double firstTryDistance, secondTryDistance;

	public double getFirstTryDistance() {
		return firstTryDistance;
	}

	public void setFirstTryDistance(double firstTryDistance) {
		this.firstTryDistance = firstTryDistance;
	}

	public double getSecondTryDistance() {
		return secondTryDistance;
	}

	public void setSecondTryDistance(double secondTryDistance) {
		this.secondTryDistance = secondTryDistance;
	}
    
    public double calculatesDistanceOfArms(){
    	
    	double resultOfFlexibilityToCalculate;
    	
    	if(firstTryDistance > secondTryDistance){
    		resultOfFlexibilityToCalculate = firstTryDistance;
    	}
    	else{
    		resultOfFlexibilityToCalculate = secondTryDistance;
    	}
    	if(firstTryDistance == secondTryDistance){
    		resultOfFlexibilityToCalculate = firstTryDistance;
    	}
    	return resultOfFlexibilityToCalculate;   	
    	
    }
}
