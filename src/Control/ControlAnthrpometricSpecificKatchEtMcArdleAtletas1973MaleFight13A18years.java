package Control;

import Anthropometric.AnthropometricMaleSpecificKatchEtMcArdleAtletas1973;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificKatchEtMcArdleAtletas1973MaleFight13A18years {
	AnthropometricMaleSpecificKatchEtMcArdleAtletas1973 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificKatchEtMcArdleAtletas1973MaleFight13A18years(){
		obg = new AnthropometricMaleSpecificKatchEtMcArdleAtletas1973();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_KatchEtMcArdle_1973_Female_UniversityStudents(double perimeterArms, double AB, double age, int gender){
		obg.setPerimeterArms(perimeterArms);
		obg.setAB(AB);
		obg.setGender(gender);
		
		obg.MaleFight13A18years();
		
		String res = tab3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
