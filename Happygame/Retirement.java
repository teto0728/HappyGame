public class Retirement {
    public static void retire(Player p,Home ha,Home hb,Home hc,Home hd,Home he,Home hf,Home hg){
        //借金に利息*2――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
        if(p.money <= 0){
            System.out.println("借金に利息が付きます");
            p.money = p.money*2;
            System.out.println("あなたの所持金は" + p.money + "です");
        }   
        //子供+*5000――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
        if(p.family >= 1){
            System.out.println("子ども1人につき5,000円もらえます");
            p.money += p.family * 5000;
            System.out.println("あなたの所持金は" + p.money + "です");
        }
        //家を半値で売る――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
        if(p.house == 1){
            System.out.println("家を買値の半分の値で売ることができます");
            System.out.println("家を売りますか？");
            System.out.println("できてる" + ha.ownername);
            int yn = 0;
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    yn = Yn.yn();
                }else if(p.cpu == 1){
                    yn = 1;
                }
            if(yn == 1){
                System.out.println("家を売ります");
                if(p.name.equals(ha.ownername)){
                    p.money += ha.value / 2;
                    ha.owner = 0;
                    ha.ownername = "-";
                    System.out.println("aす");
                }else if(hb.ownername == p.name){
                    p.money += hb.value / 2;
                    hb.owner = 0;
                    hb.ownername = "-";
                }else if(hc.ownername == p.name){
                    p.money += hc.value / 2;
                    hc.owner = 0;
                    hc.ownername = "-";
                }else if(hd.ownername == p.name){
                    p.money += hd.value / 2;
                    hd.owner = 0;
                    hd.ownername = "-";
                }else if(he.ownername == p.name){
                    p.money += he.value / 2;
                    he.owner = 0;
                    he.ownername = "-";
                }else if(hf.ownername == p.name){
                    p.money += hf.value / 2;
                    hf.owner = 0;
                    hf.ownername = "-";
                }else if(hg.ownername == p.name){
                    p.money += hg.value / 2;
                    hg.owner = 0;
                    hg.ownername = "-";
                }else if(yn == 2){
                    System.out.println("家を売りません");
                }
                System.out.println("あなたの所持金は" + p.money + "です");
            }
        }
        
        System.out.println("できてる" + ha.ownername);
    }
}