import java.util.Scanner;

public class main{

    public static void main(String[] args){

		String name = makeChara();
		Hero h = new Hero(name);
		h.say();
		doing(h);
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
		System.out.println("--------------------------------\n");
		Scanner scanner = new Scanner(System.in);
		
		for(;;){
			System.out.println(h.getName() + "\nHP : "+ h.getHp());
			System.out.println( "EXP : "+ h.getExp());
			System.out.print("\n選択肢 1:攻撃　2:回復  \n > ");
			int num = scanner.nextInt();
			System.out.println("--------------------------------");
		/*ヒーローの戦闘行動選択*/
			if(num==1){
				h.HeroAttack(e1);
				if(e1.getHp() <= 0) return ;
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

//敵探索、宿屋の選択
	public static void doing(Hero h){
		Scanner scanner = new Scanner(System.in);
		for(;;){
			System.out.println("次にする行動を決めてください\n");
			System.out.print("選択肢 1:探索　2:宿屋  \n > ");
			int num = scanner.nextInt();
			System.out.println("--------------------------------");
			/*ヒーローの行動選択*/
			if(num==1){
				combat(h);
			} else if(num == 2){
				Inn.heal(h);
			}
			else{
				System.out.println("もう一度入力してください");
				System.out.println("--------------------------------\n");
				continue;
			}
		}
	}

}
