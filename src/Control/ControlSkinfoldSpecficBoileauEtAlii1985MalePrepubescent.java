package Control;

import Skinfold.SkinfoldMaleSpecficDeurenbergEtAlii1990;
import Table.TableBodyDenstiyMaleChildrenAndTeen;

public class ControlSkinfoldSpecficBoileauEtAlii1985MalePrepubescent {
	
	SkinfoldMaleSpecficDeurenbergEtAlii1990 om2;
	TableBodyDenstiyMaleChildrenAndTeen tab2;
	
	public ControlSkinfoldSpecficBoileauEtAlii1985MalePrepubescent(){
		
		om2 = new SkinfoldMaleSpecficDeurenbergEtAlii1990();
		tab2 = new TableBodyDenstiyMaleChildrenAndTeen();
		
	}
	
	public String ReturnSituation_BoileauEtAlii_1985_Male_Prepubescent(double BI, double TR, double SB, double SI){
		   
		   om2.setBI(BI);
		   om2.setTR(TR);
		   om2.setSB(SB);
		   om2.setSI(SI);
		   
		   
	       String res = tab2.check(om2.WhiteAndBlackBoys_Prepubescent());
		   
		   return res;
	   }

}
