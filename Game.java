package Frogger;

import Zen.*;
public class Game extends ZenGame{

	public static final int FAST = 5;
	public static final int MEDIUM = 4;
	public static final int SLOW = 3;
	public static final int VERY_SLOW = 2;

	public static int speed = 3;
	static Frog frog;


	public static void main(String[]args){
		Game game = new Game();
		game.setSize(800,500);
		game.setName("frogger");
		game.run();
	}

	@Override
	public void setup() {
		frog = new Frog();
		frog.set(400,450);
		addSprite(frog);
		
		Racecar race = new Racecar();
		race.set(0,400);
		addSprite(race);
		
		for(int x = 0 ; x <= 666 ; x+=333){
		Truck obs = new Truck();
		obs.set(x,300);
		addSprite(obs);
		}
	}

	public void drawLanes(){
		Zen.setColor("yellow");
		Zen.drawLine(0, 225, 800, 225);
		Zen.drawLine(0,226,800,226);
		Zen.drawLine(0, 229, 800, 229);
		Zen.drawLine(0,230,800,230);
		for(int y = 275; y<= 375; y+=50){
			for(int x = 20; x <= 780; x+=40){
				Zen.drawLine(x,y, x+20,y);
				Zen.drawLine(x,y+1, x+20, y+1);
				Zen.drawLine(x, y+2, x+20, y+2);

			}
		}
		Zen.drawLine(0, 425, 800, 425);
		Zen.drawLine(0, 426, 800, 426);
		Zen.drawLine(0, 429, 800, 429);
		Zen.drawLine(0, 430, 800, 430);
	}
	public void drawBackground(){
		Zen.setBackground("light gray");
		Zen.setColor("blue");
		Zen.fillRect(0, 0,800,200);
		Zen.setColor("green");
		Zen.fillRect(0,450,800,50);
	}
	public void loop() {
		drawBackground();
		drawLanes();
	}
}
