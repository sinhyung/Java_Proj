package basic_class_11.object;

import java.util.Objects;

class MyDate {
	int day;
	int month;
	int year ;
		//1. toString �޼ҵ带 ������ : " 2021��, 09��,27�� �Դϴ�. "
		//2. equals �޼ҵ� ������ : �ΰ��� ��ü�� ���� ��, ��, ���� ������ : True �� ����
	    //3. hashcode �޼ҵ� ������ : �� + �� + �⵵ 
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month,year);		// Object.hash() <== hash �ڵ带 �������� 
	}
	@Override
	public boolean equals(Object obj) {	// ��ĳ���� �Ǿ ����
		if ( obj instanceof MyDate) {	
			MyDate my = (MyDate) obj ; // �ٿ� ĳ����
			   if (this.day == my.day && this.month == my.month && this.year == my.year) {
				   return true;
			   }else {
				   return false;
			   }				
		}
		
		return false;
	}
	@Override
	public String toString() {
		return year + "��, " + month + "��, "+ day + "�� �Դϴ�.";
	}
	
}

public class EqualTest4 {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(28, 9, 2021) ;		// �����ڸ� ���ؼ� ���Ҵ�
		System.out.println(date1);
		
		MyDate date2 = new MyDate();		// ���� ��ü�� ���� �Ҵ�.
		date2.day = 28;
		date2.month = 9;
		date2.year = 2021;
		System.out.println(date2);
		
		MyDate date3 = new MyDate();		//Setter�� ���ؼ� ���Ҵ�.
		date3.setDay(29);
		date3.setMonth(9);
		date3.setYear(2021);
		System.out.println(date3);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));
		System.out.println("================");
		System.out.println("date1 �� �ؽ��ڵ� : " + date1.hashCode());
		System.out.println("date2 �� �ؽ��ڵ� : " + date2.hashCode());
		System.out.println("date3 �� �ؽ��ڵ� : " + date3.hashCode());
		
		
		//P478 : HashCodeExample.java 
				// sno, name ���� �ΰ��� ��� ���� �Ҷ� : True �� �����ϵ��� equals �޼ҵ常 ������ 
		

	}

}
