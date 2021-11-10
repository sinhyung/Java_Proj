package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberArrayList = new MemberLinkedList();
		
		Member memberLee = new Member(1001, "������");		//Member��ü ����
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);	// LinkedList�� ��ü�� �߰� 
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		System.out.println("====LinkedList ��� ��ü ���======");
		memberArrayList.showAllMember();
		
		System.out.println("====LinkedList�� Ư���濡 ���� �߰��� ���=========");
		memberArrayList.addMember2(1, memberHong);
		memberArrayList.showAllMember();
		
		System.out.println("=====Ư��ȸ�� ���� =======");
		memberArrayList.removeMember(1002);		//member ���� ���� �־� ����
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
		
		
		
		
		
		
		
		
	}

}
