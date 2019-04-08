class Ex15_Op
{
	public static void main(String[] args) 
	{
		//Ex15_Op.java(ch3)

		//¿¬»êÀÚ, Operator
		// - ÇÇ¿¬»êÀÚ(Operand)¸¦ ´ë»óÀ¸·Î ¹Ì¸® Á¤ÇØÁø ¿¬»ê(°è»ê,Çàµ¿)À» ÇÑ ÈÄ¿¡ °á°ú°ªÀ» ¹İÈ¯ÇÏ´Â ¿ªÇÒ(ÁÖ·Î ±âÈ£·Î Ç¥Çö)
		// 1. ¹®Àå(Statement)
		// 2. Ç¥Çö½Ä(Expression)
		// 3. ¿¬»êÀÚ
		// 4. ÇÇ¿¬»êÀÚ
		// 5. ¿¬»ê ¿ì¼±¼øÀ§
		// 6. ¿¬»ê ¹æÇâ
		int sum;

		sum = 1 + 2 + 3;

		System.out.println(sum);


		//1. »ê¼ú ¿¬»êÀÚ
		// - +, -, *, /, %(³ª¸ÓÁö ¿¬»êÀÚ, mod)
		// - ÇÇ¿¬»êÀÚ 2°³ > 2Ç× ¿¬»êÀÚ

		int a = 10;
		int b = 3;

		System.out.println(a + b); //13
		System.out.println(a - b); //7
		System.out.println(a * b); //30
		System.out.println(a / b); //3, Á¤¼ö/Á¤¼ö = Á¤¼ö(¸ò)
		System.out.println(a % b); //1, ³ª¸ÓÁö

		//Á¤¼ö/Á¤¼ö = Á¤¼ö
		//Á¤¼ö/½Ç¼ö = ½Ç¼ö
		//½Ç¼ö/Á¤¼ö = ½Ç¼ö
		//½Ç¼ö/½Ç¼ö = ½Ç¼ö
		//*** »ê¼ú ¿¬»êÀÇ °á°ú´Â µÎ ÇÇ¿¬»êÀÚ Áß ´õ Å« ÀÚ·áÇüÀ¸·Î ¹İÈ¯µÈ´Ù.
		System.out.println(10 / 3); //int
		System.out.println(10 / 3.0); //double
		System.out.println(10.0 / 3); //double
		System.out.println(10.0 / 3.0); //double

		System.out.println(10 + 10L); //long

		//***
		System.out.println(2100000000 + 2100000000L);

		System.out.println(-2100000000 - 2100000000);



		//reader
		//»ç¿ëÀÚ¿¡°Ô ¼ıÀÚ¸¦ ÀÔ·Â : 
		//int num = 0;
		//System.out.println(100 / num);
		

		//¿¡·¯, Error
		// - ¹ö±×(Bug), ¿À·ù, ¿¹¿Ü(Exception)

		//1. ÄÄÆÄÀÏ ¿¡·¯
		// - ÄÄÆÄÀÏ·¯°¡ ÄÄÆÄÀÏ ÀÛ¾÷ Áß ¹ß°ß ÇÏ´Â ¿À·ù
		// - ¹®¹ıÀÌ Æ²¸° °æ¿ì ¹ß»ı
		// - ¹ß»ı ºóµµ ³ôÀ½(ÃÊº¸ÀÚ)
		// - ¼öÁ¤ ³­ÀÌµµ ³·À½ > ¿À·ù ¸Ş½ÃÁö Ãâ·Â

		//2. ·±Å¸ÀÓ ¿¡·¯
		// - ·±Å¸ÀÓ(Runtime) : ÇÁ·Î±×·¥ÀÌ ½ÇÇà ÁßÀÎ »óÅÂ
		// - ½ÇÇà Áß ¹ß»ıÇÏ´Â ¿¡·¯
		// - ¿¹¿Ü(Exception)
		// - ÀÔÃâ·Â ÀÛ¾÷(¿ÜºÎ ÀÚ¿ø¿¡ ´ëÇÑ)
		// - ¹ß»ı ºóµµ ³ôÀ½(¿¹»ó Èûµë - °æÇè ºÎÁ·ÇÏ¸é)
		// - ¼öÁ¤ ³­ÀÌµµ ³ôÀ½(¹ß°ß ¸øÇÏ¸é.. ³²¾ÆÀÖ¾î¼­..)

		//3. ³í¸® ¿¡·¯
		// - ÄÄÆÄÀÏO, ½ÇÇàO, °á°ú ÀÌ»ó
		//System.out.println(10 - 20);



		//2. ºñ±³ ¿¬»êÀÚ
		// - >, >=, <, <=, ==(equal), !=(not equal)
		// - 2Ç× ¿¬»êÀÚ
		// - ÇÇ¿¬»êÀÚµéÀÇ ºñ±³ ¿ìÀ§¸¦ ¹İÈ¯ÇÏ´Â ¿ªÇÒ
		// - ¿¬»êÀÇ °á°ú°¡ Ç×»ó booleanÀ¸·Î ¹İÈ¯(***)

		int c = 10;
		int d = 5;

		System.out.println(c > d);
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);


		//»ç¿ëÀÚÀÇ ÀÔ·Â ¿Ã¹Ù¸¥Áö °Ë»ç? -> À¯È¿¼º °Ë»ç(Validation)
		
		//»ç¿ëÀÚ ³ªÀÌ ÀÔ·Â : 25
		int age = 15;

		System.out.println(age >= 19);
		//System.out.println(19 <= age);
		
		//»ç¿ëÀÚ ¹®ÀÚ ÀÔ·Â : g
		// -> ¿µ¼Ò¹®ÀÚ¸¸ ÀÔ·Â °¡´É
		char c1 = 'A';

		//a(97) ~ z(122)
		System.out.println((int)c1 >= 97);
		System.out.println((int)c1 <= 122);


		c1 = 'c'; //¼ıÀÚ¸¸ ÀÔ·Â °¡´É

		//0(48) ~ 9(57)
		System.out.println((int)c1 >= 48);
		System.out.println((int)c1 <= 57);


		c1 = 'c'; //ÇÑ±Û¸¸ ÀÔ·Â °¡´É

		//°¡ ~ Èş
		System.out.println((int)c1 >= (int)'°¡');
		System.out.println((int)c1 <= (int)'ÆR');

		System.out.println(c1 >= '°¡');
		System.out.println(c1 <= 'ÆR');
		

		//==, !=
		// -> ¹®ÀÚ¿­ ºñ±³
		//System.out.println("È«±æµ¿" > "¾Æ¹«°³");
		System.out.println("È«±æµ¿" == "¾Æ¹«°³"); //XXX
		System.out.println("È«±æµ¿" == "È«±æµ¿"); //XXX

		
		String name1 = "È«±æµ¿";
		String name2 = "È«±æµ¿";
		String name3 = "È«";
		name3 = name3 + "±æµ¿";

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));



		//3. ³í¸® ¿¬»êÀÚ
		// - &&(and), ||(or), !(not)
		// - ÇÇ¿¬»êÀÚ¸¦ °¡Áö°í Æ¯Á¤ ±ÔÄ¢¿¡ µû¶ó Á¤ÇØÁø °á°ú°ªÀ» ¹İÈ¯
		// - &&, || : 2Ç× ¿¬»êÀÚ
		// - ! : 1Ç× ¿¬»êÀÚ
		// - ÇÇ¿¬»êÀÚ´Â ¹İµå½Ã boolean
		// - ¿¬»êÀÇ °á°ú´Â booleanÀ» ¹İÈ¯

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		//³í¸®¿¬»êÀÚ + ºñ±³¿¬»êÀÚ
		//age : 19 ÀÌ»ó ~ 60 ¹Ì¸¸
		// 19 <= age < 60
		age = 100;

		//System.out.println(19 <= age < 60);
		System.out.println(19 <= age && age < 60);
		System.out.println(age >= 19 && age < 60);
		System.out.println((age >= 19) && (age < 60));

		//¿¬»êÀÚ ¿ì¼± ¼øÀ§
		// - »ê¼ú > ºñ±³ > ³í¸®
		//¿¬»êÀÚ ¹æÇâ
		// - ¿ŞÂÊ -> ¿À¸¥ÂÊ

		c1 = 'v';
		System.out.println(c1 >= '°¡' && c1 <= 'ÆR');
		System.out.println(c1 < '°¡' || c1 > 'ÆR'); //v
		System.out.println(!(c1 >= '°¡' && c1 <= 'ÆR')); //v

		//¼îÇÎ¸ô ÀÇ·ù
		// - »¡, ÆÄ, ³ë
		String color = "black";

		System.out.println(color.equals("red") || color.equals("blue") || color.equals("yellow"));


		//4. ´ëÀÔ(ÇÒ´ç) ¿¬»êÀÚ
		// - =
		// - +=, -=, *=, /=, %= //º¹ÇÕ ´ëÀÔ ¿¬»êÀÚ
		// - LValue(º¯¼ö) = RValue(»ó¼ö, º¯¼ö)
		// - LValue¿Í RValueÀÇ ÀÚ·áÇü ¹İµå½Ã µ¿ÀÏ
		// - ´ëÀÔ ¿¬»êÀÚ´Â ¸ğµç ¿¬»êÀÚ¸¦ Åëµé¾î¼­ ¿¬»êÀÚ ¿ì¼± ¼øÀ§°¡ °¡Àå ³·´Ù.
		// - ¿¬»êÀÚ ¹æÇâÀÌ ¿À¸¥ÂÊ -> ¿ŞÂÊ ÀÌ´Ù.

		int n = 10;

		n = n + 1; //´©Àû
		System.out.println(n); //11
		
		n += 1;
		System.out.println(n); //12

		n = n - 3;
		System.out.println(n); //9

		n -= 3;
		System.out.println(n); //6

		n = 100 - n;
		n -= 100; //n = n - 100

		n = n * 2;
		System.out.println(n); //12

		n *= 2;
		System.out.println(n); //24

		n = n / 3;
		System.out.println(n); //8

		n /= 3;
		System.out.println(n); //2

		n = 10;
		n = n % 3;
		System.out.println(n); //1

		n = 10;
		n %= 3;
		System.out.println(n); //1



		//5. Áõ°¨ ¿¬»êÀÚ
		// - ++(Áõ°¡), --(°¨¼Ò)
		// - 1Ç× ¿¬»êÀÚ(´ÜÇ× ¿¬»êÀÚ)
		// - ¼ıÀÚÀÎ ÇÇ¿¬»êÀÚ¸¦ +1, -1
		// - ¿¬»êÀÚÀÇ °á°ú°¡ °æ¿ì¿¡ µû¶ó ´Ş¶óÁø´Ù.(¿¬»êÀÚ ¿ì¼± ¼øÀ§°¡ º¯ÇÔ)
		// - ++n : ÀüÀ§ ¹èÄ¡(ÀüÄ¡). ¿¬»êÀÚ ¿ì¼± ¼øÀ§ °¡Àå ³ôÀ½
		// - n++ : ÈÄÀ§ ¹èÄ¡(ÈÄÄ¡). ¿¬»êÀÚ ¿ì¼± ¼øÀ§ °¡Àå ³·À½

		n = 10;

		n = n + 1;

		n += 1;

		++n;

		System.out.println(n);

		n = n - 1;

		n -= 1;

		--n;

		System.out.println(n);


		n = 10;

		sum = 10 + ++n;

		++n; //n++;
		sum = 10 + n;

		
		sum = 10 + n++;

		sum = 10 + n;
		++n; //n++;

		System.out.println(sum);
		System.out.println(n);

		int o = 10;
		System.out.println(--o-o--);// --o - o--
		
		//--o;
		//o - o;
		//--o;



		//6. Á¶°Ç ¿¬»êÀÚ
		// - A ? B : C
		// - 3Ç× ¿¬»êÀÚ
		// - A : boolean
		// - B, C : »ó¼ö or º¯¼ö or Ç¥Çö½Ä -> °ª
		// - B¿Í C´Â ÀÚ·áÇüÀÌ µ¿ÀÏÇØ¾ß ÇÑ´Ù.
		// - if¹® ¿ªÇÒ°ú À¯»ç

		age = 15;

		//°á°ú? ¼ºÀÎ or ¹Ì¼º³âÀÚ
		String result = age >= 19 ? "¼ºÀÎ" : "¹Ì¼º³âÀÚ"; 
		System.out.println(result);


		int money = age >= 19 ? 1000 : 500;
		System.out.println(money);

	}
}

















