/**
 * @ 요일을 구하는 메소드
 * 
 * @param m 요일을 구할 날의 월
 * @param d 요일을 구할 날의 일
 * 
 * @author zeonghun
 * @since 230313
 */
public class getDay {
    public String getday(int m, int d) {
        String answer = "";
        int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" }; // 1월1일이 금요일이기 때문에 day[1]을 "FRI"로 설정
        int sum = 0;

        for (int i = 0; i < m - 1; i++) {
            sum += month[i];
        }
        sum += d;
        answer=day[sum%7];
        
        return answer;
    }
}
