package Skinfold;

public abstract class Skinfold{ // Dobras Cultâneas
	
		private double TR; /*MedidaDoTriceps*/
		private double BI; /*MedidaDoBiceps*/
		private double SB; /*MedidaDoSubescapular*/
		private double SI; /* MedidaDaSupraIliaca*/
		private double ChestMeasure; /*MedidaDoTorácica*/
		private double AM; /*MedidaDoAxiliarMedia*/
		private double AB; /*MedidaAbdominal*/
		private double CX; /*MedidaDaCoxa*/
		private double PR; /*MedidaDaPanturrilhaMedial*/
		private double AgeInYears; /*IdadeEmAnos*/
		private int gender; //sexo
	    
		public double getTR() {
			return TR;
		}
		public void setTR(double tR) {
			TR = tR;
		}
		public double getBI() {
			return BI;
		}
		public void setBI(double bI) {
			BI = bI;
		}
		public double getSB() {
			return SB;
		}
		public void setSB(double sB) {
			SB = sB;
		}
		public double getSI() {
			return SI;
		}
		public void setSI(double sI) {
			SI = sI;
		}
		public double getChestMeasure() {
			return ChestMeasure;
		}
		public void setChestMeasure(double chestMeasure) {
			ChestMeasure = chestMeasure;
		}
		public double getAM() {
			return AM;
		}
		public void setAM(double aM) {
			AM = aM;
		}
		public double getAB() {
			return AB;
		}
		public void setAB(double aB) {
			AB = aB;
		}
		public double getCX() {
			return CX;
		}
		public void setCX(double cX) {
			CX = cX;
		}
		public double getPR() {
			return PR;
		}
		public void setPR(double pR) {
			PR = pR;
		}
		public double getAgeInYears() {
			return AgeInYears;
		}
		public void setAgeInYears(double ageInYears) {
			AgeInYears = ageInYears;
		}
		public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}

}
