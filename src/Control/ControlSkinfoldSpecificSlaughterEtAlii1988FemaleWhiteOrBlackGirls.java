package Control;

import Skinfold.SkinfoldFemaleSpecficSlaughterEtAlii1988;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;

public class ControlSkinfoldSpecificSlaughterEtAlii1988FemaleWhiteOrBlackGirls {

	SkinfoldFemaleSpecficSlaughterEtAlii1988 obj;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	
	public ControlSkinfoldSpecificSlaughterEtAlii1988FemaleWhiteOrBlackGirls() {

		obj = new SkinfoldFemaleSpecficSlaughterEtAlii1988();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();

	}

	public String ReturnSituation_Slaughter_Et_Alii_1988(double TR, double PR, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setPR(PR);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		res = tab1.check(obj.WhiteOrBlackGirls_8A17anos());

		return res; 
	}
}
