package Control;

import PhysicalAssessment.Flexibility;
import Table.TablePhysicalAssessmentFlexibilityFemale;
import Table.TablePhysicalAssessmentFlexibilityMale;


public class ControlPhysicalAssessmentFlexibility {

	Flexibility person;
	TablePhysicalAssessmentFlexibilityMale table_Male;
	TablePhysicalAssessmentFlexibilityFemale table_Female;

	public ControlPhysicalAssessmentFlexibility() {

		person = new Flexibility();
		table_Male = new TablePhysicalAssessmentFlexibilityMale();
		table_Female = new TablePhysicalAssessmentFlexibilityFemale();
	}

	public String Flexibility(double firstTryDistance, double secondTryDistance, int age, String gender) {

		person.setFirstTryDistance(firstTryDistance);
		person.setSecondTryDistance(secondTryDistance);

		String biggerResult;

		if (gender == "M") {

			biggerResult = table_Male.verifyFlexibility_Male(person.calculatesDistanceOfArms(), age);

			return biggerResult;
		}

		else if (gender == "F") {

			biggerResult = table_Female.verifyFlexibility_Female(person.calculatesDistanceOfArms(), age);

			return biggerResult;
		}
		return null;

	}
}
