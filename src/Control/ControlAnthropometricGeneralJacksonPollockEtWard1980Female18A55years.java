package Control;

import Anthropometric.AnthropometricFemaleGeneralJacksonPollockEtWard1980;
import Table.TableBodyDenstiyWoman;

public class ControlAnthropometricGeneralJacksonPollockEtWard1980Female18A55years {
	
	AnthropometricFemaleGeneralJacksonPollockEtWard1980 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthropometricGeneralJacksonPollockEtWard1980Female18A55years(){
		obg = new AnthropometricFemaleGeneralJacksonPollockEtWard1980();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_JacksonPollockEtWard_1980_Female_18A55years(double ChestMeasure, double AM, double TR, double SB, double SI, double AB, double CX, double PTU, double age, int gender){
		obg.setChestMeasure(ChestMeasure);
		obg.setAM(AM);
		obg.setTR(TR); 
		obg.setSB(SB); 
		obg.setAB(AB);
		obg.setSI(SI);
		obg.setCX(CX);
		obg.setPTU(PTU);
		obg.setAgeInYears(age);
		obg.setGender(gender);
		
		obg.Female18A55years();
		
		
		String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
	
}
