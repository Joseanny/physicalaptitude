package Control;

import Table.TablePhysicalAssessmentCardiorespiratoryFitnessMale;
import PhysicalAssessment.CardiorespiratoryFitness;
import Table.TablePhysicalAssessmentCardiorespiratoryFitnessFemale;

public class ControlPhysicalAssementCardiorespiratoryFitness {

	CardiorespiratoryFitness ob;
	TablePhysicalAssessmentCardiorespiratoryFitnessMale table_Man;
	TablePhysicalAssessmentCardiorespiratoryFitnessFemale table_Woman;

	public ControlPhysicalAssementCardiorespiratoryFitness() {
		ob = new CardiorespiratoryFitness();
		table_Man = new TablePhysicalAssessmentCardiorespiratoryFitnessMale();
		table_Woman = new TablePhysicalAssessmentCardiorespiratoryFitnessFemale();
	}

	public String CardiorespiratoryFitness(double MetersWalked, double age, String gender) {

		ob.setMetersWalked(MetersWalked);

		String res;

		if (gender == "M") {
			res = table_Man.verifyCardiorespiratoryFitness_Male(MetersWalked, age);

			return res;

		} else if (gender == "F") {
			res = table_Woman.verifyCardiorespiratoryFitness_Female(MetersWalked, age);

			return res;

		}

		return null;
	}

}
