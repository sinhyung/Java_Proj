package inheritance_07.abstract_gamelevel;

public class Player {
	private PlayerLevel level ;  // PlayerLevel : ����Ÿ Ÿ��, level : �ν��Ͻ����� 
	
	public Player () {	//������
		level = new BeginerLevel();		// ��ü ���� 
		level.showLevelMassage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradLevel (PlayerLevel level) { //��ĳ���� 
		this.level = level;
		level.showLevelMassage();
	}	
	public void play ( int count) {
		level.go(count);
	}
}
