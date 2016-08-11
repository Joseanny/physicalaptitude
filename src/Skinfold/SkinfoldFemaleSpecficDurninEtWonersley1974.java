package Skinfold;

public class SkinfoldFemaleSpecficDurninEtWonersley1974 extends SkinfoldFemaleSpecfic {

	double density; // densidade

	public double Women16A19years() { // Mulheres de 16 a 19 anos

		density = Math.log10(1.1549 - 0.0678) * (getTR() + getBI() + getSB() + getSI());

		return density;
	}

	public double Women20A29years() { // Mulheres de 20 a 29 anos

		density = Math.log10(1.1599 - 0.0717) * (getTR() + getBI() + getSB() + getSI());

		return density;
	}

	public double Women30A39years() { // Mulheres de 30 a 39 anos

		density = Math.log10(1.1423 - 0.0632) * (getTR() + getBI() + getSB() + getSI());

		return density;
	}

	public double Women40A49years() { // Mulheres de 40 a 49 anos

		density = Math.log10(1.1333 - 0.0612) * (getTR() + getBI() + getSB() + getSI());

		return density;
	}

	public double Women50A68years() { // Mulheres de 50 a 68 anos

		density = Math.log10(1.1339 - 0.0645) * (getTR() + getBI() + getSB() + getSI());

		return density;
	}
	
	public double CalculateFatPercentage(int age, int gender) {

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
