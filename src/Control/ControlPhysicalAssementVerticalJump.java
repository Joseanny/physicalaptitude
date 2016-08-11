package Control;

import Neuromuscular.VerticalJump;
import Table.TableNeuromuscularVerticalJumpMale;
import Table.TableNeuromuscularVerticalJumpFemale;

public class ControlPhysicalAssementVerticalJump {

	VerticalJump ob;
	TableNeuromuscularVerticalJumpMale tab1;
	TableNeuromuscularVerticalJumpFemale tab2;

	public ControlPhysicalAssementVerticalJump() {

		ob = new VerticalJump();
		tab1 = new TableNeuromuscularVerticalJumpMale();
		tab2 = new TableNeuromuscularVerticalJumpFemale();
	}

	public String VerticalJump(double weight, double greaterDistance, double smallerDistance, String age) {

		ob.setweight(weight);
		ob.setgreaterDistance(greaterDistance);
		ob.setgreaterDistance(smallerDistance);
		ob.makeDifference();

		String res;

		if (age == "M") {

			res = tab1.verifyVerticalJump_Male(ob.calculationVerticalJump());

			return res;
		}

		else if (age == "F") {

			res = tab2.verifyVerticalJump_Female(ob.calculationVerticalJump());

			return res;
		}
		return null;
	}

}
