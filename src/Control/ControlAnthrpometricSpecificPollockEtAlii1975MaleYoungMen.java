package Control;

import Anthropometric.AnthropometricMaleSpecificPollockEtAlii1975;
import Table.TableBodyDenstiyMaleChildrenAndTeen;


public class ControlAnthrpometricSpecificPollockEtAlii1975MaleYoungMen {
	AnthropometricMaleSpecificPollockEtAlii1975 obg;
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	
	public ControlAnthrpometricSpecificPollockEtAlii1975MaleYoungMen(){
		obg = new AnthropometricMaleSpecificPollockEtAlii1975();
		tab2 = new TableBodyDenstiyMaleChildrenAndTeen();
	}
	public String ReturnSituation_Male_Specific_PollockEtAlii_1975(double TR, double AB, double PCIN, double BR, int PerimeterAnkle, double PerimeterFist,double BiacromialDiameter, double BitrocanterianoDiameter, double age, double gender){
		obg.setTR(TR);
		obg.setAB(AB);
		obg.setPCIN(PCIN);
		obg.setBR(BR);
		obg.getPerimeterAnkle();
		obg.setPerimeterFist(PerimeterFist);
		obg.setBiacromialDiameter(BiacromialDiameter);
		obg.setBitrocanterianoDiameter(BitrocanterianoDiameter);
		
		
		String res = tab2.check(obg.CalculateFatPercentage(age, gender));
		
		return res;
	}
}

