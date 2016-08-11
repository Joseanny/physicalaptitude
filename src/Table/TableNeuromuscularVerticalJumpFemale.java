package Table;

public class TableNeuromuscularVerticalJumpFemale {

	TableSupport TableVerticalJump_Female[];

	TableSupport percentage1;
	TableSupport percentage2;
	TableSupport percentage3;
	TableSupport percentage4;
	TableSupport percentage5;
	TableSupport percentage6;
	TableSupport percentage7;
	TableSupport percentage8;
	TableSupport percentage9;

	public TableNeuromuscularVerticalJumpFemale() {
		InicializaTableVerticalJump_Female();
	}

	public void InicializaTableVerticalJump_Female() {

		percentage1 = new TableSupport();
		percentage2 = new TableSupport();
		percentage3 = new TableSupport();
		percentage4 = new TableSupport();
		percentage5 = new TableSupport();
		percentage6 = new TableSupport();
		percentage7 = new TableSupport();
		percentage8 = new TableSupport();
		percentage9 = new TableSupport();

		TableVerticalJump_Female = new TableSupport[9];

		percentage1.setMinimumValueOfTheTableCell(0.0);
		percentage1.setMaximumValueOfTheTableCell(2.5);

		percentage2.setMinimumValueOfTheTableCell(2.6);
		percentage2.setMaximumValueOfTheTableCell(5.0);

		percentage3.setMinimumValueOfTheTableCell(5.1);
		percentage3.setMaximumValueOfTheTableCell(10.0);

		percentage4.setMinimumValueOfTheTableCell(10.1);
		percentage4.setMaximumValueOfTheTableCell(15.0);

		percentage5.setMinimumValueOfTheTableCell(15.1);
		percentage5.setMaximumValueOfTheTableCell(20.0);

		percentage6.setMinimumValueOfTheTableCell(20.1);
		percentage6.setMaximumValueOfTheTableCell(25.0);

		percentage7.setMinimumValueOfTheTableCell(25.1);
		percentage7.setMaximumValueOfTheTableCell(30.0);

		percentage8.setMinimumValueOfTheTableCell(30.1);
		percentage8.setMaximumValueOfTheTableCell(33.0);

		percentage9.setMinimumValueOfTheTableCell(33.1);
		percentage9.setMaximumValueOfTheTableCell(36.0);

		TableVerticalJump_Female[0] = percentage1;
		TableVerticalJump_Female[1] = percentage2;
		TableVerticalJump_Female[2] = percentage3;
		TableVerticalJump_Female[3] = percentage4;
		TableVerticalJump_Female[4] = percentage5;
		TableVerticalJump_Female[5] = percentage6;
		TableVerticalJump_Female[6] = percentage7;
		TableVerticalJump_Female[7] = percentage8;
		TableVerticalJump_Female[8] = percentage9;

	}

	public String Situation1() {
		return "10% de desempenho";
	}

	public String Situation2() {
		return "20% de desempenho";
	}

	public String Situation3() {
		return "30% de desempenho";
	}

	public String Situation4() {
		return "40% de desempenho";
	}

	public String Situation5() {
		return "50% de desempenho";
	}

	public String Situation6() {
		return "60% de desempenho";
	}

	public String Situation7() {
		return "70% de desempenho";
	}

	public String Situation8() {
		return "80% de desempenho";
	}

	public String Situation9() {
		return "90% de desempenho";
	}

	public String verifyVerticalJump_Female(double r) {

		if (r >= percentage1.getMinimumValueOfTheTableCell() && r <= percentage1.getMaximumValueOfTheTableCell()) {
			return Situation1();
		} else if (r >= percentage2.getMinimumValueOfTheTableCell() && r <= percentage2.getMaximumValueOfTheTableCell()) {
			return Situation2();
		} else if (r >= percentage3.getMinimumValueOfTheTableCell() && r <= percentage3.getMaximumValueOfTheTableCell()) {
			return Situation3();
		} else if (r >= percentage4.getMinimumValueOfTheTableCell() && r <= percentage4.getMaximumValueOfTheTableCell()) {
			return Situation4();
		} else if (r >= percentage5.getMinimumValueOfTheTableCell() && r <= percentage5.getMaximumValueOfTheTableCell()) {
			return Situation5();
		} else if (r >= percentage6.getMinimumValueOfTheTableCell() && r <= percentage6.getMaximumValueOfTheTableCell()) {
			return Situation6();
		} else if (r >= percentage7.getMinimumValueOfTheTableCell() && r <= percentage7.getMaximumValueOfTheTableCell()) {
			return Situation7();
		} else if (r >= percentage8.getMinimumValueOfTheTableCell() && r <= percentage8.getMaximumValueOfTheTableCell()) {
			return Situation8();
		} else if (r >= percentage9.getMinimumValueOfTheTableCell() && r <= percentage9.getMaximumValueOfTheTableCell()) {
			return Situation9();
		}
		return null;
	}

}
