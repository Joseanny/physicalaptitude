package Control;

import Skinfold.SkinfoldFemaleSpecficPolockEtAlii1975;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificPolockEtAlii1975MiddleAgedWomen {

	SkinfoldFemaleSpecficPolockEtAlii1975 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificPolockEtAlii1975MiddleAgedWomen() {

		obj = new SkinfoldFemaleSpecficPolockEtAlii1975();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_Polock_Et_Alii_1975(double AM, double CX, int gender, int age) {
		String res = null;
		
		obj.setAM(AM);;
		obj.setCX(CX);;
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Middle_AgedWomen();
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res; 
	}
}
