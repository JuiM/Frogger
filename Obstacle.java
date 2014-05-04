package Frogger;

import Zen.Circle;
import Zen.Zen;
import Zen.ZenSprite;

public class Obstacle extends ZenSprite{
	
	boolean goingLeft = false;

	@Override
	public void draw() {
		Circle c = new Circle(50);
		c.set(getX(),getY());
		c.setColor("red");
		Zen.draw(c);
	}

	@Override
	public void move() {
		if(distanceTo(Game.frog) < 50){
			Game.frog.kill();
		}
		if(goingLeft){
			changeX(-1 * getSpeed());
			if(getX() < -100){
				setX(900);
			}
		}
		else{
			changeX(getSpeed());
			if(getX() > 900){
				setX(-100);
			}
		}
	}
	
	public int getSpeed(){
		return 3;
	}
	public void goLeft(){
		goingLeft = true;
	}
	

}
