package Control;

import Skinfold.SkinfoldMaleGeneralPetroski1995;
import Table.TableBodyDenstiyMan;


public class ControlSkinfoldGeneralPetroski1995Male18A61years {

	SkinfoldMaleGeneralPetroski1995 obj;
	TableBodyDenstiyMan tab3;
	
	public void Control_Skinfold_General_Petroski_1995_Female_18A61years() {

		obj = new SkinfoldMaleGeneralPetroski1995();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_Petroski_1995_Female_18A61years(double SB, double TR, double SI, double PR, int gender, int age) {
		String res = null;
		
		obj.setSB(SB);
		obj.setTR(TR);
		obj.setSI(SI);
		obj.setPR(PR);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Male_18A61years();
		
			
		res = tab3.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}
}
