package collection;

public class Member {
			//Comparable : TreeSet���� �ߺ��� ���ְ� ������ ���ִ� �������̽� .
	
	private int memberid;			// ID
	private String memberName;		// �̸�
	
	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {return memberid;}
	public void setMemberid(int memberid) {this.memberid = memberid;}
	public String getMemberName() {return memberName;}
	public void setMemberName(String memberName) {this.memberName = memberName;}
	
	@Override		// ��ü�� ����Ʈ(���)�ϸ�, Object(toString() : ��ü�� �ּ��� ���),
					// ������ 
	public String toString () {
		return memberName  + " ȸ������ ���̵�� " + memberid + "�Դϴ�." ;
	}

		//Object�� equals �޼ҵ�� ��ü�� �ּҸ� �� : True, False�� ����
					//������ : ��ü���� memberid�� �� : True, False ����
	public String equalss(Object obj) {		//��ĳ���� : Object
		if (obj instanceof Member) {
			Member member = (Member) obj;	//�ٿ�ĳ���� : Member 
			if (this.memberid == member.memberid) {	// ������ memberid �� ���� ��ü�� memberid
				return "������ ȸ��(��ü) �Դϴ�. (memberid�� �����ϴ�.)";
			}else {
				return "�ٸ� ȸ��(��ü)�Դϴ�. ";
			}				
		}
		//System.out.println("ȸ�� ������ ã�� �� �����ϴ�. ");
		return "ȸ�� ������ ã�� �� �����ϴ�.";
	}
	
	@Override
	public boolean equals(Object obj) {		//��ĳ���� : Object
		if (obj instanceof Member) {
			Member member = (Member) obj;	//�ٿ�ĳ���� : Member 
			if (this.memberid == member.memberid) {	// ������ memberid �� ���� ��ü�� memberid
				return true;
			}else {
				return false;
			}				
		}
		//System.out.println("ȸ�� ������ ã�� �� �����ϴ�. ");
		return false;
	}
	
	
	

	@Override
	public int hashCode() {
		return memberid;
	}

	public int compareTo (Member member) {
		return (this.memberid - member.memberid ); 				//���� ���� ���� ( a ~ z )
		//	return (this.memberid - member.memberid ) * (-1) ;	//�������� ����  ( z ~ a )
	}
	
	
	
	
	

	
}
