package ex;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	//스케너 객체 생성
		int[] arr = new int[10];		// arr 배열 변수에 정수 값 10 개를 받는 배열 변수 선언
		
		System.out.println(" 양의 정수 10 개를 입력 하세요. 공백으로 구분 >> "); // 문자열 출력. 
		
		for ( int i = 0 ; i< arr.length ; i++) {	// 인풋받은 정수 10개를  배열의 각 방에 저장 
			arr[i] = scanner.nextInt();
		}
		System.out.println("3의 배수의 값은 ? ");  // for 문을 사용해서 각방의 내용을 조건 n%3 ==0
		
		for (int i =0 ; i< arr.length ; i++) {
			if (arr[i] % 3 == 0) {		// arr의 각방을 3으로 나누었을때 나머지가 0 이라면 출력
				System.out.print(arr[i] + " ");
			}
		}				
	}
}
