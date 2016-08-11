package Control;

import PhysicalAssessment.Agility;
import Table.TablePhysicalAssessmentAgilityFemale;
import Table.TablePhysicalAssessmentAgilityMale;

public class ControlPhysicalAssessmentAgility {
	
	Agility agility;
	TablePhysicalAssessmentAgilityMale table_Male;
	TablePhysicalAssessmentAgilityFemale table_Female;

	public ControlPhysicalAssessmentAgility() {

		agility = new Agility();
		table_Male = new TablePhysicalAssessmentAgilityMale();
		table_Female = new TablePhysicalAssessmentAgilityFemale();
	}

	public String Agility(double firstAttemptTime, double secondAttemptTime, double age, String gender) {

		agility.setFirstAttemptTime(firstAttemptTime);
		agility.setSecondAttempTime(secondAttemptTime);

		String biggerResultAgility;

		if (gender == "M") {

			biggerResultAgility = table_Male.verifyAgility_Male(agility.attemptLastTime(), age);

			return biggerResultAgility;
		}

		else if (gender == "F") {

			biggerResultAgility = table_Female.verifyAgility_Female(agility.attemptLastTime(), age);

			return biggerResultAgility;
		}
		return null;
	}
}
