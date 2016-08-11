package Table;

public class TablePhysicalAssementWaistAndHipRatioFemale {

	TableSupport TabICQ[][];

	TableSupport LowValue1;
	TableSupport LowValue2;
	TableSupport LowValue3;
	TableSupport LowValue4;
	TableSupport LowValue5;

	TableSupport ModerateValue1;
	TableSupport ModerateValue2;
	TableSupport ModerateValue3;
	TableSupport ModerateValue4;
	TableSupport ModerateValue5;

	TableSupport HighValue1;
	TableSupport HighValue2;
	TableSupport HighValue3;
	TableSupport HighValue4;
	TableSupport HighValue5;

	TableSupport VeryHighValue1;
	TableSupport VeryHighValue2;
	TableSupport VeryHighValue3;
	TableSupport VeryHighValue4;
	TableSupport VeryHighValue5;

	public TablePhysicalAssementWaistAndHipRatioFemale() {
		InicializaTabICQ_Feminina();
	}

	public void InicializaTabICQ_Feminina() {

		LowValue1 = new TableSupport();
		LowValue2 = new TableSupport();
		LowValue3 = new TableSupport();
		LowValue4 = new TableSupport();
		LowValue5 = new TableSupport();

		ModerateValue1 = new TableSupport();
		ModerateValue2 = new TableSupport();
		ModerateValue3 = new TableSupport();
		ModerateValue4 = new TableSupport();
		ModerateValue5 = new TableSupport();

		HighValue1 = new TableSupport();
		HighValue2 = new TableSupport();
		HighValue3 = new TableSupport();
		HighValue4 = new TableSupport();
		HighValue5 = new TableSupport();

		VeryHighValue1 = new TableSupport();
		VeryHighValue2 = new TableSupport();
		VeryHighValue3 = new TableSupport();
		VeryHighValue4 = new TableSupport();
		VeryHighValue5 = new TableSupport();

		TabICQ = new TableSupport[5][4];

		LowValue1.setLowerAgeLimite(20);
		LowValue1.setHighterAgeLimite(29);
		LowValue1.setMaximumValueOfTheTableCell(0.70);

		LowValue2.setLowerAgeLimite(30);
		LowValue2.setHighterAgeLimite(39);
		LowValue2.setMaximumValueOfTheTableCell(0.71);

		LowValue3.setLowerAgeLimite(40);
		LowValue3.setHighterAgeLimite(49);
		LowValue3.setMaximumValueOfTheTableCell(0.72);

		LowValue4.setLowerAgeLimite(50);
		LowValue4.setHighterAgeLimite(59);
		LowValue4.setMaximumValueOfTheTableCell(0.73);

		LowValue5.setLowerAgeLimite(60);
		LowValue5.setHighterAgeLimite(69);
		LowValue5.setMaximumValueOfTheTableCell(0.75);

		ModerateValue1.setLowerAgeLimite(20);
		ModerateValue1.setHighterAgeLimite(29);
		ModerateValue1.setMinimumValueOfTheTableCell(0.71);
		ModerateValue1.setMaximumValueOfTheTableCell(0.77);

		ModerateValue2.setLowerAgeLimite(30);
		ModerateValue2.setHighterAgeLimite(39);
		ModerateValue2.setMinimumValueOfTheTableCell(0.72);
		ModerateValue2.setMaximumValueOfTheTableCell(0.78);

		ModerateValue3.setLowerAgeLimite(40);
		ModerateValue3.setHighterAgeLimite(49);
		ModerateValue3.setMinimumValueOfTheTableCell(0.73);
		ModerateValue3.setMaximumValueOfTheTableCell(0.79);

		ModerateValue4.setLowerAgeLimite(50);
		ModerateValue4.setHighterAgeLimite(59);
		ModerateValue4.setMinimumValueOfTheTableCell(0.74);
		ModerateValue4.setMaximumValueOfTheTableCell(0.81);

		ModerateValue5.setLowerAgeLimite(60);
		ModerateValue5.setHighterAgeLimite(69);
		ModerateValue5.setMinimumValueOfTheTableCell(0.76);
		ModerateValue5.setMaximumValueOfTheTableCell(0.83);

		HighValue1.setLowerAgeLimite(20);
		HighValue1.setHighterAgeLimite(29);
		HighValue1.setMinimumValueOfTheTableCell(0.78);
		HighValue1.setMaximumValueOfTheTableCell(0.82);

		HighValue2.setLowerAgeLimite(30);
		HighValue2.setHighterAgeLimite(39);
		HighValue2.setMinimumValueOfTheTableCell(0.79);
		HighValue2.setMaximumValueOfTheTableCell(0.84);

		HighValue3.setLowerAgeLimite(40);
		HighValue3.setHighterAgeLimite(49);
		HighValue3.setMinimumValueOfTheTableCell(0.80);
		HighValue3.setMaximumValueOfTheTableCell(1.87);

		HighValue4.setLowerAgeLimite(50);
		HighValue4.setHighterAgeLimite(59);
		HighValue4.setMinimumValueOfTheTableCell(0.82);
		HighValue4.setMaximumValueOfTheTableCell(1.88);

		HighValue5.setLowerAgeLimite(60);
		HighValue5.setHighterAgeLimite(69);
		HighValue5.setMinimumValueOfTheTableCell(0.84);
		HighValue5.setMaximumValueOfTheTableCell(1.90);

		VeryHighValue1.setLowerAgeLimite(20);
		VeryHighValue1.setHighterAgeLimite(29);
		VeryHighValue1.setMinimumValueOfTheTableCell(0.83);
		VeryHighValue1.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		VeryHighValue2.setLowerAgeLimite(30);
		VeryHighValue2.setHighterAgeLimite(39);
		VeryHighValue2.setMinimumValueOfTheTableCell(0.85);
		VeryHighValue2.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		VeryHighValue3.setLowerAgeLimite(40);
		VeryHighValue3.setHighterAgeLimite(49);
		VeryHighValue3.setMinimumValueOfTheTableCell(0.88);
		VeryHighValue3.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		VeryHighValue4.setLowerAgeLimite(50);
		VeryHighValue4.setHighterAgeLimite(59);
		VeryHighValue4.setMinimumValueOfTheTableCell(0.89);
		VeryHighValue4.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		VeryHighValue5.setLowerAgeLimite(60);
		VeryHighValue5.setHighterAgeLimite(69);
		VeryHighValue5.setMinimumValueOfTheTableCell(0.91);
		VeryHighValue5.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		TabICQ[0][0] = LowValue1;
		TabICQ[1][0] = LowValue2;
		TabICQ[2][0] = LowValue3;
		TabICQ[3][0] = LowValue4;
		TabICQ[4][0] = LowValue5;

		TabICQ[0][1] = ModerateValue1;
		TabICQ[1][1] = ModerateValue2;
		TabICQ[2][1] = ModerateValue3;
		TabICQ[3][1] = ModerateValue4;
		TabICQ[4][1] = ModerateValue5;

		TabICQ[0][2] = HighValue1;
		TabICQ[1][2] = HighValue2;
		TabICQ[2][2] = HighValue3;
		TabICQ[3][2] = HighValue4;
		TabICQ[4][2] = HighValue5;

		TabICQ[0][3] = VeryHighValue1;
		TabICQ[1][3] = VeryHighValue2;
		TabICQ[2][3] = VeryHighValue3;
		TabICQ[3][3] = VeryHighValue4;
		TabICQ[4][3] = VeryHighValue5;

	}
	
	public String SituationDoesNotExist() {
		return "Resultados para este nivel de age não existe em nossos registros.";
	}

	public String Situation1() {
		return "LowValue";
	}

	public String Situation2() {
		return "ModerateValue";
	}

	public String Situation3() {
		return "HighValue";
	}

	public String Situation4() {
		return "Muito HighValue";
	}

	public String verifyWaistAndHipRatio_Female(double r, double age) {
		
		if (age <= 19.0) {
			return SituationDoesNotExist();
		} else if (r <= LowValue1.getMaximumValueOfTheTableCell() && (age >= LowValue1.getLowerAgeLimite() && age <= LowValue1.getHighterAgeLimite())) {
			return Situation1();
		} else if (r <= LowValue2.getMaximumValueOfTheTableCell()
				&& (age >= LowValue2.getLowerAgeLimite() && age <= LowValue2.getHighterAgeLimite())) {
			return Situation1();
		} else if (r <= LowValue3.getMaximumValueOfTheTableCell()
				&& (age >= LowValue3.getLowerAgeLimite() && age <= LowValue3.getHighterAgeLimite())) {
			return Situation1();
		} else if (r <= LowValue4.getMaximumValueOfTheTableCell()
				&& (age >= LowValue4.getLowerAgeLimite() && age <= LowValue4.getHighterAgeLimite())) {
			return Situation1();
		} else if (r <= LowValue5.getMaximumValueOfTheTableCell()
				&& (age >= LowValue5.getLowerAgeLimite() && age <= LowValue5.getHighterAgeLimite())) {
			return Situation1();
		}

		else if ((r >= ModerateValue1.getMinimumValueOfTheTableCell() && r <= ModerateValue1.getMaximumValueOfTheTableCell())
				&& (age >= ModerateValue1.getLowerAgeLimite() && age <= ModerateValue1.getHighterAgeLimite())) {
			return Situation2();
		} else if ((r >= ModerateValue2.getMinimumValueOfTheTableCell() && r <= ModerateValue2.getMaximumValueOfTheTableCell())
				&& (age >= ModerateValue2.getLowerAgeLimite() && age <= ModerateValue2.getHighterAgeLimite())) {
			return Situation2();
		} else if ((r >= ModerateValue3.getMinimumValueOfTheTableCell() && r <= ModerateValue3.getMaximumValueOfTheTableCell())
				&& (age >= ModerateValue3.getLowerAgeLimite() && age <= ModerateValue3.getHighterAgeLimite())) {
			return Situation2();
		} else if ((r >= ModerateValue4.getMinimumValueOfTheTableCell() && r <= ModerateValue4.getMaximumValueOfTheTableCell())
				&& (age >= ModerateValue4.getLowerAgeLimite() && age <= ModerateValue4.getHighterAgeLimite())) {
			return Situation2();
		} else if ((r >= ModerateValue5.getMinimumValueOfTheTableCell() && r <= ModerateValue5.getMaximumValueOfTheTableCell())
				&& (age >= ModerateValue5.getLowerAgeLimite() && age <= ModerateValue5.getHighterAgeLimite())) {
			return Situation2();
		}

		else if ((r >= HighValue1.getMinimumValueOfTheTableCell() && r <= HighValue1.getMaximumValueOfTheTableCell())
				&& (age >= HighValue1.getLowerAgeLimite() && age <= HighValue1.getHighterAgeLimite())) {
			return Situation3();
		} else if ((r >= HighValue2.getMinimumValueOfTheTableCell() && r <= HighValue2.getMaximumValueOfTheTableCell())
				&& (age >= HighValue2.getLowerAgeLimite() && age <= HighValue2.getHighterAgeLimite())) {
			return Situation3();
		} else if ((r >= HighValue3.getMinimumValueOfTheTableCell() && r <= HighValue3.getMaximumValueOfTheTableCell())
				&& (age >= HighValue3.getLowerAgeLimite() && age <= HighValue3.getHighterAgeLimite())) {
			return Situation3();
		} else if ((r >= HighValue4.getMinimumValueOfTheTableCell() && r <= HighValue4.getMaximumValueOfTheTableCell())
				&& (age >= HighValue4.getLowerAgeLimite() && age <= HighValue4.getHighterAgeLimite())) {
			return Situation3();
		} else if ((r >= HighValue5.getMinimumValueOfTheTableCell() && r <= HighValue5.getMaximumValueOfTheTableCell())
				&& (age >= HighValue5.getLowerAgeLimite() && age <= HighValue5.getHighterAgeLimite())) {
			return Situation3();
		}

		else if ((r >= VeryHighValue1.getMinimumValueOfTheTableCell() && r <= VeryHighValue1.getMaximumValueOfTheTableCell())
				&& (age >= VeryHighValue1.getLowerAgeLimite() && age <= VeryHighValue1.getHighterAgeLimite())) {
			return Situation4();
		} else if ((r >= VeryHighValue2.getMinimumValueOfTheTableCell() && r <= VeryHighValue2.getMaximumValueOfTheTableCell())
				&& (age >= VeryHighValue2.getLowerAgeLimite() && age <= VeryHighValue2.getHighterAgeLimite())) {
			return Situation4();
		} else if ((r >= VeryHighValue3.getMinimumValueOfTheTableCell() && r <= VeryHighValue3.getMaximumValueOfTheTableCell())
				&& (age >= VeryHighValue3.getLowerAgeLimite() && age <= VeryHighValue3.getHighterAgeLimite())) {
			return Situation4();
		} else if ((r >= VeryHighValue4.getMinimumValueOfTheTableCell() && r <= VeryHighValue4.getMaximumValueOfTheTableCell())
				&& (age >= VeryHighValue4.getLowerAgeLimite() && age <= VeryHighValue4.getHighterAgeLimite())) {
			return Situation4();
		} else if ((r >= VeryHighValue5.getMinimumValueOfTheTableCell() && r <= VeryHighValue5.getMaximumValueOfTheTableCell())
				&& (age >= VeryHighValue5.getLowerAgeLimite() && age <= VeryHighValue5.getHighterAgeLimite())) {
			return Situation4();
		}
		return null;
	}

}
