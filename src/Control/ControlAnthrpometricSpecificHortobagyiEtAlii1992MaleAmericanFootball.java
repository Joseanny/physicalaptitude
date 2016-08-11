package Control;

import Anthropometric.AnthropometricMaleSpecificHortobagyiEtAlii1992;
import Table.TableBodyDenstiyMan;

public class ControlAnthrpometricSpecificHortobagyiEtAlii1992MaleAmericanFootball {
	AnthropometricMaleSpecificHortobagyiEtAlii1992 obg;
	TableBodyDenstiyMan tab3;
	
	public ControlAnthrpometricSpecificHortobagyiEtAlii1992MaleAmericanFootball(){
		obg = new AnthropometricMaleSpecificHortobagyiEtAlii1992();
		tab3 = new TableBodyDenstiyMan();
	}
	
	public String ReturnSituation_HortobagyiEtAlii_1992_Male_AmericanFootball(double MC, double A, int gender, double age){
		obg.setMC(MC);
		obg.setA(A);
		obg.setGender(gender);
		
		String res = tab3.check(obg.MaleAmericanFootball(), age);
		
		return res;
	}
}
