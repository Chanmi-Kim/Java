package example;

class Time {
	// 시간 클래스
	
	private int hour;	// 시(0 이상 양의 정수)
	private int minute;	// 분(0 이상 양의 정수)
	private int second;	// 초(0 이상 양의 정수)


	public Time() {
		// 기본 생성자
		this(0, 0, 0);
	}
	
	/**
	 * == 인자리스트 변수명 ==
	 * @param hour		시
	 * @param minute	분
	 * @param second	초
	 */
	public Time(int hour, int minute, int second) {
		// 생성자 오버로딩
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public Time(int minute, int second) {
		// 생성자 오버로딩
		
		this.minute = minute;
		this.second = second;
	}

	public Time(int second) {
		// 생성자 오버로딩

		this.second = second;
	}

	public String info() {
		
		// total 변수를 사용하여 모든 시간을 초(second) 단위로 통일
		int total = second + (minute * 60) + (hour * 60 * 60); 
		
		hour = total / 3600; 		// 통합된 시간에서 시간 단위 재분배
		minute = total % 3600 / 60;	// 통합된 시간에서 분 단위 재분배
		second = total % 3600 % 60;	// 통합된 시간에서 초 단위 재분배
		
		return hour + ":" + minute + ":" + second;
	}
}

