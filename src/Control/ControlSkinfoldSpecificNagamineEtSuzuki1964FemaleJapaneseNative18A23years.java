package Control;

import Skinfold.SkinfoldFemaleSpecficNagamineEtSuzuki1964;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificNagamineEtSuzuki1964FemaleJapaneseNative18A23years {
	
	SkinfoldFemaleSpecficNagamineEtSuzuki1964 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificNagamineEtSuzuki1964FemaleJapaneseNative18A23years() {

		obj = new SkinfoldFemaleSpecficNagamineEtSuzuki1964();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_NagamineEtSuzuki_1964(double TR, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);;
		obj.setSB(SB);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.JapaneseNative_18A23years();
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender),age);

		return res; 
	}
}
