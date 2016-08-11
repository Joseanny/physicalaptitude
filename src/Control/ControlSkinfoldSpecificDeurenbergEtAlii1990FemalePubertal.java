package Control;

import Skinfold.SkinfoldFemaleSpecficDeurenbergEtAlii1990;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificDeurenbergEtAlii1990FemalePubertal {

	SkinfoldFemaleSpecficDeurenbergEtAlii1990 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificDeurenbergEtAlii1990FemalePubertal() {

		obj = new SkinfoldFemaleSpecficDeurenbergEtAlii1990();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_DeurenbergEtAlii_1990(double TR, double BI, double SI, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setBI(BI);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
			
		res = tab4.check(obj.Girls_Pubertal(), age);

		return res; //arrumar
	}
}
