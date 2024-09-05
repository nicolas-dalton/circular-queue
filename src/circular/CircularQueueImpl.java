package circular;

public class CircularQueueImpl implements CircularQueue
{
	// INTERNAL REPRESENTATION
	int s; // s = the size of the queue
	int front; // front is an index
	int back; // back is an index
	int[] intArray; // intArray is the internal array but not the actual queue
	
	// CONSTRUCTOR CALL:
	public CircularQueueImpl()
	{
		intArray = new int[6]; // size of intArray is 6
		back = intArray.length-1; // back is the last index of intArray
		front = 0; // front is the first index of intArray
	}
	@Override
	public void enqueue(int e) 
	{
		// TODO Auto-generated method stub
		assert s != capacity() : "Queue is FULL! Cannot add element!"; 
		s++; // size goes up by one
		if(back != intArray.length-1)
		{
			back = back+1;
			intArray[back] = e;
		}
		else
		{
			back = 0;
			intArray[back] = e;
		}
	}

	@Override
	public void dequeue() 
	{
		// TODO Auto-generated method stub
		assert s != 0 : "Queue is EMPTY! Cannot remove element!";
		s--;
		if(front != intArray.length-1)
		{
			front = front+1;
		}
		else
		{
			front = 0;
		}
	}

	@Override
	public int capacity() 
	{
		// TODO Auto-generated method stub
		return intArray.length;
	}

	@Override
	public int getFront() {
		return front;
	}

	@Override
	public int getBack() {
		return back;
	}

	@Override
	public int getSize() {
		return s;
	}
	
}
