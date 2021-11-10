package collection.treeset;

import collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member2 memberPark = new Member2(1001, "박서원");
		Member2 memberLee = new Member2(1002, "이순신");
		Member2 memberSon = new Member2(1003, "손오공");
		Member2 memberKim = new Member2(900, "김유신");	//제일 마지막에 저장됨. 
		Member2 memberSong = new Member2(930, "송유나");
		
		
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberSong);
		
		memberTreeSet.showAllMember();	
			// Comparable 인터페이스의 compareTo() 정의에 따라 정렬(오름차순 정렬, 내림차순 정열)
		
		System.out.println("=====중복된 내용 삽입(equals() 메소드가 재정의 되어야함. =====");
		Member2 memberSong2 = new Member2(930, "송유나");
		Member2 memberSong3 = new Member2(930, "송유나");
		Member2 memberSong4 = new Member2(940, "송유나");
		memberTreeSet.addMember(memberSong2);
		memberTreeSet.addMember(memberSong3);
		memberTreeSet.addMember(memberSong4);
		memberTreeSet.showAllMember();	
	}

}
