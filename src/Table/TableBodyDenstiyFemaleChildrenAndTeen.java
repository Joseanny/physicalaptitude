package Table;

public class TableBodyDenstiyFemaleChildrenAndTeen {
	
	TableSupport TableFemaleChildrenAndTeen[];
	
	TableSupport i1, i2, i3, i4, i5, i6;

	public TableBodyDenstiyFemaleChildrenAndTeen()  {
		InicializaTableFemaleChildrenAndTeen();
	}

	public void InicializaTableFemaleChildrenAndTeen() {

		i1 = new TableSupport();
		i2 = new TableSupport();
		i3 = new TableSupport();
		i4 = new TableSupport();
		i5 = new TableSupport();
		i6 = new TableSupport();
		

		TableFemaleChildrenAndTeen = new TableSupport[6];

		i1.setMinimumValueOfTheTableCell(0.0);
		i1.setMaximumValueOfTheTableCell(12.0);

		i2.setMinimumValueOfTheTableCell(12.1);
		i2.setMaximumValueOfTheTableCell(15.0);

		i3.setMinimumValueOfTheTableCell(15.1);
		i3.setMaximumValueOfTheTableCell(25.0);

		i4.setMinimumValueOfTheTableCell(25.1);
		i4.setMaximumValueOfTheTableCell(30.0);

		i5.setMinimumValueOfTheTableCell(30.1);
		i5.setMaximumValueOfTheTableCell(36.0);
		
		i6.setMinimumValueOfTheTableCell(36.1);
		i6.setMaximumValueOfTheTableCell(TableSupport.INFINITY);

		TableFemaleChildrenAndTeen[0] = i1;
		TableFemaleChildrenAndTeen[1] = i2;
		TableFemaleChildrenAndTeen[2] = i3;
		TableFemaleChildrenAndTeen[3] = i4;
		TableFemaleChildrenAndTeen[4] = i5;
		TableFemaleChildrenAndTeen[5] = i6;

	}

	public String Situacao1() {
		return "Excessivamente Baixo";
	}

	public String Situacao2() {
		return "Baixa";
	}

	public String Situacao3() {
		return "Adequada";
	}

	public String Situacao4() {
		return "Moderamente alta";
	}

	public String Situacao5() {
		return "Alta";
	}
	
	public String Situacao6() {
		return "Excessivamente Alta";
	}

	public String check(double r) {

		if (r >= i1.getMinimumValueOfTheTableCell() && r <= i1.getMaximumValueOfTheTableCell()) {
			return Situacao1();
		} else if (r >= i2.getMinimumValueOfTheTableCell() && r <= i2.getMaximumValueOfTheTableCell()) {
			return Situacao2();
		} else if (r >= i3.getMinimumValueOfTheTableCell() && r <= i3.getMaximumValueOfTheTableCell()) {
			return Situacao3();
		} else if (r >= i4.getMinimumValueOfTheTableCell() && r <= i4.getMaximumValueOfTheTableCell()) {
			return Situacao4();
		} else if (r >= i5.getMinimumValueOfTheTableCell() && r <= i5.getMaximumValueOfTheTableCell()) {
			return Situacao5();
		} else if (r >= i6.getMinimumValueOfTheTableCell() && r <= i6.getMaximumValueOfTheTableCell()) {
			return Situacao6();
		}
		return null;
	}
}
