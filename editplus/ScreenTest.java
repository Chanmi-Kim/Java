

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

			System.out.print("��");
			Thread.sleep(100);

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		*/


		String[] items = { "��", "��", "��", "��", "��", "��", "��", "��", "Ŀ", "��", "��", "��", "Ű", "��", "��", "��", "��", "��", "��", "��" };
		String txt = "�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.";
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
