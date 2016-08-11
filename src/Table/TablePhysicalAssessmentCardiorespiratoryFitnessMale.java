package Table;

public class TablePhysicalAssessmentCardiorespiratoryFitnessMale {

	TableSupport tableOfCardiorespiratoryFitness_Male[], age_6, age_7, age_8, age_9, age_10, age_11, age_12,
			age_13, age_14, age_15, age_16, age_17;

	public TablePhysicalAssessmentCardiorespiratoryFitnessMale() {
		initializeTableOfCardiorespiratoryFitness_Male();
	}

	public void initializeTableOfCardiorespiratoryFitness_Male() {

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

		tableOfCardiorespiratoryFitness_Male = new TableSupport[12];

		age_6.setNumFixoAge(6);
		age_6.setNumFixoTable(675.0);

		age_7.setNumFixoAge(7);
		age_7.setNumFixoTable(730.0);

		age_8.setNumFixoAge(8);
		age_8.setNumFixoTable(768.0);

		age_9.setNumFixoAge(9);
		age_9.setNumFixoTable(820.0);

		age_10.setNumFixoAge(10);
		age_10.setNumFixoTable(856.0);

		age_11.setNumFixoAge(11);
		age_11.setNumFixoTable(930.0);

		age_12.setNumFixoAge(12);
		age_12.setNumFixoTable(966.0);

		age_13.setNumFixoAge(13);
		age_13.setNumFixoTable(995.0);

		age_14.setNumFixoAge(14);
		age_14.setNumFixoTable(1060.0);

		age_15.setNumFixoAge(15);
		age_15.setNumFixoTable(1130.0);

		age_16.setNumFixoAge(16);
		age_16.setNumFixoTable(1190.0);

		age_17.setNumFixoAge(17);
		age_17.setNumFixoTable(1190.0);

		tableOfCardiorespiratoryFitness_Male[0] = age_6;
		tableOfCardiorespiratoryFitness_Male[1] = age_7;
		tableOfCardiorespiratoryFitness_Male[2] = age_8;
		tableOfCardiorespiratoryFitness_Male[3] = age_9;
		tableOfCardiorespiratoryFitness_Male[4] = age_10;
		tableOfCardiorespiratoryFitness_Male[5] = age_11;
		tableOfCardiorespiratoryFitness_Male[6] = age_12;
		tableOfCardiorespiratoryFitness_Male[7] = age_13;
		tableOfCardiorespiratoryFitness_Male[8] = age_14;
		tableOfCardiorespiratoryFitness_Male[9] = age_15;
		tableOfCardiorespiratoryFitness_Male[10] = age_16;
		tableOfCardiorespiratoryFitness_Male[11] = age_17;

	}

	public String SituationDoesNotExist() {
		return "Resultados para este nivel de age não existe em nossos registros.";
	}

	public String HealthySituation() {
		return "Saudável";
	}

	public String NotHealthySituation() {
		return "Não Saudável";
	}

	public String verifyCardiorespiratoryFitness_Male(double r, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return SituationDoesNotExist();
		} else if (age == age_6.getNumFixoAge() && r > age_6.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_6.getNumFixoAge() && r < age_6.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_7.getNumFixoAge() && r > age_7.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_7.getNumFixoAge() && r < age_7.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_8.getNumFixoAge() && r > age_8.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_8.getNumFixoAge() && r < age_8.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_9.getNumFixoAge() && r > age_9.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_9.getNumFixoAge() && r < age_9.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_10.getNumFixoAge() && r > age_10.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_10.getNumFixoAge() && r < age_10.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_11.getNumFixoAge() && r > age_11.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_11.getNumFixoAge() && r < age_11.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_12.getNumFixoAge() && r > age_12.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_12.getNumFixoAge() && r < age_12.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_13.getNumFixoAge() && r > age_13.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_13.getNumFixoAge() && r < age_13.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_14.getNumFixoAge() && r > age_14.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_14.getNumFixoAge() && r < age_14.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_15.getNumFixoAge() && r > age_15.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_15.getNumFixoAge() && r < age_15.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_16.getNumFixoAge() && r > age_16.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_16.getNumFixoAge() && r < age_16.getNumFixoTable()) {
			return NotHealthySituation();
		}

		else if (age == age_17.getNumFixoAge() && r > age_17.getNumFixoTable()) {
			return HealthySituation();
		} else if (age == age_17.getNumFixoAge() && r < age_17.getNumFixoTable()) {
			return NotHealthySituation();
		}
		return null;
	}

}
