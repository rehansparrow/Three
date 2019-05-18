package DataLib;

public class DataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDataLib dr = new TestDataLib("C:\\Users\\shaikh\\Desktop\\TestTestData.xlsx");
		System.out.println(dr.getData(0, 0, 1));
	}

}
