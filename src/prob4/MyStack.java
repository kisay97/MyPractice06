package prob4;

public class MyStack implements Stack {
	
	private String[] buffer;
	private int capacity;
	private int top;
	
	public MyStack(int capacity) throws MyStackException{
		if(capacity <=0 ){
			throw new MyStackException("init stack capacity");
		}
		this.capacity = capacity;
		buffer = new String[capacity];
		top = 0;
	}

	@Override
	public void push(String str) {
		if(top >= capacity){
			String newBuffer[] = new String[(capacity*2)];
			System.arraycopy(buffer, 0, newBuffer, 0, capacity);
			buffer = newBuffer;
		}
		
		buffer[top] = str;
		top++;
	}

	@Override
	public String pop() throws RuntimeException {
		top--;
		if(top <= 0){
			top = 0;
			return null;
		}
		return buffer[top];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}

}
