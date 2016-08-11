package Skinfold;

public class SkinfoldMaleSpecficWilmoreEtBehnke1969 extends SkinfoldMaleSpecfic{
	
	double denstiy; // densidade
	
	public double UniversityStudents_17A37years() { /* Estudantes Universitários de 17 a 37 anos */

    	denstiy = ((1.08543 - 0.000886) * getAB()) - (0.0004 * getCX());
        
        return denstiy;
    }
	
	public double CalcularPercentualDeGordura(double age, int gender) {
		
    	double fatPercentage = 0;
    	
    	if (age >= 7 && age <= 8 && gender == 1){
    		
    		fatPercentage = 497 - (538/denstiy);
    	}
    	else if (age >= 9 && age <= 10 && gender == 1){
    		
    		fatPercentage = 489 - (530/denstiy);
    	}
    	else if (age >= 11 && age <= 12 && gender == 1){
    		
    		fatPercentage = 481 - (523/denstiy);
    	}
    	else if (age >= 13 && age <= 14 && gender == 1){
    		
    		fatPercentage = 464 - (507/denstiy);
    	}
    	else if (age >= 15 && age <= 16 && gender == 1){
    		
    		fatPercentage = 459 - (503/denstiy);
    	}
    	else if (age >= 17 && age <= 19 && gender == 1){
    		
    		fatPercentage = 453 - (498/denstiy);
    	}
    	else if (age >= 20 && age <= 50 && gender == 1){
    		
    		fatPercentage = 450 - (495/denstiy);
    	}
    	else if (age >= 7 && age <= 8 && gender == 2){
    		
    		fatPercentage = 503 - (543/denstiy);
    	}
    	else if (age >= 9 && age <= 10 && gender == 2){
    		
    		fatPercentage = 495 - (535/denstiy);
    	}
    	else if (age >= 11 && age <= 12 && gender == 2){
    		
    		fatPercentage = 484 - (525/denstiy);
    	}
    	else if (age >= 13 && age <= 14 && gender == 2){
    		
    		fatPercentage = 469 - (512/denstiy);
    	}
    	else if (age >= 15 && age <= 16 && gender == 2){
    		
    		fatPercentage = 464 - (507/denstiy);
    	}
    	else if (age >= 17 && age <= 19 && gender == 2){
    		
    		fatPercentage = 462 - (505/denstiy);
    	}
    	else if (age >= 20 && age <= 50 && gender == 2){
    		
    		fatPercentage = 459 - (503/denstiy);
    	}

    	return fatPercentage;
    }
}
