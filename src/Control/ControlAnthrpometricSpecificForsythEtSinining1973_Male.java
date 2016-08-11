package Control;

import Anthropometric.AnthropometricMaleSpecificForsythEtSinining1973;
import Table.TableBodyDenstiyMan;


public class ControlAnthrpometricSpecificForsythEtSinining1973_Male {
	
	AnthropometricMaleSpecificForsythEtSinining1973 obg;
	TableBodyDenstiyMan ta3;
	
	public ControlAnthrpometricSpecificForsythEtSinining1973_Male(){
		obg = new AnthropometricMaleSpecificForsythEtSinining1973();
		ta3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_ForsythEtSinining_1973_Male(double SB, double bitrocanterianoDiameter, double AB, double age, int gender){
		
		obg.setSB(SB);
		obg.setBitrocanterianoDiameter(bitrocanterianoDiameter);
		obg.setAB(AB);
		obg.setGender(gender);
		
		obg.ForsythEtSinining();
		
		String res = ta3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	} 
}
