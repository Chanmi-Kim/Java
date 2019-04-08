package example;

public class Ex31_question {
	
	public static void main(String[] args) {
		
		//Ex31_question.java
		//q3();
		//q5();
		//q6();
		q7();
		
	}

	private static void q7() {
		
		//배열 중간에 삭제 + Left Shift
		int[] nums = new int[5];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		
		print(nums);
		
		int deleteIndex = 1; //삭제할 방번호
		
		for (int i=deleteIndex; i<= nums.length-2; i++) {
			
			nums[i] = nums[i+1]; //우측방 -> 좌측방
			print(nums);
			
		}
		
		nums[nums.length-1] = 0;
		
		print(nums);
		
	}

	private static void q6() {
		
		//배열 중간에 삽입 + Right Shift
		int[] nums = new int[5];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		
		print(nums);
		
		int insertIndex = 1;
		int newValue = 10;
		
		//1. 우측 시프트(오른쪽 -> 왼쪽 : 루프 변수 감소)
		for (int i=nums.length-2; i>=insertIndex; i--) {
			nums[i+1] = nums[i];
			print(nums);
		}
		
		//2. 삽입
		nums[insertIndex] = newValue;
		print(nums);
		
		
	}

	private static void q5() {
		
		//임의의 수 5개 확보(중복X)
		int[] nums = new int[5];
		
		boolean flag = false;
		
		for (int i=0; i<nums.length; i++) {
			
			int n = (int)(Math.random() * 9) + 1;
			
			//중복 검사
			for (int j=0; j<i; j++) {
				if (n == nums[j]) {
					//중복 발견!!! -> n을 버림
					flag = true;
				}
			}
			
			if (!flag) {
				nums[i] = n;
			} else {
				flag = false;
				i--;
			}
			//print(nums);
			//System.out.println(n);
			
		}
		
		print(nums);
		
	}

	private static void q3() {
		
		//배열 + 난수 -> 최대,최소
		
		//배열 생성
		int[] nums = new int[20];
		
		//난수 대입
		for (int i=0; i<nums.length; i++) {
			
			int n = (int)(Math.random() * 100) + 1; //1~100
			
			nums[i] = n;
		}
		
		//출력
		print(nums);
		
		//최대값, 최소값
		int max = 0, min = 101;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.printf("max : %d, min : %d\n", max, min);
		
	}

	private static void print(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.printf("%4d", nums[i]);
		}
		
		System.out.println();
		
	}

}






















