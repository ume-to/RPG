public class Enemy{

    private int hp;
    private String name;
    private int attack;

    public void attack(Hero h){
		System.out.println(h.getName() + "は" + this.attack + "のダメージを受けた");
		h.damage(this.attack);
    }

    public int getHp(){
		return hp;
    }

    public void damage(int heroAttack){
        System.out.print(this.name + "のHP" + this.hp + "が");
		this.hp -= heroAttack;
		if(this.hp <= 0){
	    	System.out.println("HP0になりました");
	    	return ;
		}
        System.out.println("HP" + this.hp + "になった");
    }

    public String getName(){
  		return this.name;
    }

    Enemy(){
		this.hp = 30;
		this.name = "モンスターA";
		this.attack = 30;
    }

    Enemy(String name){
		this.hp = 30;
		this.name = name;
		this.attack = 30;
    }

}
