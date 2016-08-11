package Control;

import Anthropometric.AnthropometricFemaleGeneralTranEtWeltman1989;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;
import Table.TableBodyDenstiyWoman;

public class ControlAnthropometricGeneralTranEtWeltman1989Female15A79years {

	AnthropometricFemaleGeneralTranEtWeltman1989 obg;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	TableBodyDenstiyWoman tab4;

	public ControlAnthropometricGeneralTranEtWeltman1989Female15A79years() {
		obg = new AnthropometricFemaleGeneralTranEtWeltman1989();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();
		tab4 = new TableBodyDenstiyWoman();
	}

	public String ReturnSituation_TranEtWeltman_1989_Female_15A79years(double A, double PABD, double PTU, double age,
			double gender) {
		obg.setA(A);
		obg.setPABD(PABD);
		obg.setAgeInYears(age);
		obg.setPTU(PTU);

		obg.TranEtWeltman198915A79years();
		
		String res;

		if (age >= 15 && age <= 18) {

			res = tab1.check(obg.CalculateFatPercentage(age, gender));

			return res;
		}

		else if (age > 18) {

			res = tab4.check(obg.CalculateFatPercentage(age, gender), age);

			return res;
		}

		return null;
	}

}
