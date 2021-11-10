package generic_12.restrict;

public class GenericPrinterTest {

	public static void main(String[] args) {
		System.out.println("============�ö�ƽ ���� ������======================");
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());	//��ü ����
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		plastic.doPrinting();
		plasticPrinter.printing();
		
		System.out.println("========�Ŀ�� ���� ������=============================");
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println("========�� ���� ������=============================");
		/*   �������� ���ϰ� ����Ÿ Ÿ���� üũ
		 * 
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting();
		*/
	}

}
