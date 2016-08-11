package Skinfold;

public class SkinfoldMaleSpecficDurninEtWomersley1974 extends SkinfoldMaleSpecfic{
	
	double density; // densidade
	
	public double Men17A19years() { /* Homens de 17 a 19 anos */

		density = Math.log10(1.162 - 0.063) * (getTR() + getBI() + getSB() + getSI());
        
        return density;
		
    }
    
    public double Men20A29years() { /* Homens de 20 a 29 anos */

    	density = Math.log10(1.1631 - 0.0632) * (getTR() + getBI() + getSB() + getSI());
        
        return density;
    }
    
    public double Men30A39years() { /* Homens de 30 a 39 anos */

    	density = Math.log10(1.1422 - 0.0544) * (getTR() + getBI() + getSB() + getSI());
        
        return density;
    }
    
    public double Men40A49years() { /* Homens de 40 a 49 anos */

    	density = Math.log10(1.162 - 0.07) * (getTR() + getBI() + getSB() + getSI());
        
        return density;
    }
    
    public double Men50A72years() { /* Homens de 50 a 72 anos */

    	density = Math.log10(1.1715 - 0.0779) * (getTR() + getBI() + getSB() + getSI());
        
        return density;
    }
    
    public double CalculateFatPercentage(double age, int gender) {
    	
    	double fatPercentage = 0;
    	
    	if (age >= 7 && age <= 8 && gender == 1){
    		
    		fatPercentage = 497 - (538/density);
    	}
    	else if (age >= 9 && age <= 10 && gender == 1){
    		
    		fatPercentage = 489 - (530/density);
    	}
    	else if (age >= 11 && age <= 12 && gender == 1){
    		
    		fatPercentage = 481 - (523/density);
    	}
    	else if (age >= 13 && age <= 14 && gender == 1){
    		
    		fatPercentage = 464 - (507/density);
    	}
    	else if (age >= 15 && age <= 16 && gender == 1){
    		
    		fatPercentage = 459 - (503/density);
    	}
    	else if (age >= 17 && age <= 19 && gender == 1){
    		
    		fatPercentage = 453 - (498/density);
    	}
    	else if (age >= 20 && age <= 50 && gender == 1){
    		
    		fatPercentage = 450 - (495/density);
    	}
    	else if (age >= 7 && age <= 8 && gender == 2){
    		
    		fatPercentage = 503 - (543/density);
    	}
    	else if (age >= 9 && age <= 10 && gender == 2){
    		
    		fatPercentage = 495 - (535/density);
    	}
    	else if (age >= 11 && age <= 12 && gender == 2){
    		
    		fatPercentage = 484 - (525/density);
    	}
    	else if (age >= 13 && age <= 14 && gender == 2){
    		
    		fatPercentage = 469 - (512/density);
    	}
    	else if (age >= 15 && age <= 16 && gender == 2){
    		
    		fatPercentage = 464 - (507/density);
    	}
    	else if (age >= 17 && age <= 19 && gender == 2){
    		
    		fatPercentage = 462 - (505/density);
    	}
    	else if (age >= 20 && age <= 50 && gender == 2){
    		
    		fatPercentage = 459 - (503/density);
    	}

    	return fatPercentage;
    }
}
