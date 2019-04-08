/*

프로그램명 : 9가지 자료형 만들기 과제
작성자 : xxHANIxx
작성일자 : 2019.01.30

*/

class Ex08_Variable
{
	public static void main(String[] args) 
	{
		// Ex08_Variable.java // 과제
		// 1. 주변의 데이터 찾기
		// 2. 적당할 자료형 선정
		// 3. 변수 생성 + 값 할당(상수)
		// 4. 출력(문장 생성)
		
		// 1. 9가지 자료형 x 10개씩
		// 
		/*
		ex.
		byte oz;
		oz = 16;

		System.out.println("오늘 마신 커피는 " + oz + "oz입니다.");
		*/
	
		// 1. byte
		System.out.println("\n1. byte");

		byte appleNumber = 10;
		System.out.println("\t01) 사과 한 박스에 " + appleNumber + "개가 들어있습니다.");

		byte orangeNumber = 15;
		System.out.println("\t02) 귤 한 박스에 " + orangeNumber + "개가 들어있습니다.");

		byte grapeNumber = 10;
		System.out.println("\t03) 포도 하나에 " + grapeNumber + "송이가 들어있습니다.");

		byte pineappleNumber = 6;
		System.out.println("\t04) 파인애플 한 박스에 " + pineappleNumber + "개가 들어있습니다.");

		byte mangoNumber = 5;
		System.out.println("\t05) 망고 한 봉지에 " + mangoNumber + "개가 들어있습니다.");

		byte strawberryNumber = 12;
		System.out.println("\t06) 딸기 한 팩에 " + strawberryNumber + "개가 들어있습니다.");

		byte blueberryNumber = 13;
		System.out.println("\t07) 블루베리 한 통에 " + blueberryNumber + "개가 들어있습니다.");

		byte avocadoNumber = 14;
		System.out.println("\t08) 아보카도 한 박스에 " + avocadoNumber + "개가 들어있습니다.");

		byte lemonNumber = 4;
		System.out.println("\t09) 레몬 한 박스에 " + lemonNumber + "개가 들어있습니다.");

		byte apricotNumber = 10;
		System.out.println("\t10) 살구 한 팩에 " + apricotNumber + "개가 들어있습니다.");
	
		// 2. short
		System.out.println("\n2. short");

		short appleCost = 20000;
		System.out.println("\t01) 사과 한 박스에 " + appleCost + "원입니다.");

		short orangeCost = 15000;
		System.out.println("\t02) 귤 한 박스에 " + orangeCost + "원입니다.");

		short grapeCost = 8000;
		System.out.println("\t03) 포도 한 박스에 " + grapeCost + "원입니다.");

		short pineappleCost = 16000;
		System.out.println("\t04) 파인애플 한 박스에 " + pineappleCost + "원입니다.");

		short mangoCost = 5000;
		System.out.println("\t05) 망고 한 봉지에 " + mangoCost + "원입니다.");

		short strawberryCost = 12000;
		System.out.println("\t06) 딸기 한 팩에 " + strawberryCost + "원입니다.");

		short blueberryCost = 13000;
		System.out.println("\t07) 블루베리 한 통에 " + blueberryCost + "원입니다.");

		short avocadoCost = 14000;
		System.out.println("\t08) 아보카도 한 박스에 " + avocadoCost + "원입니다.");

		short lemonCost = 4000;
		System.out.println("\t09) 레몬 한 박스에 " + lemonCost + "원입니다.");

		short apricotCost = 10000;
		System.out.println("\t10) 살구 한 팩에 " + apricotCost + "원입니다.");
	
		// 3. int
		System.out.println("\n3. int");

		int appleQuota = 55;
		System.out.println("\t01) 사과 한 박스에 " + appleQuota + "개까지 넣을 수 있습니다.");

		int orangeQuota = 100;
		System.out.println("\t02) 귤 한 박스에 " + orangeQuota + "개까지 넣을 수 있습니다.");

		int grapeQuota = 30;
		System.out.println("\t03) 포도 한 박스에 " + grapeQuota + "개까지 넣을 수 있습니다.");

		int pineappleQuota = 10;
		System.out.println("\t04) 파인애플 한 박스에 " + pineappleQuota + "개까지 넣을 수 있습니다.");

		int mangoQuota = 20;
		System.out.println("\t05) 망고 한 봉지에 " + mangoQuota + "개까지 넣을 수 있습니다.");

		int strawberryQuota = 60;
		System.out.println("\t06) 딸기 한 팩에 " + strawberryQuota + "개까지 넣을 수 있습니다.");

		int blueberryQuota = 80;
		System.out.println("\t07) 블루베리 한 통에 " + blueberryQuota + "개까지 넣을 수 있습니다.");

		int avocadoQuota = 50;
		System.out.println("\t08) 아보카도 한 박스에 " + avocadoQuota + "개까지 넣을 수 있습니다.");

		int lemonQuota = 20;
		System.out.println("\t09) 레몬 한 박스에 " + lemonQuota + "개까지 넣을 수 있습니다.");

		int apricotQuota = 100;
		System.out.println("\t10) 살구 한 팩에 " + apricotQuota + "개까지 넣을 수 있습니다.");
		
		// 4. long
		System.out.println("\n4. long");

		long appleSales = 41300;
		System.out.println("\t01) 사과 매출액은 " + appleSales + "원입니다.");

		long orangeSales = 32100;
		System.out.println("\t02) 귤 매출액은 " + orangeSales + "원입니다.");

		long grapeSales = 423000;
		System.out.println("\t03) 포도 매출액은 " + grapeSales + "원입니다.");

		long pineappleSales = 784000;
		System.out.println("\t04) 파인애플 매출액은 " + pineappleSales + "원입니다.");

		long mangoSales = 168020;
		System.out.println("\t05) 망고 매출액은 " + mangoSales + "원입니다.");

		long strawberrySales = 850060;
		System.out.println("\t06) 딸기 매출액은 " + strawberrySales + "원입니다.");

		long blueberrySales = 320080;
		System.out.println("\t07) 블루베리 매출액은 " + blueberrySales + "원입니다.");

		long avocadoSales = 321000;
		System.out.println("\t08) 아보카도 매출액은 " + avocadoSales + "원입니다.");

		long lemonSales = 7520020;
		System.out.println("\t09) 레몬 매출액은 " + lemonSales + "원입니다.");

		long apricotSales = 46500;
		System.out.println("\t10) 살구 매출액은 " + apricotSales + "원입니다.");

		// 5. float
		System.out.println("\n5. float");

		float kakaoUsers = 1.41365749F;
		System.out.println("\t01) 전체 앱 사용자 중 카카오톡 앱의 사용자의 비율은 " + kakaoUsers + "입니다.");

		float facebookUsers = 0.6546451F;
		System.out.println("\t02) 전체 앱 사용자 중 페이스북 앱의 사용자의 비율은 " + facebookUsers + "입니다.");

		float instagramUsers = 0.652534F;
		System.out.println("\t03) 전체 앱 사용자 중 인스타그램 앱의 사용자의 비율은 " + instagramUsers + "입니다.");

		float snowUsers = 0.643216F;
		System.out.println("\t04) 전체 앱 사용자 중 스노우 앱의 사용자의 비율은 " + snowUsers + "입니다.");

		float foodieUsers = 0.423547F;
		System.out.println("\t05) 전체 앱 사용자 중 푸디 앱의 사용자의 비율은 "+ foodieUsers + "입니다.");

		float lineUsers = 0.321265468F;
		System.out.println("\t06) 전체 앱 사용자 중 라인 앱의 사용자의 비율은 " + lineUsers + "입니다.");

		float photowonderUsers = 0.1232454F;
		System.out.println("\t07) 전체 앱 사용자 중 포토원더 앱의 사용자의 비율은 " + photowonderUsers + "입니다.");

		float nateonUsers = 0.32156F;
		System.out.println("\t08) 전체 앱 사용자 중 네이트온 앱의 사용자의 비율은 " + nateonUsers + "입니다.");

		float skypeUsers = 0.0126345F;
		System.out.println("\t09) 전체 앱 사용자 중 스카이프 앱의 사용자의 비율은 " + skypeUsers + "입니다.");

		float telegramUsers = 0.0152354F;
		System.out.println("\t10) 전체 앱 사용자 중 텔레그램 앱의 사용자의 비율은 " + telegramUsers + "입니다.");

		// 6. double
		System.out.println("\n6. double");

		double kakaoDailyUsers = 6564.231321654;
		System.out.println("\t01) 카카오톡 앱의 평균 DAU는 " + kakaoDailyUsers + "입니다.");

		double facebookDailyUsers = 65432.3216345;
		System.out.println("\t02) 페이스북 앱의 평균 DAU는 " + facebookDailyUsers + "입니다.");

		double instagramDailyUsers = 268464.1231;
		System.out.println("\t03) 인스타그램 앱의 평균 DAU는 " + instagramDailyUsers + "입니다.");

		double snowDailyUsers = 98735.321654654;
		System.out.println("\t04) 스노우 앱의 평균 DAU는 " + snowDailyUsers + "입니다.");

		double foodieDailyUsers = 58432131.136545;
		System.out.println("\t05) 푸디 앱의 평균 DAU는 "+ foodieDailyUsers + "입니다.");

		double lineDailyUsers = 654684.256864;
		System.out.println("\t06) 라인 앱의 평균 DAU는 " + lineDailyUsers + "입니다.");

		double photowonderDailyUsers = 2512135.1231123;
		System.out.println("\t07) 포토원더 앱의 평균 DAU는 " + photowonderDailyUsers + "입니다.");

		double nateonDailyUsers = 684684321.123121;
		System.out.println("\t08) 네이트온 앱의 평균 DAU는 " + nateonDailyUsers + "입니다.");

		double skypeDailyUsers = 213.12648564;
		System.out.println("\t09) 스카이프 앱의 평균 DAU는 " + skypeDailyUsers + "입니다.");

		double telegramDailyUsers = 231.1235768;
		System.out.println("\t10) 텔레그램 앱의 평균 DAU는 " + telegramDailyUsers + "입니다.");


		// 7. char
		System.out.println("\n7. char");

		char _2010popularSurname = '최';
		System.out.println("\t01) 2010년에 가장 많은 성씨는 " + _2010popularSurname + "씨입니다.");

		char _2011popularSurname = '이';
		System.out.println("\t02) 2011년에 가장 많은 성씨는 " + _2011popularSurname + "씨입니다.");

		char _2012popularSurname = '박';
		System.out.println("\t03) 2012년에 가장 많은 성씨는 " + _2012popularSurname + "씨입니다.");

		char _2013popularSurname = '김';
		System.out.println("\t04) 2013년에 가장 많은 성씨는 " + _2013popularSurname + "씨입니다.");

		char _2014popularSurname = '설';
		System.out.println("\t05) 2014년에 가장 많은 성씨는 "+ _2014popularSurname + "씨입니다.");

		char _2015popularSurname = '남';
		System.out.println("\t06) 2015년에 가장 많은 성씨는 " + _2015popularSurname + "씨입니다.");

		char _2016popularSurname = '엄';
		System.out.println("\t07) 2016년에 가장 많은 성씨는 " + _2016popularSurname + "씨입니다.");

		char _2017popularSurname = '채';
		System.out.println("\t08) 2017년에 가장 많은 성씨는 " + _2017popularSurname + "씨입니다.");

		char _2018popularSurname = '조';
		System.out.println("\t09) 2018년에 가장 많은 성씨는 " + _2018popularSurname + "씨입니다.");

		char _2019popularSurtname = '주';
		System.out.println("\t10) 2019년에 가장 많은 성씨는 " + _2019popularSurtname + "씨입니다.");


		// 8. boolean
		System.out.println("\n8. boolean");

		boolean blueberryNumberJudge = true;
		System.out.println("\t01) 블루베리 한 통에 13개가 들어있습니다. \t\t(판단 : " + blueberryNumberJudge + ")");

		boolean snowDailyUsersJudge = true;
		System.out.println("\t02) 스노우 앱의 평균 DAU는 98735.321654654입니다. \t(판단 : " + snowDailyUsersJudge + ")");

		boolean mangoSalesJudge = false;
		System.out.println("\t03) 망고 매출액은 15000원입니다. \t\t\t(판단 : " + mangoSalesJudge + ")");

		boolean lemonQuotaJudge = false;
		System.out.println("\t04) 레몬 한 박스에 18개까지 넣을 수 있습니다. \t\t(판단 : " + lemonQuotaJudge + ")");

		boolean strawberryNumberJudge = true;
		System.out.println("\t05) 딸기 한 팩에 12개가 들어있습니다. \t\t\t(판단 : " + strawberryNumberJudge + ")");

		boolean avocadoQuotaJudge = false;
		System.out.println("\t06) 아보카도 한 박스에 30개까지 넣을 수 있습니다. \t(판단 : " + avocadoQuotaJudge + ")");

		boolean _2016popularNameJudge = true;
		System.out.println("\t07) 2016년에 가장 인기 많은 이름은 설아입니다. \t\t(판단 : " + _2016popularNameJudge + ")");

		boolean _2017popularNameJudge = false;
		System.out.println("\t08) 2017년에 가장 인기 많은 이름은 송이입니다. \t\t(판단 : " + _2017popularNameJudge + ")");

		boolean _2018popularNameJudge = true;
		System.out.println("\t09) 2018년에 가장 인기 많은 이름은 현영입니다. \t\t(판단 : " + _2018popularNameJudge + ")");

		boolean _2019popularNameJudge = true;
		System.out.println("\t10) 2019년에 가장 인기 많은 이름은 유리입니다. \t\t(판단 : " + _2019popularNameJudge + ")");
		
		// 9. String
		System.out.println("\n9. String");

		String _2010popularName = "예은";
		System.out.println("\t01) 2010년에 가장 인기 많은 이름은 " + _2010popularName + "입니다.");

		String _2011popularName = "지현";
		System.out.println("\t02) 2011년에 가장 인기 많은 이름은 " + _2011popularName + "입니다.");

		String _2012popularName = "수지";
		System.out.println("\t03) 2012년에 가장 인기 많은 이름은 " + _2012popularName + "입니다.");

		String _2013popularName = "예슬";
		System.out.println("\t04) 2013년에 가장 인기 많은 이름은 " + _2013popularName + "입니다.");

		String _2014popularName = "은희";
		System.out.println("\t05) 2014년에 가장 인기 많은 이름은 "+ _2014popularName + "입니다.");

		String _2015popularName = "보라";
		System.out.println("\t06) 2015년에 가장 인기 많은 이름은 " + _2015popularName + "입니다.");

		String _2016popularName = "설아";
		System.out.println("\t07) 2016년에 가장 인기 많은 이름은 " + _2016popularName + "입니다.");

		String _2017popularName = "송이";
		System.out.println("\t08) 2017년에 가장 인기 많은 이름은 " + _2017popularName + "입니다.");

		String _2018popularName = "현영";
		System.out.println("\t09) 2018년에 가장 인기 많은 이름은 " + _2018popularName + "입니다.");

		String _2019popularName = "유리";
		System.out.println("\t10) 2019년에 가장 인기 많은 이름은 " + _2019popularName + "입니다.");

	}
}
