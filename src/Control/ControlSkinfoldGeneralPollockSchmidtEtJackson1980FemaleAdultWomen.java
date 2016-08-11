package Control;

import Skinfold.SkinfoldFemaleGeneralPollockSchmidtEtJackson1980;

import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldGeneralPollockSchmidtEtJackson1980FemaleAdultWomen {
	
	SkinfoldFemaleGeneralPollockSchmidtEtJackson1980 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldGeneralPollockSchmidtEtJackson1980FemaleAdultWomen() {

		obj = new SkinfoldFemaleGeneralPollockSchmidtEtJackson1980();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_Pollock_Schmidt_Et_Jackson_1980_AdultWomen(double TR, double SI, double CX, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setSI(SI);
		obj.setCX(CX);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.AdultWomen();
		
			
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}

}
