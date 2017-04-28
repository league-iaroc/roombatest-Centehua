package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		for (int i = 0; i <8; i++) {
		driveDirect(500,500);
		sleep(2000);
		driveDirect(0,0);
		driveDirect(300,300);
		driveDirect(-70,50);
		sleep(2000);	
		driveDirect(0,0);
		}
		
		
	}

	public void loop()
	
	{
	}
}
