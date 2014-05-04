package Frogger;



import Zen.Zen;

public class Truck extends Obstacle{
	
	public void draw() {
		Zen.setColor("grey");
		Zen.fillRect(getX() - 30,  getY() - 20,  60,  40);
		Zen.setColor("orange");
		Zen.fillRect(getX() - 30,  getY() - 15,  15,  30);
		
		
	}
}
