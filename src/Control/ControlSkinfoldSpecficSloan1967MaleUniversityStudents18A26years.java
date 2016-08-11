package Control;

import Skinfold.SkinfoldMaleSpecficSloan1967;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficSloan1967MaleUniversityStudents18A26years {

	SkinfoldMaleSpecficSloan1967 om10;
	TableBodyDenstiyMan tab3;

	public ControlSkinfoldSpecficSloan1967MaleUniversityStudents18A26years() {

		om10 = new SkinfoldMaleSpecficSloan1967();
		tab3 = new Table.TableBodyDenstiyMan();
	}

	public String ReturnSituation_Sloan_1967(double CX, double SB, double age, int gender) {

		om10.setCX(CX);
		om10.setSB(SB);

		String res = tab3.check(om10.CalculateFatPercentage(age, gender), age);

		return res;
	}

}
