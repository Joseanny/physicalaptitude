package Control;

import Skinfold.SkinfoldFemaleGeneralJacksonPollockEtWard1980;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldGeneralJacksonPollockEtWard1980Female18A55years {
	
	SkinfoldFemaleGeneralJacksonPollockEtWard1980 obj;
	TableBodyDenstiyWoman tab4;
	
	public void Control_Skinfold_General_Durnin_Et_Womersley_1980_Female_16A68years() {

		obj = new SkinfoldFemaleGeneralJacksonPollockEtWard1980();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_PolockEtAlii_1980_18A55years(double ChestMeasure, double AM, double TR, double SB, double SI, double CX, int gender, int age) {
		String res = null;
		
		obj.setChestMeasure(ChestMeasure);
		obj.setAM(AM);
		obj.setTR(TR);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setCX(CX);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Female_18A55years();
		
			
		res = tab4.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}
}
