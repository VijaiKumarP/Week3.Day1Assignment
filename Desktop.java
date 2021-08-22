package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Size - 18 inch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desktopObj=new Desktop();
		desktopObj.desktopSize();
		desktopObj.computerModel();
	}

}
