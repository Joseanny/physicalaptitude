package Control;

import Skinfold.SkinfoldFemaleSpecficDurninEtWonersley1974;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificDurninEtWomersley1974Female16A19years {

	SkinfoldFemaleSpecficDurninEtWonersley1974 obj;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	TableBodyDenstiyWoman tab4;
	
	public ControlSkinfoldSpecificDurninEtWomersley1974Female16A19years() {

		obj = new SkinfoldFemaleSpecficDurninEtWonersley1974();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();
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
		
		obj.Women16A19years();
		
		if(age >= 16 || age < 18){
			res = tab1.check(obj.CalculateFatPercentage(age, gender));
		}
		else if(age >= 18 || age < 20){
			res = tab4.check(obj.CalculateFatPercentage(age, gender),age);
		}

		return res; 
	}
}
