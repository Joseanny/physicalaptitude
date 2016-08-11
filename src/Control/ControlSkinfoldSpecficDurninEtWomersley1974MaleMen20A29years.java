package Control;

import Skinfold.SkinfoldMaleSpecficDurninEtWomersley1974;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficDurninEtWomersley1974MaleMen20A29years {
	
	SkinfoldMaleSpecficDurninEtWomersley1974 om4;
	TableBodyDenstiyMan tab3;
	
	public ControlSkinfoldSpecficDurninEtWomersley1974MaleMen20A29years(){
		
		  om4 = new SkinfoldMaleSpecficDurninEtWomersley1974();
	      tab3 = new TableBodyDenstiyMan();
		
	}
	
	public String ReturnSituation_DurninEtWomersley_1974_Male_Men20A29anos(double BI, double TR, double SB, double SI, double age, int gender){
		   
		   om4.setBI(BI);
		   om4.setTR(TR);
		   om4.setSB(SB);
		   om4.setSI(SI);
		   
		   om4.Men20A29years();

	       String res = tab3.check(om4.CalculateFatPercentage(age, gender), age);
		   
		   return res;
	   }

}
