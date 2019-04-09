
public class _02_MyQueue {
	
	private String[] list;
	private int index = 0;
	private int Capacity = 0;
	
	//생성자
	public _02_MyQueue() {
		this(4);
	}
	
	public _02_MyQueue(int initialCapacity) {
		this.Capacity = initialCapacity;
	}
	
	public void add(String value) {
		// 값을 순차적으로 추가한다.
		// value : 추가할 요소의 값
		
		if (this.list == null) {
			this.list = new String[this.Capacity];
		}
		
		doubling();
		
		this.list[this.index] = value;
		this.index++;	
		
		
	}
	
	private void doubling() {
		if(this.index == this.list.length) {
			String[] temp = new String[this.list.length * 2];
			 for (int i=0; i<this.list.length; i++) {
				 temp[i] = this.list[i];
			 }
			 this.list = temp;
		}	
	}

	public String poll() {
		// 값을 순차적으로 가져온다.
		// return : 가져올 요소의 값
		
		String output = this.list[0];
		
		for (int i=0; i<this.index-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		
		return output;
	}
	
	public int size() {
		// 요소의 개수를 반환한다.
		// return : 요소의 개수
		
		return this.index;
	}
	
	public String peek() {
		// 이번에 가져올 값을 확인한다.
		// value : 값 반환
		
		String output = this.list[0];
		return output;
	}
	
	public void clear() {
		// 배열의 모든 요소를 삭제한다.
		this.index = 0;
	}
	
	public void trimToSize() {
		// 배열 안의 요소의 개수만큼 배열의 길이를 줄인다.
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}
	
}
