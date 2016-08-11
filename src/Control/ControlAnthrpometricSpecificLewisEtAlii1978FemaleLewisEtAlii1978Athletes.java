package Control;

import Anthropometric.AnthropometricFemaleSpecificLewisEtAlii1978;
import Table.TableBodyDenstiyWoman;;

public class ControlAnthrpometricSpecificLewisEtAlii1978FemaleLewisEtAlii1978Athletes {
	
	AnthropometricFemaleSpecificLewisEtAlii1978 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthrpometricSpecificLewisEtAlii1978FemaleLewisEtAlii1978Athletes(){
		obg = new AnthropometricFemaleSpecificLewisEtAlii1978();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_LewisEtAlii_1978_Female_LewisEtAlii_1978_Athletes(double TR, double A, double SB, double PBR, int gender, double age){
		
		obg.setTR(TR);
		obg.setA(A);
		obg.setSB(SB);
		obg.setPBR(PBR);
		obg.setGender(gender);
		
		obg.FemaleAthletes();
		
		String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
