package Control;

import Table.TablePhysicalAssementWaistAndHipRatioMale;
import PhysicalAssessment.WaistAndHipRatio;
import Table.TablePhysicalAssementWaistAndHipRatioFemale;

public class ControlPhysicalAssementWaistAndHipRatio {

	WaistAndHipRatio person;
	TablePhysicalAssementWaistAndHipRatioMale tab;
	TablePhysicalAssementWaistAndHipRatioFemale tab2;

	public ControlPhysicalAssementWaistAndHipRatio() {

		person = new WaistAndHipRatio();
		tab = new TablePhysicalAssementWaistAndHipRatioMale();
		tab2 = new TablePhysicalAssementWaistAndHipRatioFemale();
	}

	public String WaistAndHipRatio(double waist, double hip, double age, String gender) {

		person.setwaist(waist);
		person.sethip(hip);
		
		String res;

		if (gender == "Masculino") {
			
			res = tab.verifyWaistAndHipRatio_Male(person.calculationWaistAndHipRatio(), age);

			return res;
		}

		else if (gender == "Feminino") {
			
			res = tab2.verifyWaistAndHipRatio_Female(person.calculationWaistAndHipRatio(), age);

			return res;
		}
		return null;
	}

}
