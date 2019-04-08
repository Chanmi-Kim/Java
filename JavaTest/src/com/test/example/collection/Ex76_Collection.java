package com.test.example.collection;

public class Ex76_Collection {
	
	public static void main(String[] args) {
		
		//MyStack 테스트
		//MyQueue 테스트
		
		//ex_stack();
		ex_queue();
		
		
	}

	private static void ex_queue() {
		
		MyQueue queue = new MyQueue();
		
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println(queue);
		
		queue.clear();
		
		System.out.println(queue);
		
		queue.add("빨강");
		queue.add("파랑");
		System.out.println(queue);
		
		queue.trimToSize();
		System.out.println(queue);
		
	}

	private static void ex_stack() {
		
		MyStack stack = new MyStack();
		
		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.size());
		
		stack.push("빨강");
		stack.push("파랑");
		stack.push("노랑");
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		stack.clear();
		System.out.println(stack);
		
		stack.push("빨강");
		stack.push("파랑");
		System.out.println(stack);
		
		stack.trimToSize();
		System.out.println(stack);
	}

}
