package Control;

import Anthropometric.AnthropometricFemaleSpecificPollockEtAlii1975;
import Table.TableBodyDenstiyWoman;

public class ControlAnthrpometricSpecificPollockEtAlii1975FemaleYoungWoman {
	AnthropometricFemaleSpecificPollockEtAlii1975 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthrpometricSpecificPollockEtAlii1975FemaleYoungWoman(){
		obg = new AnthropometricFemaleSpecificPollockEtAlii1975();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_Female_Specific_PollockEtAlii_1975(double SI, double CX, double perimeterFist, double diameterFemur, int gender, double age){
		obg.setSI(SI);
		obg.setCX(CX);
		obg.setPerimeterFist(perimeterFist);
		obg.setDiameterFemur(diameterFemur);
		obg.setGender(gender);
		
		obg.YoungWoman();
		
		String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
