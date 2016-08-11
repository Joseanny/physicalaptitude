package Skinfold;

public class SkinfoldFemaleSpecficDeurenbergEtAlii1990 extends SkinfoldFemaleSpecfic {

	double fatPercentage; // Percentual de gordura

	public double Girls_Prepubescent() { // Meninas brancas e negras pré-púbere

		fatPercentage = Math.log10(29.85) * (getBI() + getTR() + getSB() + getSI()) - 25.87;

		return fatPercentage;
	}

	public double Girls_Pubertal() { // Meninas brancas e negras púbere

		fatPercentage = Math.log10(23.94) * (getBI() + getTR() + getSB() + getSI()) - 18.89;

		return fatPercentage;
	}

	public double Girls_PosPubertal() { // Meninas brancas e negras pós-púbere

		fatPercentage = Math.log10(39.02) * (getBI() + getTR() + getSB() + getSI()) - 43.49;

		return fatPercentage;
	}
}
