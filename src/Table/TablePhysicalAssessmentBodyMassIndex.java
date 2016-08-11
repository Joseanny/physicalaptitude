package Table;

public class TablePhysicalAssessmentBodyMassIndex {
	
	TableSupport tableOfBodyMassIndex[], category_Down, category_Ideal, 
	category_ObsityLight, category_ObsityModerate, 
	category_ObsitySevere;
	
	public TablePhysicalAssessmentBodyMassIndex(){
		initializeIndextableOfBodyMass();
	}
	
	public void initializeIndextableOfBodyMass(){
		
		category_Down = new TableSupport();
		category_Ideal = new TableSupport();
		category_ObsityLight = new TableSupport();
		category_ObsityModerate = new TableSupport();
		category_ObsitySevere = new TableSupport();
		
		tableOfBodyMassIndex = new TableSupport[5];
		
		category_Down.setMinimumValueOfTheTableCell(0.0);
		category_Down.setMaximumValueOfTheTableCell(18.4);
		
		category_Ideal.setMinimumValueOfTheTableCell(18.5);
		category_Ideal.setMaximumValueOfTheTableCell(24.9);
		
		category_ObsityLight.setMinimumValueOfTheTableCell(25.0);
		category_ObsityLight.setMaximumValueOfTheTableCell(29.9);
		
		category_ObsityModerate.setMinimumValueOfTheTableCell(30.0);
		category_ObsityModerate.setMaximumValueOfTheTableCell(39.9);
		
		category_ObsitySevere.setMinimumValueOfTheTableCell(40.0);
		category_ObsitySevere.setMaximumValueOfTheTableCell(TableSupport.INFINITY);
		
		tableOfBodyMassIndex[0] = category_Down;
		tableOfBodyMassIndex[1] = category_Ideal;
		tableOfBodyMassIndex[2] = category_ObsityLight;
		tableOfBodyMassIndex[3] = category_ObsityModerate;
		tableOfBodyMassIndex[4] = category_ObsitySevere;	
				
	}
	
	public String situationDown(){
		return "Down";
	}
	
	public String situationIdeal(){
		return "Ideal";
	}
	
	public String situationObsityLight(){
		return "ObsityLight";
	}
	
	public String situationObsityModerate(){
		return "ObsityModerate";
	}
	
	public String situationObsitySevere(){
		return "ObsitySevere";
	}
	
	public String verifyBodyMassIndex(double returnResultOfBodyMassIndexToCalculate) {
		
		if(returnResultOfBodyMassIndexToCalculate >= category_Down.getMinimumValueOfTheTableCell() 
		&& returnResultOfBodyMassIndexToCalculate <= category_Down.getMaximumValueOfTheTableCell()){		
			return situationDown();
		}
		else if(returnResultOfBodyMassIndexToCalculate >= category_Ideal.getMinimumValueOfTheTableCell() 
			&& returnResultOfBodyMassIndexToCalculate <= category_Ideal.getMaximumValueOfTheTableCell()){
			return situationIdeal();
		}
		else if(returnResultOfBodyMassIndexToCalculate >= category_ObsityLight.getMinimumValueOfTheTableCell() 
			&& returnResultOfBodyMassIndexToCalculate <= category_ObsityModerate.getMaximumValueOfTheTableCell()){
			return situationObsityLight();
		}
		else if(returnResultOfBodyMassIndexToCalculate >= category_ObsityModerate.getHighterAgeLimite() 
			&& returnResultOfBodyMassIndexToCalculate <= category_ObsityLight.getMaximumValueOfTheTableCell()){
			return situationObsityModerate();
		}
		else if(returnResultOfBodyMassIndexToCalculate >= category_ObsitySevere.getHighterAgeLimite() 
			&& returnResultOfBodyMassIndexToCalculate <= category_ObsitySevere.getMaximumValueOfTheTableCell()){
			return situationObsityLight();
		}
		
		return null;
	}
	
}
