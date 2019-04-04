import java.util.Scanner;

public class main{

    public static void main(String[] args){

    Hero h = new Hero("ウメート");
    h.say();
    Enemy e1 = new Enemy("スライム");
    System.out.println(e1.getName()+ "が現れた");
    Scanner scanner = new Scanner(System.in);
    
    for(;;){
	System.out.println(h.getName() + "\nHP : "+ h.getHp());
	System.out.print("選択肢 1: 攻撃\n > ");
	int num = scanner.nextInt();
	System.out.println("--------------------------------");
	if(num==1){
	    h.HeroAttack(e1);
	}else{
	    System.out.println("もう一度入力してください");
	    System.out.println();
	    continue;
	}
	    System.out.println();
    }
    }
}
