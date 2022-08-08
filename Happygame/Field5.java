public class Field5 {
    public static void f400(Player p,Player pa,Player pb){
        if(p.curent == 401){
            System.out.println("飼い犬がTV出演");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 402){
            System.out.println("自身のブログが書籍化");
            System.out.println("17,000円もらう");
                p.money += 17000;
                p.happy += 10;
        }else if(p.curent == 403){
            System.out.println("フリーマーケットで不用品処分");
            System.out.println("5,000円もらう");
            p.money += 5000;
            System.out.println("cp1もらう");
            p.cp += 1;
        }else if(p.curent == 404){
            System.out.println("新型洗濯機を買う");
            System.out.println("120,000円払う");
            p.money += -120000;
        }else if(p.curent == 405){
            System.out.println("花粉症で仕事にならない");
            System.out.println("6,000円払う");
            p.money -= 6000;
            p.happy += -20;
        }else if(p.curent == 406){
            System.out.println("ギャンブルにはまる");
            System.out.println("10,000円払う");
            p.money += -10000;
            p.happy += 30;
        }else if(p.curent == 407){
            System.out.println("海水浴場でウニを踏む");
            System.out.println("10,000円払う");
            p.money -= -10000;
            p.happy += -10;
        }else if(p.curent == 408){
            System.out.println("クーポンを駆使して食事代を浮かす");
            System.out.println("8,000円払う");
            System.out.println("cp3をもらう");
            p.money += -8000;
            p.cp += 3;
        }else if(p.curent == 409){
            System.out.println("占い師に相談して部屋の風水を高める");
            System.out.println("5,000円もらう");
            p.money += 5000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 30;
        }else if(p.curent == 410){
            System.out.println("昔持っていたおもちゃがプレミアになる");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 411){
            System.out.println("交通事故にあう");
            System.out.println("自動車保険に入っていなければ15,000円払う");
            if(p.ci == 0){
                p.money -= 15000;
            }
            p.happy += -50;
        }else if(p.curent == 412){
            System.out.println("家に野良猫が侵入");
            System.out.println("6000円もらう");
            p.money += 6000;
        }else if(p.curent == 413){
            System.out.println("洗濯物を乾燥機にかけたら縮んだ");
            System.out.println("5,000円払う");
            p.money -= 5000;
            p.happy += -10;
        }else if(p.curent == 414){
            System.out.println("コンビニスイーツレビューで注目が集まる");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 415){
            System.out.println("人里に降りてきたサルを保護");
            System.out.println("8,000円もらう");
            p.money += 8000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 416){
            System.out.println("ソーラーパネルで売電");
            System.out.println("8,000円もらう");
            p.money += 8000;
        }else if(p.curent == 417){
            System.out.println("ホームセキュリティの契約を行う");
            System.out.println("15,000円払う");
            p.money += -15000;
        }else if(p.curent == 418){
            System.out.println("eスポーツの大会で優勝");
            System.out.println("65,000円もらう");
            p.money += 65000;
            p.happy += 30;
        }else if(p.curent == 419){
            System.out.println("発明品に特許申請");
            System.out.println("28,000円もらう");
            p.money += 28000;
        }else if(p.curent == 420){
            System.out.println("免許更新を忘れて失効する");
            System.out.println("30,000円払う");
            p.money += -30000;
            p.happy += 40;
        }else if(p.curent == 421){
            System.out.println("買っていた蛇が脱走");
            System.out.println("13,000円払う");
            p.money += -13000;
            p.happy += -20;
        }else if(p.curent == 422){
            System.out.println("ディナーショーに招待される");
            System.out.println("15,000円もらう");
            p.money += 15000;
            p.happy += 20;
        }else if(p.curent == 423){
            System.out.println("バナナの皮でこけて骨折");
            System.out.println("10,000円払う");
            p.money += -10000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 424){
            System.out.println("社交界デビュー");
            System.out.println("30,000円払う");
            p.money += -30000;
            p.happy += 10;
        }else if(p.curent == 425){
            System.out.println("旅行で飛行機が不時着");
            System.out.println("慰謝料36,000円もらう");
            p.money += 36000;
            p.happy += -20;
        }else if(p.curent == 426){
            System.out.println("万博のキャラ選考に受かる");
            System.out.println("21,000円もらう");
            p.money += 21000;
        }else if(p.curent == 427){
            System.out.println("飼い犬が歩行者にかみつく");
            System.out.println("14,000円払う");
            p.money += -14000;
            p.happy += -30;
        }else if(p.curent == 428){
            System.out.println("定期券を落とす");
            System.out.println("20,000円払う");
            p.money += -20000;
            p.happy += -30;
        }else if(p.curent == 429){
            System.out.println("ウィル・スミスにたたかれる");
            System.out.println("8,000円払う");
            p.money += -8000;
            p.happy += -10;
        }else if(p.curent == 430){
            System.out.println("ブランド品が高く売れる");
            System.out.println("19,000円もらう");
            p.money += 19000;
            p.happy += 10;
        }else if(p.curent == 431){
            System.out.println("選挙の投票に行く");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 432){
            System.out.println("誤認逮捕される");
            System.out.println("30,000円もらう");
            p.money += 30000;
            p.happy += -50;
        }else if(p.curent == 433){
            System.out.println("読者モデルにスカウトされる");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 434){
            System.out.println("家族とけんかして家出する");
            System.out.println("8,000円払う");
            p.money += -8000;
            p.happy += -10;
        }else if(p.curent == 435){
            System.out.println("地面が凍結して事故を起こした");
            System.out.println("12,000円払う");
            p.money += -12000;
            p.happy += -20;
        }else if(p.curent == 436){
            System.out.println("いじめられている亀を助ける");
            System.out.println("20,000円もらう");
            p.money += 20000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 437){
            System.out.println("金利が上がる");
            System.out.println("所持金がマイナスなら借金が２倍になる");
            if(p.money <= 0){
                p.money = p.money*2;
                p.happy += -50;
            }
        }else if(p.curent == 438){
            System.out.println("不審者と間違われる");
            System.out.println("3,000円払う");
            p.money += -3000;
            p.happy += -10;
        }else if(p.curent == 439){
            System.out.println("競馬で一発逆転");
            System.out.println("60,000円もらう");
            p.money += 60000;
            p.happy += 40;
        }else if(p.curent == 440){
            System.out.println("AIに仕事を奪われる");
            System.out.println("フリーターになる");
            p.jname = "フリーター";
            p.happy += -50;
        }else if(p.curent >= 441){
            p.curent = 499;
        }
    }

}