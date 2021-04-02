package cs146F20Mwaseproject1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTestCase {

    
	LinkedListGame prisoners = new LinkedListGame();
	
	@BeforeEach
	void setUp() {
		prisoners = new LinkedListGame();
	}
	
	@Test
	public void testIfEmpty() {
	assertTrue(prisoners.isEmpty()); //before inserting, list is empty
	}
	
	@Test
	public void testSize() {
		assertEquals(0, prisoners.size); // Size is 0
	}
	
	@Test
	public void addFirst() {
		prisoners.add(1);
		assertEquals(1, prisoners.lucky(9)); //n = 1, k = 9, output = 1
	}
	
	@Test
	public void addMore() {
		prisoners.add(1);
		prisoners.add(2);
		prisoners.add(3);
		prisoners.add(4);
		prisoners.add(5);
		assertEquals(3, prisoners.lucky(1)); // n = 5, k = 1, output = 3
	}
	
	@Test
	public void addTwelve() {
		prisoners.add(1);
		prisoners.add(2);
		prisoners.add(3);
		prisoners.add(4);
		prisoners.add(5);
		prisoners.add(6);
		prisoners.add(7);
		prisoners.add(8);
		prisoners.add(9);
		prisoners.add(10);
		prisoners.add(12);
		assertEquals(2, prisoners.lucky(8)); // n = 12, k = 8, output = 2
	}
	

	@Test
	public void testIfEmptyAfterAdding() {
	assertTrue(prisoners.isEmpty()); //before inserting, list is empty
	}
	
	@Test
	public void timeToFindWinner() {
        double a =  System.currentTimeMillis();
        prisoners.add(1);
		prisoners.add(2);
		prisoners.add(3);
		prisoners.add(4);
		prisoners.add(5);	
		prisoners.lucky(1);
        double b =  System.currentTimeMillis();
        System.out.println("It takes " + (b - a) + " milliseconds to find winner ");
	}
	@Test
	public void timeToDelete() {
        double a =  System.currentTimeMillis();
        prisoners.add(1);
		prisoners.add(2);
		prisoners.add(3);
		prisoners.add(4);
		prisoners.add(5);	
		prisoners.deleteElement(4);
        double b =  System.currentTimeMillis();
        System.out.println("It takes " + (b - a) + " milliseconds to create a list and delete one element ");
	}
	
	public void timeToCreate() {
        double n =  System.currentTimeMillis();
        prisoners.add(5);
		prisoners.add(6);
		prisoners.add(7);
		prisoners.add(8);
		prisoners.add(9);	
        double m =  System.currentTimeMillis();
        System.out.println("It takes " + (m - n) + " milliseconds to create a list");
	}
}
