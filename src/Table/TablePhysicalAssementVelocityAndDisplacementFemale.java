package Table;

public class TablePhysicalAssementVelocityAndDisplacementFemale {
	TableSupport tableOfVelocityAndDisplacement_Female[][], category_Weak_SixYears, category_Weak_SevenYears,
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

public TablePhysicalAssementVelocityAndDisplacementFemale() {
initializeTableOfVelocityAndDisplacement_Female();
}

	public void initializeTableOfVelocityAndDisplacement_Female() {

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

		tableOfVelocityAndDisplacement_Female = new TableSupport[12][5];

		category_Weak_SixYears.setNumFixoAge(6.0);
		category_Weak_SixYears.setMinimumValueOfTheTableCell(5.12);
		category_Weak_SixYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SevenYears.setNumFixoAge(7.0);
		category_Weak_SevenYears.setMinimumValueOfTheTableCell(5.07);
		category_Weak_SevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_EightYears.setNumFixoAge(8.0);
		category_Weak_EightYears.setMinimumValueOfTheTableCell(4.75);
		category_Weak_EightYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_NineYears.setNumFixoAge(9.0);
		category_Weak_NineYears.setMinimumValueOfTheTableCell(4.54);
		category_Weak_NineYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TenYears.setNumFixoAge(10.0);
		category_Weak_TenYears.setMinimumValueOfTheTableCell(4.41);
		category_Weak_TenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ElevenYears.setNumFixoAge(11.0);
		category_Weak_ElevenYears.setMinimumValueOfTheTableCell(4.35);
		category_Weak_ElevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TwelveYears.setNumFixoAge(12.0);
		category_Weak_TwelveYears.setMinimumValueOfTheTableCell(4.32);
		category_Weak_TwelveYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ThirteenYears.setNumFixoAge(13.0);
		category_Weak_ThirteenYears.setMinimumValueOfTheTableCell(4.28);
		category_Weak_ThirteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FourteenYears.setNumFixoAge(14.0);
		category_Weak_FourteenYears.setMinimumValueOfTheTableCell(4.27);
		category_Weak_FourteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FifteenYears.setNumFixoAge(15.0);
		category_Weak_FifteenYears.setMinimumValueOfTheTableCell(4.26);
		category_Weak_FifteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SixteenYears.setNumFixoAge(16.0);
		category_Weak_SixteenYears.setMinimumValueOfTheTableCell(4.23);
		category_Weak_SixteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SeventeenYears.setNumFixoAge(17.0);
		category_Weak_SeventeenYears.setMinimumValueOfTheTableCell(4.21);
		category_Weak_SeventeenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		// ------------------------------------------------

		category_Reasonable_SixYears.setNumFixoAge(6.0);
		category_Reasonable_SixYears.setMinimumValueOfTheTableCell(4.84);
		category_Reasonable_SixYears.setMaximumValueOfTheTableCell(5.11);

		category_Reasonable_SevenYears.setNumFixoAge(7.0);
		category_Reasonable_SevenYears.setMinimumValueOfTheTableCell(4.78);
		category_Reasonable_SevenYears.setMaximumValueOfTheTableCell(5.06);

		category_Reasonable_EightYears.setNumFixoAge(8.0);
		category_Reasonable_EightYears.setMinimumValueOfTheTableCell(4.54);
		category_Reasonable_EightYears.setMaximumValueOfTheTableCell(4.74);

		category_Reasonable_NineYears.setNumFixoAge(9.0);
		category_Reasonable_NineYears.setMinimumValueOfTheTableCell(4.29);
		category_Reasonable_NineYears.setMaximumValueOfTheTableCell(4.53);

		category_Reasonable_TenYears.setNumFixoAge(10.0);
		category_Reasonable_TenYears.setMinimumValueOfTheTableCell(4.17);
		category_Reasonable_TenYears.setMaximumValueOfTheTableCell(4.40);

		category_Reasonable_ElevenYears.setNumFixoAge(11.0);
		category_Reasonable_ElevenYears.setMinimumValueOfTheTableCell(4.10);
		category_Reasonable_ElevenYears.setMaximumValueOfTheTableCell(4.34);

		category_Reasonable_TwelveYears.setNumFixoAge(12.0);
		category_Reasonable_TwelveYears.setMinimumValueOfTheTableCell(4.01);
		category_Reasonable_TwelveYears.setMaximumValueOfTheTableCell(4.31);

		category_Reasonable_ThirteenYears.setNumFixoAge(13.0);
		category_Reasonable_ThirteenYears.setMinimumValueOfTheTableCell(3.99);
		category_Reasonable_ThirteenYears.setMaximumValueOfTheTableCell(4.27);

		category_Reasonable_FourteenYears.setNumFixoAge(14.0);
		category_Reasonable_FourteenYears.setMinimumValueOfTheTableCell(3.95);
		category_Reasonable_FourteenYears.setMaximumValueOfTheTableCell(4.26);

		category_Reasonable_FifteenYears.setNumFixoAge(15.0);
		category_Reasonable_FifteenYears.setMinimumValueOfTheTableCell(3.94);
		category_Reasonable_FifteenYears.setMaximumValueOfTheTableCell(4.25);

		category_Reasonable_SixteenYears.setNumFixoAge(16.0);
		category_Reasonable_SixteenYears.setMinimumValueOfTheTableCell(3.92);
		category_Reasonable_SixteenYears.setMaximumValueOfTheTableCell(4.22);

		category_Reasonable_SeventeenYears.setNumFixoAge(17.0);
		category_Reasonable_SeventeenYears.setMinimumValueOfTheTableCell(3.92);
		category_Reasonable_SeventeenYears.setMaximumValueOfTheTableCell(4.20);

		// ------------------------------------------------

		category_Good_SixYears.setNumFixoAge(6.0);
		category_Good_SixYears.setMinimumValueOfTheTableCell(4.55);
		category_Good_SixYears.setMaximumValueOfTheTableCell(4.83);

		category_Good_SevenYears.setNumFixoAge(7.0);
		category_Good_SevenYears.setMinimumValueOfTheTableCell(4.48);
		category_Good_SevenYears.setMaximumValueOfTheTableCell(4.77);

		category_Good_EightYears.setNumFixoAge(8.0);
		category_Good_EightYears.setMinimumValueOfTheTableCell(4.28);
		category_Good_EightYears.setMaximumValueOfTheTableCell(4.53);

		category_Good_NineYears.setNumFixoAge(9.0);
		category_Good_NineYears.setMinimumValueOfTheTableCell(4.01);
		category_Good_NineYears.setMaximumValueOfTheTableCell(4.28);

		category_Good_TenYears.setNumFixoAge(10.0);
		category_Good_TenYears.setMinimumValueOfTheTableCell(3.98);
		category_Good_TenYears.setMaximumValueOfTheTableCell(4.16);

		category_Good_ElevenYears.setNumFixoAge(11.0);
		category_Good_ElevenYears.setMinimumValueOfTheTableCell(3.88);
		category_Good_ElevenYears.setMaximumValueOfTheTableCell(4.09);

		category_Good_TwelveYears.setNumFixoAge(12.0);
		category_Good_TwelveYears.setMinimumValueOfTheTableCell(3.79);
		category_Good_TwelveYears.setMaximumValueOfTheTableCell(4.00);

		category_Good_ThirteenYears.setNumFixoAge(13.0);
		category_Good_ThirteenYears.setMinimumValueOfTheTableCell(3.75);
		category_Good_ThirteenYears.setMaximumValueOfTheTableCell(3.98);

		category_Good_FourteenYears.setNumFixoAge(14.0);
		category_Good_FourteenYears.setMinimumValueOfTheTableCell(3.73);
		category_Good_FourteenYears.setMaximumValueOfTheTableCell(3.94);

		category_Good_FifteenYears.setNumFixoAge(15.0);
		category_Good_FifteenYears.setMinimumValueOfTheTableCell(3.70);
		category_Good_FifteenYears.setMaximumValueOfTheTableCell(3.93);

		category_Good_SixteenYears.setNumFixoAge(16.0);
		category_Good_SixteenYears.setMinimumValueOfTheTableCell(3.69);
		category_Good_SixteenYears.setMaximumValueOfTheTableCell(3.91);

		category_Good_SeventeenYears.setNumFixoAge(17.0);
		category_Good_SeventeenYears.setMinimumValueOfTheTableCell(3.68);
		category_Good_SeventeenYears.setMaximumValueOfTheTableCell(3.91);

		// ------------------------------------------------

		category_VeryGood_SixYears.setNumFixoAge(6.0);
		category_VeryGood_SixYears.setMinimumValueOfTheTableCell(4.02);
		category_VeryGood_SixYears.setMaximumValueOfTheTableCell(4.54);

		category_VeryGood_SevenYears.setNumFixoAge(7.0);
		category_VeryGood_SevenYears.setMinimumValueOfTheTableCell(3.91);
		category_VeryGood_SevenYears.setMaximumValueOfTheTableCell(4.47);

		category_VeryGood_EightYears.setNumFixoAge(8.0);
		category_VeryGood_EightYears.setMinimumValueOfTheTableCell(3.88);
		category_VeryGood_EightYears.setMaximumValueOfTheTableCell(4.27);

		category_VeryGood_NineYears.setNumFixoAge(9.0);
		category_VeryGood_NineYears.setMinimumValueOfTheTableCell(3.56);
		category_VeryGood_NineYears.setMaximumValueOfTheTableCell(4.00);

		category_VeryGood_TenYears.setNumFixoAge(10.0);
		category_VeryGood_TenYears.setMinimumValueOfTheTableCell(3.44);
		category_VeryGood_TenYears.setMaximumValueOfTheTableCell(3.97);

		category_VeryGood_ElevenYears.setNumFixoAge(11.0);
		category_VeryGood_ElevenYears.setMinimumValueOfTheTableCell(3.30);
		category_VeryGood_ElevenYears.setMaximumValueOfTheTableCell(3.87);

		category_VeryGood_TwelveYears.setNumFixoAge(12.0);
		category_VeryGood_TwelveYears.setMinimumValueOfTheTableCell(3.11);
		category_VeryGood_TwelveYears.setMaximumValueOfTheTableCell(3.78);

		category_VeryGood_ThirteenYears.setNumFixoAge(13.0);
		category_VeryGood_ThirteenYears.setMinimumValueOfTheTableCell(3.09);
		category_VeryGood_ThirteenYears.setMaximumValueOfTheTableCell(3.74);

		category_VeryGood_FourteenYears.setNumFixoAge(14.0);
		category_VeryGood_FourteenYears.setMinimumValueOfTheTableCell(3.06);
		category_VeryGood_FourteenYears.setMaximumValueOfTheTableCell(3.72);

		category_VeryGood_FifteenYears.setNumFixoAge(15.0);
		category_VeryGood_FifteenYears.setMinimumValueOfTheTableCell(3.04);
		category_VeryGood_FifteenYears.setMaximumValueOfTheTableCell(3.69);

		category_VeryGood_SixteenYears.setNumFixoAge(16.0);
		category_VeryGood_SixteenYears.setMinimumValueOfTheTableCell(3.02);
		category_VeryGood_SixteenYears.setMaximumValueOfTheTableCell(3.68);

		category_VeryGood_SeventeenYears.setNumFixoAge(17.0);
		category_VeryGood_SeventeenYears.setMinimumValueOfTheTableCell(3.01);
		category_VeryGood_SeventeenYears.setMaximumValueOfTheTableCell(3.67);

		// ------------------------------------------------

		category_Excellent_SixYears.setNumFixoAge(6.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(4.00);

		category_Excellent_SixYears.setNumFixoAge(7.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.90);

		category_Excellent_SixYears.setNumFixoAge(8.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.86);

		category_Excellent_SixYears.setNumFixoAge(9.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.54);

		category_Excellent_SixYears.setNumFixoAge(10.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.43);

		category_Excellent_SixYears.setNumFixoAge(11.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.29);

		category_Excellent_SixYears.setNumFixoAge(12.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.10);

		category_Excellent_SixYears.setNumFixoAge(13.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.08);

		category_Excellent_SixYears.setNumFixoAge(14.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.05);

		category_Excellent_SixYears.setNumFixoAge(15.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.03);

		category_Excellent_SixYears.setNumFixoAge(16.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.01);

		category_Excellent_SixYears.setNumFixoAge(17.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(3.00);

		tableOfVelocityAndDisplacement_Female[0][0] = category_Weak_SixYears;
		tableOfVelocityAndDisplacement_Female[1][0] = category_Weak_SevenYears;
		tableOfVelocityAndDisplacement_Female[2][0] = category_Weak_EightYears;
		tableOfVelocityAndDisplacement_Female[3][0] = category_Weak_NineYears;
		tableOfVelocityAndDisplacement_Female[4][0] = category_Weak_TenYears;
		tableOfVelocityAndDisplacement_Female[5][0] = category_Weak_ElevenYears;
		tableOfVelocityAndDisplacement_Female[6][0] = category_Weak_TwelveYears;
		tableOfVelocityAndDisplacement_Female[7][0] = category_Weak_ThirteenYears;
		tableOfVelocityAndDisplacement_Female[8][0] = category_Weak_FourteenYears;
		tableOfVelocityAndDisplacement_Female[9][0] = category_Weak_FifteenYears;
		tableOfVelocityAndDisplacement_Female[10][0] = category_Weak_SixteenYears;
		tableOfVelocityAndDisplacement_Female[11][0] = category_Weak_SeventeenYears;

		tableOfVelocityAndDisplacement_Female[0][0] = category_Reasonable_SixYears;
		tableOfVelocityAndDisplacement_Female[1][1] = category_Reasonable_SevenYears;
		tableOfVelocityAndDisplacement_Female[2][1] = category_Reasonable_EightYears;
		tableOfVelocityAndDisplacement_Female[3][1] = category_Reasonable_NineYears;
		tableOfVelocityAndDisplacement_Female[4][1] = category_Reasonable_TenYears;
		tableOfVelocityAndDisplacement_Female[5][1] = category_Reasonable_ElevenYears;
		tableOfVelocityAndDisplacement_Female[6][1] = category_Reasonable_TwelveYears;
		tableOfVelocityAndDisplacement_Female[7][1] = category_Reasonable_ThirteenYears;
		tableOfVelocityAndDisplacement_Female[8][1] = category_Reasonable_FourteenYears;
		tableOfVelocityAndDisplacement_Female[9][1] = category_Reasonable_FifteenYears;
		tableOfVelocityAndDisplacement_Female[10][1] = category_Reasonable_SixteenYears;
		tableOfVelocityAndDisplacement_Female[11][1] = category_Reasonable_SeventeenYears;

		tableOfVelocityAndDisplacement_Female[0][2] = category_Good_SixYears;
		tableOfVelocityAndDisplacement_Female[1][2] = category_Good_SevenYears;
		tableOfVelocityAndDisplacement_Female[2][2] = category_Good_EightYears;
		tableOfVelocityAndDisplacement_Female[3][2] = category_Good_NineYears;
		tableOfVelocityAndDisplacement_Female[4][2] = category_Good_TenYears;
		tableOfVelocityAndDisplacement_Female[5][2] = category_Good_ElevenYears;
		tableOfVelocityAndDisplacement_Female[6][2] = category_Good_TwelveYears;
		tableOfVelocityAndDisplacement_Female[7][2] = category_Good_ThirteenYears;
		tableOfVelocityAndDisplacement_Female[8][2] = category_Good_FourteenYears;
		tableOfVelocityAndDisplacement_Female[9][2] = category_Good_FifteenYears;
		tableOfVelocityAndDisplacement_Female[10][2] = category_Good_SixteenYears;
		tableOfVelocityAndDisplacement_Female[11][2] = category_Good_SeventeenYears;

		tableOfVelocityAndDisplacement_Female[0][3] = category_VeryGood_SixYears;
		tableOfVelocityAndDisplacement_Female[1][3] = category_VeryGood_SevenYears;
		tableOfVelocityAndDisplacement_Female[2][3] = category_VeryGood_EightYears;
		tableOfVelocityAndDisplacement_Female[3][3] = category_VeryGood_NineYears;
		tableOfVelocityAndDisplacement_Female[4][3] = category_VeryGood_TenYears;
		tableOfVelocityAndDisplacement_Female[5][3] = category_VeryGood_ElevenYears;
		tableOfVelocityAndDisplacement_Female[6][3] = category_VeryGood_TwelveYears;
		tableOfVelocityAndDisplacement_Female[7][3] = category_VeryGood_ThirteenYears;
		tableOfVelocityAndDisplacement_Female[8][3] = category_VeryGood_FourteenYears;
		tableOfVelocityAndDisplacement_Female[9][3] = category_VeryGood_FifteenYears;
		tableOfVelocityAndDisplacement_Female[10][3] = category_VeryGood_SixteenYears;
		tableOfVelocityAndDisplacement_Female[11][3] = category_VeryGood_SeventeenYears;

		tableOfVelocityAndDisplacement_Female[0][4] = category_Excellent_SixYears;
		tableOfVelocityAndDisplacement_Female[1][4] = category_Excellent_SevenYears;
		tableOfVelocityAndDisplacement_Female[2][4] = category_Excellent_EightYears;
		tableOfVelocityAndDisplacement_Female[3][4] = category_Excellent_NineYears;
		tableOfVelocityAndDisplacement_Female[4][4] = category_Excellent_TenYears;
		tableOfVelocityAndDisplacement_Female[5][4] = category_Excellent_ElevenYears;
		tableOfVelocityAndDisplacement_Female[6][4] = category_Excellent_TwelveYears;
		tableOfVelocityAndDisplacement_Female[7][4] = category_Excellent_ThirteenYears;
		tableOfVelocityAndDisplacement_Female[8][4] = category_Excellent_FourteenYears;
		tableOfVelocityAndDisplacement_Female[9][4] = category_Excellent_FifteenYears;
		tableOfVelocityAndDisplacement_Female[10][4] = category_Excellent_SixteenYears;
		tableOfVelocityAndDisplacement_Female[11][4] = category_Excellent_SeventeenYears;

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

	public String VerifyvelocityAndDisplacement_Female(double resultVelocityAndDisplacement_FemaleCalculation, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return situationDoesNotExist();
		} else if ((age == category_Weak_SixYears.getNumFixoAge()
				&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_EightYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_NineYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ElevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TwelveYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ThirteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FourteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FifteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SixteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SeventeenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Weak_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Weak_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationWeak();
		}

		else if ((age == category_Reasonable_SixYears.getNumFixoAge()
				&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_EightYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_NineYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ElevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TwelveYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ThirteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FourteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FifteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SixteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SeventeenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Reasonable_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Reasonable_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationReasonable();
		}

		else if ((age == category_Good_SixYears.getNumFixoAge()
				&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_EightYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_NineYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ElevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TwelveYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ThirteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FourteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FifteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SixteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SeventeenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Good_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Good_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationGood();
		}

		else if ((age == category_VeryGood_SixYears.getNumFixoAge()
				&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_EightYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_NineYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ElevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TwelveYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ThirteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FourteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FifteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SixteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SeventeenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_VeryGood_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_VeryGood_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationVeryGood();
		}

		else if ((age == category_Excellent_SixYears.getNumFixoAge()
				&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_SixYears
						.getMinimumValueOfTheTableCell()
						&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_SixYears
								.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_SevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_SevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_EightYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_EightYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_EightYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_NineYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_NineYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_NineYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_TenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_TenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ElevenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_ElevenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_ElevenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TwelveYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_TwelveYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_TwelveYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ThirteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_ThirteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_ThirteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FourteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_FourteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_FourteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FifteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_FifteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_FifteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SixteenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_SixteenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_SixteenYears
										.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SeventeenYears.getNumFixoAge()
						&& (resultVelocityAndDisplacement_FemaleCalculation >= category_Excellent_SeventeenYears
								.getMinimumValueOfTheTableCell()
								&& resultVelocityAndDisplacement_FemaleCalculation <= category_Excellent_SeventeenYears
										.getMaximumValueOfTheTableCell()))) {
			return situationExcellent();
		}

		return null;
	}
}
