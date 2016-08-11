package Control;


import Skinfold.SkinfoldMaleGeneralDurninEtWomersley1974;
import Table.TableBodyDenstiyMaleChildrenAndTeen;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldGeneralDurninEtWomersley1974Male17A72years {

	SkinfoldMaleGeneralDurninEtWomersley1974 obj;
	TableBodyDenstiyMan tab3;
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	
	public ControlSkinfoldGeneralDurninEtWomersley1974Male17A72years() {

		obj = new SkinfoldMaleGeneralDurninEtWomersley1974();
		tab3 = new TableBodyDenstiyMan();
		tab2 = new TableBodyDenstiyMaleChildrenAndTeen();

	}

	public String ReturnSituation_PolockEtAlii_1974_Male_17A72years(double TR, double BI, double SB, double SI, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setBI(BI);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.Male_17A72years();
		
		if(age == 17){
			res = tab2.check(obj.CalculateFatPercentage(age, gender));
		}
		if(age >= 18 || age <= 72){
			
			res = tab3.check(obj.CalculateFatPercentage(age, gender), age);
		}

		return res;
	}
	
}
