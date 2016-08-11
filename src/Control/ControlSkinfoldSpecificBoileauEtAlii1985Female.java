package Control;

import Skinfold.SkinfoldFemaleSpecficBoileauEtAlii1985;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificBoileauEtAlii1985Female {
	
	SkinfoldFemaleSpecficBoileauEtAlii1985 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificBoileauEtAlii1985Female() {

		obj = new SkinfoldFemaleSpecficBoileauEtAlii1985();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_BoileauEtAlii_1985(double TR, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setSB(SB);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
			
		res = tab4.check(obj.Female_1985(), age);

		return res;
	}


}
