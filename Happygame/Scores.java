import java.util.Arrays;
import java.util.Collections;

public class Scores {
    //結果発表
    public static void scores(Player p1,Player p2,Player p3){
        Integer[] s= {p1.money,p2.money,p3.money}; //intじゃだめらしい
        String[] n={p1.name,p2.name,p3.name};

        //金額の順位付け
        Arrays.sort(s,Collections.reverseOrder());
        for(int i =0;i<s.length;i++) {
            System.out.println((i+1)+"位");
            
                //金額の降順とプレイヤーの紐づけ
                if(s[i] == p1.money){
                System.out.println(n[0]);
                }else if(s[i] == p2.money){
                System.out.println(n[1]);
                }else if(s[i] == p3.money){
                System.out.println(n[2]);
                }
                
            System.out.println(s[i] + "円");
        }
        
    }    
}