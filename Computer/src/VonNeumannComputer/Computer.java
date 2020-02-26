package VonNeumannComputer;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	public Processor CPU;
	public RAM RAM;
	public Input input;
	public Output output;
	public List<Bus> buses = new ArrayList<>();
	
	public Boolean ready; //same ready for all components

}
