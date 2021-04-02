package cs146F20Mwaseproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DataShuffling {
	
	        //1.Reading in text file
	    public static String[] readIn(String filename) throws FileNotFoundException {

	        File file = new File(filename);
	        Scanner input = new Scanner(file);

	        //Write the file into an arraylist
	        ArrayList<String> list = new ArrayList<>();

	        //Using scanner to skip the first line
	        input.nextLine();

	        while (input.hasNext()) {
	            String combination = input.nextLine();
	            list.add(combination);
	        }
	        input.close();

	        String[] array = new String[list.size() - 1];
	        array = list.toArray(array);

	        return array;
	    }

	    public static void display(String[] array){
	        int count = 0;
	        for (int i = 0; i < array.length ; i++) {
	            System.out.println(array[i]);
	            count++;
	        }
	        System.out.println();
	        System.out.println(count + " combinations");
	    }

	    public static String[] fisherYates(String[] array){

	        Random random = new Random();

	        for (int i = array.length - 1; i > 1 ; i--) {

	            //Pick a random index
	            int randomIndex = random.nextInt( i + 1);

	            //Swap array[i] with random index
	            String temp = array[i];
	            array[i] = array[randomIndex];
	            array[randomIndex] = temp;
	        }
	        return array;

	    }

	    public static void writeToFile(String[] array) throws IOException {

	        FileWriter output = new FileWriter("/Users/Nkono Mwase Andrew/Desktop/CS 146/ErdosCA1.txt");

	        for (int i = 0; i < array.length ; i++) {
	            output.write(array[i] + "\n");
	        }
	        output.close();
	    }

}
