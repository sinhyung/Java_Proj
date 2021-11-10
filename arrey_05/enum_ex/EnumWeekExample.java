package arrey_05.enum_ex;
import java.util.Calendar;
public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();	//�޼ҵ带 ȣ���ؼ� ��� ��ü ����, �̱���
						// getInstance() �޼ҵ�� static ���� ���� . 
		int week = cal.get(Calendar.DAY_OF_WEEK); // ������ ���ڷ� ��� 
						// �Ͽ��� (1), ��(2), ȭ(3), ��(4), ��(5), ��(6), ��(7)
		System.out.println(week);
		
		switch (week) {
		case 1 : today = Week.SUNDAY ; break;
		case 2 : today = Week.MONDAY ; break;
		case 3 : today = Week.TUESDAY ; break;
		case 4 : today = Week.WEDNESDAY ; break;
		case 5 : today = Week.THURSDay ; break;
		case 6 : today = Week.FRIDAY ; break;
		case 7 : today = Week.SATURDAY ; break;		
		}
		System.out.println( "������ ������ : " + today + "�Դϴ�. ");
		
		if ( today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�. ");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�. ");
		}
		
	}

}
