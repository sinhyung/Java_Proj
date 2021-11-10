package ex.chap05.add;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise09 {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		boolean run = true;			//종료 전까지 루프
		int studentNum = 0 ;
		//int [] scores = null;
		Scanner scanner = new Scanner ( System.in);
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=================================================");
			System.out.println("선택 >");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo ==1 ) {	// 학생수를 입력 받고, 배열의 크기를 입력 받은 학생수로 지정. 
				//작성위치
				System.out.println ("학생수 입력 >");
				studentNum = scanner.nextInt();
				//arr = new ArrayList<Student>(studentNum) ;	// ArrayList의 방크기 설정
				System.out.println(" ArrayList 방크기 설정 완료");
				System.out.println(arr.size());
				
			}else if(selectNo == 2) { //각각의 배열 방에 학생들의 점수를 입력 
				// 작성위치
				if (studentNum == 0 ) {
					System.out.println( "1번을 선택 해서 학생수를 먼저 입력하세요. >>");
				}else {
					System.out.println(" 점수를 입력하세요. ");
					for ( int i = 0 ; i < studentNum; i++) {
						Student student = new Student();
						System.out.println ( (i + 1) +" 번째방에 점수 입력" );
						student.score = scanner.nextInt();
						arr.add(student);		// ArrayList에 객체를 저장 						
						System.out.println("저장 완료");						
					}										
				}
				
			}else if (selectNo == 3 ) {
				//작성위치
				for (int i =0 ; i <arr.size(); i++) {
					System.out.println("방번호[" + (i+1) + "] : " + arr.get(i).score);
				}
			}else if (selectNo == 4 ) {
				// 작성 위치
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0 ; i < arr.size(); i++) {
					max = (max <arr.get(i).score ) ? arr.get(i).score : max;
					sum += arr.get(i).score;
				}
				avg = (double) sum/studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
				
			}else if (selectNo == 5 ) {
				// 작성 위치
				run = false;
			}
		}
				
		System.out.println("프로그램 종료");
	}

}
