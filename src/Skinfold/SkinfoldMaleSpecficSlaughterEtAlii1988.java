package Skinfold;

public class SkinfoldMaleSpecficSlaughterEtAlii1988 extends  SkinfoldMaleSpecfic{
	
	double fatPercentage; // percentual de gordura
    
	 public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_Prepubescent() { /* Crianças e adolescentes, meninos brancos com somatório das dobras menor ou igual a 35mm (Pré-púbere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 1.7;
	        
	        return fatPercentage;
	    }
	    
	    public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_Pubertal() { /* Crianças e adolescentes, meninos brancos com somatório das dobras menor ou igual a 35mm (Púbere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 3.4;
	        
	        return fatPercentage;
	    }
	    public double ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_PosPubertal() { /* Crianças e adolescentes, meninos brancos com somatório das dobras menor ou igual a 35mm (Pós-púbere)*/

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 5.5;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_Prepubescent() { /* Meninos negros pré-púbere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 3.2;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_Pubertal() { /* Meninos negros púbere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 5.2;
	        
	        return fatPercentage;
	    }
	    public double BlackBoys_PosPubertal() { /* Meninos negros pós-púbere */

	    	fatPercentage = 1.21 * (getTR() + getSB()) - (0.008 * Math.pow(getSB() + getTR(), 2)) - 6.8;
	        
	        return fatPercentage;
	    }
	    public double WhiteOrBlackBoysSummationOfTheLargestFolds35mm() { /* Meninos brancos ou negros com somátorio das dobras maior que 35mm */

	    	fatPercentage = 0.783 * (getTR() + getSB()) + 1.6;
	        
	        return fatPercentage;
	    }
	    public double WhiteAndBlackBoys() { /* Meninos brancos e negros */

	    	fatPercentage = 0.735 * (getTR() + getPR()) + 1;
	        
	        return fatPercentage;
	    }
}
