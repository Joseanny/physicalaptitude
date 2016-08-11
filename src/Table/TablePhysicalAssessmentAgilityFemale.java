package Table;

public class TablePhysicalAssessmentAgilityFemale {
	TableSupport tableOfAgilityFemale[][], category_Weak_SixYears, category_Weak_SevenYears,
	category_Weak_EightYears, category_Weak_NineYears, category_Weak_TenYears, 
	category_Weak_ElevenYears, category_Weak_TwelveYears, category_Weak_ThirteenYears,
	category_Weak_FourteenYears, category_Weak_FifteenYears, category_Weak_SixteenYears,
	category_Weak_SeventeenYears,
	
	category_Reasonable_SixYears, category_Reasonable_SevenYears, category_Reasonable_EightYears,
	category_Reasonable_NineYears, category_Reasonable_TenYears, category_Reasonable_ElevenYears,
	category_Reasonable_TwelveYears, category_Reasonable_ThirteenYears, category_Reasonable_FourteenYears,
	category_Reasonable_FifteenYears, category_Reasonable_SixteenYears, category_Reasonable_SeventeenYears,
	
	category_Good_SixYears, category_Good_SevenYears, category_Good_EightYears,
	category_Good_NineYears, category_Good_TenYears, category_Good_ElevenYears,
	category_Good_TwelveYears, category_Good_ThirteenYears, category_Good_FourteenYears,
	category_Good_FifteenYears, category_Good_SixteenYears, category_Good_SeventeenYears,
	
	category_VeryGood_SixYears, category_VeryGood_SevenYears, category_VeryGood_EightYears,
	category_VeryGood_NineYears, category_VeryGood_TenYears, category_VeryGood_ElevenYears,
	category_VeryGood_TwelveYears, category_VeryGood_ThirteenYears, category_VeryGood_FourteenYears,
	category_VeryGood_FifteenYears, category_VeryGood_SixteenYears, category_VeryGood_SeventeenYears,
	
	category_Excellent_SixYears, category_Excellent_SevenYears, category_Excellent_EightYears,
	category_Excellent_NineYears, category_Excellent_TenYears, category_Excellent_ElevenYears,
	category_Excellent_TwelveYears, category_Excellent_ThirteenYears, category_Excellent_FourteenYears,
	category_Excellent_FifteenYears, category_Excellent_SixteenYears, category_Excellent_SeventeenYears;
	
	
	public TablePhysicalAssessmentAgilityFemale(){
		initializeTableOfAgility_Female();
	}

	public void initializeTableOfAgility_Female() {
		
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
		
		tableOfAgilityFemale = new TableSupport[12][5];
		
		category_Weak_SixYears.setNumFixoAge(6.0);
		category_Weak_SixYears.setMinimumValueOfTheTableCell(8.70);
		category_Weak_SixYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SevenYears.setNumFixoAge(7.0);
		category_Weak_SevenYears.setMinimumValueOfTheTableCell(8.41);
		category_Weak_SevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_EightYears.setNumFixoAge(8.0);
		category_Weak_EightYears.setMinimumValueOfTheTableCell(7.98);
		category_Weak_EightYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_NineYears.setNumFixoAge(9.0);
		category_Weak_NineYears.setMinimumValueOfTheTableCell(7.63);
		category_Weak_NineYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TenYears.setNumFixoAge(10.0);
		category_Weak_TenYears.setMinimumValueOfTheTableCell(7.35);
		category_Weak_TenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ElevenYears.setNumFixoAge(11.0);
		category_Weak_ElevenYears.setMinimumValueOfTheTableCell(7.24);
		category_Weak_ElevenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_TwelveYears.setNumFixoAge(12.0);
		category_Weak_TwelveYears.setMinimumValueOfTheTableCell(7.17);
		category_Weak_TwelveYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_ThirteenYears.setNumFixoAge(13.0);
		category_Weak_ThirteenYears.setMinimumValueOfTheTableCell(7.10);
		category_Weak_ThirteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FourteenYears.setNumFixoAge(14.0);
		category_Weak_FourteenYears.setMinimumValueOfTheTableCell(7.03);
		category_Weak_FourteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_FifteenYears.setNumFixoAge(15.0);
		category_Weak_FifteenYears.setMinimumValueOfTheTableCell(7.00);
		category_Weak_FifteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SixteenYears.setNumFixoAge(16.0);
		category_Weak_SixteenYears.setMinimumValueOfTheTableCell(6.94);
		category_Weak_SixteenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		category_Weak_SeventeenYears.setNumFixoAge(17.0);
		category_Weak_SeventeenYears.setMinimumValueOfTheTableCell(6.81);
		category_Weak_SeventeenYears.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		// ------------------------------------------------

		category_Reasonable_SixYears.setNumFixoAge(6.0);
		category_Reasonable_SixYears.setMinimumValueOfTheTableCell(8.27);
		category_Reasonable_SixYears.setMaximumValueOfTheTableCell(8.68);

		category_Reasonable_SevenYears.setNumFixoAge(7.0);
		category_Reasonable_SevenYears.setMinimumValueOfTheTableCell(8.01);
		category_Reasonable_SevenYears.setMaximumValueOfTheTableCell(8.40);

		category_Reasonable_EightYears.setNumFixoAge(8.0);
		category_Reasonable_EightYears.setMinimumValueOfTheTableCell(7.60);
		category_Reasonable_EightYears.setMaximumValueOfTheTableCell(7.97);

		category_Reasonable_NineYears.setNumFixoAge(9.0);
		category_Reasonable_NineYears.setMinimumValueOfTheTableCell(7.26);
		category_Reasonable_NineYears.setMaximumValueOfTheTableCell(7.62);

		category_Reasonable_TenYears.setNumFixoAge(10.0);
		category_Reasonable_TenYears.setMinimumValueOfTheTableCell(7.01);
		category_Reasonable_TenYears.setMaximumValueOfTheTableCell(7.34);

		category_Reasonable_ElevenYears.setNumFixoAge(11.0);
		category_Reasonable_ElevenYears.setMinimumValueOfTheTableCell(6.91);
		category_Reasonable_ElevenYears.setMaximumValueOfTheTableCell(7.23);

		category_Reasonable_TwelveYears.setNumFixoAge(12.0);
		category_Reasonable_TwelveYears.setMinimumValueOfTheTableCell(6.81);
		category_Reasonable_TwelveYears.setMaximumValueOfTheTableCell(7.16);

		category_Reasonable_ThirteenYears.setNumFixoAge(13.0);
		category_Reasonable_ThirteenYears.setMinimumValueOfTheTableCell(6.71);
		category_Reasonable_ThirteenYears.setMaximumValueOfTheTableCell(7.09);

		category_Reasonable_FourteenYears.setNumFixoAge(14.0);
		category_Reasonable_FourteenYears.setMinimumValueOfTheTableCell(6.69);
		category_Reasonable_FourteenYears.setMaximumValueOfTheTableCell(7.02);

		category_Reasonable_FifteenYears.setNumFixoAge(15.0);
		category_Reasonable_FifteenYears.setMinimumValueOfTheTableCell(6.67);
		category_Reasonable_FifteenYears.setMaximumValueOfTheTableCell(6.99);

		category_Reasonable_SixteenYears.setNumFixoAge(16.0);
		category_Reasonable_SixteenYears.setMinimumValueOfTheTableCell(6.56);
		category_Reasonable_SixteenYears.setMaximumValueOfTheTableCell(6.93);

		category_Reasonable_SeventeenYears.setNumFixoAge(17.0);
		category_Reasonable_SeventeenYears.setMinimumValueOfTheTableCell(6.47);
		category_Reasonable_SeventeenYears.setMaximumValueOfTheTableCell(6.80);

		// ------------------------------------------------

		category_Good_SixYears.setNumFixoAge(6.0);
		category_Good_SixYears.setMinimumValueOfTheTableCell(7.67);
		category_Good_SixYears.setMaximumValueOfTheTableCell(8.26);

		category_Good_SevenYears.setNumFixoAge(7.0);
		category_Good_SevenYears.setMinimumValueOfTheTableCell(7.57);
		category_Good_SevenYears.setMaximumValueOfTheTableCell(8.00);

		category_Good_EightYears.setNumFixoAge(8.0);
		category_Good_EightYears.setMinimumValueOfTheTableCell(7.23);
		category_Good_EightYears.setMaximumValueOfTheTableCell(7.59);

		category_Good_NineYears.setNumFixoAge(9.0);
		category_Good_NineYears.setMinimumValueOfTheTableCell(6.90);
		category_Good_NineYears.setMaximumValueOfTheTableCell(7.25);

		category_Good_TenYears.setNumFixoAge(10.0);
		category_Good_TenYears.setMinimumValueOfTheTableCell(6.61);
		category_Good_TenYears.setMaximumValueOfTheTableCell(7.00);

		category_Good_ElevenYears.setNumFixoAge(11.0);
		category_Good_ElevenYears.setMinimumValueOfTheTableCell(6.50);
		category_Good_ElevenYears.setMaximumValueOfTheTableCell(6.90);

		category_Good_TwelveYears.setNumFixoAge(12.0);
		category_Good_TwelveYears.setMinimumValueOfTheTableCell(6.37);
		category_Good_TwelveYears.setMaximumValueOfTheTableCell(6.80);

		category_Good_ThirteenYears.setNumFixoAge(13.0);
		category_Good_ThirteenYears.setMinimumValueOfTheTableCell(6.29);
		category_Good_ThirteenYears.setMaximumValueOfTheTableCell(6.70);

		category_Good_FourteenYears.setNumFixoAge(14.0);
		category_Good_FourteenYears.setMinimumValueOfTheTableCell(6.23);
		category_Good_FourteenYears.setMaximumValueOfTheTableCell(6.68);

		category_Good_FifteenYears.setNumFixoAge(15.0);
		category_Good_FifteenYears.setMinimumValueOfTheTableCell(6.20);
		category_Good_FifteenYears.setMaximumValueOfTheTableCell(6.66);

		category_Good_SixteenYears.setNumFixoAge(16.0);
		category_Good_SixteenYears.setMinimumValueOfTheTableCell(6.16);
		category_Good_SixteenYears.setMaximumValueOfTheTableCell(6.55);

		category_Good_SeventeenYears.setNumFixoAge(17.0);
		category_Good_SeventeenYears.setMinimumValueOfTheTableCell(6.06);
		category_Good_SeventeenYears.setMaximumValueOfTheTableCell(6.46);

		// ------------------------------------------------

		category_VeryGood_SixYears.setNumFixoAge(6.0);
		category_VeryGood_SixYears.setMinimumValueOfTheTableCell(6.59);
		category_VeryGood_SixYears.setMaximumValueOfTheTableCell(7.66);

		category_VeryGood_SevenYears.setNumFixoAge(7.0);
		category_VeryGood_SevenYears.setMinimumValueOfTheTableCell(6.57);
		category_VeryGood_SevenYears.setMaximumValueOfTheTableCell(7.56);

		category_VeryGood_EightYears.setNumFixoAge(8.0);
		category_VeryGood_EightYears.setMinimumValueOfTheTableCell(6.41);
		category_VeryGood_EightYears.setMaximumValueOfTheTableCell(7.22);

		category_VeryGood_NineYears.setNumFixoAge(9.0);
		category_VeryGood_NineYears.setMinimumValueOfTheTableCell(6.04);
		category_VeryGood_NineYears.setMaximumValueOfTheTableCell(6.89);

		category_VeryGood_TenYears.setNumFixoAge(10.0);
		category_VeryGood_TenYears.setMinimumValueOfTheTableCell(5.89);
		category_VeryGood_TenYears.setMaximumValueOfTheTableCell(6.60);

		category_VeryGood_ElevenYears.setNumFixoAge(11.0);
		category_VeryGood_ElevenYears.setMinimumValueOfTheTableCell(5.73);
		category_VeryGood_ElevenYears.setMaximumValueOfTheTableCell(6.49);

		category_VeryGood_TwelveYears.setNumFixoAge(12.0);
		category_VeryGood_TwelveYears.setMinimumValueOfTheTableCell(5.64);
		category_VeryGood_TwelveYears.setMaximumValueOfTheTableCell(6.36);

		category_VeryGood_ThirteenYears.setNumFixoAge(13.0);
		category_VeryGood_ThirteenYears.setMinimumValueOfTheTableCell(5.58);
		category_VeryGood_ThirteenYears.setMaximumValueOfTheTableCell(6.28);

		category_VeryGood_FourteenYears.setNumFixoAge(14.0);
		category_VeryGood_FourteenYears.setMinimumValueOfTheTableCell(5.50);
		category_VeryGood_FourteenYears.setMaximumValueOfTheTableCell(6.22);

		category_VeryGood_FifteenYears.setNumFixoAge(15.0);
		category_VeryGood_FifteenYears.setMinimumValueOfTheTableCell(5.34);
		category_VeryGood_FifteenYears.setMaximumValueOfTheTableCell(6.19);

		category_VeryGood_SixteenYears.setNumFixoAge(16.0);
		category_VeryGood_SixteenYears.setMinimumValueOfTheTableCell(5.42);
		category_VeryGood_SixteenYears.setMaximumValueOfTheTableCell(6.15);

		category_VeryGood_SeventeenYears.setNumFixoAge(17.0);
		category_VeryGood_SeventeenYears.setMinimumValueOfTheTableCell(5.27);
		category_VeryGood_SeventeenYears.setMaximumValueOfTheTableCell(6.05);

		// ------------------------------------------------

		category_Excellent_SixYears.setNumFixoAge(6.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(6.58);

		category_Excellent_SixYears.setNumFixoAge(7.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(6.56);

		category_Excellent_SixYears.setNumFixoAge(8.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(6.40);

		category_Excellent_SixYears.setNumFixoAge(9.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(6.03);

		category_Excellent_SixYears.setNumFixoAge(10.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.88);

		category_Excellent_SixYears.setNumFixoAge(11.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.72);

		category_Excellent_SixYears.setNumFixoAge(12.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.63);

		category_Excellent_SixYears.setNumFixoAge(13.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.57);

		category_Excellent_SixYears.setNumFixoAge(14.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.49);

		category_Excellent_SixYears.setNumFixoAge(15.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.33);

		category_Excellent_SixYears.setNumFixoAge(16.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.41);

		category_Excellent_SixYears.setNumFixoAge(17.0);
		category_Excellent_SeventeenYears.setMinimumValueOfTheTableCell(0);
		category_Excellent_SeventeenYears.setMaximumValueOfTheTableCell(5.26);

		tableOfAgilityFemale[0][0] = category_Weak_SixYears;
		tableOfAgilityFemale[1][0] = category_Weak_SevenYears;
		tableOfAgilityFemale[2][0] = category_Weak_EightYears;
		tableOfAgilityFemale[3][0] = category_Weak_NineYears;
		tableOfAgilityFemale[4][0] = category_Weak_TenYears;
		tableOfAgilityFemale[5][0] = category_Weak_ElevenYears;
		tableOfAgilityFemale[6][0] = category_Weak_TwelveYears;
		tableOfAgilityFemale[7][0] = category_Weak_ThirteenYears;
		tableOfAgilityFemale[8][0] = category_Weak_FourteenYears;
		tableOfAgilityFemale[9][0] = category_Weak_FifteenYears;
		tableOfAgilityFemale[10][0] = category_Weak_SixteenYears;
		tableOfAgilityFemale[11][0] = category_Weak_SeventeenYears;

		tableOfAgilityFemale[0][0] = category_Reasonable_SixYears;
		tableOfAgilityFemale[1][1] = category_Reasonable_SevenYears;
		tableOfAgilityFemale[2][1] = category_Reasonable_EightYears;
		tableOfAgilityFemale[3][1] = category_Reasonable_NineYears;
		tableOfAgilityFemale[4][1] = category_Reasonable_TenYears;
		tableOfAgilityFemale[5][1] = category_Reasonable_ElevenYears;
		tableOfAgilityFemale[6][1] = category_Reasonable_TwelveYears;
		tableOfAgilityFemale[7][1] = category_Reasonable_ThirteenYears;
		tableOfAgilityFemale[8][1] = category_Reasonable_FourteenYears;
		tableOfAgilityFemale[9][1] = category_Reasonable_FifteenYears;
		tableOfAgilityFemale[10][1] = category_Reasonable_SixteenYears;
		tableOfAgilityFemale[11][1] = category_Reasonable_SeventeenYears;

		tableOfAgilityFemale[0][2] = category_Good_SixYears;
		tableOfAgilityFemale[1][2] = category_Good_SevenYears;
		tableOfAgilityFemale[2][2] = category_Good_EightYears;
		tableOfAgilityFemale[3][2] = category_Good_NineYears;
		tableOfAgilityFemale[4][2] = category_Good_TenYears;
		tableOfAgilityFemale[5][2] = category_Good_ElevenYears;
		tableOfAgilityFemale[6][2] = category_Good_TwelveYears;
		tableOfAgilityFemale[7][2] = category_Good_ThirteenYears;
		tableOfAgilityFemale[8][2] = category_Good_FourteenYears;
		tableOfAgilityFemale[9][2] = category_Good_FifteenYears;
		tableOfAgilityFemale[10][2] = category_Good_SixteenYears;
		tableOfAgilityFemale[11][2] = category_Good_SeventeenYears;

		tableOfAgilityFemale[0][3] = category_VeryGood_SixYears;
		tableOfAgilityFemale[1][3] = category_VeryGood_SevenYears;
		tableOfAgilityFemale[2][3] = category_VeryGood_EightYears;
		tableOfAgilityFemale[3][3] = category_VeryGood_NineYears;
		tableOfAgilityFemale[4][3] = category_VeryGood_TenYears;
		tableOfAgilityFemale[5][3] = category_VeryGood_ElevenYears;
		tableOfAgilityFemale[6][3] = category_VeryGood_TwelveYears;
		tableOfAgilityFemale[7][3] = category_VeryGood_ThirteenYears;
		tableOfAgilityFemale[8][3] = category_VeryGood_FourteenYears;
		tableOfAgilityFemale[9][3] = category_VeryGood_FifteenYears;
		tableOfAgilityFemale[10][3] = category_VeryGood_SixteenYears;
		tableOfAgilityFemale[11][3] = category_VeryGood_SeventeenYears;

		tableOfAgilityFemale[0][4] = category_Excellent_SixYears;
		tableOfAgilityFemale[1][4] = category_Excellent_SevenYears;
		tableOfAgilityFemale[2][4] = category_Excellent_EightYears;
		tableOfAgilityFemale[3][4] = category_Excellent_NineYears;
		tableOfAgilityFemale[4][4] = category_Excellent_TenYears;
		tableOfAgilityFemale[5][4] = category_Excellent_ElevenYears;
		tableOfAgilityFemale[6][4] = category_Excellent_TwelveYears;
		tableOfAgilityFemale[7][4] = category_Excellent_ThirteenYears;
		tableOfAgilityFemale[8][4] = category_Excellent_FourteenYears;
		tableOfAgilityFemale[9][4] = category_Excellent_FifteenYears;
		tableOfAgilityFemale[10][4] = category_Excellent_SixteenYears;
		tableOfAgilityFemale[11][4] = category_Excellent_SeventeenYears;

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

	public String verifyAgility_Female(double resultAgilityCalculation, double age) {

		if (age <= 5.0 || age >= 18.0) {
			return situationDoesNotExist();
		} else if ((age == category_Weak_SixYears.getNumFixoAge()
				&& (resultAgilityCalculation >= category_Weak_SixYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_SevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_EightYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_EightYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_NineYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_NineYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_TenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ElevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_ElevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_TwelveYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_TwelveYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_ThirteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_ThirteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FourteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_FourteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_FifteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_FifteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SixteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_SixteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Weak_SeventeenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Weak_SeventeenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Weak_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return situationWeak();
		}

		else if ((age == category_Reasonable_SixYears.getNumFixoAge()
				&& (resultAgilityCalculation >= category_Reasonable_SixYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_SevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_EightYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_EightYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_NineYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_NineYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_TenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ElevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_ElevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_TwelveYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_TwelveYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_ThirteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_ThirteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FourteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_FourteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_FifteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_FifteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SixteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_SixteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Reasonable_SeventeenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Reasonable_SeventeenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Reasonable_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return situationReasonable();
		}

		else if ((age == category_Good_SixYears.getNumFixoAge()
				&& (resultAgilityCalculation >= category_Good_SixYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_SevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_EightYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_EightYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_NineYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_NineYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_TenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ElevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_ElevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_TwelveYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_TwelveYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_ThirteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_ThirteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FourteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_FourteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_FifteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_FifteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SixteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_SixteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Good_SeventeenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Good_SeventeenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Good_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return situationGood();
		}

		else if ((age == category_VeryGood_SixYears.getNumFixoAge()
				&& (resultAgilityCalculation >= category_VeryGood_SixYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_SevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_EightYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_EightYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_NineYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_NineYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_TenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ElevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_ElevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_TwelveYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_TwelveYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_ThirteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_ThirteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FourteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_FourteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_FifteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_FifteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SixteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_SixteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_VeryGood_SeventeenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_VeryGood_SeventeenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_VeryGood_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return situationVeryGood();
		}

		else if ((age == category_Excellent_SixYears.getNumFixoAge()
				&& (resultAgilityCalculation >= category_Excellent_SixYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_SixYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_SevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_SevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_EightYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_EightYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_EightYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_NineYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_NineYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_NineYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_TenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_TenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ElevenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_ElevenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_ElevenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_TwelveYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_TwelveYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_TwelveYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_ThirteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_ThirteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_ThirteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FourteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_FourteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_FourteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_FifteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_FifteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_FifteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SixteenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_SixteenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_SixteenYears.getMaximumValueOfTheTableCell()))
				|| (age == category_Excellent_SeventeenYears.getNumFixoAge()
						&& (resultAgilityCalculation >= category_Excellent_SeventeenYears.getMinimumValueOfTheTableCell() && resultAgilityCalculation <= category_Excellent_SeventeenYears.getMaximumValueOfTheTableCell()))) {
			return situationExcellent();
		}

		return null;
	}
}
