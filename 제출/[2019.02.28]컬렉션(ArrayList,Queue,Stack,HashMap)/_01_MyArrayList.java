
public class _01_MyArrayList {
	
	private String[] list; // 데이터 저장소
	private int index = 0; // 현재 접근할 방의 번호
	private int capacity = 0;
	
	// 생성자 선언
	public _01_MyArrayList() {
		this(4);
	}
	
	public _01_MyArrayList(int initialCapacity) {
		this.capacity = initialCapacity;
	}
	
	public void add(String value) {
		// Append 모드로 배열의 맨 끝에 요소를 추가한다.
		// s : 추가할 요소
		
		// 1) 배열이 없을 때 (처음 add 할 때)
		if (this.list == null) { // 첫 add()
			this.list = new String[this.capacity];
			this.index++;
		}
		
		// 2) 배열 공간이 없어서 공간을 추가해야 할 때
		doubling();
		
		// 3) 배열의 맨 끝에 요소 추가
		for (int i=0; i<list.length; i++) {
			if(this.list[i] == null) {
				this.list[index] = value;
				this.index++;
			}
		}
	}
	
	private void doubling() {
		if (this.index == this.list.length) { // 배열의 끝 길이에 다다르면,
			
			String[] temp = new String[this.list.length * 2]; // 배열의 길이를 2배로 늘려야 하므로 임시배열 선언
			
			for (int i=0; i<this.list.length; i++) { // 원본 배열의 크기만큼 for을 돌려서,
				temp[i] = this.list[i]; // 임시배열에 원본배열을 Deep Copy
			}

			this.list = temp; // 원본 배열을 임시배열로 교체, 배열의 길이는 2배로 늘어남
		}
	}

	@Override // 오버라이드 : 개발자 디버깅용
	public String toString() {
		
		String temp = "";
		
		for (String value : this.list) {
			temp += value + ", ";
		}
		
		temp += "\r\nindex : " + this.index;
		temp += "\r\nlength : " + this.list.length;
		
		return temp;
	}
	
	
	public String get(int index) {
		// 원하는 위치에 있는 요소를 가져온다.
		// index : 가져올 요소의 위치
		// return : 가져올 요소의 값
		
		// 유효한 index 검사
		// - 0 ~ this.index
		if (index >= 0 && index < this.index) {
			return this.list[index];
		} else {
			throw new IndexOutOfBoundsException();
		} 
	}
	
	public int size() {
		// 요소의 개수를 반환한다.
		// return : 요소의 개수

		return this.index;
	}
	
	public void set(int index, String value) {
		// 원하는 위치의 요소를 다른 값으로 수정한다.
		// index : 수정할 요소의 위치
		// value : 수정할 요소의 값
		
		if (index >= 0 && index < this.index) {
			this.list[index] = value;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void remove(int index) {
		// 원하는 위치의 요소를 삭제한다.
		// index : 삭제할 요소의 위치		
		
		//Red, 파랑, 노랑, 검정, 하하하, null, null, null,
		for(int i= this.index-1; i>=0; i--) {

			this.list[i] = this.list[i+1];
			this.index--;

		}
		
	}
	
	public void add(int index, String value) {
		// Insert 모드로 원하는 위치에 요소를 삽입한다.
		// index : 수정할 요소의 위치
		// value : 수정할 요소의 값
		
		doubling();
		
		//Red, 파랑, 노랑, 검정, 하하하, null, null, null,
		for (int i=this.index-1; i>=index; i--) { // 원하는 위치
			this.list[i+1] = this.list[i]; // 왼쪽에서 오른쪽으로 
			
		}
		
		this.list[index] = value;
		this.index++;
	}
	
	public int indexOf(String value) {
		// 원하는 요소가 몇 번째 위치에 있는지 위치값을 반환한다.
		// value : 검색할 요소의 값
		// return : 검색된 요소의 위치
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int indexOf(String value, int beginIndex) {
		// 원하는 요소가 몇 번째 위치에 있는지 위치값을 반환한다.
		// value : 검색할 요소의 값
		// return : 검색된 요소의 위치
		
		for (int i=beginIndex; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;	
	}
	
	public int lastIndexOf(String value) {
		// 원하는 요소가 몇 번재 위치에 있는지 위치값을 반환한다.
		// value : 검색할 요소의 값
		// return : 검색된 요소의 위치
		
		for (int i=this.index-1; i>-1; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}

	public void clear() {
		// 배열의 모든 요소를 삭제한다.
		
		//for -> i -> null
		for(int i=0; i<this.index; i++) {
			this.list[i] = "";	
		}
		
		this.index = 0;
	}
	
	public void trimToSize() {
		
		//빈방 버리기
		String[] temp = new String[this.index]; //실제 데이터 개수만큼의 배열 길이
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}
}
