public class Job {
    // r=1～10の乱数
    static void job(Player p,Player pa,Player pb){
        int r = Roulette.r();
        if(p.jname == "フリーター"){ //フリーターの場合
            System.out.println("給料日！ ルーレットで出た数×1,000円もらえる");
            System.out.println(r);
            p.money += r*1000;
            
        }else if(p.jname == "サラリーマン"){    //サラリーマンの場合
            System.out.println("給料日！ 7,000円もらえる");
            System.out.println("CPを1もらえる");
            p.money += 7000;
            p.cp += 1;
        }else if(p.jname == "部長"){    //部長
        System.out.println("給料日！　75,000円もらえる");
        p.money += 75000;
        }else if(p.jname == "社長"){    
        System.out.println("給料日！　100,000円もらえる");
        p.money += 100000;

        }else if(p.jname == "教師"){    
        System.out.println("給料日！　17,000円もらえる");
        p.money += 17000;
        }else if(p.jname == "校長"){    
        System.out.println("給料日！　73,000円もらえる");
        p.money += 73000;
        }else if(p.jname == "大学教授"){    
        System.out.println("給料日！　80,000円もらえる");
        p.money += 80000;

        }else if(p.jname == "YouTuber"){    
        System.out.println("給料日！　5,000円もらえる");
        p.money += 5000;
        }else if(p.jname == "トップYouTuber"){    
        System.out.println("給料日！　100,000円もらえる");
        p.money += 100000;
        }else if(p.jname == "炎上YouTuber"){    
        System.out.println("給料日！　3,000円もらえる");
        p.money += 3000;

        }else if(p.jname == "プログラマー"){    
        System.out.println("給料日！　16,000円もらえる");
        p.money += 16000;
        }else if(p.jname == "天才プログラマー"){    
        System.out.println("給料日！　90,000円もらえる");
        p.money += 90000;
        }else if(p.jname == "クラッカー"){    
        System.out.println("給料日！　全員から30,000円もらえる");
        p.money += (30000*2);
            if (p.name == "プレイヤー1"){
                pa.money -= 30000;
                pb.money -= 30000;
            }else if (p.name == "プレイヤー2"){
                pa.money -= 30000;
                pb.money -= 30000;
            }else if (p.name == "プレイヤー3"){
                pa.money -= 30000;
                pb.money -= 30000;   
            }

        }else if(p.jname == "漫画家"){    
        System.out.println("給料日！　10,000円もらえる");
        p.money += 10000;
        }else if(p.jname == "人気漫画家"){    
        System.out.println("給料日！　90,000円もらえる");
        p.money += 90000;
        }else if(p.jname == "アシスタント"){    
        System.out.println("給料日！　45,000円もらえる");
        p.money += 45000;

        }else if(p.jname == "芸能人"){    
        System.out.println("給料日！ ルーレットで出た数×2,000円もらえる");
        System.out.println(r);
        p.money += r*2000;
        }else if(p.jname == "売れっ子芸能人"){    
        System.out.println("給料日！ ルーレットで出た数×10,000円もらえる");
        System.out.println(r);
        p.money += r*10000;
        }else if(p.jname == "三流芸能人"){    
        System.out.println("給料日！ ルーレットで出た数×5,000円もらえる");
        System.out.println(r);
        p.money += r*5000;

        }else if(p.jname == "デザイナー"){    
        System.out.println("給料日！　16,000円もらえる");
        p.money += 16000;
        }else if(p.jname == "トップデザイナー"){    
        System.out.println("給料日！　98,000円もらえる");
        p.money += 98000;
        }else if(p.jname == "盗作デザイナー"){    
        System.out.println("給料日！　45,000円もらえる");
        p.money += 45000;

        }else if(p.jname == "医師"){    
        System.out.println("給料日！　30,000円もらえる");
        p.money += 30000;
        }else if(p.jname == "医院長"){    
        System.out.println("給料日！　100,000円もらえる");
        p.money += 100000;
        }else if(p.jname == "闇医者"){    
        System.out.println("給料日！ルーレットを回し1～9がでれば130,000円もらえるが");
        System.out.println("10が出ると200,000円払う");
        System.out.println(r);
            if(r <= 9){
            p.money += 130000;
            }else if(r == 10){
            p.money -= 200000;    
            }

        }else if(p.jname == "作家"){    
        System.out.println("給料日！　13,000円もらえる");
        p.money += 13000;
        }else if(p.jname == "文学賞作家"){    
        System.out.println("給料日！　85,000円もらえる");
        p.money += 85000;
        }else if(p.jname == "ゴーストライター"){    
        System.out.println("給料日！　80,000円もらえる");
        p.money += 80000;

        }else if(p.jname == "スポーツ選手"){    
        System.out.println("給料日！　35,000円もらえる");
        p.money += 35000;
        }else if(p.jname == "メダリスト"){    
        System.out.println("給料日！　150,000円もらえる");
        p.money += 150000;
        }else if(p.jname == "ドーピング選手"){    
        System.out.println("給料日！　85,000円もらえる");
        p.money += 85000;

        }else if(p.jname == "パイロット"){    
        System.out.println("給料日！　28,000円もらえる");
        p.money += 28000;
        }else if(p.jname == "整備士"){    
        System.out.println("給料日！　83,000円もらえる");
        p.money += 83000;
        }else if(p.jname == "宇宙飛行士"){    
        System.out.println("給料日！　120,000円もらえる");
        p.money += 120000;

        }else if(p.jname == "料理人"){    
        System.out.println("給料日！　10,000円もらえる");
        p.money += 10000;
        }else if(p.jname == "三ツ星シェフ"){    
        System.out.println("給料日！　90,000円もらえる");
        p.money += 90000;
        }else if(p.jname == "管理栄養士"){    
        System.out.println("給料日！　70,000円もらえる");
        p.money += 70000;

        }else if(p.jname == "役者"){    
        System.out.println("給料日！　3,000円もらえる");
        p.money += 3000;
        }else if(p.jname == "ハリウッド俳優"){    
        System.out.println("給料日！　15,000円もらえる");
        p.money += 15000;
        }else if(p.jname == "熟練フリーター"){    
        System.out.println("給料日！ ルーレットで出た数×3,000円もらえる");
        System.out.println(r);
        p.money += r*3000;
        
        }else if(p.jname == "アイドル"){    //低確率でキャリアアップに失敗する
        System.out.println("給料日！　10,000円もらえる");
        p.money += 10000;
        }else if(p.jname == "トップアイドル"){    
        System.out.println("給料日！　85,000円もらえる");
        p.money += 85000;

        }else if(p.jname == "農家"){    
        System.out.println("給料日！　15,000円もらえる");
        p.money += 15000;
        }else if(p.jname == "ブランド農家"){    
        System.out.println("給料日！　75,000円もらえる");
        p.money += 75000;
        }else if(p.jname == "不作農家"){    
        System.out.println("給料日！　15,000円もらえる");
        System.out.println("CPを1もらえる");
        p.money += 15000;
        p.cp += 1;
        
        }else if(p.jname == "政治家"){    
        System.out.println("給料日！　22,000円もらえる");
        p.money += 22000;
        }else if(p.jname == "総理大臣"){    
        System.out.println("給料日！　200,000円もらえる");
        p.money += 200000;
        }else if(p.jname == "汚職政治家"){    
        System.out.println("給料日！　10,000円払う");
        p.money -= 10000;
        }
        
    }

}