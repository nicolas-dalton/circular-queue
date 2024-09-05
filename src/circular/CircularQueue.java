package circular;

public interface CircularQueue 
{
	// pre-condition: takes an integer.
	// post-condition:  s increases by 1. If back equals intArray.length-1, then back equals intArray[0] and
	// 		intArray[0] equals e. Otherwise, back equals intArray[back+1] and intArray[back+1] equals e.	
	public void enqueue(int e);
	// pre-condition: s cannot be equal to 0 ( s != 0 )
	// post-condition: s decreases by 1. If the s does not equal 1, then if front does not equal intArray.length-1 ) 
	// 		then front equals front+1, otherwise, front equals 0. If s equals 1, then will remain at the same indexes.
	public void dequeue();
	// pre-condition: nothing.
	// post-condition: returns the capacity of the queue.
	public int capacity();
	// pre-condition: nothing.
	// post-condition: returns the front index.
	public int getFront();
	// pre-condition: nothing.
	// post-condition: returns the back index.
	public int getBack();
	// pre-condition: nothing.
	// post-condition: returns the size of the queue.
	public int getSize();
}
