package Control;

import Skinfold.SkinfoldFemaleSpecficKatchEtMcArdle1973;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificKatchEtMcArdle1973FemaleUniversityStudents {
	
	SkinfoldFemaleSpecficKatchEtMcArdle1973 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificKatchEtMcArdle1973FemaleUniversityStudents() {

		obj = new SkinfoldFemaleSpecficKatchEtMcArdle1973();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_Katch_Et_McArdle_1973(double CX, double SI, double SB, int gender, int age) {
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
