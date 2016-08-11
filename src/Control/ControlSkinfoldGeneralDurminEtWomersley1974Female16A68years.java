package Control;

import Skinfold.SkinfoldFemaleGeneralDurninEtWomersley1974;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldGeneralDurminEtWomersley1974Female16A68years {
	
	SkinfoldFemaleGeneralDurninEtWomersley1974 obj;
	TableBodyDenstiyWoman tab4;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	
	public void Control_Skinfold_General_Durnin_Et_Womersley_1974_Female_16A68years() {

		obj = new SkinfoldFemaleGeneralDurninEtWomersley1974();
		tab4 = new TableBodyDenstiyWoman();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();

	}

	public String ReturnSituation_PolockEtAlii_1974_Female_16A68years(double TR, double BI, double SB, double SI, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setBI(BI);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Female_16A68years();
		
		if(age == 16 || age < 18){
			res = tab1.check(obj.CalculateFatPercentage(age, gender));
		}
		if(age >= 18 || age <= 72){
			
			res = tab4.check(obj.CalculateFatPercentage(age, gender), age);
		}

		return res;
	}
}
