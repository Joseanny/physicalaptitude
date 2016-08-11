package Control;

import Skinfold.SkinfoldMaleSpecficPolockEtAlii1976;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficPolockEtAlii1976MaleYoungMen {

	SkinfoldMaleSpecficPolockEtAlii1976 om8;
	TableBodyDenstiyMan tab3;

	public ControlSkinfoldSpecficPolockEtAlii1976MaleYoungMen() {

		om8 = new SkinfoldMaleSpecficPolockEtAlii1976();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_PolockEtAlii_1976_Male_YoungMen(double CX, double TO, double age, int gender) {
		
		om8.setCX(CX);
		om8.setChestMeasure(TO);
		om8.YoungMen();

		String res = tab3.check(om8.CalculateFatPercentage(age, gender), age);

		return res;
	}

}
