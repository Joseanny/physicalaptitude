package Skinfold;

public class SkinfoldFemaleSpecficSlaughterEtAlii1988 extends SkinfoldFemaleSpecfic{

	double fatPercentage; // percentual de gordura
	
	public double WhiteOrBlackGirlsWitheSumOfLessThanOrEqualTo35mmFolds_8A17anos() { // Meninas brancas ou negras com somatório das dobras menor ou igual a 35mm 

    	fatPercentage = 1.33 * (getTR() + getSB()) - (0.13 * Math.pow(getSB() + getTR(), 2)) - 2.5;
        
        return fatPercentage;
    }
    public double WhiteOrBlackGirlsWitheSumOfFoldsThanOrEqualTo35mmFolds_8A17anos() { // Meninas brancas ou negras com somatório das dobras maior ou igual a 35mm

    	fatPercentage = 0.546 * (getTR() + getSB()) + 9.7;
        
        return fatPercentage;
    }
    public double WhiteOrBlackGirls_8A17anos() { // Meninas brancas ou negras

    	fatPercentage = 0.61 * (getTR() + getPR()) + 5.1;
        
        return fatPercentage;
    }
}
