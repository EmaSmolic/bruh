package VonNeumannComputer;

public class Data {
	private String string;
	private int integer;
	private dataType dataType;
	
	public void writeData(Boolean[] word) { 
		if (!word[0]) {this.dataType = dataType.INTEGER;
		this.integer = returnInt(word);
		}
		else {this.dataType = dataType.STRING;
		this.string = returnString(word);
		}
	}
	
	public static int returnInt(Boolean[] word) {
		return Converter.booleanArrayToDec(word);
	}
	
	public static String returnString(Boolean[] word) {
		word[0] = false;
		return String.valueOf(Converter.booleanArrayToDec(word));
		
	}

	public void writeData() {
		
	}
	public Data readData() {
		return null;
	}
	
	public Boolean[] returnWord() {
		switch(this.dataType) {
		case INTEGER: {
			
		}
		}
		return null;
		
	}

	public static Data dataToWord(Data dataRegister) {
		// TODO Auto-generated method stub
		return null;
	}
}
