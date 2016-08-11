package Control;

import Skinfold.SkinfoldFemaleSpecficPariskova1961;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;

public class ControlSkinfoldSpecificPariskova1961Female13A16years {
	SkinfoldFemaleSpecficPariskova1961 obj;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	
	public ControlSkinfoldSpecificPariskova1961Female13A16years() {

		obj = new SkinfoldFemaleSpecficPariskova1961();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();

	}

	public String ReturnSituation_Pariskova_1961(double TR, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);;
		obj.setSB(SB);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		
		
		res = tab1.check(obj.WhiteOrBlackGirls_13A16years());

		return res; 
	}
}
