package inheritance;

import Characters.Enemy;
import Characters.SuperEnemy;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enemy e1 = new Enemy(10);
		Enemy e2 = new Enemy();
		Enemy e3 = new Enemy(3);
		SuperEnemy se1 = new SuperEnemy();
				
		System.out.println(e1.lives);
		System.out.println(e2.lives);
		System.out.println(e3.lives);
		System.out.println(se1.lives);
		
		e2.ReduceHealth(9);
		se1.ReduceHealth(250);
		
		System.out.println(e1.health);
		System.out.println(e2.health);
		System.out.println(e3.health);
		System.out.println(se1.health);
	}

}
