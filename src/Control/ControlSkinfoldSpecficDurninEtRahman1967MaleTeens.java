package Control;

import Skinfold.SkinfoldMaleSpecficDurninEtRahman1967;
import Table.TableBodyDenstiyMaleChildrenAndTeen;

public class ControlSkinfoldSpecficDurninEtRahman1967MaleTeens {
	
	SkinfoldMaleSpecficDurninEtRahman1967 om3;
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	
	public ControlSkinfoldSpecficDurninEtRahman1967MaleTeens(){
		
		  om3 = new SkinfoldMaleSpecficDurninEtRahman1967();
		  tab2 = new TableBodyDenstiyMaleChildrenAndTeen();

	}
	
	public String ReturnSituation_DurninEtRahman_1967_Male_Teens(double BI, double TR, double SB, double SI, double age, int gender){
		   
		   om3.setBI(BI);
		   om3.setTR(TR);
		   om3.setSB(SB);
		   om3.setSI(SI);
		   
		   om3.Teens();
		   
		   String res = tab2.check(om3.CalculateFatPercentage(age, gender));
		   
		   return res;
	   }
}
