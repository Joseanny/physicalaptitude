package Control;

import PhysicalAssessment.VelocityAndDisplacement;
import Table.TablePhysicalAssementVelocityAndDisplacementFemale;
import Table.TablePhysicalAssementVelocityAndDisplacementMale;

public class ControlPhysicalAssementVelocityAndDisplacement {
	VelocityAndDisplacement person;
	TablePhysicalAssementVelocityAndDisplacementMale table_Male;
	TablePhysicalAssementVelocityAndDisplacementFemale table_Female;

	public ControlPhysicalAssementVelocityAndDisplacement() {

		person = new VelocityAndDisplacement();
		table_Male = new TablePhysicalAssementVelocityAndDisplacementMale();
		table_Female = new TablePhysicalAssementVelocityAndDisplacementFemale();
	}

	public String VelocityAndDisplacement(double timeOfdDuration, double age, String gender) {

		person.setTimeOfdDuration(timeOfdDuration);

		String biggerResultVelocityAndDisplacement;

		if (gender == "M") {

			biggerResultVelocityAndDisplacement = table_Male.VerifyVelocityAndDisplacement_Male(timeOfdDuration, age);

			return biggerResultVelocityAndDisplacement;
		}

		else if (gender == "F") {

			biggerResultVelocityAndDisplacement = table_Female.VerifyvelocityAndDisplacement_Female(timeOfdDuration, age);

			return biggerResultVelocityAndDisplacement;
		}
		return null;
	}
}
