package Table;

public class TableNeuromuscularFlexionArmsFemale {

	TableSupport TableFlexionArms_Female[][], category_Weak_15_19, category_Weak_20_29, category_Weak_30_39, category_Weak_40_49, category_Weak_50_59,
			category_Weak_60_69, category_Reasonable_15_19, category_Reasonable_20_29, category_Reasonable_30_39, category_Reasonable_40_49, category_Reasonable_50_59, category_Reasonable_60_69,
			category_Medium_15_19, category_Medium_20_29, category_Medium_30_39, category_Medium_40_49, category_Medium_50_59, category_Medium_60_69, category_Good_15_19, category_Good_20_29,
			category_Good_30_39, category_Good_40_49, category_Good_50_59, category_Good_60_69, category_Excellent_15_19, category_Excellent_20_29, category_Excellent_30_39,
			category_Excellent_40_49, category_Excellent_50_59, category_Excellent_60_69;

	public TableNeuromuscularFlexionArmsFemale() {
		InicializeTableFlexionArms_Female();
	}
	public void InicializeTableFlexionArms_Female() {

		category_Weak_15_19 = new TableSupport();
		category_Weak_20_29 = new TableSupport();
		category_Weak_30_39 = new TableSupport();
		category_Weak_40_49 = new TableSupport();
		category_Weak_50_59 = new TableSupport();
		category_Weak_60_69 = new TableSupport();

		category_Reasonable_15_19 = new TableSupport();
		category_Reasonable_20_29 = new TableSupport();
		category_Reasonable_30_39 = new TableSupport();
		category_Reasonable_40_49 = new TableSupport();
		category_Reasonable_50_59 = new TableSupport();
		category_Reasonable_60_69 = new TableSupport();

		category_Medium_15_19 = new TableSupport();
		category_Medium_20_29 = new TableSupport();
		category_Medium_30_39 = new TableSupport();
		category_Medium_40_49 = new TableSupport();
		category_Medium_50_59 = new TableSupport();
		category_Medium_60_69 = new TableSupport();

		category_Good_15_19 = new TableSupport();
		category_Good_20_29 = new TableSupport();
		category_Good_30_39 = new TableSupport();
		category_Good_40_49 = new TableSupport();
		category_Good_50_59 = new TableSupport();
		category_Good_60_69 = new TableSupport();

		category_Excellent_15_19 = new TableSupport();
		category_Excellent_20_29 = new TableSupport();
		category_Excellent_30_39 = new TableSupport();
		category_Excellent_40_49 = new TableSupport();
		category_Excellent_50_59 = new TableSupport();
		category_Excellent_60_69 = new TableSupport();

		TableFlexionArms_Female = new TableSupport[6][6];

		category_Weak_15_19.setLowerAgeLimite(15.0);
		category_Weak_15_19.setHighterAgeLimite(19.0);
		category_Weak_15_19.setMinimumValueOfTheTableCell(0.0);
		category_Weak_15_19.setMaximumValueOfTheTableCell(11.0);

		category_Weak_20_29.setLowerAgeLimite(20.0);
		category_Weak_20_29.setHighterAgeLimite(29.0);
		category_Weak_20_29.setMinimumValueOfTheTableCell(0.0);
		category_Weak_20_29.setMaximumValueOfTheTableCell(9.0);

		category_Weak_30_39.setLowerAgeLimite(30.0);
		category_Weak_30_39.setHighterAgeLimite(39.0);
		category_Weak_30_39.setMinimumValueOfTheTableCell(0.0);
		category_Weak_30_39.setMaximumValueOfTheTableCell(7.0);

		category_Weak_40_49.setLowerAgeLimite(40.0);
		category_Weak_40_49.setHighterAgeLimite(49.0);
		category_Weak_40_49.setMinimumValueOfTheTableCell(0.0);
		category_Weak_40_49.setMaximumValueOfTheTableCell(4.0);

		category_Weak_50_59.setLowerAgeLimite(50.0);
		category_Weak_50_59.setHighterAgeLimite(59.0);
		category_Weak_50_59.setMinimumValueOfTheTableCell(0.0);
		category_Weak_50_59.setMaximumValueOfTheTableCell(1.0);

		category_Weak_60_69.setLowerAgeLimite(60.0);
		category_Weak_60_69.setHighterAgeLimite(69.0);
		category_Weak_60_69.setMinimumValueOfTheTableCell(0.0);
		category_Weak_60_69.setMaximumValueOfTheTableCell(1.0);

		// ---------------------------------------

		category_Reasonable_15_19.setLowerAgeLimite(15.0);
		category_Reasonable_15_19.setHighterAgeLimite(19.0);
		category_Reasonable_15_19.setMinimumValueOfTheTableCell(12.0);
		category_Reasonable_15_19.setMaximumValueOfTheTableCell(17.0);

		category_Reasonable_20_29.setLowerAgeLimite(20.0);
		category_Reasonable_20_29.setHighterAgeLimite(29.0);
		category_Reasonable_20_29.setMinimumValueOfTheTableCell(10.0);
		category_Reasonable_20_29.setMaximumValueOfTheTableCell(14.0);

		category_Reasonable_30_39.setLowerAgeLimite(30.0);
		category_Reasonable_30_39.setHighterAgeLimite(39.0);
		category_Reasonable_30_39.setMinimumValueOfTheTableCell(8.0);
		category_Reasonable_30_39.setMaximumValueOfTheTableCell(12.0);

		category_Reasonable_40_49.setLowerAgeLimite(40.0);
		category_Reasonable_40_49.setHighterAgeLimite(49.0);
		category_Reasonable_40_49.setMinimumValueOfTheTableCell(5.0);
		category_Reasonable_40_49.setMaximumValueOfTheTableCell(10.0);

		category_Reasonable_50_59.setLowerAgeLimite(50.0);
		category_Reasonable_50_59.setHighterAgeLimite(59.0);
		category_Reasonable_50_59.setMinimumValueOfTheTableCell(2.0);
		category_Reasonable_50_59.setMaximumValueOfTheTableCell(6.0);

		category_Reasonable_60_69.setLowerAgeLimite(60.0);
		category_Reasonable_60_69.setHighterAgeLimite(69.0);
		category_Reasonable_60_69.setMinimumValueOfTheTableCell(1.0);
		category_Reasonable_60_69.setMaximumValueOfTheTableCell(4.0);

		// -------------------------------------

		category_Medium_15_19.setLowerAgeLimite(15.0);
		category_Medium_15_19.setHighterAgeLimite(19.0);
		category_Medium_15_19.setMinimumValueOfTheTableCell(18.0);
		category_Medium_15_19.setMaximumValueOfTheTableCell(24.0);

		category_Medium_20_29.setLowerAgeLimite(20.0);
		category_Medium_20_29.setHighterAgeLimite(29.0);
		category_Medium_20_29.setMinimumValueOfTheTableCell(15.0);
		category_Medium_20_29.setMaximumValueOfTheTableCell(20.0);

		category_Medium_30_39.setLowerAgeLimite(30.0);
		category_Medium_30_39.setHighterAgeLimite(39.0);
		category_Medium_30_39.setMinimumValueOfTheTableCell(13.0);
		category_Medium_30_39.setMaximumValueOfTheTableCell(19.0);

		category_Medium_40_49.setLowerAgeLimite(40.0);
		category_Medium_40_49.setHighterAgeLimite(49.0);
		category_Medium_40_49.setMinimumValueOfTheTableCell(11.0);
		category_Medium_40_49.setMaximumValueOfTheTableCell(14.0);

		category_Medium_50_59.setLowerAgeLimite(50.0);
		category_Medium_50_59.setHighterAgeLimite(59.0);
		category_Medium_50_59.setMinimumValueOfTheTableCell(7.0);
		category_Medium_50_59.setMaximumValueOfTheTableCell(10.0);

		category_Medium_60_69.setLowerAgeLimite(60.0);
		category_Medium_60_69.setHighterAgeLimite(69.0);
		category_Medium_60_69.setMinimumValueOfTheTableCell(5.0);
		category_Medium_60_69.setMaximumValueOfTheTableCell(11.0);

		// -----------------------------------

		category_Good_15_19.setLowerAgeLimite(15.0);
		category_Good_15_19.setHighterAgeLimite(19.0);
		category_Good_15_19.setMinimumValueOfTheTableCell(25.0);
		category_Good_15_19.setMaximumValueOfTheTableCell(32.0);

		category_Good_20_29.setLowerAgeLimite(20.0);
		category_Good_20_29.setHighterAgeLimite(29.0);
		category_Good_20_29.setMinimumValueOfTheTableCell(21.0);
		category_Good_20_29.setMaximumValueOfTheTableCell(29.0);

		category_Good_30_39.setLowerAgeLimite(30.0);
		category_Good_30_39.setHighterAgeLimite(39.0);
		category_Good_30_39.setMinimumValueOfTheTableCell(20.0);
		category_Good_30_39.setMaximumValueOfTheTableCell(26.0);

		category_Good_40_49.setLowerAgeLimite(40.0);
		category_Good_40_49.setHighterAgeLimite(49.0);
		category_Good_40_49.setMinimumValueOfTheTableCell(15.0);
		category_Good_40_49.setMaximumValueOfTheTableCell(23.0);

		category_Good_50_59.setLowerAgeLimite(50.0);
		category_Good_50_59.setHighterAgeLimite(59.0);
		category_Good_50_59.setMinimumValueOfTheTableCell(11.0);
		category_Good_50_59.setMaximumValueOfTheTableCell(20.0);

		category_Good_60_69.setLowerAgeLimite(60.0);
		category_Good_60_69.setHighterAgeLimite(69.0);
		category_Good_60_69.setMinimumValueOfTheTableCell(12.0);
		category_Good_60_69.setMaximumValueOfTheTableCell(16.0);

		// ---------------------------------

		category_Excellent_15_19.setLowerAgeLimite(15.0);
		category_Excellent_15_19.setHighterAgeLimite(19.0);
		category_Excellent_15_19.setMinimumValueOfTheTableCell(33.0);
		category_Excellent_15_19.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_20_29.setLowerAgeLimite(20.0);
		category_Excellent_20_29.setHighterAgeLimite(29.0);
		category_Excellent_20_29.setMinimumValueOfTheTableCell(30.0);
		category_Excellent_20_29.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_30_39.setLowerAgeLimite(30.0);
		category_Excellent_30_39.setHighterAgeLimite(39.0);
		category_Excellent_30_39.setMinimumValueOfTheTableCell(27.0);
		category_Excellent_30_39.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_40_49.setLowerAgeLimite(40.0);
		category_Excellent_40_49.setHighterAgeLimite(49.0);
		category_Excellent_40_49.setMinimumValueOfTheTableCell(24.0);
		category_Excellent_40_49.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_50_59.setLowerAgeLimite(50.0);
		category_Excellent_50_59.setHighterAgeLimite(59.0);
		category_Excellent_50_59.setMinimumValueOfTheTableCell(21.0);
		category_Excellent_50_59.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_60_69.setLowerAgeLimite(60.0);
		category_Excellent_60_69.setHighterAgeLimite(69.0);
		category_Excellent_60_69.setMinimumValueOfTheTableCell(17.0);
		category_Excellent_60_69.setMaximumValueOfTheTableCell(TableSupport.INFINITY);
		
		TableFlexionArms_Female[0][0] = category_Weak_15_19;
		TableFlexionArms_Female[0][1] = category_Weak_20_29;
		TableFlexionArms_Female[0][2] = category_Weak_30_39;
		TableFlexionArms_Female[0][3] = category_Weak_40_49;
		TableFlexionArms_Female[0][4] = category_Weak_50_59;
		TableFlexionArms_Female[0][5] = category_Weak_60_69;
		
		TableFlexionArms_Female[1][0] = category_Reasonable_15_19;
		TableFlexionArms_Female[1][1] = category_Reasonable_20_29;
		TableFlexionArms_Female[1][2] = category_Reasonable_30_39;
		TableFlexionArms_Female[1][3] = category_Reasonable_40_49;
		TableFlexionArms_Female[1][4] = category_Reasonable_50_59;
		TableFlexionArms_Female[1][5] = category_Reasonable_60_69;
		
		TableFlexionArms_Female[2][0] = category_Medium_15_19;
		TableFlexionArms_Female[2][1] = category_Medium_20_29;
		TableFlexionArms_Female[2][2] = category_Medium_30_39;
		TableFlexionArms_Female[2][3] = category_Medium_40_49;
		TableFlexionArms_Female[2][4] = category_Medium_50_59;
		TableFlexionArms_Female[2][5] = category_Medium_60_69;
		
		TableFlexionArms_Female[3][0] = category_Good_15_19;
		TableFlexionArms_Female[3][1] = category_Good_20_29;
		TableFlexionArms_Female[3][2] = category_Good_30_39;
		TableFlexionArms_Female[3][3] = category_Good_40_49;
		TableFlexionArms_Female[3][4] = category_Good_50_59;
		TableFlexionArms_Female[3][5] = category_Good_60_69;
		
		TableFlexionArms_Female[4][0] = category_Excellent_15_19;
		TableFlexionArms_Female[4][1] = category_Excellent_20_29;
		TableFlexionArms_Female[4][2] = category_Excellent_30_39;
		TableFlexionArms_Female[4][3] = category_Excellent_40_49;
		TableFlexionArms_Female[4][4] = category_Excellent_50_59;
		TableFlexionArms_Female[4][5] = category_Excellent_60_69;
	}
	
	public String SituationDoesNotExist() {
		return "Resultados para este nivel de age não existe em nossos registros.";
	}

	public String Situation1() {
		return "category_Weak";
	}

	public String Situation2() {
		return "category_Reasonable";
	}

	public String Situation3() {
		return "category_Medium";
	}

	public String Situation4() {
		return "category_Good";
	}

	public String Situation5() {
		return "category_Excellent";
	}

	public String verifyFlexionArms_Female(double r, double age) {

		if (age <= 14.0) {
			return SituationDoesNotExist();
		} else if (((age >= category_Weak_15_19.getLowerAgeLimite() && age <= category_Weak_15_19.getHighterAgeLimite()) && (r >= category_Weak_15_19.getMinimumValueOfTheTableCell() && r <= category_Weak_15_19.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Weak_20_29.getLowerAgeLimite() && age <= category_Weak_20_29.getHighterAgeLimite()) && (r >= category_Weak_20_29.getMinimumValueOfTheTableCell() && r <= category_Weak_20_29.getMaximumValueOfTheTableCell())) 
				|| ((age >= category_Weak_30_39.getLowerAgeLimite() && age <= category_Weak_30_39.getHighterAgeLimite()) && (r >= category_Weak_30_39.getMinimumValueOfTheTableCell() && r <= category_Weak_30_39.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Weak_40_49.getLowerAgeLimite() && age <= category_Weak_40_49.getHighterAgeLimite()) && (r >= category_Weak_40_49.getMinimumValueOfTheTableCell() && r <= category_Weak_40_49.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Weak_50_59.getLowerAgeLimite() && age <= category_Weak_50_59.getHighterAgeLimite()) && (r >= category_Weak_50_59.getMinimumValueOfTheTableCell() && r <= category_Weak_50_59.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Weak_60_69.getLowerAgeLimite() && age <= category_Weak_60_69.getHighterAgeLimite()) && (r >= category_Weak_60_69.getMinimumValueOfTheTableCell() && r <= category_Weak_60_69.getMaximumValueOfTheTableCell()))) {
			return Situation1();
		}
		else if (((age >= category_Reasonable_15_19.getLowerAgeLimite() && age <= category_Reasonable_15_19.getHighterAgeLimite()) && (r >= category_Reasonable_15_19.getMinimumValueOfTheTableCell() && r <= category_Reasonable_15_19.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Reasonable_20_29.getLowerAgeLimite() && age <= category_Reasonable_20_29.getHighterAgeLimite()) && (r >= category_Reasonable_20_29.getMinimumValueOfTheTableCell() && r <= category_Reasonable_20_29.getMaximumValueOfTheTableCell())) 
				|| ((age >= category_Reasonable_30_39.getLowerAgeLimite() && age <= category_Reasonable_30_39.getHighterAgeLimite()) && (r >= category_Reasonable_30_39.getMinimumValueOfTheTableCell() && r <= category_Reasonable_30_39.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Reasonable_40_49.getLowerAgeLimite() && age <= category_Reasonable_40_49.getHighterAgeLimite()) && (r >= category_Reasonable_40_49.getMinimumValueOfTheTableCell() && r <= category_Reasonable_40_49.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Reasonable_50_59.getLowerAgeLimite() && age <= category_Reasonable_50_59.getHighterAgeLimite()) && (r >= category_Reasonable_50_59.getMinimumValueOfTheTableCell() && r <= category_Reasonable_50_59.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Reasonable_60_69.getLowerAgeLimite() && age <= category_Reasonable_60_69.getHighterAgeLimite()) && (r >= category_Reasonable_60_69.getMinimumValueOfTheTableCell() && r <= category_Reasonable_60_69.getMaximumValueOfTheTableCell()))) {
			return Situation2();
		}
		else if (((age >= category_Medium_15_19.getLowerAgeLimite() && age <= category_Medium_15_19.getHighterAgeLimite()) && (r >= category_Medium_15_19.getMinimumValueOfTheTableCell() && r <= category_Medium_15_19.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Medium_20_29.getLowerAgeLimite() && age <= category_Medium_20_29.getHighterAgeLimite()) && (r >= category_Medium_20_29.getMinimumValueOfTheTableCell() && r <= category_Medium_20_29.getMaximumValueOfTheTableCell())) 
				|| ((age >= category_Medium_30_39.getLowerAgeLimite() && age <= category_Medium_30_39.getHighterAgeLimite()) && (r >= category_Medium_30_39.getMinimumValueOfTheTableCell() && r <= category_Medium_30_39.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Medium_40_49.getLowerAgeLimite() && age <= category_Medium_40_49.getHighterAgeLimite()) && (r >= category_Medium_40_49.getMinimumValueOfTheTableCell() && r <= category_Medium_40_49.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Medium_50_59.getLowerAgeLimite() && age <= category_Medium_50_59.getHighterAgeLimite()) && (r >= category_Medium_50_59.getMinimumValueOfTheTableCell() && r <= category_Medium_50_59.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Medium_60_69.getLowerAgeLimite() && age <= category_Medium_60_69.getHighterAgeLimite()) && (r >= category_Medium_60_69.getMinimumValueOfTheTableCell() && r <= category_Medium_60_69.getMaximumValueOfTheTableCell()))) {
			return Situation3();
		}
		else if (((age >= category_Good_15_19.getLowerAgeLimite() && age <= category_Good_15_19.getHighterAgeLimite()) && (r >= category_Good_15_19.getMinimumValueOfTheTableCell() && r <= category_Good_15_19.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Good_20_29.getLowerAgeLimite() && age <= category_Good_20_29.getHighterAgeLimite()) && (r >= category_Good_20_29.getMinimumValueOfTheTableCell() && r <= category_Good_20_29.getMaximumValueOfTheTableCell())) 
				|| ((age >= category_Good_30_39.getLowerAgeLimite() && age <= category_Good_30_39.getHighterAgeLimite()) && (r >= category_Good_30_39.getMinimumValueOfTheTableCell() && r <= category_Good_30_39.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Good_40_49.getLowerAgeLimite() && age <= category_Good_40_49.getHighterAgeLimite()) && (r >= category_Good_40_49.getMinimumValueOfTheTableCell() && r <= category_Good_40_49.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Good_50_59.getLowerAgeLimite() && age <= category_Good_50_59.getHighterAgeLimite()) && (r >= category_Good_50_59.getMinimumValueOfTheTableCell() && r <= category_Good_50_59.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Good_60_69.getLowerAgeLimite() && age <= category_Good_60_69.getHighterAgeLimite()) && (r >= category_Good_60_69.getMinimumValueOfTheTableCell() && r <= category_Good_60_69.getMaximumValueOfTheTableCell()))) {
			return Situation4();
		}
		else if (((age >= category_Excellent_15_19.getLowerAgeLimite() && age <= category_Excellent_15_19.getHighterAgeLimite()) && (r >= category_Excellent_15_19.getMinimumValueOfTheTableCell() && r <= category_Excellent_15_19.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Excellent_20_29.getLowerAgeLimite() && age <= category_Excellent_20_29.getHighterAgeLimite()) && (r >= category_Excellent_20_29.getMinimumValueOfTheTableCell() && r <= category_Excellent_20_29.getMaximumValueOfTheTableCell())) 
				|| ((age >= category_Excellent_30_39.getLowerAgeLimite() && age <= category_Excellent_30_39.getHighterAgeLimite()) && (r >= category_Excellent_30_39.getMinimumValueOfTheTableCell() && r <= category_Excellent_30_39.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Excellent_40_49.getLowerAgeLimite() && age <= category_Excellent_40_49.getHighterAgeLimite()) && (r >= category_Excellent_40_49.getMinimumValueOfTheTableCell() && r <= category_Excellent_40_49.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Excellent_50_59.getLowerAgeLimite() && age <= category_Excellent_50_59.getHighterAgeLimite()) && (r >= category_Excellent_50_59.getMinimumValueOfTheTableCell() && r <= category_Excellent_50_59.getMaximumValueOfTheTableCell()))
				|| ((age >= category_Excellent_60_69.getLowerAgeLimite() && age <= category_Excellent_60_69.getHighterAgeLimite()) && (r >= category_Excellent_60_69.getMinimumValueOfTheTableCell() && r <= category_Excellent_60_69.getMaximumValueOfTheTableCell()))) {
			return Situation5();
		}
		
		return null;
	}
}
