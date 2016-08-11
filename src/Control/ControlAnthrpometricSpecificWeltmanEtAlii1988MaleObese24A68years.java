package Control;

import Anthropometric.AnthropometricMaleSpecificWeltmanEtAlii1988;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificWeltmanEtAlii1988MaleObese24A68years {
	AnthropometricMaleSpecificWeltmanEtAlii1988 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificWeltmanEtAlii1988MaleObese24A68years(){
		obg = new AnthropometricMaleSpecificWeltmanEtAlii1988();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_WeltmanEtAlii_1988_Male_Obese24A68years(double TR, double AB, double PCIN, double PR, double perimeterAnkle, double perimeterFist, double biacromialDiameter, double bitrocanterianoDiameter, int gender, double age){
		obg.setTR(TR);
		obg.setAB(AB);
		obg.setPCIN(PCIN);
		obg.setPR(PR);
		obg.setPerimeterAnkle(perimeterAnkle);
		obg.setPerimeterFist(perimeterFist);
		obg.setBiacromialDiameter(biacromialDiameter);
		obg.setBitrocanterianoDiameter(bitrocanterianoDiameter);
		obg.setGender(gender);
		
		String res = tab3.check(obg.Obese24A68years(), age);
		
		return res;
	}
}
