package cs146F20Mwaseproject1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class DataShufflingTestCase {
	

	@Test
	
	public void file() throws IOException {
	BufferedReader Out=new BufferedReader (new FileReader ("/Users/Nkono Mwase Andrew/Desktop/CS 146/Target3.txt"));
	BufferedReader In=new BufferedReader (new FileReader ("/Users/Nkono Mwase Andrew/Desktop/CS 146/ErdosCA.txt"));
	String expectedLine;
		while ((expectedLine = In.readLine ()) != null) {
			String actualLine = Out.readLine ();
			assertEquals (expectedLine, actualLine);
		}
	}
	
		
}


