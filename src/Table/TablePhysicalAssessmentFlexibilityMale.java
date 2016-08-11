package Table;

public class TablePhysicalAssessmentFlexibilityMale {
	TableSupport tableOfFlexibilityMale[], categoryZonaSixYears, categoryZonaSevenYears, categoryZonaEightYears,
			categoryZonaNineYears, categoryZonaTenYears, categoryZonaElevenYears, categoryZonaTwelveYears,
			categoryZonaThirteenYears, categoryZonaFourteenYears, categoryZonaFifteenYears,
			categoryZonaSixteenYears, categoryZonaSeventeenYears;

	public TablePhysicalAssessmentFlexibilityMale() {
		initializeIndextableFlexibility_Male();
	}

	public void initializeIndextableFlexibility_Male() {

		categoryZonaSixYears = new TableSupport();
		categoryZonaSevenYears = new TableSupport();
		categoryZonaEightYears = new TableSupport();
		categoryZonaNineYears = new TableSupport();
		categoryZonaTenYears = new TableSupport();
		categoryZonaElevenYears = new TableSupport();
		categoryZonaTwelveYears = new TableSupport();
		categoryZonaThirteenYears = new TableSupport();
		categoryZonaFourteenYears = new TableSupport();
		categoryZonaFifteenYears = new TableSupport();
		categoryZonaSixteenYears = new TableSupport();
		categoryZonaSeventeenYears = new TableSupport();

		tableOfFlexibilityMale = new TableSupport[12];

		categoryZonaSixYears.setNumFixoAge(6);
		categoryZonaSixYears.setNumFixoTable(28.9);

		categoryZonaSevenYears.setNumFixoAge(7);
		categoryZonaSevenYears.setNumFixoTable(28.9);

		categoryZonaEightYears.setNumFixoAge(8);
		categoryZonaEightYears.setNumFixoTable(32.5);

		categoryZonaNineYears.setNumFixoAge(9);
		categoryZonaNineYears.setNumFixoTable(29.2);

		categoryZonaTenYears.setNumFixoAge(10);
		categoryZonaTenYears.setNumFixoTable(29.5);

		categoryZonaElevenYears.setNumFixoAge(11);
		categoryZonaElevenYears.setNumFixoTable(29.5);

		categoryZonaTwelveYears.setNumFixoAge(12);
		categoryZonaTwelveYears.setNumFixoTable(29.5);

		categoryZonaThirteenYears.setNumFixoAge(13);
		categoryZonaThirteenYears.setNumFixoTable(26.5);

		categoryZonaFourteenYears.setNumFixoAge(14);
		categoryZonaFourteenYears.setNumFixoTable(30.5);

		categoryZonaFifteenYears.setNumFixoAge(15);
		categoryZonaFifteenYears.setNumFixoTable(31.0);

		categoryZonaSixteenYears.setNumFixoAge(16);
		categoryZonaSixteenYears.setNumFixoTable(34.5);

		categoryZonaSeventeenYears.setNumFixoAge(17);
		categoryZonaSeventeenYears.setNumFixoTable(34.0);

		tableOfFlexibilityMale[0] = categoryZonaSixYears;
		tableOfFlexibilityMale[1] = categoryZonaSevenYears;
		tableOfFlexibilityMale[2] = categoryZonaEightYears;
		tableOfFlexibilityMale[3] = categoryZonaNineYears;
		tableOfFlexibilityMale[4] = categoryZonaTenYears;
		tableOfFlexibilityMale[5] = categoryZonaElevenYears;
		tableOfFlexibilityMale[6] = categoryZonaTwelveYears;
		tableOfFlexibilityMale[7] = categoryZonaThirteenYears;
		tableOfFlexibilityMale[8] = categoryZonaFourteenYears;
		tableOfFlexibilityMale[9] = categoryZonaFifteenYears;
		tableOfFlexibilityMale[10] = categoryZonaSixteenYears;
		tableOfFlexibilityMale[11] = categoryZonaSeventeenYears;

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

	public String verifyFlexibility_Male(double returnResultOfFlexibility_MaleToCalculate, int age) {

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaSixYears.getNumFixoTable()
				&& age == categoryZonaSixYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaSixYears.getNumFixoTable()
				&& age == categoryZonaSixYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaSixYears.getNumFixoTable()
				&& age == categoryZonaSixYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaSevenYears.getNumFixoTable()
				&& age == categoryZonaSevenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaSevenYears.getNumFixoTable()
				&& age == categoryZonaSevenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaSevenYears.getNumFixoTable()
				&& age == categoryZonaSevenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaEightYears.getNumFixoTable()
				&& age == categoryZonaEightYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaEightYears.getNumFixoTable()
				&& age == categoryZonaEightYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaEightYears.getNumFixoTable()
				&& age == categoryZonaEightYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaNineYears.getNumFixoTable()
				&& age == categoryZonaNineYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaNineYears.getNumFixoTable()
				&& age == categoryZonaNineYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaNineYears.getNumFixoTable()
				&& age == categoryZonaNineYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaTenYears.getNumFixoTable()
				&& age == categoryZonaTenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaTenYears.getNumFixoTable()
				&& age == categoryZonaTenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaTenYears.getNumFixoTable()
				&& age == categoryZonaTenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaElevenYears.getNumFixoTable()
				&& age == categoryZonaElevenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaElevenYears.getNumFixoTable()
				&& age == categoryZonaElevenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaElevenYears.getNumFixoTable()
				&& age == categoryZonaElevenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaTwelveYears.getNumFixoTable()
				&& age == categoryZonaTwelveYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaTwelveYears.getNumFixoTable()
				&& age == categoryZonaTwelveYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaTwelveYears.getNumFixoTable()
				&& age == categoryZonaTwelveYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaThirteenYears.getNumFixoTable()
				&& age == categoryZonaThirteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaThirteenYears.getNumFixoTable()
				&& age == categoryZonaThirteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaThirteenYears.getNumFixoTable()
				&& age == categoryZonaThirteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaFourteenYears.getNumFixoTable()
				&& age == categoryZonaFourteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaFourteenYears.getNumFixoTable()
				&& age == categoryZonaFourteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaFourteenYears.getNumFixoTable()
				&& age == categoryZonaFourteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaFifteenYears.getNumFixoTable()
				&& age == categoryZonaFifteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaFifteenYears.getNumFixoTable()
				&& age == categoryZonaFifteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaFifteenYears.getNumFixoTable()
				&& age == categoryZonaFifteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaSixteenYears.getNumFixoTable()
				&& age == categoryZonaSixteenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaSixteenYears.getNumFixoTable()
				&& age == categoryZonaSixteenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaSixteenYears.getNumFixoTable()
				&& age == categoryZonaSixteenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		if (returnResultOfFlexibility_MaleToCalculate < categoryZonaSeventeenYears.getNumFixoTable()
				&& age == categoryZonaSeventeenYears.getNumFixoAge()) {
			return situacaoRiskArea();
		} else if (returnResultOfFlexibility_MaleToCalculate > categoryZonaSeventeenYears.getNumFixoTable()
				&& age == categoryZonaSeventeenYears.getNumFixoAge()) {
			return situationHealthyZone();
		} else if (returnResultOfFlexibility_MaleToCalculate == categoryZonaSeventeenYears.getNumFixoTable()
				&& age == categoryZonaSeventeenYears.getNumFixoAge()) {
			return situationIntermediateZone();
		}

		return null;
	}

}
