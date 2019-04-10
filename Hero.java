public class Hero{

    private int hp;
    private String name;
    private int attack;
	private int maxHp;

    public String getName(){
		return name;
    }

	public void damage(int attack){
		this.hp -= attack;
		if(this.die()){
			System.exit(0);
		}
	}

    public int getHp(){
		return hp;
    }

	public void setHp(int hp){
		this.hp = hp;
	}

	public int getMaxHp(){
		return maxHp;
    }
    
    public void say(){
		System.out.println("私は" + this.name + "だー");
    }

    public int getAttack(){
		return this.attack;
    }
//主人公の回復
    public void heal(){
		System.out.print(this.name + "のHP"+this.hp);
		this.hp += 10;
		System.out.println("→  HP"+ this.hp + "になりました");
	}
//主人公の攻撃
    public void HeroAttack(Enemy e){
		System.out.println(this.name + "は" + e.getName() +"に攻撃した");
		e.damage(this.attack);
		if(e.getHp() <= 0){
			System.out.println(this.name + "は" + e.getName() +"を倒しました");
			System.out.println("--------------------------------\n");
			
		}
	}
//主人公が死んだ時の処理
	public boolean die(){
		if(this.hp <= 0){
			System.out.println("game over");
			System.out.println("--------------------------------\n");
			return true;
		} else {
			return false;
		}

    }

    Hero(){
		this("hoge");
    }

    Hero(String name){
		this.maxHp = 100;
		this.hp = this.maxHp;
		this.name = name;
		this.attack = 10;
    }


   
}
