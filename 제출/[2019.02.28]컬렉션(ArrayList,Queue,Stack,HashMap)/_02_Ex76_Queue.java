
public class _02_Ex76_Queue {
	public static void main(String[] args) {
		
		//배열 생성
		_02_MyQueue queue = new _02_MyQueue();

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		
		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println();
		
		//개수
		System.out.println("배열 안의 값의 개수는 : " + queue.size() + "개");
		System.out.println();
		
		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println();
		
		//크기 조절
		queue.trimToSize();
		System.out.println(queue);
		System.out.println();
		
		//초기화
		queue.clear();
		System.out.println(queue.size());
		System.out.println(queue);
		System.out.println();
		
	}
}
