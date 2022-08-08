import java.util.Scanner;
public class Action {
    public static void a(Player p){
        int aflag = 0; //アクションの会話フラグ　0なら以下の会話をループ
        do{
            System.out.println("1:ルーレットを回す");
            System.out.println("2:ステータスを見る");
            Scanner scanner = new Scanner(System.in);
        	int select = scanner.nextInt(); 
            
            if(select == 1){
                aflag = 1;
            }else if(select == 2){
                System.out.println("所持金:" + p.money);
                System.out.println("職業:" + p.jname);
                System.out.println("所持CP:" + p.cp);
                if(p.ci == 0){
                    System.out.println("自動車保険:×");
                }else if(p.ci == 1){
                    System.out.println("自動車保険:〇");
                }
                if(p.li == 0){
                    System.out.println("生命保険:×");
                }else if(p.li == 1){
                    System.out.println("生命保険:〇");
                }
                if(p.pertner == 0){
                    System.out.println("結婚:×");
                }else if(p.pertner == 1){
                    System.out.println("結婚:〇");
                }
                System.out.println("子供:" + p.family + "人");
                System.out.println();
            }else if((select == 1) || (select == 2)){
                System.out.println("もう一度入力してください"); 
            }
        }while(aflag == 0);
    }
}
