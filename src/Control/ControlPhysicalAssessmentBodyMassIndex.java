package Control;

import PhysicalAssessment.BodyMassIndex;
import Table.TablePhysicalAssessmentBodyMassIndex;

public class ControlPhysicalAssessmentBodyMassIndex {

	BodyMassIndex imc;
	
	TablePhysicalAssessmentBodyMassIndex table;
	
	public ControlPhysicalAssessmentBodyMassIndex(){
		
		imc = new BodyMassIndex();
		table = new TablePhysicalAssessmentBodyMassIndex();
	}
	
	public String returnSituationBodyMassIndex(double bodyWeight, double heightInMeters) {
		
		imc.setBodyWeight(bodyWeight);
		imc.setHeightInMeters(heightInMeters);
		
		String result = table.verifyBodyMassIndex(imc.calculateBodyMassIndex());
		
		return result;
	}
	
}
