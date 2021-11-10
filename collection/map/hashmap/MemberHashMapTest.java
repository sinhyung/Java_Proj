package collection.map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberHong = new Member(1003, "ȫ�浿");
		Member memberSong = new Member(1004, "������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSong);
		
		System.out.println("====��ü ��ü ������ ��� ======");
		memberHashMap.showAllMember();
		
		System.out.println("====��ü ���� ���� =========");
		memberHashMap.removeMember(1003);
		memberHashMap.removeMember(memberSong.getMemberid());
		memberHashMap.showAllMember();
		
		
		
	}

}
