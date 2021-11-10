package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import collection.Member;		//�ٸ� ��Ű���� Ŭ������ ����ҷ��� import �� �ʿ���. 

public class MemberArrayList {
	private ArrayList<Member>  arrayList;		// ArrayList<Member> ���� arrayMember ����
	public MemberArrayList () {				//������ : �Ű����� ���� ������.
		arrayList = new ArrayList<Member>();  //ArrayList<Member> ����
	}
	public void addMember(Member member) {
		arrayList.add(member);		//�� ������ �濡 ����
	}
	public void addMember2(int a, Member member) {		// Ư�� Index �濡 ���� ����. 
		arrayList.add(a, member);	//Ư�� �濡 ���� ����
	}
	
	public boolean removeMember(int memberid) {
		
		//for ���� ����ؼ� arrayList�� ����� memberid�� �˻��ؼ� �ش� ��ü�� ����
		/*
		for (int i=0 ; i < arrayList.size(); i++) {	// ��� ���� �˻��ؼ� �ش� id�� ���� ��ü�� ã��
			Member member = arrayList.get(i);	//������ ��ü�� �����ͼ� member ������ �Ҵ�.
		int tempid = member.getMemberid(); 	// ��ü�� ����� memberid�� ���� �����ͼ� tempid�Ҵ�.
		if ( tempid == memberid) {
			arrayList.remove(i);		// ���ȣ�� ���� (index)
			return true;		//
		}
		} 
		*/
		
		Iterator<Member> ir = arrayList.iterator();
		
		while (ir.hasNext()) {	//�������� ���� ������ ����(True), �����濡 ���� ������ (False)
			Member member = ir.next();  //���� ���� ��ȯ. List���� get() �޼ҵ�� ���� 
			int tempid = member.getMemberid();
			if (tempid == memberid) {
				arrayList.remove(member);	//��ü�̸����� ���� 
				return true;
			}
		}
		
		
		
		
		
		System.out.println(memberid + "�� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
		/*
		for (Member member : arrayList) {
			System.out.println(member);
		}
		*/
		for (int i=0 ; i< arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member + " index " + i);
		}
		System.out.println();
	}

}
