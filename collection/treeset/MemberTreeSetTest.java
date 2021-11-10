package collection.treeset;

import collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member2 memberPark = new Member2(1001, "�ڼ���");
		Member2 memberLee = new Member2(1002, "�̼���");
		Member2 memberSon = new Member2(1003, "�տ���");
		Member2 memberKim = new Member2(900, "������");	//���� �������� �����. 
		Member2 memberSong = new Member2(930, "������");
		
		
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberSong);
		
		memberTreeSet.showAllMember();	
			// Comparable �������̽��� compareTo() ���ǿ� ���� ����(�������� ����, �������� ����)
		
		System.out.println("=====�ߺ��� ���� ����(equals() �޼ҵ尡 ������ �Ǿ����. =====");
		Member2 memberSong2 = new Member2(930, "������");
		Member2 memberSong3 = new Member2(930, "������");
		Member2 memberSong4 = new Member2(940, "������");
		memberTreeSet.addMember(memberSong2);
		memberTreeSet.addMember(memberSong3);
		memberTreeSet.addMember(memberSong4);
		memberTreeSet.showAllMember();	
	}

}
