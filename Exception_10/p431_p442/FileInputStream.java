package Exception_10.p431_p442;		//sec05_try_with_resources;  06 P439

public class FileInputStream implements AutoCloseable { // ���� Ŭ���� (AutoClose ��)
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
