package Control;

import Skinfold.SkinfoldMaleSpecficSlaughterEtAlii1988;
import Table.TableBodyDenstiyMaleChildrenAndTeen;

public class ControlSkinfoldSpecficSlaughterEtAlii1988MaleChildrenAndAdolescentsPrepubescent {

	SkinfoldMaleSpecficSlaughterEtAlii1988 om9;
	TableBodyDenstiyMaleChildrenAndTeen tab2;

	public ControlSkinfoldSpecficSlaughterEtAlii1988MaleChildrenAndAdolescentsPrepubescent() {

		om9 = new SkinfoldMaleSpecficSlaughterEtAlii1988();
		tab2 = new Table.TableBodyDenstiyMaleChildrenAndTeen();

	}

	public String ReturnSituation_SlaughterEtAlii_1988_Male_ChildrenAndAdolescents_Prepubescent(double TR, double SB) {

		om9.setTR(TR);
		om9.setSB(SB);

		String res = tab2.check(om9.ChildrenAndAdolescents_WhiteBoysWithTheSumOfLessThanOrEqualTo_35mmFolds_Prepubescent());

		return res;
	}

}
