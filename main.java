import java.util.Scanner;

public class main{

    public static void main(String[] args){

		String name = makeChara();
		Hero h = new Hero(name);
		h.say();
		combat(h);
    }

//キャラ作成
	public static String makeChara(){
		Scanner scanner = new Scanner(System.in);
		for(;;){
			System.out.println("主人公の名前を入力してください");
			System.out.print("  >  ");
			String name = scanner.next();
			if(name=="")continue;
			//if(name.length >= 10)continue;
			return name;
		}
	}
//戦闘
	public static void combat(Hero h){
		Enemy e1 = new Enemy("スライム");
		System.out.println(e1.getName()+ "が現れた");
		Scanner scanner = new Scanner(System.in);
		
		for(;;){
			System.out.println(h.getName() + "\nHP : "+ h.getHp());
			System.out.print("選択肢 1:攻撃　2:回復  \n > ");
			int num = scanner.nextInt();
			System.out.println("--------------------------------");
		/*ヒーローの行動選択*/
			if(num==1){
				h.HeroAttack(e1);
			} else if(num == 2){
				h.heal();
			}
			else{
				System.out.println("もう一度入力してください");
				System.out.println("--------------------------------\n");
				continue;
			}
		e1.attack(h);
		System.out.println("--------------------------------\n");
		}
	}



}
