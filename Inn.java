
public class Inn{

	//主人公のHPを回復させる

	public static void heal(Hero h){
		System.out.println(h.getName() + "はHPが最大まで回復した");
		System.out.println(h.getHp()+"→  "+h.getMaxHp());
		h.setHp(h.getMaxHp());
		System.out.println("--------------------------------\n");
	}
}
