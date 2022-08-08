public class Field7 {
    public static void f600(Player p,Player pa,Player pb){
        if(p.curent == 601){
            System.out.println("宇宙旅行ツアーに行く");
            System.out.println("120,000円払う");
            p.money -= 120000;
            p.happy += 50;
        }else if(p.curent == 602){
            System.out.println("山で助けた鶴が恩返しに来る");
            System.out.println("20,000円もらう");
                p.money += 20000;
                p.happy += 10;
        }else if(p.curent == 603){
            System.out.println("持っていた山が土地開発の対象になる");
            System.out.println("150,000円もらう");
            p.money += 150000;
            p.happy += 20;
        }else if(p.curent == 604){
            System.out.println("大企業のCEOに抜擢");
            System.out.println("90,000円もらう");
            p.money += 90000;
            p.happy += 10;
        }else if(p.curent == 605){
            System.out.println("自分主催でパーティーを開く");
            System.out.println("30,000円払う");
            p.money -= 30000;
            p.happy += 10;
        }else if(p.curent == 606){
            System.out.println("夢だったカフェを開業");
            System.out.println("16,000円払う");
            p.money += -16000;
            p.happy += 20;
        }else if(p.curent == 607){
            System.out.println("実家をリフォーム");
            System.out.println("40,000円払う");
            p.money += -40000;
            p.happy += 10;
        }else if(p.curent == 608){
            System.out.println("初孫にランドセルを買う");
            System.out.println("12,000円払う");
            p.money += -12000;
            p.happy += 20;
        }else if(p.curent == 609){
            System.out.println("新惑星発見");
            System.out.println("25,000円もらう");
            p.money += 25000;
            p.happy += 30;
        }else if(p.curent == 610){
            System.out.println("老人ホームに入れられる");
            System.out.println("20,000円もらう");
            p.money += 20000;
            p.happy += -20;
        }else if(p.curent == 611){
            System.out.println("ベストジーニスト賞を受賞する");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 612){
            System.out.println("昔買っていた株券が出てきた");
            System.out.println("150,000円もらう");
            p.money += 150000;
            p.happy += 50;
        }else if(p.curent == 613){
            System.out.println("不治の病を克服");
            System.out.println("70,000円もらう");
            p.money += 70000;
            p.happy += 100;
        }else if(p.curent == 614){
            System.out.println("通帳をなくす");
            System.out.println("50,000円払う");
            p.money += -50000;
            p.happy += -40;
        }else if(p.curent == 615){
            System.out.println("人間ドッグへ行く");
            System.out.println("10,000円払う");
            p.money += -10000;
            p.happy += 10;
        }else if(p.curent == 616){
            System.out.println("旅行中パスポートをなくして帰れなくなる");
            System.out.println("50,000円払う");
            p.money += -50000;
            p.happy += -50;
        }else if(p.curent == 617){
            System.out.println("リゾートに別荘を建てる");
            System.out.println("50,000円払う");
            p.money += -50000;
            p.happy += 50;
        }else if(p.curent >= 618){
            p.curent = 9999;
        }
    }

}