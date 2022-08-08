public class Field3 {
    //――――――――――――――――――――――――――――――――――――――――――――――――――――――――――

    public static void f200(Player p,Player pa,Player pb){
        if(p.curent == 201){
            System.out.println("スケボーで大けが");
            System.out.println("10,000円払う");
            p.money += -10000;
            p.happy += -20;
        }else if(p.curent == 202){
            System.out.println("SNSのフォロワーが１万人を超える");
            System.out.println("20,000円もらう");
                p.money += 20000;
                p.happy += 10;
        }else if(p.curent == 203){
            System.out.println("親戚の子にお年玉を上げる");
            System.out.println("3,000円払う");
            p.money += -3000;
            p.happy += 10;
        }else if(p.curent == 204){
            System.out.println("禁煙を始める");
            System.out.println("1,000円もらう");
            p.money += 1000;
            p.happy += -20;
        }else if(p.curent == 205){
            System.out.println("酔った親に殴られる");
            System.out.println("6,000円払う");
            p.money += -6000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += -40;
        }else if(p.curent == 206){
            System.out.println("公園で炊き出しを手伝う");
            System.out.println("1,000円もらう");
            p.money += 1000;
            p.happy += 10;
        }else if(p.curent == 207){
            System.out.println("新幹線に乗っていると隣に芸能人が座っていた");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 208){
            System.out.println("リサイクルショップで買った商品がビンテージものだった");
            System.out.println("20,000円もらう");
            p.money += 20000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 20;
        }else if(p.curent == 209){
            System.out.println("叔父が逮捕");
            System.out.println("12,000円払う");
            p.money += -12000;
            p.happy += -30;
        }else if(p.curent == 210){
            System.out.println("接待で飲み明かす");
            System.out.println("8,000円もらう");
            p.money += 8000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
        }else if(p.curent == 211){
            System.out.println("バーで見知らぬ客におごってもらう");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 212){
            System.out.println("趣味で書いた小説が入賞");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 20;
        }else if(p.curent == 213){
            System.out.println("実家の農作業を手伝う");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 10;
        }else if(p.curent == 214){
            System.out.println("家でポルターガイストが発生");
            System.out.println("6,000円払い2cpもらう");
            p.money -= -6000;
            p.happy += -20;
            p.cp +=2;
        }else if(p.curent == 215){
            System.out.println("スーパーのタイムセール");
            System.out.println("2,000円もらう");
            p.money += 2000;
            p.happy += 10;
        }else if(p.curent == 216){
            System.out.println("英会話教室に通う");
            System.out.println("8,000円払い1cpもらう");
            p.money += -8000;
            p.happy += 10;
            p.cp += 1;
        }else if(p.curent == 217){
            System.out.println("忘年会の一芸が大うけ");
            System.out.println("7,000円と3cpもらう");
            p.money += 7000;
            p.happy += 10;
            p.cp +=3;
        }else if(p.curent == 218){
            System.out.println("オンライン会議の機材を購入");
            System.out.println("3,000円払う");
            p.money = -3000;
        }else if(p.curent == 219){
            System.out.println("株価が上がる");
            System.out.println("8,000円もらう");
            p.money += 8000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 20;
        }else if(p.curent == 220){
            System.out.println("片付けをしていたらベットの下からお金を発見");
            System.out.println("10,000円もらう");
            p.money += 10000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 221){
            System.out.println("山奥へ星空を見に行く");
            System.out.println("4,000円もらう");
            p.money += 4000;
            p.happy += 30;
        }else if(p.curent == 222){
            System.out.println("友達と鍋パーティー");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += 20;
        }else if(p.curent == 223){
            System.out.println("ヨガ教室に通う");
            System.out.println("6,000円払う");
            p.money += -6000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 224){
            System.out.println("ベランダにオオクワガタを発見");
            System.out.println("12,000円もらう");
            p.money += 12000;
            p.happy += 10;
        }else if(p.curent == 225){
            System.out.println("スーツを新調");
            System.out.println("9,000円払う");
            p.money += -9000;
            p.happy += 10;
        }else if(p.curent == 226){
            System.out.println("物干しざおを買う");
            System.out.println("5,000円払う");
            p.money += -5000;
        }else if(p.curent == 227){
            System.out.println("健康のためにジムに通う");
            System.out.println("8,000円払う");
            p.money += -8000;
            System.out.println("cp2もらう");
            p.cp += 2;
            p.happy += 10;
        }else if(p.curent == 228){
            System.out.println("アイドルの追っかけで散財");
            System.out.println("13,000円払う");
            p.money += -13000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 30;
        }else if(p.curent == 229){
            System.out.println("駅前で手相占いをしてもらう");
            System.out.println("1,000円払う");
            p.money += -1000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 10;
        }else if(p.curent == 230){
            System.out.println("応募した川柳で入賞");
            System.out.println("10,000円払う");
            p.money += 10000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 231){
            System.out.println("UFO発見");
            System.out.println("35,000円もらう");
            p.money += 35000;
            p.happy += 10;
        }else if(p.curent == 232){
            System.out.println("上司にウナギをごちそうになる");
            System.out.println("8,000円もらう");
            p.money += 8000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 20;
        }else if(p.curent == 233){
            System.out.println("花見大会の幹事になる");
            System.out.println("5,000円払う");
            p.money += -100;
            p.happy += -10;
        }else if(p.curent == 234){
            System.out.println("新婚旅行に出かける");
            System.out.println("40,000円払う");
            p.money += -40000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 30;
        }else if(p.curent == 235){
            System.out.println("地域ボランティアでゴミ拾い");
            System.out.println("1,000円もらう");
            p.money += 1000;
        }else if(p.curent == 236){
            System.out.println("芸能人の熱愛を激写");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 237){
            System.out.println("ユッケを食べて食中毒になる");
            System.out.println("11,000円払う");
            p.money += -11000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += -20;
        }else if(p.curent == 238){
            System.out.println("実家の庭から新種の化石を発見");
            System.out.println("100,000円もらう");
            p.money += 100000;
            p.happy += 10;
        }else if(p.curent == 239){
            System.out.println("キャンプブームで一式そろえる");
            System.out.println("12,000円払う");
            p.money += -12000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 240){
            System.out.println("スピード違反");
            System.out.println("罰金6,000円");
            p.money += -6000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += -10;
        }else if(p.curent >= 241){
    p.curent = 299;
    }

    }

}
