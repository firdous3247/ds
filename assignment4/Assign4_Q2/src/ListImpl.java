
public class ListImpl {

	public static void main(String[] args) {

//		Stack stack = new Stack();
//		
//		stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        
//        stack.displayStack();  
//        
//        System.out.println("Popped: " + stack.pop());  
//        System.out.println("Peek: " + stack.peek());   
//        
//        stack.displayStack();  
		
		
		Queue queue = new Queue();
		
		queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
//        queue.displayQueue();

        System.out.println("Front element: " + queue.peek());
//
//        queue.dequeue();
//        queue.displayQueue();
//
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.displayQueue();
//
//        System.out.println("Front element: " + queue.peek());

	}
}
