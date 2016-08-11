package Control;

import Skinfold.SkinfoldFemaleSpecficWithersNortonCraigHartlandEtVenables1987;
import Table.TableBodyDenstiyFemaleChildrenAndTeen;
import Table.TableBodyDenstiyWoman;

public class ControlSkinfoldSpecificWithersNortonCraigHartlandEtVenables1987FemaleWomenActive17A35years {
	SkinfoldFemaleSpecficWithersNortonCraigHartlandEtVenables1987 obj;
	TableBodyDenstiyWoman tab4;
	TableBodyDenstiyFemaleChildrenAndTeen tab1;
	
	public ControlSkinfoldSpecificWithersNortonCraigHartlandEtVenables1987FemaleWomenActive17A35years() {

		obj = new SkinfoldFemaleSpecficWithersNortonCraigHartlandEtVenables1987();
		tab4 = new TableBodyDenstiyWoman();
		tab1 = new TableBodyDenstiyFemaleChildrenAndTeen();

	}

	public String ReturnSituation_Withers_Norton_Craig_Hartland_Et_Venables_1987(double TR, double SB, double SI, double AB, double CX, double PR, int gender, int age) {
		String res = null;
		
		obj.setTR(TR);
		obj.setSB(SB);
		obj.setSI(SI);
		obj.setAB(AB);
		obj.setCX(CX);
		obj.setPR(PR);
		obj.setAgeInYears(age);
		obj.setGender(gender);
		
		obj.ActiveWomen_17A35years();
		
		if(age == 17){
			res = tab1.check(obj.CalculateFatPercentage(age, gender));
		}
		else if(age >= 18 || age <= 35){
			res = tab4.check(obj.CalculateFatPercentage(age, gender), age);
		}
			
		return res; 
	}
}
