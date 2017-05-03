package myPart;

import java.awt.Color;
import java.awt.Graphics;
public class GameBar {

	public static int health = 100;
	public static int armor = 100;
	public static int bossHealth = 100;
	
	private int greenColorShift = 255;
	private int enemygreenColorShift = 255;
	
	public static int score = 0;
	private int level = 0;
	
	public void tick()
	{	
		armor = Game.boundControl(armor, 0, 100);
		health = Game.boundControl(health, 0, 100);
		greenColorShift = Game.boundControl(greenColorShift, 0, 255);
		greenColorShift = health *2;
		

		bossHealth = Game.boundControl(bossHealth, 0, 100);
		enemygreenColorShift = Game.boundControl(enemygreenColorShift, 0, 255);
		enemygreenColorShift = bossHealth *2;
	}
	
	public void render(Graphics graphics)
	{

		
		graphics.setColor(Color.gray);
		graphics.fillRect(10, 10, 200, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(Color.blue);
		graphics.fillRect(10, 10, armor*2, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(Color.white);
		graphics.drawRect(10, 10, 200, 22);  // 15 and 15 are postion on the screen
		
		
		graphics.setColor(Color.gray);
		graphics.fillRect(10, 20, 200, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(new Color(75 , greenColorShift , 0));
		graphics.fillRect(10, 20, health*2, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(Color.white);
		graphics.drawRect(10, 20, 200, 22);  // 15 and 15 are postion on the screen
		
		graphics.drawString("Score : " + score , 250 , 32);
		graphics.drawString("level : " + level , 450 , 32);
		

		//enemy health 
	
		graphics.setColor(Color.gray);
		graphics.fillRect(450, 20, 200, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(new Color(75 , enemygreenColorShift , 0));
		graphics.fillRect(450, 20, bossHealth*2, 22);  // 15 and 15 are postion on the screen
		graphics.setColor(Color.white);
		graphics.drawRect(450, 20, 200, 22);  // 15 and 15 are postion on the screen
		
	}
	
	public void setHealth(int x)
	{
		GameBar.health = x;
	}
	
	public int getHealth()
	{
		return health;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		GameBar.score = score;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}