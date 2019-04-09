
public class _04_MyHashMap {

	private String[] list;
	private int index = 0;
	private int Capacity = 0;
	
	// 생성자
	public _04_MyHashMap() {
		this(4);
	}
	
	public _04_MyHashMap(int initialCapacity) {
		this.Capacity = initialCapacity;
	}
	
	public void put(String key, String value) {
		// 키와 값을 요소로 추가한다.
		// key : 추가할 요소의 키
		// value : 추가할 요소의 값
		
		if (this.list == null) {
			this.list = new String[this.Capacity];
		} 
		
		doubling();
		
		//중복값의 유무에 따라 분기를 설정하기 위한 값
		int flag = 0;

		//최초 입력시의 분기 설정
		if (this.index == 0) {
			flag = -1;
		}
		
		//중복값의 유무를 체크
		for (int i=0; i<this.index; i++) {
			int basis = this.list[i].indexOf("/");
			if (key.equals(this.list[i].substring(0, basis))) {
				flag = i;
				break;
			} else {
				flag = -1;
			}
			
		}
		
		//flag의 값에 따라 분기 설정
		if (flag >= 0) { //중복값이 있는 경우 -> 수정 모드
			
			this.list[flag] = key + "/" + value;
			
		} else { //중복값이 없는 경우 -> 입력 모드
			
			this.list[this.index] = key + "/" + value;
			this.index++;
			
		}
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

	public String get(String key) {
		// 키에 대응하는 요소의 값을 가져온다.
		// key : 가져올 요소의 키
		// return : 가져올 요소의 값
		
		String value = "";
		
		for (int i=0; i<this.index; i++) {
			int basis = this.list[i].indexOf("/");
			if (key.equals(this.list[i].substring(0, basis))) {
				value = this.list[i].substring(basis+1);
				return value;
			}
		}
		
		return null;
	}
	
	public int size() {
		// 요소의 개수를 반환한다.
		// return : 요소의 개수
		
		return this.index;
	}
	
//	public void put(String key, String value) {
//		// 해당 키의 값을 요소로 수정한다.
//		// key : 수정할 요소의 키
//		// value : 수정할 요소의 값
//	}
	
	public void remove(String key) {
		// 원하는 키의 요소를 삭제한다.
		// key : 삭제할 요소의 키
		
		//삭제 할 위치를 선정하기 위한 위치값
		int flag = 0;
		
		//위치값 구하는 구간
		for (int i=0; i<this.index; i++) {
			int basis = this.list[i].indexOf("/");
			if (key.equals(this.list[i].substring(0, basis))) {
				flag = i;
			}
		}
		
		//삭제 작업 구간
		for (int i=flag; i<this.index-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
	}
	
	public boolean containKey(String key) {
		// 해당 키가 존재하는지 확인한다.
		// key : 확인할 키
		// return : 키의 존재 유무
		
		for (int i=0; i<this.index; i++) {
			int basis = this.list[i].indexOf("/");
			if (key.equals(this.list[i].substring(0, basis))) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean containsValue(String value) {
		// 해당 값이 존재하는지 확인한다.
		// value : 확인할 값
		// return : 값의 존재 유무
		
		for (int i=0; i<this.index; i++) {
			int basis = this.list[i].indexOf("/");
			if (value.equals(this.list[i].substring(basis + 1))) {
				return true;
			}
		}
		
		return false;
	}
	
	public void clear() {
		// 배열의 모든 요소를 삭제한다.
		this.index = 0;
	}
}
