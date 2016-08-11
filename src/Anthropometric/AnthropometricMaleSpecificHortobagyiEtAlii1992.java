package Anthropometric;

public class AnthropometricMaleSpecificHortobagyiEtAlii1992  extends AnthropometricMaleSpecific{
	
	
	 public double MaleAmericanFootball(){/*futebol americano*/
		
		double fatPercentage = 55.2 + 0.481 * getMC() - 0.468 * getA();
		
		return fatPercentage;
	}
}
