package Control;

import Skinfold.SkinfoldMaleSpecficWilmoreEtBehnke1969;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficWilmoreEtBehnke1969MaleUniversityStudents17A37years {

	SkinfoldMaleSpecficWilmoreEtBehnke1969 om11;
	TableBodyDenstiyMan tab3;
	Table.TableBodyDenstiyMaleChildrenAndTeen tab2;

	public ControlSkinfoldSpecficWilmoreEtBehnke1969MaleUniversityStudents17A37years() {

		tab2 = new Table.TableBodyDenstiyMaleChildrenAndTeen();
		tab3 = new Table.TableBodyDenstiyMan();
		om11 = new SkinfoldMaleSpecficWilmoreEtBehnke1969();

	}

	public String ReturnSituation_WilmoreEtBehnke_1969(double CX, double AB, double age, int gender) {
		
		String res;

		om11.setCX(CX);
		om11.setAB(AB);

		if (age == 17) {
			
			res = tab2.check(om11.CalcularPercentualDeGordura(age, gender));
			
			return res;
			
		} else if (age > 17) {
			
			res = tab3.check(om11.CalcularPercentualDeGordura(age, gender), age);
			
			return res;
		}
		return null;
	}

}
