package Skinfold;

public class SkinfoldFemaleSpecficBoileauEtAlii1985 extends SkinfoldFemaleSpecfic {

	 public double Female_1985() { 
		 
	    	double fatPercentage = 1.35 * (getTR() + getSB()) - (0.012 * Math.pow(getSB() + getTR(), 2)) - 2.4;
	    	/* Percentual de gordura */
	    	
	        return fatPercentage;
	    }
}
