package Control;

import Skinfold.SkinfoldMaleSpecficNagamineEtSuzuki1964;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficNagamineEtSuzuki1964Male {

	SkinfoldMaleSpecficNagamineEtSuzuki1964 om7;
	TableBodyDenstiyMan tab3;

	public ControlSkinfoldSpecficNagamineEtSuzuki1964Male() {

		om7 = new SkinfoldMaleSpecficNagamineEtSuzuki1964();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_NagamineEtSuzuki_1964_Male(double TR, double SB, double age, int gender) {
		
		om7.setTR(TR);
		om7.setSB(SB);
		
		om7.JapaneseNative_18A27years();

		String res = tab3.check(om7.CalculateFatPercentage(age, gender), age);

		return res;
	}

}
