package Control;

import Skinfold.SkinfoldFemaleGeneralPetroski1995;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldGeneralPetroski1995Female18A61years {
	
	SkinfoldFemaleGeneralPetroski1995 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldGeneralPetroski1995Female18A61years() {

		obj = new SkinfoldFemaleGeneralPetroski1995();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_Petroski_1995_Female_18A61years(double AM, double SI, double CX, double PR, int gender, int age) {
		String res = null;
		
		obj.setAM(AM);
		obj.setSI(SI);
		obj.setCX(CX);
		obj.setPR(PR);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Female_18A61years();
		
			
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}
}
