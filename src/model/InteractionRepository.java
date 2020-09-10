package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InteractionRepository implements Repository{

	@Override
	public Scanner connect() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disconnect(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList read() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void write(Interaction obj) throws FileNotFoundException {
		// TODO Auto-generated method stub

	}

}
