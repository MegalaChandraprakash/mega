
public class MyMobile {
	int screenSize;
	int cost;
	char logo;
	float amps;
	long mobileNumber;
	boolean isTouchScreen;
	String brandName;

	public void makeCalls() {
		System.out.println("Making calls");
	}


	public void takePictures()  {
		System.out.println("Taking pictures");
	}
  private void doChat() {
	  System.out.println("type chat");
  }
 public static void main (String[]args) {
	 MyMobile mobile = new MyMobile();
	 mobile.makeCalls();
	 mobile.takePictures();
	 mobile.doChat();
 }
} 

