package Control;

import Skinfold.SkinfoldMaleGeneralPollockSchmidtEtJackson1980;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldGeneralPollockSchmidtEtJackson1980MaleAdultMan {
	
	SkinfoldMaleGeneralPollockSchmidtEtJackson1980 obj;
	TableBodyDenstiyMan tab3;
	
	public ControlSkinfoldGeneralPollockSchmidtEtJackson1980MaleAdultMan() {

		obj = new SkinfoldMaleGeneralPollockSchmidtEtJackson1980();
		tab3 = new TableBodyDenstiyMan();

	}

	public String ReturnSituation_Pollock_Schmidt_Et_Jackson_1980_AdultMan(double ChestMeasure, double AB, double CX, int gender, int age) {
		String res = null;
		
		obj.setChestMeasure(ChestMeasure);;
		obj.setAB(AB);;
		obj.setCX(CX);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.AdultMan();
		
			
		res = tab3.check(obj.CalculateFatPercentage(age, gender), age);

		return res;
	}
}
