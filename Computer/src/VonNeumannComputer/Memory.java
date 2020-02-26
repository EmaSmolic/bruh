package VonNeumannComputer;
import java.lang.Math;

public abstract class Memory implements Component{
	
	private static int NUMBER_OF_ADRESS_BYTES = 16;
	private static int DATA_SIZE = 1;
	private static int MEMORY_SIZE = (int) Math.pow(2, NUMBER_OF_ADRESS_BYTES);
	
	private Data memory[] = new Data[MEMORY_SIZE];
	private int adressRegister;
	private Data dataRegister;
	
	private Data getData() {
		return memory[adressRegister];
	}
	
	public Data getDataAtAdress(int adress) {
		adressRegister = adress;
		dataRegister = getData();
		return Data.dataToWord(dataRegister);
	}

	public int getMemorySize() {
		return MEMORY_SIZE;
	}
	

}
