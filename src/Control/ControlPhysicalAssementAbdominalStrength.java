package Control;

import PhysicalAssessment.AbdominalStrength;
import Table.TablePhysicalAssementAbdominalStrengthFemale;
import Table.TablePhysicalAssementAbdominalStrengthMale;

public class ControlPhysicalAssementAbdominalStrength {

	AbdominalStrength ob;
	TablePhysicalAssementAbdominalStrengthMale table_Man;
	TablePhysicalAssementAbdominalStrengthFemale table_Woman;

	public ControlPhysicalAssementAbdominalStrength() {
		ob = new AbdominalStrength();
		table_Man = new TablePhysicalAssementAbdominalStrengthMale();
		table_Woman = new TablePhysicalAssementAbdominalStrengthFemale();
	}

	public String AbdominalStrength(double NumberOfMovementsMinute, double age, String gender) {

		ob.setNumberOfMovementsMinute(NumberOfMovementsMinute);

		String res;

		if (gender == "M") {

			res = table_Man.verifyAbdominalStrength_Male(NumberOfMovementsMinute, age);

			return res;
		}

		if (gender == "F") {

			res = table_Woman.verifyAbdominalStrength_Female(NumberOfMovementsMinute, age);

			return res;
		}

		return null;

	}

}
