package Control;

import Anthropometric.AnthropometricMaleSpecificBulbulianEtAlii1987;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificBulbulianEtAlii1987MaleParaplegic {
	
	AnthropometricMaleSpecificBulbulianEtAlii1987 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificBulbulianEtAlii1987MaleParaplegic(){
		obg = new AnthropometricMaleSpecificBulbulianEtAlii1987();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_BulbulianEtAlii_1987_Male_Paraplegic(double PCIN, double BR, double age, int gender){
		obg.setPCIN(PCIN);
		obg.setBR(BR);
		obg.setGender(gender);
		
		obg.MaleParaplegic();
		
		String res = tab3.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
