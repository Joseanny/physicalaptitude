package Control;

import Anthropometric.AnthropometricMaleGeneralJacksonEtPollock1978;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricGeneralJacksonEtPollock1978Male18A61years {
	
	AnthropometricMaleGeneralJacksonEtPollock1978 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricGeneralJacksonEtPollock1978Male18A61years(){
		obg = new AnthropometricMaleGeneralJacksonEtPollock1978();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_JacksonPollockEtWard_1980_Male_18A61years(double ChestMeasure, double AM, double TR, double SB, double SI, double AB, double CX, double PTU, double age,double PCIN, double PANT, int gender){
		obg.setChestMeasure(ChestMeasure);
		obg.setAM(AM);
		obg.setTR(TR); 
		obg.setSB(SB); 
		obg.setAB(AB);
		obg.setSI(SI);
		obg.setCX(CX);
		obg.setAgeInYears(age);
		obg.setPTU(PTU);
		obg.setPCIN(PCIN);
		obg.setPANT(PANT);
		obg.setGender(gender);
		
		obg.Male18A61years();
		
		String res = tab3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}

}
