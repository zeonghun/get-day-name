// 문제
// 2016년(윤년) 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
// 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수를 완성하세요.

import java.util.Scanner;

/**
 * @ (non-javadoc)
 * 
 * @author zeonghun
 * @since 230313
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getDay getday = new getDay();

        System.out.printf("월을 입력하세요: ");
        int a = sc.nextInt();
        System.out.printf("일을 입력하세요: ");
        int b = sc.nextInt();

        String result = getday.getday(a,b);
        System.out.println(result);

        sc.close();
    }
}
