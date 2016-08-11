package Table;

public class TablePhysicalAssessmentFlexibilityFemale {
	TableSupport tableOfFlexibility_Female[], category_ZonaSixYears, category_ZonaSevenYears, category_ZonaEightYears,
			category_ZonaNineYears, category_ZonaTenYears, category_ZonaElevenYears, category_ZonaTwelveYears,
			category_ZonaThirteenYears, category_ZonaFourteenYears, category_ZonaFifteenYears,
			category_ZonaSixteenYears, category_ZonaSeventeenYears;

	public TablePhysicalAssessmentFlexibilityFemale() {
		initializeIndextableFlexibility_Female();
	}

	public void initializeIndextableFlexibility_Female() {

		category_ZonaSixYears = new TableSupport();
		category_ZonaSevenYears = new TableSupport();
		category_ZonaEightYears = new TableSupport();
		category_ZonaNineYears = new TableSupport();
		category_ZonaTenYears = new TableSupport();
		category_ZonaElevenYears = new TableSupport();
		category_ZonaTwelveYears = new TableSupport();
		category_ZonaThirteenYears = new TableSupport();
		category_ZonaFourteenYears = new TableSupport();
		category_ZonaFifteenYears = new TableSupport();
		category_ZonaSixteenYears = new TableSupport();
		category_ZonaSeventeenYears = new TableSupport();

		tableOfFlexibility_Female = new TableSupport[12];

		category_ZonaSixYears.setNumFixoAge(6);
		category_ZonaSixYears.setNumFixoTable(40.5);

		category_ZonaSevenYears.setNumFixoAge(7);
		category_ZonaSevenYears.setNumFixoTable(40.5);

		category_ZonaEightYears.setNumFixoAge(8);
		category_ZonaEightYears.setNumFixoTable(39.5);

		category_ZonaNineYears.setNumFixoAge(9);
		category_ZonaNineYears.setNumFixoTable(35.0);

		category_ZonaTenYears.setNumFixoAge(10);
		category_ZonaTenYears.setNumFixoTable(36.5);

		category_ZonaElevenYears.setNumFixoAge(11);
		category_ZonaElevenYears.setNumFixoTable(34.5);

		category_ZonaTwelveYears.setNumFixoAge(12);
		category_ZonaTwelveYears.setNumFixoTable(39.5);

		category_ZonaThirteenYears.setNumFixoAge(13);
		category_ZonaThirteenYears.setNumFixoTable(38.5);

		category_ZonaFourteenYears.setNumFixoAge(14);
		category_ZonaFourteenYears.setNumFixoTable(38.5);

		category_ZonaFifteenYears.setNumFixoAge(15);
		category_ZonaFifteenYears.setNumFixoTable(38.5);

		category_ZonaSixteenYears.setNumFixoAge(16);
		category_ZonaSixteenYears.setNumFixoTable(39.5);

		category_ZonaSeventeenYears.setNumFixoAge(17);
		category_ZonaSeventeenYears.setNumFixoTable(39.0);

		tableOfFlexibility_Female[0] = category_ZonaSixYears;
		tableOfFlexibility_Female[1] = category_ZonaSevenYears;
		tableOfFlexibility_Female[2] = category_ZonaEightYears;
		tableOfFlexibility_Female[3] = category_ZonaNineYears;
		tableOfFlexibility_Female[4] = category_ZonaTenYears;
		tableOfFlexibility_Female[5] = category_ZonaElevenYears;
		tableOfFlexibility_Female[6] = category_ZonaTwelveYears;
		tableOfFlexibility_Female[7] = category_ZonaThirteenYears;
		tableOfFlexibility_Female[8] = category_ZonaFourteenYears;
		tableOfFlexibility_Female[9] = category_ZonaFifteenYears;
		tableOfFlexibility_Female[10] = category_ZonaSixteenYears;
		tableOfFlexibility_Female[11] = category_ZonaSeventeenYears;

	}

	public String situacaoRiskArea() {
		return "Zona de Risco à Saude";
	}

	public String situationIntermediateZone() {
		return "Zona Intermadiária";
	}

	public String situationHealthyZone() {
		return "Zona Saudável";
	}

	public String verifyFlexibility_Female(double returnResultOfFlexibility_FemaleToCalculate, int age) {

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaSixYears.getNumFixoTable()
				&& age == category_ZonaSixYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaSixYears.getNumFixoTable()
				&& age == category_ZonaSixYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaSixYears.getNumFixoTable()
				&& age == category_ZonaSixYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaSevenYears.getNumFixoTable()
				&& age == category_ZonaSevenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaSevenYears.getNumFixoTable()
				&& age == category_ZonaSevenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaSevenYears.getNumFixoTable()
				&& age == category_ZonaSevenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaEightYears.getNumFixoTable()
				&& age == category_ZonaEightYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaEightYears.getNumFixoTable()
				&& age == category_ZonaEightYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaEightYears.getNumFixoTable()
				&& age == category_ZonaEightYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaNineYears.getNumFixoTable()
				&& age == category_ZonaNineYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaNineYears.getNumFixoTable()
				&& age == category_ZonaNineYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaNineYears.getNumFixoTable()
				&& age == category_ZonaNineYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaTenYears.getNumFixoTable()
				&& age == category_ZonaTenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaTenYears.getNumFixoTable()
				&& age == category_ZonaTenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaTenYears.getNumFixoTable()
				&& age == category_ZonaTenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaElevenYears.getNumFixoTable()
				&& age == category_ZonaElevenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaElevenYears.getNumFixoTable()
				&& age == category_ZonaElevenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaElevenYears.getNumFixoTable()
				&& age == category_ZonaElevenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaTwelveYears.getNumFixoTable()
				&& age == category_ZonaTwelveYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaTwelveYears.getNumFixoTable()
				&& age == category_ZonaTwelveYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaTwelveYears.getNumFixoTable()
				&& age == category_ZonaTwelveYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaThirteenYears.getNumFixoTable()
				&& age == category_ZonaThirteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaThirteenYears.getNumFixoTable()
				&& age == category_ZonaThirteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaThirteenYears.getNumFixoTable()
				&& age == category_ZonaThirteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaFourteenYears.getNumFixoTable()
				&& age == category_ZonaFourteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaFourteenYears.getNumFixoTable()
				&& age == category_ZonaFourteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaFourteenYears.getNumFixoTable()
				&& age == category_ZonaFourteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaFifteenYears.getNumFixoTable()
				&& age == category_ZonaFifteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaFifteenYears.getNumFixoTable()
				&& age == category_ZonaFifteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaFifteenYears.getNumFixoTable()
				&& age == category_ZonaFifteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaSixteenYears.getNumFixoTable()
				&& age == category_ZonaSixteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaSixteenYears.getNumFixoTable()
				&& age == category_ZonaSixteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaSixteenYears.getNumFixoTable()
				&& age == category_ZonaSixteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_FemaleToCalculate < category_ZonaSeventeenYears.getNumFixoTable()
				&& age == category_ZonaSeventeenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_FemaleToCalculate > category_ZonaSeventeenYears.getNumFixoTable()
				&& age == category_ZonaSeventeenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_FemaleToCalculate == category_ZonaSeventeenYears.getNumFixoTable()
				&& age == category_ZonaSeventeenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		return null;
	}

}
