public class Field2 {
    //――――――――――――――――――――――――――――――――――――――――――――――――――――――――――

    public static void f100(Player p,Player pa,Player pb){
        if(p.curent == 101){
            System.out.println("霊障多発‼");
            System.out.println("徐霊をしてもらう");
            System.out.println("除霊代8,000円払う");
            p.money -= 8000;
            p.happy += -20;
        }else if(p.curent == 102){
            System.out.println("恋人に振られやけ酒");
            System.out.println("5,000円払う");
                p.money -= 5000;
                p.happy += -50;
        }else if(p.curent == 103){
            System.out.println("早起きは三文の徳");
            System.out.println("4,000円もらう");
            System.out.println("cp1もらう");
            p.money += 4000;
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 104){
            System.out.println("年賀状抽選が当たる");
            System.out.println("7,000円当たる");
            p.money += 7000;
            p.happy += 20;
        }else if(p.curent == 105){
            System.out.println("サブスクを契約しすぎた");
            System.out.println("6,000円払う");
            p.money -= 6000;
            p.happy += -10;
        }else if(p.curent == 106){
            System.out.println("応募していた懸賞に当たる");
            System.out.println("9,000円もらう");
            p.money += 9000;
            p.happy += 30;
        }else if(p.curent == 107){
            System.out.println("はやり病にかかる");
            System.out.println("10,000円払う");
            System.out.println("職業が医師かそのランクアップ後なら払わなくてもよい");
            if ((p.jname == "医師") || (p.jname == "医院長") || (p.jname == "闇医者")){
            }else {
                p.money -= -10000;
            }
            p.happy += -25;
        }else if(p.curent == 108){
            System.out.println("同期の中で一番の成績をあげる");
            System.out.println("12,000円もらう");
            System.out.println("cp3をもらう");
            p.money += 12000;
            p.cp += 3;
            p.happy += 20;
        }else if(p.curent == 109){
            System.out.println("非常食を全部食べてしまう");
            System.out.println("7,000円分買いなおす");
            p.money -= 7000;
            p.happy += -10;
        }else if(p.curent == 110){
            System.out.println("今年は大豊作");
            System.out.println("8,000円もらう");
            System.out.println("職業が農家かそのランクアップ後なら20,000円もらう");
            if ((p.jname == "農家") || (p.jname == "ブランド農家") || (p.jname == "不作農家")){
                p.money += 20000;
            }else{
                p.money += 8000;
            }
            p.happy += 30;
        }else if(p.curent == 111){
            System.out.println("エンジンが壊れる");
            System.out.println("自動車保険に入っていなければ9,000円払う");
            if(p.ci == 0){
                p.money -= 9000;
            }
            p.happy += -40;
        }else if(p.curent == 112){
            System.out.println("カラオケでストレス発散");
            System.out.println("1000円払う");
            p.money -= 1000;
            p.happy += 40;
        }else if(p.curent == 113){
            System.out.println("甥っ子にお年玉をあげる");
            System.out.println("5,000円払う");
            p.money -= 5000;
            p.happy += 10;
        }else if(p.curent == 114){
            System.out.println("お隣さんがエロい");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 20;
        }else if(p.curent == 115){
            System.out.println("お年寄りに優しくする");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 116){
            System.out.println("ネットで趣味の合う友人ができる");
            System.out.println("8,000円もらう");
            p.money += 8000;
            p.happy += 10;
        }else if(p.curent == 117){
            System.out.println("先輩に高めの店でおごってもらう");
            System.out.println("7,000円もらう");
            p.money += 7000;
            p.happy += 20;
        }else if(p.curent == 118){
            System.out.println("同窓会でタイムカプセルを開ける");
            System.out.println("4,000円もらう");
            p.money += 4000;
            p.happy += 10;
        }else if(p.curent == 119){
            System.out.println("美容院で変な髪形にされる");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += -20;
        }else if(p.curent == 120){
            System.out.println("残業都築でつらい");
            System.out.println("15,000円もらう");
            p.money += 15000;
            p.happy += -40;
        }else if(p.curent == 121){
            System.out.println("自身のラーメンブログが話題に");
            System.out.println("9,000円もらう");
            p.money += 9000;
            p.happy += 10;
        }else if(p.curent == 122){
            System.out.println("キャッシュレス決済のポイントがたまる");
            System.out.println("3,000円もらう");
            p.money += 3000;
            p.happy += 10;
        }else if(p.curent == 123){
            System.out.println("サブすくに登録しすぎた");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += 10;
        }else if(p.curent == 124){
            System.out.println("終電を逃しカラオケで夜を過ごす");
            System.out.println("5,000円払う");
            p.money += -5000;
        }else if(p.curent == 125){
            System.out.println("ふるさと納税で豪勢な夕食になる");
            System.out.println("15,000円払う");
            p.money += -15000;
            p.happy += 20;
        }else if(p.curent == 126){
            System.out.println("恋人に誕生日を祝ってもらう");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 30;
        }else if(p.curent == 127){
            System.out.println("四つ葉のクローバーを見つける");
            System.out.println("1,000円もらう");
            p.money += 1000;
            p.happy += 10;
        }else if(p.curent == 128){
            System.out.println("外出自粛で出前を頼みすぎる");
            System.out.println("8,000円払う");
            p.money += -8000;
            p.happy += 10;
        }else if(p.curent == 129){
            System.out.println("近所の本屋が閉店セール");
            System.out.println("3,000円もらう");
            p.money += 3000;
            p.happy += -10;
        }else if(p.curent == 130){
            System.out.println("婚約指輪を買う");
            System.out.println("15,000円払う");
            p.money += -15000;
            p.happy += 20;
        }else if(p.curent == 131){
            System.out.println("フリマアプリで小銭稼ぎ");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 20;
        }else if(p.curent == 132){
            System.out.println("地域の相撲大会で優勝");
            System.out.println("8,000円もらう");
            p.money += 8000;
            p.happy += 10;
        }else if(p.curent == 133){
            System.out.println("創作料理で大バズり");
            System.out.println("12,000円もらう");
            p.money += 12000;
            p.happy += 10;
        }else if(p.curent == 134){
            System.out.println("置き引きに会う");
            System.out.println("7,000円払う");
            p.money += -7000;
            p.happy += -30;
        }else if(p.curent == 135){
            System.out.println("TVの視聴者プレゼントに当選");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 136){
            System.out.println("防災グッズを買いだめ");
            System.out.println("13,000円払う");
            p.money += -13000;
        }else if(p.curent == 137){
            System.out.println("家の近くに転勤");
            System.out.println("6,000円もらう");
            p.money += 6000;
            p.happy += 10;
        }else if(p.curent == 138){
            System.out.println("ストリートで大道芸をする");
            System.out.println("3,000円もらう");
            p.money += 3000;
            p.happy += 10;
        }else if(p.curent == 139){
            System.out.println("雨が降るたびにコンビニで傘を買う");
            System.out.println("2,000円払う");
            p.money += -2000;
            p.happy += -10;
        }else if(p.curent == 140){
            System.out.println("英会話教室に通う");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += 10;
        }else if(p.curent >= 141){
    p.curent = 199;
    }

    }

}