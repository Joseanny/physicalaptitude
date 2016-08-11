package Control;

import Skinfold.SkinfoldFemaleSpecficDurninEtRahman1967;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;

public class ControlSkinfoldSpecificDurninEtRahman1967FemaleTeens {
	SkinfoldFemaleSpecficDurninEtRahman1967 obj;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	
	public ControlSkinfoldSpecificDurninEtRahman1967FemaleTeens() {

		obj = new SkinfoldFemaleSpecficDurninEtRahman1967();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();

	}

	public String returnSituation_DurninEtRahman_1967(double TR, double BI, double SI, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setBI(BI);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Teens();
		
			
		res = tab1.check(obj.CalculateFatPercentage(age, gender));

		return res; 
	}
}
