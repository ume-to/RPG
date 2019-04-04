public class Enemy{

    private int hp;
    private String name;
    private int attack;

    public void attack(Hero h){
	
    }

    public void damage(int heroAttack){
	hp -= heroAttack;
    }

    public String getName(){
  	return this.name;
    }

    Enemy(){
	this.hp = 30;
	this.name = "モンスターA";
	this.attack = 3;
    }

    Enemy(String name){
	this.hp = 30;
	this.name = name;
	this.attack = 3;
    }

}
