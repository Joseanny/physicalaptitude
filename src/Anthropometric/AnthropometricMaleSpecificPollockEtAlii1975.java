package Anthropometric;

public class AnthropometricMaleSpecificPollockEtAlii1975 extends AnthropometricMaleSpecific {

	private double density; // densidade

	public double YoungMen() {

		density = 1.0559 - 0.00068 * getTR() - 0.00043 * getAB() - 0.00049 * getPCIN() + 0.00144 * getBR()
				- 0.00274 * getPerimeterAnkle() + 0.00553 * getPerimeterFist() + 0.00133 * getBiacromialDiameter()
				- 0.00203 * getBitrocanterianoDiameter();

		return density;
	}

	public double MiddleAgedMen() {

		density = 1.12172 - 0.00112 * getChestMeasure() - 0.00056 * getPTU();
		
		return density;
	}

	public double CalculateFatPercentage(double age, double gender) {

		double fatPercentage = 0; // percentual de gordura

		if (age >= 7 && age <= 8 && gender == 1) {

			fatPercentage = (538 / density) - 497;

		} else if (age >= 9 && age <= 10 && gender == 1) {

			fatPercentage = (530 / density) - 489;

		} else if (age >= 11 && age <= 12 && gender == 1) {

			fatPercentage = (523 / density) - 481;

		} else if (age >= 13 && age <= 14 && gender == 1) {

			fatPercentage = (507 / density) - 464;

		} else if (age >= 15 && age <= 16 && gender == 1) {

			fatPercentage = (503 / density) - 459;

		} else if (age >= 17 && age <= 19 && gender == 1) {

			fatPercentage = (498 / density) - 453;

		} else if (age >= 20 && age <= 50 && gender == 1) {

			fatPercentage = (495 / density) - 450;

		} else if (age >= 7 && age <= 8 && gender == 2) {

			fatPercentage = (543 / density) - 503;

		} else if (age >= 9 && age <= 10 && gender == 2) {

			fatPercentage = (535 / density) - 495;

		} else if (age >= 11 && age <= 12 && gender == 2) {

			fatPercentage = (525 / density) - 484;

		} else if (age >= 13 && age <= 14 && gender == 2) {

			fatPercentage = (512 / density) - 469;

		} else if (age >= 15 && age <= 16 && gender == 2) {

			fatPercentage = (507 / density) - 464;

		} else if (age >= 17 && age <= 19 && gender == 2) {

			fatPercentage = (505 / density) - 462;

		} else if (age >= 20 && age <= 50 && gender == 2) {

			fatPercentage = (503 / density) - 459;
		}

		return fatPercentage;
	}

}
