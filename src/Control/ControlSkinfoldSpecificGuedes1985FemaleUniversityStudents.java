package Control;

import Skinfold.SkinfoldFemaleSpecficGuedes1985;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificGuedes1985FemaleUniversityStudents {

	SkinfoldFemaleSpecficGuedes1985 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificGuedes1985FemaleUniversityStudents() {

		obj = new SkinfoldFemaleSpecficGuedes1985();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_DurninEtWonersley_1974(double CX, double SI, double SB, int gender, int age) {
		String res = null;
		
		obj.setCX(CX);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.UniversityStudents();
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender),age);

		return res; 
	}
}
