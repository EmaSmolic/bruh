package VonNeumannComputer;
import java.lang.Math;

public class Converter {

	public static int booleanArrayToDec(Boolean[] array) {
		double result = 0;
		
		for (int i=0; i<array.length; i++) {
			if (array[i]) result += Math.pow(2, i);
		}
		
		return (int) result;
	}
	
	public static Boolean[] decToBooleanArray(int integer) {
		
		return null;
	}

	public static Boolean[] dataToBoolArray(Data dataRegister) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Data booleanArrayToData(Boolean[] dataWires) {
		// TODO Auto-generated method stub
		return null;
	}


	

}