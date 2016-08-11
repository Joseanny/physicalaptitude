package Control;

import Skinfold.SkinfoldMaleSpecficDurninEtWomersley1974;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficDurninEtWomersley1974MaleMen30A39years {
	
	SkinfoldMaleSpecficDurninEtWomersley1974 om4;
	TableBodyDenstiyMan tab3;
	
	public ControlSkinfoldSpecficDurninEtWomersley1974MaleMen30A39years(){
		
		  om4 = new SkinfoldMaleSpecficDurninEtWomersley1974();
	      tab3 = new TableBodyDenstiyMan();
		
	}
	
	 public String ReturnSituation_DurninEtWomersley_1974_Male_Men30A39anos(double BI, double TR, double SB, double SI, double age, int gender){
		   
		   om4.setBI(BI);
		   om4.setTR(TR);
		   om4.setSB(SB);
		   om4.setSI(SI);
		   
		   om4.Men30A39years();

	       String res = tab3.check(om4.CalculateFatPercentage(age, gender), age);
		   
		   return res;
	   }

}
