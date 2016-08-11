package Control;

import Table.TableNeuromuscularDynamometerManualMale;
import Neuromuscular.DynamometerManual;
import Table.TableNeuromuscularDynamometerManualFemale;

public class ControlPhysicalAssementDynamometerManual {

	DynamometerManual ob;
	TableNeuromuscularDynamometerManualMale tab1;
	TableNeuromuscularDynamometerManualFemale tab2;

	public ControlPhysicalAssementDynamometerManual() {

		ob = new DynamometerManual();
		tab1 = new TableNeuromuscularDynamometerManualMale();
		tab2 = new TableNeuromuscularDynamometerManualFemale();

	}

	public String DinonometroManual(double measureFirstTimeRightHand, double MeasureSecondTimeRightHard, double MeasureFirstTimeLeftHard,
			double MeasureSecondTimeLeftHard, String gender, double age) {

		ob.setMeasureFirstTimeRightHand(measureFirstTimeRightHand);
		ob.setMeasureSecondTimeRightHard(MeasureSecondTimeRightHard);

		ob.setMeasureFirstTimeLeftHard(MeasureFirstTimeLeftHard);
		ob.setMeasureSecondTimeLeftHard(MeasureSecondTimeLeftHard);

		ob.comparisonHardRight();
		ob.comparisonHardLeft();

		String res;

		if (gender == "M") {

			res = tab1.verifyDynamometerManual_Male(ob.calculationDynamometer(), age);

			return res;

		}

		else if (gender == "F") {

			res = tab2.verifyDynamometerManual_Female(ob.calculationDynamometer(), age);

			return res;
		}

		return null;
	}

}
