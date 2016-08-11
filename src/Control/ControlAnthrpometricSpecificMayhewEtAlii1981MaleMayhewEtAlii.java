package Control;

import Anthropometric.AnthropometricMaleSpecificMayhewEtAlii1981;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificMayhewEtAlii1981MaleMayhewEtAlii {
	AnthropometricMaleSpecificMayhewEtAlii1981 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificMayhewEtAlii1981MaleMayhewEtAlii(){
		obg = new AnthropometricMaleSpecificMayhewEtAlii1981();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_MayhewEtAlii_1981_Male_MayhewEtAlii(double AB, double PR, double PPES, double DBIC, int gender, double age){
		obg.setAB(AB);
		obg.setPR(PR);
		obg.setPPES(PPES);
		obg.setDBIC(DBIC);
		obg.setGender(gender);
		
		obg.MayhewEtAlii();
		
		String res = tab3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
