

class ScreenTest 
{
	public static void main(String[] args) throws Exception
	{
		//C:\Class\Java\editplus\ScreenTest.java
		//System.out.println("test");

		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		//System.out.println("zzzz");
		
		
		/*
		for (int j=0; j<100; j++) {
			for (int i=0; i<j; i++) {
				 System.out.print(" ");
			}

			System.out.print("▶");
			Thread.sleep(100);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		*/


		String[] items = { "강", "공", "아", "김", "성", "최", "녕", "하", "커", "마", "우", "스", "키", "보", "드", "모", "니", "터", "빌", "드" };
		String txt = "안녕하세요. 저는 홍길동입니다.";
		String output = "";

		for (int i=0; i<txt.length(); i++) {
			
			for (int j=0; j<items.length; j++) {
				output = items[j];
				for (int k=0; k<=i; k++) {
					System.out.print(txt.substring(k, k+1));
				}
				System.out.print(output);
				Thread.sleep(1);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}

			

		}


	}
}
