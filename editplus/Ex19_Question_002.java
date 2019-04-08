class Ex19_Question_002 
{
	public static void main(String[] args) 
	{
		//Ex19_Question_002.java

		BufferedReader reader ;
		String input = reader.readLine();
		int n = Integer.parseInt(input);

		digit(n);

	}

	public static void digit(int num)
	{
		//5 -> "0005"
		String result = (num < 10) ? "000" + num : (num < 100) ? "00" + num : (num < 1000) ? "0" + num : "" + num;

		System.out.printf("%d -> %s\n", num, result);
		
	}
}
