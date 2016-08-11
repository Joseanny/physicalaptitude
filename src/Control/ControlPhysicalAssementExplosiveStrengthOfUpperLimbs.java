package Control;

import Table.TablePhysicalAssementExplosiveStrengthOfUpperLimbsMale;
import PhysicalAssessment.ExplosiveStrengthOfUpperLimbs;
import Table.TablePhysicalAssementExplosiveStrengthOfUpperLimbsFemale;

public class ControlPhysicalAssementExplosiveStrengthOfUpperLimbs {

	ExplosiveStrengthOfUpperLimbs person;
	TablePhysicalAssementExplosiveStrengthOfUpperLimbsMale table_Male;
	TablePhysicalAssementExplosiveStrengthOfUpperLimbsFemale table_Female;

	public ControlPhysicalAssementExplosiveStrengthOfUpperLimbs() {

		person = new ExplosiveStrengthOfUpperLimbs();
		table_Male = new TablePhysicalAssementExplosiveStrengthOfUpperLimbsMale();
		table_Female = new TablePhysicalAssementExplosiveStrengthOfUpperLimbsFemale();

	}

	public String ExplosiveStrengthOfUpperLimbs(double firstThrow, double secondThrow, double age, String gender) {

		person.setFirstThrow(firstThrow);
		person.setSecondThrow(secondThrow);

		String res;

		if (gender == "M") {

			res = table_Male.verifyExplosiveStrengthOfUpperLimbs_Male(person.calculationExplosiveStrengthOfUpperLimbs(), age);

			return res;
		}

		else if (gender == "F") {

			res = table_Female.verifyExplosiveStrengthOfUpperLimbs_Female(person.calculationExplosiveStrengthOfUpperLimbs(), age);

			return res;
		}

		return null;
	}

}
