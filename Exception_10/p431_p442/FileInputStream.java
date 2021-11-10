package Exception_10.p431_p442;		//sec05_try_with_resources;  06 P439

public class FileInputStream implements AutoCloseable { // 구현 클래스 (AutoClose 를)
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
