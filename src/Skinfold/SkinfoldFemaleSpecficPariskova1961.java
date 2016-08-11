package Skinfold;

public class SkinfoldFemaleSpecficPariskova1961 extends SkinfoldFemaleSpecfic {

	double fatPercentage; // Percentual de gordura

	public double WhiteOrBlackGirls_9A12years() { /* Meninas brancas ou negras */

		fatPercentage = (Math.log10(1.088 - 0.014) * getTR()) - Math.log10(0.036) * getSB();

		return fatPercentage;
	}

	public double WhiteOrBlackGirls_13A16years() { // Meninas brancas ou negras
													
		fatPercentage = (Math.log10(1.114 - 0.031) * getTR()) - Math.log10(0.041) * getSB();

		return fatPercentage;
	}
}
