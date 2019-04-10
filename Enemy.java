public class Enemy{

    private int hp;
    private String name;
    private int attack;
	private int exp;

    public void attack(Hero h){
		System.out.println(h.getName() + "は" + this.attack + "のダメージを受けた");
		h.damage(this.attack);
    }

    public int getHp(){
		return this.hp;
    }

	public int getExp(){
		return this.exp;
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
		this("モンスターA");
    }

    Enemy(String name){
		this.hp = 30;
		this.name = name;
		this.attack = 30;
		this.exp = 1;
    }

}
