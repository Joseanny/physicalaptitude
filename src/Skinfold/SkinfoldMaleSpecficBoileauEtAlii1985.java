package Skinfold;

public class SkinfoldMaleSpecficBoileauEtAlii1985 extends  SkinfoldMaleSpecfic {
	
    public double WhiteAndBlackBoys_8A17years() { /* Meninos brancos e negros */

    	double fatPercentage /* Percentual de gordura */ = 1.35 * (getTR() + getSB()) - (0.012 * Math.pow(getSB() + getTR(), 2)) - 4.4;
    	
    	return fatPercentage;
    }
}
