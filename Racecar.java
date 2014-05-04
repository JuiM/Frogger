package Frogger;

import Zen.Zen;

public class Racecar extends Obstacle{
	
	public void draw(){
		Zen.setColor("red");
		Zen.fillRect(getX() -20, getY() -10, 40,20);
		Zen.setColor("brown");
		Zen.fillRect(getX() - 12, getY() - 8, 24, 16);
		Zen.setColor("black");
		Zen.fillRect(getX() - 16, getY() - 12, 6, 2);
		Zen.fillRect(getX() - 16, getY() + 10, 6, 2);
		Zen.fillRect(getX() + 10, getY() - 12, 6, 2);
		Zen.fillRect(getX() + 10, getY() + 10, 6, 2);
		
		
	}
	
	public int getSpeed() {
		return 8;
	}
}
