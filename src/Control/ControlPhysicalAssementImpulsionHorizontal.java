package Control;

import Neuromuscular.ImpulsionHorizontal;
import Table.TablePhysicalAssementImpulsionHorizontalMale;
import Table.TablePhysicalAssementImpulsionHorizontalFemale;

public class ControlPhysicalAssementImpulsionHorizontal {

	ImpulsionHorizontal ob;
	TablePhysicalAssementImpulsionHorizontalMale table_Man;
	TablePhysicalAssementImpulsionHorizontalFemale table_Woman;

	public ControlPhysicalAssementImpulsionHorizontal() {

		ob = new ImpulsionHorizontal();
		table_Man = new TablePhysicalAssementImpulsionHorizontalMale();
		table_Woman = new TablePhysicalAssementImpulsionHorizontalFemale();

	}

	public String HorizontalPush(double distance1, double distance2, int age, String gender) {

		ob.setdistance1(distance1);
		ob.setdistance2(distance2);

		String res;

		if (gender == "M") {

			res = table_Man.VerifyImpulsionHorizontal_Male(ob.calculationImpulsionHorizontal(), age);

			return res;
		}

		else if (gender == "F") {

			res = table_Woman.verifyImpulsionHorizontal_Female(ob.calculationImpulsionHorizontal(), age);

			return res;
		}

		return null;

	}

}
