package selAug2021week1.day2;


public class Mykid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMobile kidObj = new MyMobile();
		float amps = kidObj.amps;
		System.out.println(" Amps value is :" + amps);
	
		kidObj.makeCalls();
		kidObj.takePics();
	//	kidObj.payMoney();  private method cannot be accesed

	}

}

