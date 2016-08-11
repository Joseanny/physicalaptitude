package Control;

import Anthropometric.AnthropometricMaleSpecificPollockEtAlii1975;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificPollockEtAlii1975MiddleAgedMen {
	public class ControlAnthrpometricSpecificPollockEtAlii1975MaleYoungMen {
		AnthropometricMaleSpecificPollockEtAlii1975 obg;
		TableBodyDenstiyMan tab4;
		
		public ControlAnthrpometricSpecificPollockEtAlii1975MaleYoungMen(){
			obg = new AnthropometricMaleSpecificPollockEtAlii1975();
			tab4 = new TableBodyDenstiyMan();
		}
		public String ReturnSituation_Male_Specific_PollockEtAlii_1975(double ChestMeasure, double PTU, double age, double gender){
			obg.setChestMeasure(ChestMeasure);
			obg.setPTU(PTU);
			
			String res = tab4.check(obg.CalculateFatPercentage(age, gender), age);
			
			return res;
		}
	}
}
