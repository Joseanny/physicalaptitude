package Control;

import Skinfold.SkinfoldMaleSpecficDurninEtWomersley1974;
import Skinfold.SkinfoldMaleSpecficGuedes1985;
import Table.TableBodyDenstiyMaleChildrenAndTeen;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficGuedes1985Male {

	SkinfoldMaleSpecficDurninEtWomersley1974 om4;
	SkinfoldMaleSpecficGuedes1985 om5;
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	TableBodyDenstiyMan tab3;

	public ControlSkinfoldSpecficGuedes1985Male() {

		om4 = new SkinfoldMaleSpecficDurninEtWomersley1974();
		om5 = new SkinfoldMaleSpecficGuedes1985();
		tab2 = new Table.TableBodyDenstiyMaleChildrenAndTeen();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_Guedes_1985_Male(double TR, double SI, double AB, double age, int gender) {
		
		String res;

		om5.setTR(TR);
		om5.setSI(SI);
		om5.setAB(AB);
		
		om5.UniversityStudents_17A27years();

		if (age == 17) {
			
			res = tab2.check(om5.CalculateFatPercentage(age, gender));
			
			return res;
			
		} else if (age > 17) {
			
			res = tab3.check(om4.CalculateFatPercentage(age, gender), age);
			
			return res;
		}
		
		return null;
	}

}
