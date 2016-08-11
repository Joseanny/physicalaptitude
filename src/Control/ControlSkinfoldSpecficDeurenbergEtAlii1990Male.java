package Control;

import Skinfold.SkinfoldMaleSpecficBoileauEtAlii1985;
import Table.TableBodyDenstiyMaleChildrenAndTeen;

public class ControlSkinfoldSpecficDeurenbergEtAlii1990Male {

	SkinfoldMaleSpecficBoileauEtAlii1985 om1;
	TableBodyDenstiyMaleChildrenAndTeen tab2;

	public ControlSkinfoldSpecficDeurenbergEtAlii1990Male() {

		tab2 = new TableBodyDenstiyMaleChildrenAndTeen();
		om1 = new SkinfoldMaleSpecficBoileauEtAlii1985();

	}

	public String ReturnSituation_DeurenbergEtAlii_1990_Male(double TR,double SB) {

		om1.setTR(TR);
		om1.setSB(SB);

		String res = tab2.check(om1.WhiteAndBlackBoys_8A17years());

		return res;
	}

}
