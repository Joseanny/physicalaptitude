package Anthropometric;


public abstract class Anthrpometric{ // Antropometrico específicas
	
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
	private double PABD; /*perimetro abdominal medio*/
	private double PTU; /*perimetro do quadril*/
	private double A; /*estatura*/
	private double MC; /*massa corporal*/
	private double PANT; /*perímetro do antebraço*/
	private double PCIN; /*perímetro da cintura*/
	private double perimeterAnkle; /*perímetro do tornozelo*/
	private double perimeterFist; /*perimetro do punho*/
	private double biacromialDiameter; /*diamentro biacromial*/
	private double bitrocanterianoDiameter; /*diamentro biatrocanteriano*/
	private double perimeterOfTheExtendedArm; /*perimetro do braço estendido*/
	private double thighPerimeter; /*perimetro da coxa*/
	private double hipPerimeterInInches; /*perimetro do quadril em polegadas*/
	private double PBCFP; /*perimetro do braço com o cúbito flexionado, em polegadas*/
	private double diameterFemur; /*diametro do fêmur*/
	private double PPES; /*Perímetro do Pescoço */
	private double DBIC; /*diametro bi-ileocristal*/
	private double perimeterArms; /*perimetro do braço*/
	private double BR; /*perimetro da panturrilha*/
	private double PBR; /*perimetro do braço relaxado*/
	private int gender;
	
	public double getPBR() {
		return PBR;
	}
	public void setPBR(double pBR) {
		PBR = pBR;
	}
	public double getBR() {
		return BR;
	}
	public void setBR(double BR) {
		this.BR = BR;
	}
	public double getPerimeterArms() {
		return perimeterArms;
	}
	public void setPerimeterArms(double perimeterArms) {
		this.perimeterArms = perimeterArms;
	}
	public double getDBIC() {
		return DBIC;
	}
	public void setDBIC(double dBIC) {
		DBIC = dBIC;
	}
	public double getPPES() {
		return PPES;
	}
	public void setPPES(double pPES) {
		PPES = pPES;
	}
	public double getDiameterFemur() {
		return diameterFemur;
	}
	public void setDiameterFemur(double diameterFemur) {
		this.diameterFemur = diameterFemur;
	}
	public double getHipPerimeterInInches() {
		return hipPerimeterInInches;
	}
	public void setHipPerimeterInInches(double hipPerimeterInInches) {
		this.hipPerimeterInInches = hipPerimeterInInches;
	}
	public double getPBCFP() {
		return PBCFP;
	}
	public void setPBCFP(double pBCFP) {
		PBCFP = pBCFP;
	}
	public double getPerimeterOfTheExtendedArm() {
		return perimeterOfTheExtendedArm;
	}
	public void setPerimeterOfTheExtendedArm(double perimeterOfTheExtendedArm) {
		this.perimeterOfTheExtendedArm = perimeterOfTheExtendedArm;
	}
	public double getThighPerimeter() {
		return thighPerimeter;
	}
	public void setThighPerimeter(double thighPerimeter) {
		this.thighPerimeter = thighPerimeter;
	}
	public double getBitrocanterianoDiameter() {
		return bitrocanterianoDiameter;
	}
	public void setBitrocanterianoDiameter(double bitrocanterianoDiameter) {
		this.bitrocanterianoDiameter = bitrocanterianoDiameter;
	}
	public double getPANT() {
		return PANT;
	}
	public void setPANT(double pANT) {
		PANT = pANT;
	}
	public double getPCIN() {
		return PCIN;
	}
	public void setPCIN(double pCIN) {
		PCIN = pCIN;
	}
	public double getPerimeterAnkle() {
		return perimeterAnkle;
	}
	public void setPerimeterAnkle(double perimeterAnkle) {
		this.perimeterAnkle = perimeterAnkle;
	}
	public double getPerimeterFist() {
		return perimeterFist;
	}
	public void setPerimeterFist(double perimeterFist) {
		this.perimeterFist = perimeterFist;
	}
	public double getBiacromialDiameter() {
		return biacromialDiameter;
	}
	public void setBiacromialDiameter(double biacromialDiameter) {
		this.biacromialDiameter = biacromialDiameter;
	}
	public double getMC() {
		return MC;
	}
	public void setMC(double mC) {
		MC = mC;
	}
	public double getPABD() {
		return PABD;
	}
	public void setPABD(double pABD) {
		PABD = pABD;
	}
	public double getPTU() {
		return PTU;
	}
	public void setPTU(double pTU) {
		PTU = pTU;
	}
	public double getA() {
		return A;
	}
	public void setA(double a) {
		A = a;
	}
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
