package Control;

import Anthropometric.AnthropometricFemaleSpecificKatchMichael1968;
import Table.TableBodyDenstiyWoman;

public class ControlAnthrpometricSpecificKatchMichael1968FemaleUniversityStudents {
	AnthropometricFemaleSpecificKatchMichael1968 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthrpometricSpecificKatchMichael1968FemaleUniversityStudents(){
		obg = new AnthropometricFemaleSpecificKatchMichael1968();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_KatchMichael_1968_Female_UniversityStudents(double hipPerimeterInInches, double PBCFP, double SB, int gender, double age){
		
		obg.setHipPerimeterInInches(hipPerimeterInInches);
		obg.setPBCFP(PBCFP);
		obg.setSB(SB);
		obg.setGender(gender);
		
		obg.UniversityStudents();
		
		String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
