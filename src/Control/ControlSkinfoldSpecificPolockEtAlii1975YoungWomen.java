package Control;

import Skinfold.SkinfoldFemaleSpecficPolockEtAlii1975;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificPolockEtAlii1975YoungWomen {
	SkinfoldFemaleSpecficPolockEtAlii1975 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificPolockEtAlii1975YoungWomen() {

		obj = new SkinfoldFemaleSpecficPolockEtAlii1975();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_Polock_Et_Alii_1975(double AM, double CX, int gender, int age) {
		String res = null;
		
		obj.setAM(AM);;
		obj.setCX(CX);;
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.YoungWomen();
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res; 
	}
}
