package inheritance_07.abstract_gamelevel;

public class PlayerEx {

	public static void main(String[] args) {
		
		Player player = new Player();		//�ʺ��� ����
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();  // �߱��� ����
		player.upgradLevel(aLevel);		
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();	// ����� ����
		player.upgradLevel(sLevel);
		player.play(3);
	}

}
