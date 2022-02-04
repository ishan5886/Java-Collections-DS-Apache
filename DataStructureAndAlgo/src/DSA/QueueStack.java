package DSA;

public class QueueStack {
	
	//enqueue :- add data in queue
	//dequeue :- remove data from queue
	
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	public QueueStack(int sizzeofqueue) {
		this.capacity = sizzeofqueue;
		front=0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	
	//Method to add element in queue
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("*************...........Queue Full......*********");
		}
		else {
			rear++;
			if(rear == capacity-1) {
				rear=0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue ");
			
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("*************...........Queue Empty......*********");
		}
		else {
			front++;
			if(rear == capacity-1) {
				System.out.println(queueArr[front-1] + " removed from the queue ");
				front=0;
			}
			else {
				System.out.println(queueArr[front-1] + " removed from the queue ");
			}
			currentSize--;
			
			
		}
	}
	
	
	
	public boolean isFull() {
		if(currentSize == capacity) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(currentSize==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	
		
		QueueStack qs = new QueueStack(10);
		qs.enqueue(100);
		qs.enqueue(400);
		qs.enqueue(300);
		qs.enqueue(200);
		qs.enqueue(500);
		qs.enqueue(600);
		qs.dequeue();
		qs.enqueue(800);
		qs.dequeue();
	}

}
