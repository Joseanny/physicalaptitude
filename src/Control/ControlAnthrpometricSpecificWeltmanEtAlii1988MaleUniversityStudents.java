package Control;

import Anthropometric.AnthropometricMaleSpecificWeltmanEtAlii1988;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificWeltmanEtAlii1988MaleUniversityStudents {
	AnthropometricMaleSpecificWeltmanEtAlii1988 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificWeltmanEtAlii1988MaleUniversityStudents(){
		obg = new AnthropometricMaleSpecificWeltmanEtAlii1988();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_WeltmanEtAlii_1988_Male_UniversityStudents(double TR, double SB, double AB, double PANT,int gender, double age){
	
		obg.setTR(TR);
		obg.setSB(SB);
		obg.setAB(AB);
		obg.setPANT(PANT);
		obg.setGender(gender);
		
		obg.UniversityStudents();
		
		String res = tab3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
