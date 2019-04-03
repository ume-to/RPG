public class Hero{

    private int hp;
    private String name;
    private int attack;

    public String getName(){
	return name;
    }

    public int getHp(){
	return hp;
    }
    
    public void say(){
	System.out.println("私は" + this.name + "だー");
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
