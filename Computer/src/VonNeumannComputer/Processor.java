package VonNeumannComputer;

public class Processor implements Component{

	public static int NUMBER_OF_INTERNAL_REGISTERS = 16;
	public static int NUMBER_OF_CONTROL_SIGNALS = 5;
	private ArithmeticLogicUnit ALU;
	private ControlUnit CTRLU;
	private int adressRegister, programCounter, stackPointer, stateRegister;
	private Data dataRegister;
	private String instructionRegister;
	private Boolean[] controlSignals = new Boolean[NUMBER_OF_CONTROL_SIGNALS];
	private Data[] internalRegisters = new Data[NUMBER_OF_INTERNAL_REGISTERS];
	public Bus bus, intBus1, intBus2, intBus3;
	
	public Boolean ready;
	
	public void write(Data data, int adress) {
		this.adressRegister = adress;
		this.dataRegister = data;
		
		setAdressWires();
		setControlWiresToWrite();
		setDataWires();
		
	}
	
	public void read(int adress) {
		this.adressRegister = adress;
		
		setAdressWires();
		setControlWiresToRead();
		
		waitForComponent();
		
		this.dataRegister = Converter.booleanArrayToData(bus.getDataWires());
	}
	
	private void waitForComponent() {
		ready = false;
		
		do {
			
		} while (!ready);
		
	}
	
	private void setAdressWires() {
		Boolean[] adressInBoolArray = new Boolean[bus.getADRESS_SIZE()];
		adressInBoolArray = Converter.decToBooleanArray(this.adressRegister);
		
		this.bus.setAdressWires(adressInBoolArray);
	}
	
	private void setControlWiresToWrite() {
		Boolean[] write = new Boolean[bus.getCONTROL_SIZE()];
		write[0] = false;
		this.bus.setControlWires(write);
	}
	
	private void setControlWiresToRead() {
		Boolean[] read = new Boolean[bus.getCONTROL_SIZE()];
		read[0] = true;
		this.bus.setControlWires(read);
	}
	
	private void setDataWires() {
		Boolean[] dataInBoolArray = new Boolean[bus.getDATA_SIZE()];
		dataInBoolArray = Converter.dataToBoolArray(this.dataRegister);
		this.bus.setDataWires(dataInBoolArray);
	}
}
