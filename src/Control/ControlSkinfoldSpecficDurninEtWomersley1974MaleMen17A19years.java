package Control;

import Skinfold.SkinfoldMaleSpecficDurninEtWomersley1974;
import Table.TableBodyDenstiyMaleChildrenAndTeen;
import Table.TableBodyDenstiyMan;

public class ControlSkinfoldSpecficDurninEtWomersley1974MaleMen17A19years {
	
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	SkinfoldMaleSpecficDurninEtWomersley1974 om4;
    TableBodyDenstiyMan tab3;

	
	public ControlSkinfoldSpecficDurninEtWomersley1974MaleMen17A19years(){
		
		  om4 = new SkinfoldMaleSpecficDurninEtWomersley1974();
		  tab2 = new TableBodyDenstiyMaleChildrenAndTeen();
	      tab3 = new TableBodyDenstiyMan();
		
	}
	
	public String ReturnSituation_DurninEtWomersley_1974_Male_Men17A19anos(double BI, double TR, double SB, double SI, double age, int gender){
		   
		   om4.setBI(BI);
		   om4.setTR(TR);
		   om4.setSB(SB);
		   om4.setSI(SI);
		   
		   om4.Men17A19years();
		   
		   String res;
		 
		   	if(age == 17){
		   		
		   		res = tab2.check(om4.CalculateFatPercentage(age, gender));
		   		
		   		return res;
		   	}
		   	
		   	else if (age > 17 || age<=19){
		   		
		   		res = tab3.check(om4.CalculateFatPercentage(age, gender), age);
		   		
		   		return res;
		   	}
		   	
		   return null;
	   }

}
