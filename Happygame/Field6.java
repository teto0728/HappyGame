public class Field6 {
    public static void f500(Player p,Player pa,Player pb){
        if(p.curent == 501){
            System.out.println("地価高騰");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 502){
            System.out.println("パソコンのデータが消える");
            System.out.println("20,000円払う");
                p.money -= 20000;
                p.happy += -30;
        }else if(p.curent == 503){
            System.out.println("スーツを新調");
            System.out.println("16,000円払う");
            p.money += -16000;
            p.happy += 10;
        }else if(p.curent == 504){
            System.out.println("安眠グッズを購入");
            System.out.println("7,000円払う");
            p.money -= 7000;
            p.happy += 10;
        }else if(p.curent == 505){
            System.out.println("ハイヤーで出勤");
            System.out.println("25,000円払う");
            p.money -= 25000;
            p.happy += 20;
        }else if(p.curent == 506){
            System.out.println("世界一周旅行が当たる");
            System.out.println("100,000円もらう");
            p.money += 100000;
            p.happy += 50;
        }else if(p.curent == 507){
            System.out.println("宇宙人が攻めてきたが友好のきっかけになる");
            System.out.println("70,000円もらう");
            p.money += 70000;
            p.happy += 50;
        }else if(p.curent == 508){
            System.out.println("芥川賞に受賞");
            System.out.println("19,000円もらう");
            p.money += 19000;
            p.happy += 10;
        }else if(p.curent == 509){
            System.out.println("頭をぶつけ記憶喪失になる");
            System.out.println("20,000円払う");
            p.money -= 20000;
            p.happy += -60;
        }else if(p.curent == 510){
            System.out.println("海外の友達が来日");
            System.out.println("東京観光をする");
            System.out.println("15,000円払う");
            p.money += 8000;
            p.happy += 10;
        }else if(p.curent == 511){
            System.out.println("生命保険満期");
            System.out.println("生命保険に入っていれば100,000円もらう");
            if(p.li == 1){
                p.money += 100000;
                p.happy += 50;
            }
        }else if(p.curent == 512){
            System.out.println("有名雑誌の創刊号を入手");
            System.out.println("20,000円もらう");
            p.money += 20000;
            p.happy += 10;
        }else if(p.curent == 513){
            System.out.println("超能力に目覚める");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 514){
            System.out.println("自動運転車を購入");
            System.out.println("100,000円払う");
            p.money += -100000;
            p.happy += 30;
        }else if(p.curent == 515){
            System.out.println("将棋で連勝記録を達成");
            System.out.println("29,000円もらう");
            p.money += 29000;
            p.happy += 10;
        }else if(p.curent == 516){
            System.out.println("エレベーターが止まり閉じ込められる");
            System.out.println("9,000円払う");
            p.money += -9000;
            p.happy += -30;
        }else if(p.curent == 517){
            System.out.println("テーマパークで遊びまくる");
            System.out.println("15,000円払う");
            p.money += -15000;
            p.happy += 30;
        }else if(p.curent == 518){
            System.out.println("近くの駅に新幹線が開通");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 519){
            System.out.println("ヒッチハイカーを乗せた");
            System.out.println("5,000円もらう");
            p.money += 5000;
        }else if(p.curent == 520){
            System.out.println("ドラマのエキストラに出演");
            System.out.println("7,000円もらう");
            p.money += 7000;
            p.happy += 10;
        }else if(p.curent == 521){
            System.out.println("高級料理店が10周年記念で半額だった");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 20;
        }else if(p.curent == 522){
            System.out.println("新エネルギーを発見する");
            System.out.println("70,000円もらう");
            p.money += 70000;
            p.happy += 40;
        }else if(p.curent == 523){
            System.out.println("天然水でそばを打つ");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 524){
            System.out.println("怪談を聞き寝不足になる");
            System.out.println("7,000円払う");
            p.money += -7000;
            p.happy += -30;
        }else if(p.curent == 525){
            System.out.println("最新機器が使いこなせない");
            System.out.println("15,000円払う");
            p.money += -15000;
            p.happy += -50;
        }else if(p.curent == 526){
            System.out.println("線路に落ちた");
            System.out.println("37,000円払う");
            p.money += -37000;
            p.happy += -20;
        }else if(p.curent == 527){
            System.out.println("人面魚を発見");
            System.out.println("25,000円もらう");
            p.money += 25000;
            p.happy += 10;
        }else if(p.curent == 528){
            System.out.println("医療が進みサイボーグ化する");
            System.out.println("20,000円もらう");
            p.money += 20000;
            p.happy += 20;
        }else if(p.curent == 529){
            System.out.println("造幣局の見学でお金をもらう");
            System.out.println("30,000円もらう");
            p.money += 30000;
            p.happy += 10;
        }else if(p.curent == 530){
            System.out.println("動物園でパンダを見る");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 20;
        }else if(p.curent == 531){
            System.out.println("カジノで大勝利");
            System.out.println("90,000円もらう");
            p.money += 90000;
            p.happy += 30;
        }else if(p.curent == 532){
            System.out.println("自身が企画してたプロジェクトが実る");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 533){
            System.out.println("スキー場で大ジャンプ");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 534){
            System.out.println("自己破産する");
            System.out.println("借金がある場合はそれがなくなる");
            if(p.money <= 0){
                p.money = 0;
                p.happy += -100;
            }
        }else if(p.curent == 535){
            System.out.println("ツチノコ発見");
            System.out.println("50,000円もらう");
            p.money += 50000;
            p.happy += 30;
        }else if(p.curent == 536){
            System.out.println("月の土地を買う");
            System.out.println("30,000円払う");
            p.money += -30000;
            p.happy += 50;
        }else if(p.curent == 537){
            System.out.println("庭が雑草だらけに");
            System.out.println("10,000円払う");
            p.money += -10000;
            p.happy += -30;
        }else if(p.curent == 538){
            System.out.println("ファーストクラスで出張");
            System.out.println("60,000円払う");
            p.money += -60000;
            p.happy += 30;
        }else if(p.curent == 539){
            System.out.println("還付金");
            System.out.println("20,000円もらう");
            p.money += 20000;
            p.happy += 10;
        }else if(p.curent == 540){
            System.out.println("ゴミ拾いをしていたら埋蔵金発見");
            System.out.println("50,000円もらう");
            p.money += 50000;
            p.happy += 10;
        }else if(p.curent >= 541){
            p.curent = 599;
        }
    }

}