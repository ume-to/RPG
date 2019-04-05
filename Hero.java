public class Hero{

    private int hp;
    private String name;
    private int attack;

    public String getName(){
		return name;
    }

	public void damage(int attack){
		this.hp -= attack;
	}

    public int getHp(){
		return hp;
    }
    
    public void say(){
		System.out.println("私は" + this.name + "だー");
    }

    public int getAttack(){
		return this.attack;
    }

    public void heal(){
		System.out.print(this.name + "のHP"+this.hp);
		this.hp += 10;
		System.out.println("→  HP"+ this.hp + "になりました");
	}

    public void HeroAttack(Enemy e){
		System.out.println(this.name + "は" + e.getName() +"に攻撃した");
		e.damage(this.attack);
		if(e.getHp() <= 0){
			System.out.println(this.name + "は" + e.getName() +"を倒しました");
			System.out.println("--------------------------------\n");
			System.exit(0);
		}
	
    }

    Hero(){
		this.hp = 100;
		this.name ="hoge";
		this.attack = 10;
    }

    Hero(String name){
		this.hp = 100;
		this.name = name;
		this.attack = 10;
    }
   
}
