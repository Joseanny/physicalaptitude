package Anthropometric;

public class AnthropometricFemaleSpecificWeltmanEtAlii1988 extends AnthropometricFemaleSpecific {
	
	public double Obese20A60years(){/*obesas de 20 a 60 anos*/
		
		double fatPercentage /* %G */ = 0.11077 * getPABD() - 0.17666 * getA() + 0.187 * getMC() + 51.03301;
		
		return fatPercentage;
	}

}
