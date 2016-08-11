package Control;

import Anthropometric.AnthropometricMaleSpecificWeltmanEtAlii1988;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificWeltmanEtAlii1988MaleYoungMen {
	AnthropometricMaleSpecificWeltmanEtAlii1988 obg;
	TableBodyDenstiyMan tab2;
	
	public ControlAnthrpometricSpecificWeltmanEtAlii1988MaleYoungMen(){
		obg = new AnthropometricMaleSpecificWeltmanEtAlii1988();
		tab2 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_WeltmanEtAlii_1988_Male_YoungMen(double TR, double AB,double PCIN,double PR, double perimeterAnkle,double perimeterFist, double biacromialDiameter, double bitrocanterianoDiameter,double age, int gender){
		
		obg.setTR(TR);
		obg.setAB(AB);
		obg.setPCIN(PCIN);
		obg.setPR(PR);
		obg.setPerimeterAnkle(perimeterAnkle);
		obg.setPerimeterFist(perimeterFist);
		obg.setBiacromialDiameter(biacromialDiameter);
		obg.setBitrocanterianoDiameter(bitrocanterianoDiameter);
		obg.setGender(gender);
		
		obg.YoungMen();
		
		String res = tab2.check(obg.CalculateFatPercentage(age, gender), age);
		
		return res;
	}
}
