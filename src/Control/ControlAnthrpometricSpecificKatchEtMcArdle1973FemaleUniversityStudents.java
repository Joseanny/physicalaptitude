package Control;

import Anthropometric.AnthropometricFemaleSpecificKatchEtMcArdle1973;
import Table.TableBodyDenstiyWoman;

public class ControlAnthrpometricSpecificKatchEtMcArdle1973FemaleUniversityStudents {
	AnthropometricFemaleSpecificKatchEtMcArdle1973 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthrpometricSpecificKatchEtMcArdle1973FemaleUniversityStudents(){
		obg = new AnthropometricFemaleSpecificKatchEtMcArdle1973();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_KatchEtMcArdle_1973_Female_UniversityStudents(double perimeterOfTheExtendedArm, double AB, double PANT, double thighPerimeter, double age, int gender){
		obg.setPerimeterOfTheExtendedArm(perimeterOfTheExtendedArm);
		obg.setAB(AB);
		obg.setThighPerimeter(thighPerimeter);
		obg.setGender(gender);
		
		obg.UniversityStudents();
		
		String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
