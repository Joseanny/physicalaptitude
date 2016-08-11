package Table;

public class TablePhysicalAssementExplosiveStrengthOfUpperLimbsMale {

	TableSupport tableOfExplosiveStrengthOfUpperLimbs_Male[][], category_Weak_SixYears, category_Weak_SevenYears,
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

	public TablePhysicalAssementExplosiveStrengthOfUpperLimbsMale() {
		initializeTableOfExplosiveStrengthOfUpperLimbs_Male();
	}

	public void initializeTableOfExplosiveStrengthOfUpperLimbs_Male() {

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

		tableOfExplosiveStrengthOfUpperLimbs_Male = new TableSupport[12][5];

		category_Weak_SixYears.setNumFixoAge(6.0);
		category_Weak_SixYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_SixYears.setMaximumValueOfTheTableCell(144.9);

		category_Weak_SevenYears.setNumFixoAge(7.0);
		category_Weak_SevenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_SevenYears.setMaximumValueOfTheTableCell(163.9);

		category_Weak_EightYears.setNumFixoAge(8.0);
		category_Weak_EightYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_EightYears.setMaximumValueOfTheTableCell(179.9);

		category_Weak_NineYears.setNumFixoAge(9.0);
		category_Weak_NineYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_NineYears.setMaximumValueOfTheTableCell(199.9);

		category_Weak_TenYears.setNumFixoAge(10.0);
		category_Weak_TenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_TenYears.setMaximumValueOfTheTableCell(211.9);

		category_Weak_ElevenYears.setNumFixoAge(11.0);
		category_Weak_ElevenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_ElevenYears.setMaximumValueOfTheTableCell(237.9);

		category_Weak_TwelveYears.setNumFixoAge(12.0);
		category_Weak_TwelveYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_TwelveYears.setMaximumValueOfTheTableCell(263.9);

		category_Weak_ThirteenYears.setNumFixoAge(13.0);
		category_Weak_ThirteenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_ThirteenYears.setMaximumValueOfTheTableCell(299.9);

		category_Weak_FourteenYears.setNumFixoAge(14.0);
		category_Weak_FourteenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_FourteenYears.setMaximumValueOfTheTableCell(349.9);

		category_Weak_FifteenYears.setNumFixoAge(15.0);
		category_Weak_FifteenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_FifteenYears.setMaximumValueOfTheTableCell(399.9);

		category_Weak_SixteenYears.setNumFixoAge(16.0);
		category_Weak_SixteenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_SixteenYears.setMinimumValueOfTheTableCell(452.9);

		category_Weak_SeventeenYears.setNumFixoAge(17.0);
		category_Weak_SeventeenYears.setMinimumValueOfTheTableCell(0.0);
		category_Weak_SeventeenYears.setMaximumValueOfTheTableCell(479.9);

		// ------------------------------------------------

		category_Reasonable_SixYears.setNumFixoAge(6.0);
		category_Reasonable_SixYears.setMinimumValueOfTheTableCell(145.0);
		category_Reasonable_SixYears.setMaximumValueOfTheTableCell(159.0);

		category_Reasonable_SevenYears.setNumFixoAge(7.0);
		category_Reasonable_SevenYears.setMinimumValueOfTheTableCell(164.0);
		category_Reasonable_SevenYears.setMaximumValueOfTheTableCell(179.0);

		category_Reasonable_EightYears.setNumFixoAge(8.0);
		category_Reasonable_EightYears.setMinimumValueOfTheTableCell(180.0);
		category_Reasonable_EightYears.setMaximumValueOfTheTableCell(199.0);

		category_Reasonable_NineYears.setNumFixoAge(9.0);
		category_Reasonable_NineYears.setMinimumValueOfTheTableCell(200.0);
		category_Reasonable_NineYears.setMaximumValueOfTheTableCell(219.0);

		category_Reasonable_TenYears.setNumFixoAge(10.0);
		category_Reasonable_TenYears.setMinimumValueOfTheTableCell(213.0);
		category_Reasonable_TenYears.setMaximumValueOfTheTableCell(239.0);

		category_Reasonable_ElevenYears.setNumFixoAge(11.0);
		category_Reasonable_ElevenYears.setMinimumValueOfTheTableCell(238.0);
		category_Reasonable_ElevenYears.setMaximumValueOfTheTableCell(260.0);

		category_Reasonable_TwelveYears.setNumFixoAge(12.0);
		category_Reasonable_TwelveYears.setMinimumValueOfTheTableCell(264.0);
		category_Reasonable_TwelveYears.setMaximumValueOfTheTableCell(296.0);

		category_Reasonable_ThirteenYears.setNumFixoAge(13.0);
		category_Reasonable_ThirteenYears.setMinimumValueOfTheTableCell(300.0);
		category_Reasonable_ThirteenYears.setMaximumValueOfTheTableCell(339.0);

		category_Reasonable_FourteenYears.setNumFixoAge(14.0);
		category_Reasonable_FourteenYears.setMinimumValueOfTheTableCell(350.0);
		category_Reasonable_FourteenYears.setMaximumValueOfTheTableCell(399.0);

		category_Reasonable_FifteenYears.setNumFixoAge(15.0);
		category_Reasonable_FifteenYears.setMinimumValueOfTheTableCell(400.0);
		category_Reasonable_FifteenYears.setMaximumValueOfTheTableCell(439.0);

		category_Reasonable_SixteenYears.setNumFixoAge(16.0);
		category_Reasonable_SixteenYears.setMinimumValueOfTheTableCell(453.0);
		category_Reasonable_SixteenYears.setMaximumValueOfTheTableCell(499.0);

		category_Reasonable_SeventeenYears.setNumFixoAge(17.0);
		category_Reasonable_SeventeenYears.setMinimumValueOfTheTableCell(480.0);
		category_Reasonable_SeventeenYears.setMaximumValueOfTheTableCell(521.0);

		// ------------------------------------------------

		category_Good_SixYears.setNumFixoAge(6.0);
		category_Good_SixYears.setMinimumValueOfTheTableCell(160.0);
		category_Good_SixYears.setMaximumValueOfTheTableCell(182.0);

		category_Good_SevenYears.setNumFixoAge(7.0);
		category_Good_SevenYears.setMinimumValueOfTheTableCell(180.0);
		category_Good_SevenYears.setMaximumValueOfTheTableCell(201.0);

		category_Good_EightYears.setNumFixoAge(8.0);
		category_Good_EightYears.setMinimumValueOfTheTableCell(200.0);
		category_Good_EightYears.setMaximumValueOfTheTableCell(224.0);

		category_Good_NineYears.setNumFixoAge(9.0);
		category_Good_NineYears.setMinimumValueOfTheTableCell(220.0);
		category_Good_NineYears.setMaximumValueOfTheTableCell(249.0);

		category_Good_TenYears.setNumFixoAge(10.0);
		category_Good_TenYears.setMinimumValueOfTheTableCell(240.0);
		category_Good_TenYears.setMaximumValueOfTheTableCell(269.0);

		category_Good_ElevenYears.setNumFixoAge(11.0);
		category_Good_ElevenYears.setMinimumValueOfTheTableCell(261.0);
		category_Good_ElevenYears.setMaximumValueOfTheTableCell(293.0);

		category_Good_TwelveYears.setNumFixoAge(12.0);
		category_Good_TwelveYears.setMinimumValueOfTheTableCell(297.0);
		category_Good_TwelveYears.setMaximumValueOfTheTableCell(329.0);

		category_Good_ThirteenYears.setNumFixoAge(13.0);
		category_Good_ThirteenYears.setMinimumValueOfTheTableCell(340.0);
		category_Good_ThirteenYears.setMaximumValueOfTheTableCell(389.0);

		category_Good_FourteenYears.setNumFixoAge(14.0);
		category_Good_FourteenYears.setMinimumValueOfTheTableCell(400.0);
		category_Good_FourteenYears.setMaximumValueOfTheTableCell(449.0);

		category_Good_FifteenYears.setNumFixoAge(15.0);
		category_Good_FifteenYears.setMinimumValueOfTheTableCell(440.0);
		category_Good_FifteenYears.setMaximumValueOfTheTableCell(499.0);

		category_Good_SixteenYears.setNumFixoAge(16.0);
		category_Good_SixteenYears.setMinimumValueOfTheTableCell(500.0);
		category_Good_SixteenYears.setMaximumValueOfTheTableCell(552.0);

		category_Good_SeventeenYears.setNumFixoAge(17.0);
		category_Good_SeventeenYears.setMinimumValueOfTheTableCell(520.0);
		category_Good_SeventeenYears.setMaximumValueOfTheTableCell(589.0);

		// ------------------------------------------------

		category_VeryGood_SixYears.setNumFixoAge(6.0);
		category_VeryGood_SixYears.setMinimumValueOfTheTableCell(183.0);
		category_VeryGood_SixYears.setMaximumValueOfTheTableCell(239.0);

		category_VeryGood_SevenYears.setNumFixoAge(7.0);
		category_VeryGood_SevenYears.setMinimumValueOfTheTableCell(202.0);
		category_VeryGood_SevenYears.setMaximumValueOfTheTableCell(249.0);

		category_VeryGood_EightYears.setNumFixoAge(8.0);
		category_VeryGood_EightYears.setMinimumValueOfTheTableCell(225.0);
		category_VeryGood_EightYears.setMaximumValueOfTheTableCell(269.0);

		category_VeryGood_NineYears.setNumFixoAge(9.0);
		category_VeryGood_NineYears.setMinimumValueOfTheTableCell(250.0);
		category_VeryGood_NineYears.setMaximumValueOfTheTableCell(299.0);

		category_VeryGood_TenYears.setNumFixoAge(10.0);
		category_VeryGood_TenYears.setMinimumValueOfTheTableCell(270.0);
		category_VeryGood_TenYears.setMaximumValueOfTheTableCell(329.0);

		category_VeryGood_ElevenYears.setNumFixoAge(11.0);
		category_VeryGood_ElevenYears.setMinimumValueOfTheTableCell(294.0);
		category_VeryGood_ElevenYears.setMaximumValueOfTheTableCell(361.0);

		category_VeryGood_TwelveYears.setNumFixoAge(12.0);
		category_VeryGood_TwelveYears.setMinimumValueOfTheTableCell(330.0);
		category_VeryGood_TwelveYears.setMaximumValueOfTheTableCell(422.0);

		category_VeryGood_ThirteenYears.setNumFixoAge(13.0);
		category_VeryGood_ThirteenYears.setMinimumValueOfTheTableCell(390.0);
		category_VeryGood_ThirteenYears.setMaximumValueOfTheTableCell(499.0);

		category_VeryGood_FourteenYears.setNumFixoAge(14.0);
		category_VeryGood_FourteenYears.setMinimumValueOfTheTableCell(450.0);
		category_VeryGood_FourteenYears.setMaximumValueOfTheTableCell(561.0);

		category_VeryGood_FifteenYears.setNumFixoAge(15.0);
		category_VeryGood_FifteenYears.setMinimumValueOfTheTableCell(500.0);
		category_VeryGood_FifteenYears.setMaximumValueOfTheTableCell(608.0);

		category_VeryGood_SixteenYears.setNumFixoAge(16.0);
		category_VeryGood_SixteenYears.setMinimumValueOfTheTableCell(553.0);
		category_VeryGood_SixteenYears.setMaximumValueOfTheTableCell(689.0);

		category_VeryGood_SeventeenYears.setNumFixoAge(17.0);
		category_VeryGood_SeventeenYears.setMinimumValueOfTheTableCell(590.0);
		category_VeryGood_SeventeenYears.setMaximumValueOfTheTableCell(699.0);

		// ------------------------------------------------

		category_Excellent_SixYears.setNumFixoAge(6.0);
		category_Excellent_SixYears.setMinimumValueOfTheTableCell(240.0);
		category_Excellent_SixYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_SevenYears.setNumFixoAge(7.0);
		category_Excellent_SevenYears.setMinimumValueOfTheTableCell(250.0);
		category_Excellent_SevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_EightYears.setNumFixoAge(8.0);
		category_Excellent_EightYears.setMinimumValueOfTheTableCell(270.0);
		category_Excellent_EightYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_NineYears.setNumFixoAge(9.0);
		category_Excellent_NineYears.setMinimumValueOfTheTableCell(300.0);
		category_Excellent_NineYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_TenYears.setNumFixoAge(10.0);
		category_Excellent_TenYears.setMinimumValueOfTheTableCell(330.0);
		category_Excellent_TenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_ElevenYears.setNumFixoAge(11.0);
		category_Excellent_ElevenYears.setMinimumValueOfTheTableCell(362.0);
		category_Excellent_ElevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_TwelveYears.setNumFixoAge(12.0);
		category_Excellent_TwelveYears.setMinimumValueOfTheTableCell(424.0);
		category_Excellent_TwelveYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_ThirteenYears.setNumFixoAge(13.0);
		category_Excellent_ThirteenYears.setMinimumValueOfTheTableCell(500.0);
		category_Excellent_ThirteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_FourteenYears.setNumFixoAge(14.0);
		category_Excellent_FourteenYears.setMinimumValueOfTheTableCell(562.0);
		category_Excellent_FourteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_FifteenYears.setNumFixoAge(15.0);
		category_Excellent_FifteenYears.setMinimumValueOfTheTableCell(609.0);
		category_Excellent_FifteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_SixteenYears.setNumFixoAge(16.0);
		category_Excellent_SixteenYears.setMinimumValueOfTheTableCell(690.0);
		category_Excellent_SixteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Excellent_SeventeenYears.setNumFixoAge(17.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(700.0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		tableOfExplosiveStrengthOfUpperLimbs_Male[0][0] = category_Weak_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[1][0] = category_Weak_SevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[2][0] = category_Weak_EightYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[3][0] = category_Weak_NineYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[4][0] = category_Weak_TenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[5][0] = category_Weak_ElevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[6][0] = category_Weak_TwelveYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[7][0] = category_Weak_ThirteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[8][0] = category_Weak_FourteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[9][0] = category_Weak_FifteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[10][0] = category_Weak_SixteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[11][0] = category_Weak_SeventeenYears;

		tableOfExplosiveStrengthOfUpperLimbs_Male[0][0] = category_Reasonable_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[1][1] = category_Reasonable_SevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[2][1] = category_Reasonable_EightYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[3][1] = category_Reasonable_NineYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[4][1] = category_Reasonable_TenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[5][1] = category_Reasonable_ElevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[6][1] = category_Reasonable_TwelveYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[7][1] = category_Reasonable_ThirteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[8][1] = category_Reasonable_FourteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[9][1] = category_Reasonable_FifteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[10][1] = category_Reasonable_SixteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[11][1] = category_Reasonable_SeventeenYears;

		tableOfExplosiveStrengthOfUpperLimbs_Male[0][2] = category_Good_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[1][2] = category_Good_SevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[2][2] = category_Good_EightYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[3][2] = category_Good_NineYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[4][2] = category_Good_TenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[5][2] = category_Good_ElevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[6][2] = category_Good_TwelveYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[7][2] = category_Good_ThirteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[8][2] = category_Good_FourteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[9][2] = category_Good_FifteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[10][2] = category_Good_SixteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[11][2] = category_Good_SeventeenYears;

		tableOfExplosiveStrengthOfUpperLimbs_Male[0][3] = category_VeryGood_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[1][3] = category_VeryGood_SevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[2][3] = category_VeryGood_EightYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[3][3] = category_VeryGood_NineYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[4][3] = category_VeryGood_TenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[5][3] = category_VeryGood_ElevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[6][3] = category_VeryGood_TwelveYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[7][3] = category_VeryGood_ThirteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[8][3] = category_VeryGood_FourteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[9][3] = category_VeryGood_FifteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[10][3] = category_VeryGood_SixteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[11][3] = category_VeryGood_SeventeenYears;

		tableOfExplosiveStrengthOfUpperLimbs_Male[0][4] = category_Excellent_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[1][4] = category_Excellent_SevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[2][4] = category_Excellent_EightYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[3][4] = category_Excellent_NineYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[4][4] = category_Excellent_TenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[5][4] = category_Excellent_ElevenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[6][4] = category_Excellent_TwelveYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[7][4] = category_Excellent_ThirteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[8][4] = category_Excellent_FourteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[9][4] = category_Excellent_FifteenYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[10][4] = category_Excellent_SixYears;
		tableOfExplosiveStrengthOfUpperLimbs_Male[11][4] = category_Excellent_SeventeenYears;

	}

	public String SituationDoesNotExist() {
		return "Resultados para este nivel de age não existe em nossos registros.";
	}

	public String Situation1() {
		return "Fraco";
	}

	public String Situation2() {
		return "Razoavel";
	}

	public String Situation3() {
		return "Bom";
	}

	public String Situation4() {
		return "Muito Bom";
	}

	public String Situation5() {
		return "Excelente";
	}

	public String verifyExplosiveStrengthOfUpperLimbs_Male(double r, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return SituationDoesNotExist();
		} else if ((age == category_Weak_SixYears.getNumFixoAge()
				&& (r >= category_Weak_SixYears.getMinimumValueOfTheTableCell()
						&& r <= category_Weak_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SevenYears.getNumFixoAge()
						&& (r >= category_Weak_SevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_EightYears.getNumFixoAge()
						&& (r >= category_Weak_EightYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_NineYears.getNumFixoAge()
						&& (r >= category_Weak_NineYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TenYears.getNumFixoAge()
						&& (r >= category_Weak_TenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ElevenYears.getNumFixoAge()
						&& (r >= category_Weak_ElevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TwelveYears.getNumFixoAge()
						&& (r >= category_Weak_TwelveYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ThirteenYears.getNumFixoAge()
						&& (r >= category_Weak_ThirteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FourteenYears.getNumFixoAge()
						&& (r >= category_Weak_FourteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FifteenYears.getNumFixoAge()
						&& (r >= category_Weak_FifteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SixteenYears.getNumFixoAge()
						&& (r >= category_Weak_SixteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SeventeenYears.getNumFixoAge()
						&& (r >= category_Weak_SeventeenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Weak_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return Situation1();
		}

		else if ((age == category_Reasonable_SixYears.getNumFixoAge()
				&& (r >= category_Reasonable_SixYears.getMinimumValueOfTheTableCell()
						&& r <= category_Reasonable_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SevenYears.getNumFixoAge()
						&& (r >= category_Reasonable_SevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_EightYears.getNumFixoAge()
						&& (r >= category_Reasonable_EightYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_NineYears.getNumFixoAge()
						&& (r >= category_Reasonable_NineYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TenYears.getNumFixoAge()
						&& (r >= category_Reasonable_TenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ElevenYears.getNumFixoAge()
						&& (r >= category_Reasonable_ElevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TwelveYears.getNumFixoAge()
						&& (r >= category_Reasonable_TwelveYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ThirteenYears.getNumFixoAge()
						&& (r >= category_Reasonable_ThirteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FourteenYears.getNumFixoAge()
						&& (r >= category_Reasonable_FourteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FifteenYears.getNumFixoAge()
						&& (r >= category_Reasonable_FifteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SixteenYears.getNumFixoAge()
						&& (r >= category_Reasonable_SixteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SeventeenYears.getNumFixoAge()
						&& (r >= category_Reasonable_SeventeenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Reasonable_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return Situation2();
		}

		else if ((age == category_Good_SixYears.getNumFixoAge()
				&& (r >= category_Good_SixYears.getMinimumValueOfTheTableCell()
						&& r <= category_Good_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SevenYears.getNumFixoAge()
						&& (r >= category_Good_SevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_EightYears.getNumFixoAge()
						&& (r >= category_Good_EightYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_NineYears.getNumFixoAge()
						&& (r >= category_Good_NineYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TenYears.getNumFixoAge()
						&& (r >= category_Good_TenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ElevenYears.getNumFixoAge()
						&& (r >= category_Good_ElevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TwelveYears.getNumFixoAge()
						&& (r >= category_Good_TwelveYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ThirteenYears.getNumFixoAge()
						&& (r >= category_Good_ThirteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FourteenYears.getNumFixoAge()
						&& (r >= category_Good_FourteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FifteenYears.getNumFixoAge()
						&& (r >= category_Good_FifteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SixteenYears.getNumFixoAge()
						&& (r >= category_Good_SixteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SeventeenYears.getNumFixoAge()
						&& (r >= category_Good_SeventeenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Good_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return Situation3();
		}

		else if ((age == category_VeryGood_SixYears.getNumFixoAge()
				&& (r >= category_VeryGood_SixYears.getMinimumValueOfTheTableCell()
						&& r <= category_VeryGood_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SevenYears.getNumFixoAge()
						&& (r >= category_VeryGood_SevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_EightYears.getNumFixoAge()
						&& (r >= category_VeryGood_EightYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_NineYears.getNumFixoAge()
						&& (r >= category_VeryGood_NineYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TenYears.getNumFixoAge()
						&& (r >= category_VeryGood_TenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ElevenYears.getNumFixoAge()
						&& (r >= category_VeryGood_ElevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TwelveYears.getNumFixoAge()
						&& (r >= category_VeryGood_TwelveYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ThirteenYears.getNumFixoAge()
						&& (r >= category_VeryGood_ThirteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FourteenYears.getNumFixoAge()
						&& (r >= category_VeryGood_FourteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FifteenYears.getNumFixoAge()
						&& (r >= category_VeryGood_FifteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SixteenYears.getNumFixoAge()
						&& (r >= category_VeryGood_SixteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SeventeenYears.getNumFixoAge()
						&& (r >= category_VeryGood_SeventeenYears.getMinimumValueOfTheTableCell()
								&& r <= category_VeryGood_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return Situation4();
		}

		else if ((age == category_Excellent_SixYears.getNumFixoAge()
				&& (r >= category_Excellent_SixYears.getMinimumValueOfTheTableCell()
						&& r <= category_Excellent_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SevenYears.getNumFixoAge()
						&& (r >= category_Excellent_SevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_EightYears.getNumFixoAge()
						&& (r >= category_Excellent_EightYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_NineYears.getNumFixoAge()
						&& (r >= category_Excellent_NineYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TenYears.getNumFixoAge()
						&& (r >= category_Excellent_TenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ElevenYears.getNumFixoAge()
						&& (r >= category_Excellent_ElevenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TwelveYears.getNumFixoAge()
						&& (r >= category_Excellent_TwelveYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ThirteenYears.getNumFixoAge()
						&& (r >= category_Excellent_ThirteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FourteenYears.getNumFixoAge()
						&& (r >= category_Excellent_FourteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FifteenYears.getNumFixoAge()
						&& (r >= category_Excellent_FifteenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SixYears.getNumFixoAge()
						&& (r >= category_Excellent_SixYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SeventeenYears.getNumFixoAge()
						&& (r >= category_Excellent_SeventeenYears.getMinimumValueOfTheTableCell()
								&& r <= category_Excellent_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return Situation5();
		}

		return null;
	}

}
