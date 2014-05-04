package Frogger;


import Zen.*;

public class Frog extends ZenSprite{
	Image frog;
	boolean leftPressed =false;
	boolean downPressed = false;
	boolean rightPressed =false;
	boolean upPressed = false;
	
	public Frog() {
		frog = new Image("Frogger/frog.jpg");
	}
	public void draw() {
		frog.set(getX()-30, getY() -15);
		Zen.draw(frog);
	}

	@Override
	public void move() {
		if(Zen.isKeyPressed("up") && !upPressed){
			changeY(-50);
			upPressed = true;
		}
		if(!Zen.isKeyPressed("up")){
			upPressed = false;
		}
		
		if(Zen.isKeyPressed("down") && !downPressed){
			changeY(50);
			downPressed = true;
		}
		if(!Zen.isKeyPressed("down")){
			downPressed = false;
		}
		// if the left key is pressed and we haven't already pressed it
		if(Zen.isKeyPressed("left") && !leftPressed){
			//move left
			changeX(-50);
			leftPressed = true;	
		}
		if(!Zen.isKeyPressed("left")){
			leftPressed = false;
		}
		
		if(Zen.isKeyPressed("right") && !rightPressed){
			rightPressed = true;
			changeX(50);
		}
		if(!Zen.isKeyPressed("right")){
			rightPressed = false;
		}
		
	}
	public void kill() {
		set(400,450);
		
	}

}
