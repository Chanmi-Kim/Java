class Ex12_Input 
{
	public static void main(String[] args) throws Exception
	{
		//Ex12_Input.java

		//ÄÜ¼Ö ÀÔ·Â
		//1. System.in.read() ¸Ş¼Òµå
		//	- 1±ÛÀÚ¸¸ ÀĞ±â
		//2. BufferedReader Å¬·¡½º 
		//3. Scanner Å¬·¡½º

		//¿ä±¸»çÇ×] »ç¿ëÀÚ¿¡°Ô ¹®ÀÚ¸¦ 1°³ ÀÔ·Â¹Ş¾Æ¼­ È­¸é¿¡ ±×´ë·Î Ãâ·ÂÇÏ½Ã¿À.
		int input = System.in.read(); //ÀÔ·Â ´ë±â »óÅÂ, ºí·°

		//¹®ÀÚ ÄÚµå°ª(¾Ï±â)
		//1. a(97), z(122)
		//2. A(65), Z(90)
		//3. 0(48), 9(57)
		//4. °¡, ÆR
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		System.out.println("Á¾·á");


	}
}










