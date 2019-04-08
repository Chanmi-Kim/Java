/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항4. 현재 시간을 출력하는 메소드를 선언하고 호출하시오.

출력]
현재 시간 : 10시 30분 25초

추가사항]
현재 시간을 오전/오후로 출력하시오.

*/
import java.util.Date;

class Ex19_4 
{
    public static void main(String[] args) 
    {
        nowTime_AMPM();
    }

	public static void nowTime_AMPM()
	{
		Date now = new Date();

		// 12시보다 작으면 오전, 크면 오후
		String result = now.getHours() < 12 ? "오전" : "오후"; 

		// 오전/오후 출력을 위해 현재 시간에서 12시간 빼고 result 붙여서 출력
        System.out.printf("현재 시간 : %s %d시 %d분 %d초\n", result, now.getHours() - 12, now.getMinutes(), now.getSeconds());
	}
}
