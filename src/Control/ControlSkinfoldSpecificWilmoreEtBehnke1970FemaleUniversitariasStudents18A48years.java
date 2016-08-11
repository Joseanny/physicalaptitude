package Control;

import Skinfold.SkinfoldFemaleSpecficWilmoreEtBehnke1970;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificWilmoreEtBehnke1970FemaleUniversitariasStudents18A48years {

	SkinfoldFemaleSpecficWilmoreEtBehnke1970 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificWilmoreEtBehnke1970FemaleUniversitariasStudents18A48years() {

		obj = new SkinfoldFemaleSpecficWilmoreEtBehnke1970();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_WilmoreEtBehnke_1970(double TR, double SB, double CX, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setSB(SB);
		obj.setCX(CX);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res; 
	}
}
