package Table;

public class TablePhysicalAssementVelocityAndDisplacementMale {
	TableSupport tableOfVerifyVelocityAndDisplacement_Male[][], category_Weak_SixYears, category_Weak_SevenYears,
			category_Weak_EightYears, category_Weak_NineYears, category_Weak_TenYears, category_Weak_ElevenYears,
			category_Weak_TwelveYears, category_Weak_ThirteenYears, category_Weak_FourteenYears,
			category_Weak_FifteenYears, category_Weak_SixteenYears, category_Weak_SeventeenYears,

			category_Reasonable_SixYears, category_Reasonable_SevenYears, category_Reasonable_EightYears,
			category_Reasonable_NineYears, category_Reasonable_TenYears, category_Reasonable_ElevenYears,
			category_Reasonable_TwelveYears, category_Reasonable_ThirteenYears, category_Reasonable_FourteenYears,
			category_Reasonable_FifteenYears, category_Reasonable_SixteenYears, category_Reasonable_SeventeenYears,

			category_Good_SixYears, category_Good_SevenYears, category_Good_EightYears, category_Good_NineYears,
			category_Good_TenYears, category_Good_ElevenYears, category_Good_TwelveYears, category_Good_ThirteenYears,
			category_Good_FourteenYears, category_Good_FifteenYears, category_Good_SixteenYears,
			category_Good_SeventeenYears,

			category_VeryGood_SixYears, category_VeryGood_SevenYears, category_VeryGood_EightYears,
			category_VeryGood_NineYears, category_VeryGood_TenYears, category_VeryGood_ElevenYears,
			category_VeryGood_TwelveYears, category_VeryGood_ThirteenYears, category_VeryGood_FourteenYears,
			category_VeryGood_FifteenYears, category_VeryGood_SixteenYears, category_VeryGood_SeventeenYears,

			category_Excellent_SixYears, category_Excellent_SevenYears, category_Excellent_EightYears,
			category_Excellent_NineYears, category_Excellent_TenYears, category_Excellent_ElevenYears,
			category_Excellent_TwelveYears, category_Excellent_ThirteenYears, category_Excellent_FourteenYears,
			category_Excellent_FifteenYears, category_Excellent_SixteenYears, category_Excellent_SeventeenYears;

	public TablePhysicalAssementVelocityAndDisplacementMale() {
		initializeTableOfVerifyVelocityAndDisplacement_Male();
	}

	public void initializeTableOfVerifyVelocityAndDisplacement_Male() {

		category_Weak_SixYears = new TableSupport();
		category_Weak_SevenYears = new TableSupport();
		category_Weak_EightYears = new TableSupport();
		category_Weak_NineYears = new TableSupport();
		category_Weak_TenYears = new TableSupport();
		category_Weak_ElevenYears = new TableSupport();
		category_Weak_TwelveYears = new TableSupport();
		category_Weak_ThirteenYears = new TableSupport();
		category_Weak_FourteenYears = new TableSupport();
		category_Weak_FifteenYears = new TableSupport();
		category_Weak_SixteenYears = new TableSupport();
		category_Weak_SeventeenYears = new TableSupport();

		category_Reasonable_SixYears = new TableSupport();
		category_Reasonable_SevenYears = new TableSupport();
		category_Reasonable_EightYears = new TableSupport();
		category_Reasonable_NineYears = new TableSupport();
		category_Reasonable_TenYears = new TableSupport();
		category_Reasonable_ElevenYears = new TableSupport();
		category_Reasonable_TwelveYears = new TableSupport();
		category_Reasonable_ThirteenYears = new TableSupport();
		category_Reasonable_FourteenYears = new TableSupport();
		category_Reasonable_FifteenYears = new TableSupport();
		category_Reasonable_SixteenYears = new TableSupport();
		category_Reasonable_SeventeenYears = new TableSupport();

		category_Good_SixYears = new TableSupport();
		category_Good_SevenYears = new TableSupport();
		category_Good_EightYears = new TableSupport();
		category_Good_NineYears = new TableSupport();
		category_Good_TenYears = new TableSupport();
		category_Good_ElevenYears = new TableSupport();
		category_Good_TwelveYears = new TableSupport();
		category_Good_ThirteenYears = new TableSupport();
		category_Good_FourteenYears = new TableSupport();
		category_Good_FifteenYears = new TableSupport();
		category_Good_SixteenYears = new TableSupport();
		category_Good_SeventeenYears = new TableSupport();

		category_VeryGood_SixYears = new TableSupport();
		category_VeryGood_SevenYears = new TableSupport();
		category_VeryGood_EightYears = new TableSupport();
		category_VeryGood_NineYears = new TableSupport();
		category_VeryGood_TenYears = new TableSupport();
		category_VeryGood_ElevenYears = new TableSupport();
		category_VeryGood_TwelveYears = new TableSupport();
		category_VeryGood_ThirteenYears = new TableSupport();
		category_VeryGood_FourteenYears = new TableSupport();
		category_VeryGood_FifteenYears = new TableSupport();
		category_VeryGood_SixteenYears = new TableSupport();
		category_VeryGood_SeventeenYears = new TableSupport();

		category_Excellent_SixYears = new TableSupport();
		category_Excellent_SevenYears = new TableSupport();
		category_Excellent_EightYears = new TableSupport();
		category_Excellent_NineYears = new TableSupport();
		category_Excellent_TenYears = new TableSupport();
		category_Excellent_ElevenYears = new TableSupport();
		category_Excellent_TwelveYears = new TableSupport();
		category_Excellent_ThirteenYears = new TableSupport();
		category_Excellent_FourteenYears = new TableSupport();
		category_Excellent_FifteenYears = new TableSupport();
		category_Excellent_SixteenYears = new TableSupport();
		category_Excellent_SeventeenYears = new TableSupport();

		tableOfVerifyVelocityAndDisplacement_Male = new TableSupport[12][5];

		category_Weak_SixYears.setNumFixoAge(6.0);
		category_Weak_SixYears.setMinimumValueOfTheTableCell(4.81);
		category_Weak_SixYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SevenYears.setNumFixoAge(7.0);
		category_Weak_SevenYears.setMinimumValueOfTheTableCell(4.62);
		category_Weak_SevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_EightYears.setNumFixoAge(8.0);
		category_Weak_EightYears.setMinimumValueOfTheTableCell(4.47);
		category_Weak_EightYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_NineYears.setNumFixoAge(9.0);
		category_Weak_NineYears.setMinimumValueOfTheTableCell(4.31);
		category_Weak_NineYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TenYears.setNumFixoAge(10.0);
		category_Weak_TenYears.setMinimumValueOfTheTableCell(4.15);
		category_Weak_TenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ElevenYears.setNumFixoAge(11.0);
		category_Weak_ElevenYears.setMinimumValueOfTheTableCell(4.03);
		category_Weak_ElevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TwelveYears.setNumFixoAge(12.0);
		category_Weak_TwelveYears.setMinimumValueOfTheTableCell(3.96);
		category_Weak_TwelveYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ThirteenYears.setNumFixoAge(13.0);
		category_Weak_ThirteenYears.setMinimumValueOfTheTableCell(3.81);
		category_Weak_ThirteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FourteenYears.setNumFixoAge(14.0);
		category_Weak_FourteenYears.setMinimumValueOfTheTableCell(3.67);
		category_Weak_FourteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FifteenYears.setNumFixoAge(15.0);
		category_Weak_FifteenYears.setMinimumValueOfTheTableCell(3.60);
		category_Weak_FifteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SixteenYears.setNumFixoAge(16.0);
		category_Weak_SixteenYears.setMinimumValueOfTheTableCell(3.51);
		category_Weak_SixteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SeventeenYears.setNumFixoAge(17.0);
		category_Weak_SeventeenYears.setMinimumValueOfTheTableCell(3.49);
		category_Weak_SeventeenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		// ------------------------------------------------

		category_Reasonable_SixYears.setNumFixoAge(6.0);
		category_Reasonable_SixYears.setMinimumValueOfTheTableCell(4.54);
		category_Reasonable_SixYears.setMaximumValueOfTheTableCell(4.80);

		category_Reasonable_SevenYears.setNumFixoAge(7.0);
		category_Reasonable_SevenYears.setMinimumValueOfTheTableCell(4.43);
		category_Reasonable_SevenYears.setMaximumValueOfTheTableCell(4.61);

		category_Reasonable_EightYears.setNumFixoAge(8.0);
		category_Reasonable_EightYears.setMinimumValueOfTheTableCell(4.22);
		category_Reasonable_EightYears.setMaximumValueOfTheTableCell(4.46);

		category_Reasonable_NineYears.setNumFixoAge(9.0);
		category_Reasonable_NineYears.setMinimumValueOfTheTableCell(4.10);
		category_Reasonable_NineYears.setMaximumValueOfTheTableCell(4.30);

		category_Reasonable_TenYears.setNumFixoAge(10.0);
		category_Reasonable_TenYears.setMinimumValueOfTheTableCell(3.99);
		category_Reasonable_TenYears.setMaximumValueOfTheTableCell(4.14);

		category_Reasonable_ElevenYears.setNumFixoAge(11.0);
		category_Reasonable_ElevenYears.setMinimumValueOfTheTableCell(3.87);
		category_Reasonable_ElevenYears.setMaximumValueOfTheTableCell(4.02);

		category_Reasonable_TwelveYears.setNumFixoAge(12.0);
		category_Reasonable_TwelveYears.setMinimumValueOfTheTableCell(3.75);
		category_Reasonable_TwelveYears.setMaximumValueOfTheTableCell(3.95);

		category_Reasonable_ThirteenYears.setNumFixoAge(13.0);
		category_Reasonable_ThirteenYears.setMinimumValueOfTheTableCell(3.61);
		category_Reasonable_ThirteenYears.setMaximumValueOfTheTableCell(3.80);

		category_Reasonable_FourteenYears.setNumFixoAge(14.0);
		category_Reasonable_FourteenYears.setMinimumValueOfTheTableCell(3.47);
		category_Reasonable_FourteenYears.setMaximumValueOfTheTableCell(3.66);

		category_Reasonable_FifteenYears.setNumFixoAge(15.0);
		category_Reasonable_FifteenYears.setMinimumValueOfTheTableCell(3.39);
		category_Reasonable_FifteenYears.setMaximumValueOfTheTableCell(3.59);

		category_Reasonable_SixteenYears.setNumFixoAge(16.0);
		category_Reasonable_SixteenYears.setMinimumValueOfTheTableCell(3.33);
		category_Reasonable_SixteenYears.setMaximumValueOfTheTableCell(3.50);

		category_Reasonable_SeventeenYears.setNumFixoAge(17.0);
		category_Reasonable_SeventeenYears.setMinimumValueOfTheTableCell(3.31);
		category_Reasonable_SeventeenYears.setMaximumValueOfTheTableCell(3.48);

		// ------------------------------------------------

		category_Good_SixYears.setNumFixoAge(6.0);
		category_Good_SixYears.setMinimumValueOfTheTableCell(4.21);
		category_Good_SixYears.setMaximumValueOfTheTableCell(4.53);

		category_Good_SevenYears.setNumFixoAge(7.0);
		category_Good_SevenYears.setMinimumValueOfTheTableCell(4.13);
		category_Good_SevenYears.setMaximumValueOfTheTableCell(4.42);

		category_Good_EightYears.setNumFixoAge(8.0);
		category_Good_EightYears.setMinimumValueOfTheTableCell(4.01);
		category_Good_EightYears.setMaximumValueOfTheTableCell(4.21);

		category_Good_NineYears.setNumFixoAge(9.0);
		category_Good_NineYears.setMinimumValueOfTheTableCell(3.89);
		category_Good_NineYears.setMaximumValueOfTheTableCell(4.09);

		category_Good_TenYears.setNumFixoAge(10.0);
		category_Good_TenYears.setMinimumValueOfTheTableCell(3.75);
		category_Good_TenYears.setMaximumValueOfTheTableCell(3.98);

		category_Good_ElevenYears.setNumFixoAge(11.0);
		category_Good_ElevenYears.setMinimumValueOfTheTableCell(3.63);
		category_Good_ElevenYears.setMaximumValueOfTheTableCell(3.86);

		category_Good_TwelveYears.setNumFixoAge(12.0);
		category_Good_TwelveYears.setMinimumValueOfTheTableCell(3.51);
		category_Good_TwelveYears.setMaximumValueOfTheTableCell(3.74);

		category_Good_ThirteenYears.setNumFixoAge(13.0);
		category_Good_ThirteenYears.setMinimumValueOfTheTableCell(3.38);
		category_Good_ThirteenYears.setMaximumValueOfTheTableCell(3.60);

		category_Good_FourteenYears.setNumFixoAge(14.0);
		category_Good_FourteenYears.setMinimumValueOfTheTableCell(3.24);
		category_Good_FourteenYears.setMaximumValueOfTheTableCell(3.46);

		category_Good_FifteenYears.setNumFixoAge(15.0);
		category_Good_FifteenYears.setMinimumValueOfTheTableCell(3.17);
		category_Good_FifteenYears.setMaximumValueOfTheTableCell(3.38);

		category_Good_SixteenYears.setNumFixoAge(16.0);
		category_Good_SixteenYears.setMinimumValueOfTheTableCell(3.13);
		category_Good_SixteenYears.setMaximumValueOfTheTableCell(3.33);

		category_Good_SeventeenYears.setNumFixoAge(17.0);
		category_Good_SeventeenYears.setMinimumValueOfTheTableCell(3.11);
		category_Good_SeventeenYears.setMaximumValueOfTheTableCell(3.30);

		// ------------------------------------------------

		category_VeryGood_SixYears.setNumFixoAge(6.0);
		category_VeryGood_SixYears.setMinimumValueOfTheTableCell(3.73);
		category_VeryGood_SixYears.setMaximumValueOfTheTableCell(4.20);

		category_VeryGood_SevenYears.setNumFixoAge(7.0);
		category_VeryGood_SevenYears.setMinimumValueOfTheTableCell(3.66);
		category_VeryGood_SevenYears.setMaximumValueOfTheTableCell(4.12);

		category_VeryGood_EightYears.setNumFixoAge(8.0);
		category_VeryGood_EightYears.setMinimumValueOfTheTableCell(3.51);
		category_VeryGood_EightYears.setMaximumValueOfTheTableCell(4.00);

		category_VeryGood_NineYears.setNumFixoAge(9.0);
		category_VeryGood_NineYears.setMinimumValueOfTheTableCell(3.16);
		category_VeryGood_NineYears.setMaximumValueOfTheTableCell(3.88);

		category_VeryGood_TenYears.setNumFixoAge(10.0);
		category_VeryGood_TenYears.setMinimumValueOfTheTableCell(3.08);
		category_VeryGood_TenYears.setMaximumValueOfTheTableCell(3.74);

		category_VeryGood_ElevenYears.setNumFixoAge(11.0);
		category_VeryGood_ElevenYears.setMinimumValueOfTheTableCell(3.01);
		category_VeryGood_ElevenYears.setMaximumValueOfTheTableCell(3.62);

		category_VeryGood_TwelveYears.setNumFixoAge(12.0);
		category_VeryGood_TwelveYears.setMinimumValueOfTheTableCell(3.00);
		category_VeryGood_TwelveYears.setMaximumValueOfTheTableCell(3.50);

		category_VeryGood_ThirteenYears.setNumFixoAge(13.0);
		category_VeryGood_ThirteenYears.setMinimumValueOfTheTableCell(2.98);
		category_VeryGood_ThirteenYears.setMaximumValueOfTheTableCell(3.37);

		category_VeryGood_FourteenYears.setNumFixoAge(14.0);
		category_VeryGood_FourteenYears.setMinimumValueOfTheTableCell(2.91);
		category_VeryGood_FourteenYears.setMaximumValueOfTheTableCell(3.23);

		category_VeryGood_FifteenYears.setNumFixoAge(15.0);
		category_VeryGood_FifteenYears.setMinimumValueOfTheTableCell(2.88);
		category_VeryGood_FifteenYears.setMaximumValueOfTheTableCell(3.16);

		category_VeryGood_SixteenYears.setNumFixoAge(16.0);
		category_VeryGood_SixteenYears.setMinimumValueOfTheTableCell(2.82);
		category_VeryGood_SixteenYears.setMaximumValueOfTheTableCell(3.12);

		category_VeryGood_SeventeenYears.setNumFixoAge(17.0);
		category_VeryGood_SeventeenYears.setMinimumValueOfTheTableCell(2.73);
		category_VeryGood_SeventeenYears.setMaximumValueOfTheTableCell(3.10);

		// ------------------------------------------------

		category_Excellent_SixYears.setNumFixoAge(6.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.72);

		category_Excellent_SixYears.setNumFixoAge(7.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.65);

		category_Excellent_SixYears.setNumFixoAge(8.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.50);

		category_Excellent_SixYears.setNumFixoAge(9.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.15);

		category_Excellent_SixYears.setNumFixoAge(10.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.07);

		category_Excellent_SixYears.setNumFixoAge(11.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.00);

		category_Excellent_SixYears.setNumFixoAge(12.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.99);

		category_Excellent_SixYears.setNumFixoAge(13.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.97);

		category_Excellent_SixYears.setNumFixoAge(14.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.90);

		category_Excellent_SixYears.setNumFixoAge(15.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.87);

		category_Excellent_SixYears.setNumFixoAge(16.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.81);

		category_Excellent_SixYears.setNumFixoAge(17.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(2.72);

		tableOfVerifyVelocityAndDisplacement_Male[0][0] = category_Weak_SixYears;
		tableOfVerifyVelocityAndDisplacement_Male[1][0] = category_Weak_SevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[2][0] = category_Weak_EightYears;
		tableOfVerifyVelocityAndDisplacement_Male[3][0] = category_Weak_NineYears;
		tableOfVerifyVelocityAndDisplacement_Male[4][0] = category_Weak_TenYears;
		tableOfVerifyVelocityAndDisplacement_Male[5][0] = category_Weak_ElevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[6][0] = category_Weak_TwelveYears;
		tableOfVerifyVelocityAndDisplacement_Male[7][0] = category_Weak_ThirteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[8][0] = category_Weak_FourteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[9][0] = category_Weak_FifteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[10][0] = category_Weak_SixteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[11][0] = category_Weak_SeventeenYears;

		tableOfVerifyVelocityAndDisplacement_Male[0][0] = category_Reasonable_SixYears;
		tableOfVerifyVelocityAndDisplacement_Male[1][1] = category_Reasonable_SevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[2][1] = category_Reasonable_EightYears;
		tableOfVerifyVelocityAndDisplacement_Male[3][1] = category_Reasonable_NineYears;
		tableOfVerifyVelocityAndDisplacement_Male[4][1] = category_Reasonable_TenYears;
		tableOfVerifyVelocityAndDisplacement_Male[5][1] = category_Reasonable_ElevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[6][1] = category_Reasonable_TwelveYears;
		tableOfVerifyVelocityAndDisplacement_Male[7][1] = category_Reasonable_ThirteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[8][1] = category_Reasonable_FourteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[9][1] = category_Reasonable_FifteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[10][1] = category_Reasonable_SixteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[11][1] = category_Reasonable_SeventeenYears;

		tableOfVerifyVelocityAndDisplacement_Male[0][2] = category_Good_SixYears;
		tableOfVerifyVelocityAndDisplacement_Male[1][2] = category_Good_SevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[2][2] = category_Good_EightYears;
		tableOfVerifyVelocityAndDisplacement_Male[3][2] = category_Good_NineYears;
		tableOfVerifyVelocityAndDisplacement_Male[4][2] = category_Good_TenYears;
		tableOfVerifyVelocityAndDisplacement_Male[5][2] = category_Good_ElevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[6][2] = category_Good_TwelveYears;
		tableOfVerifyVelocityAndDisplacement_Male[7][2] = category_Good_ThirteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[8][2] = category_Good_FourteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[9][2] = category_Good_FifteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[10][2] = category_Good_SixteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[11][2] = category_Good_SeventeenYears;

		tableOfVerifyVelocityAndDisplacement_Male[0][3] = category_VeryGood_SixYears;
		tableOfVerifyVelocityAndDisplacement_Male[1][3] = category_VeryGood_SevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[2][3] = category_VeryGood_EightYears;
		tableOfVerifyVelocityAndDisplacement_Male[3][3] = category_VeryGood_NineYears;
		tableOfVerifyVelocityAndDisplacement_Male[4][3] = category_VeryGood_TenYears;
		tableOfVerifyVelocityAndDisplacement_Male[5][3] = category_VeryGood_ElevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[6][3] = category_VeryGood_TwelveYears;
		tableOfVerifyVelocityAndDisplacement_Male[7][3] = category_VeryGood_ThirteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[8][3] = category_VeryGood_FourteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[9][3] = category_VeryGood_FifteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[10][3] = category_VeryGood_SixteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[11][3] = category_VeryGood_SeventeenYears;

		tableOfVerifyVelocityAndDisplacement_Male[0][4] = category_Excellent_SixYears;
		tableOfVerifyVelocityAndDisplacement_Male[1][4] = category_Excellent_SevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[2][4] = category_Excellent_EightYears;
		tableOfVerifyVelocityAndDisplacement_Male[3][4] = category_Excellent_NineYears;
		tableOfVerifyVelocityAndDisplacement_Male[4][4] = category_Excellent_TenYears;
		tableOfVerifyVelocityAndDisplacement_Male[5][4] = category_Excellent_ElevenYears;
		tableOfVerifyVelocityAndDisplacement_Male[6][4] = category_Excellent_TwelveYears;
		tableOfVerifyVelocityAndDisplacement_Male[7][4] = category_Excellent_ThirteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[8][4] = category_Excellent_FourteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[9][4] = category_Excellent_FifteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[10][4] = category_Excellent_SixteenYears;
		tableOfVerifyVelocityAndDisplacement_Male[11][4] = category_Excellent_SeventeenYears;

	}

	public String situationDoesNotExist() {
		return "Resultados para este nivel de idade não existe em nossos registros.";
	}

	public String situationWeak() {
		return "Fraco";
	}

	public String situationReasonable() {
		return "Razoavel";
	}

	public String situationGood() {
		return "Bom";
	}

	public String situationVeryGood() {
		return "Muito Bom";
	}

	public String situationExcellent() {
		return "Excelente";
	}

	public String VerifyVelocityAndDisplacement_Male(double resultVerifyVelocityAndDisplacement_MaleCalculation, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return situationDoesNotExist();
		} else if ((age == category_Weak_SixYears.getNumFixoAge()
				&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_EightYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_NineYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ElevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TwelveYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ThirteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FourteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FifteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SixteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SeventeenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Weak_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Weak_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationWeak();
		}

		else if ((age == category_Reasonable_SixYears.getNumFixoAge()
				&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_EightYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_NineYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ElevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TwelveYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ThirteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FourteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FifteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SixteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SeventeenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Reasonable_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Reasonable_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationReasonable();
		}

		else if ((age == category_Good_SixYears.getNumFixoAge()
				&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_EightYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_NineYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ElevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TwelveYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ThirteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FourteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FifteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SixteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SeventeenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Good_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Good_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationGood();
		}

		else if ((age == category_VeryGood_SixYears.getNumFixoAge()
				&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_EightYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_NineYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ElevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TwelveYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ThirteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FourteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FifteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SixteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SeventeenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_VeryGood_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_VeryGood_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationVeryGood();
		}

		else if ((age == category_Excellent_SixYears.getNumFixoAge()
				&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_EightYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_NineYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ElevenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TwelveYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ThirteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FourteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FifteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SixteenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SeventeenYears.getNumFixoAge()
						&& (resultVerifyVelocityAndDisplacement_MaleCalculation >= category_Excellent_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVerifyVelocityAndDisplacement_MaleCalculation <= category_Excellent_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationExcellent();
		}

		return null;
	}

}