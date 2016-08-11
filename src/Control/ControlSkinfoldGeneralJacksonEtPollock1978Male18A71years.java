package Control;

import Skinfold.SkinfoldMaleGeneralJacksonEtPollock1978;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldGeneralJacksonEtPollock1978Male18A71years {
	
	SkinfoldMaleGeneralJacksonEtPollock1978 obj;
	TableBodyDenstiyMan tab3;
	
	public void Control_Skinfold_General_Durnin_Et_Womersley_1974_Female_16A68years() {

		obj = new SkinfoldMaleGeneralJacksonEtPollock1978();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_PolockEtAlii_1976_Male_Middie_AgedMen(double ChestMeasure, double AM, double TR, double SB, double SI, double CX, int gender, int age) {
		String res = null;
		
		obj.setChestMeasure(ChestMeasure);
		obj.setAM(AM);
		obj.setTR(TR);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setCX(CX);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Male_18A61years();
		
			
		res = tab3.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}
}
