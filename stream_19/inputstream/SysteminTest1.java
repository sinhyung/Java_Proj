package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i ;
		
		try {
			i = System.in.read();	//�ѱ��ڸ� �о �ƽ�Ű �ڵ�� ����
									//���� ó���� �ؾ� �Ѵ�. IOException �߻�
			System.out.println(i);	//�ƽ�Ű �ڵ� ���� ���
			System.out.println((char)i);	//�ƽ�Ű �ڵ��� ���ڰ� ��µ�
			
		} catch (IOException e) {
			System.out.println(e);	//������ ���������� ���.
			//e.printStackTrace();	//�ڼ��� ���� ������ ���
		}	
		
	}

}
