package test;

import static org.junit.Assert.*;

import org.junit.Test;

import circular.CircularQueue;
import circular.CircularQueueImpl;

public class CircularQueueTest {
	// straightforward
	@Test
	public void enqueue__5_6_7_10() 
	{
		CircularQueue myQueue = new CircularQueueImpl();
		assert myQueue.getSize() == 0;
		// ENQUEUE 5
		myQueue.enqueue(5);
		int expectedSize = 1;
		int actualSize = myQueue.getSize();
		assertEquals(actualSize, expectedSize);
		
		
		// ENQUEUE 6
		myQueue.enqueue(6);
		assert myQueue.getSize() == 2;
		assert myQueue.getFront() == 0;
		assert myQueue.getBack() == 1;
		
		myQueue.enqueue(7);
		assert myQueue.getSize() == 3;
		assert myQueue.getFront() == 0;
		assert myQueue.getBack() == 2;
		
		myQueue.enqueue(10);
		assert myQueue.getSize() == 4;
		assert myQueue.getFront() == 0;
		assert myQueue.getBack() == 3;
	}
	@Test(expected = AssertionError.class)
	public void enqueue__1_1_1_1_1_1_1()
	{
		CircularQueue myQueue = new CircularQueueImpl();
		myQueue.enqueue(1);
		myQueue.enqueue(1);
		myQueue.enqueue(1);
		myQueue.enqueue(1);
		myQueue.enqueue(1);
		myQueue.enqueue(1);
		myQueue.enqueue(1);
	}
	@Test
	public void enqueue__1_16__dequeue()
	{
		CircularQueue myQueue = new CircularQueueImpl();
		myQueue.enqueue(1);
		myQueue.enqueue(16);
		// Check size, front, back
		int expectedSize = 2;
		int actualSize = myQueue.getSize();
		assertEquals(actualSize, expectedSize);
		int expectedFront = 0;
		int actualFront = myQueue.getFront();
		assertEquals(actualFront, expectedFront);
		int expectedBack = 1;
		int actualBack = myQueue.getBack();
		assertEquals(actualBack, expectedBack);
		//Duqueue
		
		myQueue.dequeue();
		assert myQueue.getSize() == 1;
		assert myQueue.getFront() == 1;
		assert myQueue.getBack() == 1;
	}
	@Test
	public void enqueue__5_6_7_10_11_7_dequeue_enque() 
	{
		CircularQueue myQueue = new CircularQueueImpl();
		assert myQueue.getSize() == 0;
		// ENQUEUE 5
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		myQueue.enqueue(7);
		myQueue.enqueue(10);
		myQueue.enqueue(11);
		myQueue.enqueue(7);
		int expectedSize = 6;
		int actualSize = myQueue.getSize();
		assertEquals(actualSize, expectedSize);
		int expectedFront = 0;
		int actualFront = myQueue.getFront();
		assertEquals(actualFront, expectedFront);
		int expectedBack = 5;
		int actualBack = myQueue.getBack();
		assertEquals(actualBack, expectedBack);
		
		
	}
}
