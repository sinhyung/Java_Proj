package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		//MemberArrayList ��ü�� �����ϴ� ���� , ArryaList<Member>�� ����.
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//Member ��ü ����
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member (1002,"�չα�");
		Member memberPark = new Member (1003, "�ڼ���");		
		Member memberHong = new Member (1004, "ȫ�浿");
		Member memberSon2 = new Member (1002,"�չα�");	// �ߺ��� ���� �����
		Member MemberPark2 = new Member (1003, "�ڼ���" );
		
		memberArrayList.addMember(memberLee);	//index 0	//ArrayList�� ��ü�� �� �濡 ����
		memberArrayList.addMember(memberSon);	//index 1
		memberArrayList.addMember(memberPark);	//index 2
		memberArrayList.addMember(memberHong);	//index 3
		memberArrayList.addMember(memberSon2);	//index 4
		/*
		 * ArrayList �� Ư¡
		 *    1. ���ȣ (Index) , ���������� ���� 
		 *    2. �ߺ��� ���� ���� �� �� �ִ�. 
		 *    3. ���� ������ ������ �þ��. (������)
		 *    4. ������ ��� ���� ���� ���� �ڵ����� ���´�. 
		 *    5. Ư���濡 ���� �������� �ڵ����� ���� �ڷ� �з�����. 
		 */
		
		memberArrayList.showAllMember();	//ArrayList ���� ��� �ɹ��� ���
		memberArrayList.addMember2(3, MemberPark2);	//Index 3�� �濡 MemberPark2 ����
		memberArrayList.showAllMember();
		
		
		System.out.println("======�ɹ� ��(equalss() �޼ҵ� ���==========");
		System.out.println(memberSon.equalss(memberLee));
		System.out.println(memberSon.equalss(memberSon2));
		
		System.out.println("====ArrayList�� ���� ���� =====");
		memberArrayList.removeMember(1003);
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
		
		
		
		
		
				
		
	}

}
