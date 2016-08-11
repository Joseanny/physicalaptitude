package Control;

import Anthropometric.AnthropometricFemaleSpecificWeltmanEtAlii1988;
import Table.TableBodyDenstiyWoman;

public class ControlAnthrpometricSpecificWeltmanEtAlii1988FemaleObese20A60years {
	AnthropometricFemaleSpecificWeltmanEtAlii1988 obg;
	TableBodyDenstiyWoman tab4;
	
	public ControlAnthrpometricSpecificWeltmanEtAlii1988FemaleObese20A60years(){
		obg = new AnthropometricFemaleSpecificWeltmanEtAlii1988();
		tab4 = new TableBodyDenstiyWoman();
	}
	
	public String ReturnSituation_Female_Specific_WeltmanEtAlii_1988(double PABD, double A, double MC, double age){
		obg.setPABD(PABD);
		obg.setA(A);
		obg.setMC(MC);
		
		String res = tab4.check(obg.Obese20A60years(), age);;
		
		return res;
	}
}
