package VonNeumannComputer;

public class Bus {

	private static int CONTROL_SIZE = 1; //0 = store, 1 = read
	private static int ADRESS_SIZE = 16;
	private static int DATA_SIZE = 8;
	private static int BUS_SIZE = ADRESS_SIZE + DATA_SIZE + CONTROL_SIZE;
	private static double PERIOD_IN_NANOSECONDS = 1;
	
	private Boolean controlWires[] = new Boolean[CONTROL_SIZE];
	private Boolean adressWires[] = new Boolean[ADRESS_SIZE];
	private Boolean dataWires[] = new Boolean[DATA_SIZE];
	
	public Boolean[] getControlWires() {
		return controlWires;
	}

	public void setControlWires(Boolean[] controlWires) {
		this.controlWires = controlWires;
	}

	public Boolean[] getAdressWires() {
		return adressWires;
	}

	public void setAdressWires(Boolean[] adressWires) {
		this.adressWires = adressWires;
	}

	public Boolean[] getDataWires() {
		return dataWires;
	}

	public void setDataWires(Boolean[] dataWires) {
		this.dataWires = dataWires;
	}

	public int getCONTROL_SIZE() {
		return CONTROL_SIZE;
	}

	public int getADRESS_SIZE() {
		return ADRESS_SIZE;
	}

	public int getDATA_SIZE() {
		return DATA_SIZE;
	}

	
	public static int getBusSize() {
		return BUS_SIZE;
	}

	public static double getPeriodInNanoseconds() {
		return PERIOD_IN_NANOSECONDS;
	}

	
	public void readFromMemoryAtAdress(int adress) {
		Data read;
		//if(this.RightToLeft) if(this.leftComponent instanceof Memory) {
		//	Memory memory = (Memory) this.leftComponent;
		//	read = memory.getDataAtAdress(adress);
		//}
	}
	
}
	

