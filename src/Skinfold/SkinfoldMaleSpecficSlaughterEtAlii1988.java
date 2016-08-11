package Skinfold;

public class SkinfoldMaleSpecficSlaughterEtAlii1988 extends  SkinfoldMaleSpecfic{
	
	double fatPercentage; // percentual de gordura
    
	 public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_Prepubescent() { /* Crian�as e adolescentes, meninos brancos com somat�rio das dobras menor ou igual a 35mm (Pr�-p�bere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 1.7;
	        
	        return fatPercentage;
	    }
	    
	    public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_Pubertal() { /* Crian�as e adolescentes, meninos brancos com somat�rio das dobras menor ou igual a 35mm (P�bere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 3.4;
	        
	        return fatPercentage;
	    }
	    public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_PosPubertal() { /* Crian�as e adolescentes, meninos brancos com somat�rio das dobras menor ou igual a 35mm (P�s-p�bere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 5.5;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_Prepubescent() { /* Meninos negros pr�-p�bere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 3.2;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_Pubertal() { /* Meninos negros p�bere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 5.2;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_PosPubertal() { /* Meninos negros p�s-p�bere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 6.8;
	        
	        return fatPercentage;
	    }
	    public double WhiteOrBlackBoysSummationOfTheLargestFolds35mm() { /* Meninos brancos ou negros com som�torio das dobras maior que 35mm */

	    	fatPercentage = 0.783 * (getTR() + getSB()) + 1.6;
	        
	        return fatPercentage;
	    }
	    public double WhiteAndBlackBoys() { /* Meninos brancos e negros */

	    	fatPercentage = 0.735 * (getTR() + getPR()) + 1;
	        
	        return fatPercentage;
	    }
}
