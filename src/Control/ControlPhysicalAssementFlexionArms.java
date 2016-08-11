package Control;

import Table.TableNeuromuscularFlexionArmsMale;
import Neuromuscular.FlexionArms;
import Table.TableNeuromuscularFlexionArmsFemale;

public class ControlPhysicalAssementFlexionArms {

	FlexionArms ob;
	TableNeuromuscularFlexionArmsMale table_Man;
	TableNeuromuscularFlexionArmsFemale table_Woman;

	public ControlPhysicalAssementFlexionArms() {
		ob = new FlexionArms();
		table_Man = new TableNeuromuscularFlexionArmsMale();
		table_Woman = new TableNeuromuscularFlexionArmsFemale();
	}

	public String FlexionArms(double numberFlexionArms, double age, String gender) {

		ob.setNumberFlexionArms(numberFlexionArms);

		String res;

		if (gender == "M") {

			res = table_Man.verifyFlexionArms_Male(numberFlexionArms, age);

			return res;

		} else if (gender == "F") {

			res = table_Woman.verifyFlexionArms_Female(numberFlexionArms, age);

			return res;

		}

		return null;

	}

}
