package Skinfold;

public class SkinfoldMaleSpecficDeurenbergEtAlii1990 extends SkinfoldMaleSpecfic{
	
	double fatPercentage; // percentual de gordura
	
	 public double WhiteAndBlackBoys_Prepubescent() { /* Meninos brancos e negros pré-púbere */

	    fatPercentage = Math.log10(26.56) * (getBI() + getTR() + getSB() + getSI())  - 22.23;
	    	
	    	return fatPercentage;
	 }
	 
	 public double WhiteAndBlackBoys_Pubertal() { /* Meninos brancos e negros púbere */

	    fatPercentage = Math.log10(18.7) * (getBI() + getTR() + getSB() + getSI())  - 11.91;
	    	
	        return fatPercentage;
	  }
	 
	 public double WhiteAndBlackBoys_PosPubertal() { /* Meninos brancos e negros pós-púbere */

	    fatPercentage = Math.log10(18.88) * (getBI() + getTR() + getSB() + getSI())  - 15.58;
	    	
	        return fatPercentage;
	 }
}
