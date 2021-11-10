package ex.chap05.add;

public class Student {
	public int score;		// 점수를 저장하는 변수 
	
	public Student () {}
	public Student (int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
