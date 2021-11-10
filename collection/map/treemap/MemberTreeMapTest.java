package collection.map.treemap;

import collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member2 memberPark = new Member2(1001, "�ڹ���");
		Member2 memberSong = new Member2(1002, "������");
		Member2 memberKim = new Member2(1003, "������");
		Member2 memberSon = new Member2(1004, "�տ���");
		
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberSong);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberSon);
		
		memberTreeMap.showAllMember();
		
		System.out.println("====��ü ����======");
		memberTreeMap.removeMember(1002);
		memberTreeMap.removeMember(memberSon.getMemberid());
		memberTreeMap.showAllMember();
	}

}
