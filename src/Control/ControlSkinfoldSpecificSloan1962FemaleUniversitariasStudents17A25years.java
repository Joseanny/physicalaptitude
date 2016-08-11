package Control;

import Skinfold.SkinfoldFemaleSpecficSloanEtAlii1962;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificSloan1962FemaleUniversitariasStudents17A25years {
	
	SkinfoldFemaleSpecficSloanEtAlii1962 obj;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificSloan1962FemaleUniversitariasStudents17A25years(){

		obj = new SkinfoldFemaleSpecficSloanEtAlii1962();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_SloanEtAlii_1962(double TR, double SI, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setSI(SI);;
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.UniversityStudents_17A25years();
		
		if(age == 17){
			res = tab1.check(obj.CalculateFatPercentage(age, gender));
		}
		else if(age >= 18 || age <= 25){
			res = tab4.check(obj.CalculateFatPercentage(age, gender), age);
		}

		return res; 
	}
}
