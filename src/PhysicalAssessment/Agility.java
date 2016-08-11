
package PhysicalAssessment;

public class Agility{ // Avaliação Física Agilidade
    
	private double firstAttemptTime;//primeira tentativa de tempo
	private double secondAttempTime;
		
	public double getFirstAttemptTime() {
		return firstAttemptTime;
	}
	public void setFirstAttemptTime(double firstAttemptTime) {
		this.firstAttemptTime = firstAttemptTime;
	}
	public double getSecondAttempTime() {
		return secondAttempTime;
	}
	public void setSecondAttempTime(double secondAttempTime) {
		this.secondAttempTime = secondAttempTime;
	}


	public double attemptLastTime() {//tentativa com menor tempo
		
		double resultLastTime;
		
		if(firstAttemptTime < secondAttempTime){
			
			resultLastTime = firstAttemptTime;	
		}
		
		else{
			
			resultLastTime = secondAttempTime;
			
		}
		
		if(firstAttemptTime == secondAttempTime) {
			
			resultLastTime = firstAttemptTime;
		}
		
		return resultLastTime;
	}
	
}
