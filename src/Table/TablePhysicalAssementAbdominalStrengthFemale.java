package Table;

public class TablePhysicalAssementAbdominalStrengthFemale {

	TableSupport tableOfAbdominalStrength_Female[], age_6, age_7, age_8, age_9, age_10, age_11, age_12, age_13,
			age_14, age_15, age_16, age_17;

	public TablePhysicalAssementAbdominalStrengthFemale() {
		InicializeTableAbdominalStrength_Female();
	}

	public void InicializeTableAbdominalStrength_Female() {

		age_6 = new TableSupport();
		age_7 = new TableSupport();
		age_8 = new TableSupport();
		age_9 = new TableSupport();
		age_10 = new TableSupport();
		age_11 = new TableSupport();
		age_12 = new TableSupport();
		age_13 = new TableSupport();
		age_14 = new TableSupport();
		age_15 = new TableSupport();
		age_16 = new TableSupport();
		age_17 = new TableSupport();

		tableOfAbdominalStrength_Female = new TableSupport[12];

		age_6.setNumFixoAge(6);
		age_6.setNumFixoTable(18.0);

		age_7.setNumFixoAge(7);
		age_7.setNumFixoTable(18.0);

		age_8.setNumFixoAge(8);
		age_8.setNumFixoTable(18.0);

		age_9.setNumFixoAge(9);
		age_9.setNumFixoTable(20.0);

		age_10.setNumFixoAge(10);
		age_10.setNumFixoTable(26.0);

		age_11.setNumFixoAge(11);
		age_11.setNumFixoTable(30.0);

		age_12.setNumFixoAge(12);
		age_12.setNumFixoTable(30.0);

		age_13.setNumFixoAge(13);
		age_13.setNumFixoTable(33.0);

		age_14.setNumFixoAge(14);
		age_14.setNumFixoTable(34.0);

		age_15.setNumFixoAge(15);
		age_15.setNumFixoTable(34.0);

		age_16.setNumFixoAge(16);
		age_16.setNumFixoTable(34.0);

		age_17.setNumFixoAge(17);
		age_17.setNumFixoTable(34.0);

		tableOfAbdominalStrength_Female[0] = age_6;
		tableOfAbdominalStrength_Female[1] = age_7;
		tableOfAbdominalStrength_Female[2] = age_8;
		tableOfAbdominalStrength_Female[3] = age_9;
		tableOfAbdominalStrength_Female[4] = age_10;
		tableOfAbdominalStrength_Female[5] = age_11;
		tableOfAbdominalStrength_Female[6] = age_12;
		tableOfAbdominalStrength_Female[7] = age_13;
		tableOfAbdominalStrength_Female[8] = age_14;
		tableOfAbdominalStrength_Female[9] = age_15;
		tableOfAbdominalStrength_Female[10] = age_16;
		tableOfAbdominalStrength_Female[11] = age_17;

	}

	public String SituationDoesNotExist() {
		return "Resultados para este nivel de age não existe em nossos registros.";
	}

	public String Situation1() {
		return "Saudável";
	}

	public String Situation2() {
		return "Não Saudável";
	}

	public String verifyAbdominalStrength_Female(double r, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return SituationDoesNotExist();
		} else if (age == age_6.getNumFixoAge() && r > age_6.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_6.getNumFixoAge() && r < age_6.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_7.getNumFixoAge() && r > age_7.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_7.getNumFixoAge() && r < age_7.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_8.getNumFixoAge() && r > age_8.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_8.getNumFixoAge() && r < age_8.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_9.getNumFixoAge() && r > age_9.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_9.getNumFixoAge() && r < age_9.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_10.getNumFixoAge() && r > age_10.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_10.getNumFixoAge() && r < age_10.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_11.getNumFixoAge() && r > age_11.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_11.getNumFixoAge() && r < age_11.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_12.getNumFixoAge() && r > age_12.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_12.getNumFixoAge() && r < age_12.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_13.getNumFixoAge() && r > age_13.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_13.getNumFixoAge() && r < age_13.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_14.getNumFixoAge() && r > age_14.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_14.getNumFixoAge() && r < age_14.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_15.getNumFixoAge() && r > age_15.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_15.getNumFixoAge() && r < age_15.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_16.getNumFixoAge() && r > age_16.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_16.getNumFixoAge() && r < age_16.getNumFixoTable()) {
			return Situation2();
		}

		else if (age == age_17.getNumFixoAge() && r > age_17.getNumFixoTable()) {
			return Situation1();
		} else if (age == age_17.getNumFixoAge() && r < age_17.getNumFixoTable()) {
			return Situation2();
		}
		return null;
	}

}
