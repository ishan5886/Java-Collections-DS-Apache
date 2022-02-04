package DSA;

public class StackImplementation {
	
	int size;
	int arr[];
	int top;
	

	public StackImplementation(int size){
		this.size=size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	//Time Complexity is O(1) for all operations
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("pushed element : " + element);
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("popped element : " + arr[returnedTop]);
			return arr[returnedTop];
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}

	public static void main(String[] args) {
		
		StackImplementation si = new StackImplementation(10);
		
		si.pop();
		si.push(100);
		si.push(200);
		si.push(300);
		si.pop();
		si.pop();
		si.push(400);
		si.push(500);
		si.push(600);
		si.push(401);
		si.push(501);
		si.push(601);
		si.push(402);
		si.push(502);
		si.push(602);
		si.push(702);
		System.out.println(si.peek());//Return top element of stack without removing it
		System.out.println(si.isFull());
	
	}

}
