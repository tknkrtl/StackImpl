
public class Stack {

	int stack[] = new int [5];
	
	int top=-1;
	
	public void push(int i) {
		
		if(top>=stack.length-1)
		{
			System.out.println("Stack Overflow");
			
		}
		else {
			stack[++top]=i;
		}
		
	}
	public int size() {
		
		return ++top;
		
	}
	public void pop() {
		
		if(top==-1) {
			
		System.out.println("Stack is already empty");	
		
		}
		else {
		stack[top] = 0;
		--top;
		}
		
	}
	public void print() {
		
		for(int i = 0 ; i < stack.length; i ++ ) {
			
			System.out.println(stack[i]);
			
		}
		
	}
	
}
