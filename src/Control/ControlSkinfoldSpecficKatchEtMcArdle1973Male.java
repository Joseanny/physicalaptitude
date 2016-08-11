package Control;

import Skinfold.SkinfoldMaleSpecficKatchEtMcArdle1973;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficKatchEtMcArdle1973Male {

	SkinfoldMaleSpecficKatchEtMcArdle1973 om6;
	TableBodyDenstiyMan tab3;

	public ControlSkinfoldSpecficKatchEtMcArdle1973Male() {

		om6 = new SkinfoldMaleSpecficKatchEtMcArdle1973();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_KatchEtMcArdle_1973_Male(double TR, double SB, double AB, double age, int gender) {

		om6.setTR(TR);
		om6.setSB(SB);
		om6.setAB(AB);
		
		om6.UniversityStudents();

		String res = tab3.check(om6.CalculateFatPercentage(age, gender), age);

		return res;
	}

}
