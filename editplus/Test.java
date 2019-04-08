class Test 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 10;

		//sum = num++ + 10;

		sum = num + 10;
		num++;

		System.out.println(sum); //20
		System.out.println(num); //11
	}
}
