package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// HashSet�� ���� �� ��ü�� ����
		Member memberHong = new Member (1001, "ȫ�浿");
		Member memberLee = new Member(1002, "�̼���");
		Member memberKim = new Member(1003, "��浿");		// �ߺ��� ���� ���� �� �� ����. 

		
		System.out.println("=====HashSet�� ��ü�� ����=========");
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(new Member (1010, "ȫ���"));
		memberHashSet.showAllMember();   // ����� ��ü�� ���
		
		/*
		 * Set���� ��ü�� ���� �Ҷ� �ߺ��� ���� ���� ���� �ʵ��� �ϱ� ���ؼ��� ?
		 * ��ü�� Ư�� ������ ���ؼ� equals() �޼ҵ带 ������ ����� �մϴ�. 
		 */
		
		System.out.println("=======HashSet�� �ߺ��� ���� ���� ======");
		Member memberKim2 = new Member(1003, "��浿");		// equals() �޼ҵ尡 ������ �Ǿ��ִ�. 
		Member memberKim3 = new Member(1003, "��浿");
		memberHashSet.addMember(memberKim2);	// HashSet�� �ߺ��� ���� �߰� 
		memberHashSet.addMember(memberKim3);		
		memberHashSet.showAllMember();
		
		System.out.println("========HashSet���� ��ü ���� =====================");
		memberHashSet.removeMember(1002);
		memberHashSet.removeMember(memberKim.getMemberid());
		memberHashSet.showAllMember();
		
	}
	

}
