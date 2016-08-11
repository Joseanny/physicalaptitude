package Control;

import Skinfold.SkinfoldFemaleSpecficDurninEtWonersley1974;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificDurninEtWomersley1974Female20A29years {

	SkinfoldFemaleSpecficDurninEtWonersley1974 obj;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificDurninEtWomersley1974Female20A29years() {

		obj = new SkinfoldFemaleSpecficDurninEtWonersley1974();
		tab4 = new TableBodyDenstiyWoman();

	}

	public String ReturnSituation_DurninEtWonersley_1974(double TR, double BI, double SI, double SB, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setBI(BI);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Women20A29years();
		
		res = tab4.check(obj.CalculateFatPercentage(age, gender),age);

		return res; 
	}
}
