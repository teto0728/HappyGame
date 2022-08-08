public class Field4 {
    //――――――――――――――――――――――――――――――――――――――――――――――――――――――――――

    public static void f300(Player p,Player pa,Player pb){
        if(p.curent == 301){
            System.out.println("街頭インタビューを受けたら美形だと話題に");
            System.out.println("20,000円もらう");
            p.money += 20000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 20;
        }else if(p.curent == 302){
            System.out.println("ゴルフ大会で優勝");
            System.out.println("10,000円もらう");
                p.money += 10000;
                p.happy += 20;
        }else if(p.curent == 303){
            System.out.println("古いケータイを売る");
            System.out.println("4,000円もらう");
            System.out.println("cp1もらう");
            p.money += 4000;
            p.happy += 10;
            p.cp += 1;
        }else if(p.curent == 304){
            System.out.println("コスプレ衣装を買う");
            System.out.println("6,000円払う");
            p.money += -6000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 305){
            System.out.println("家の鍵をなくす");
            System.out.println("18,000円払う");
            p.money -= 18000;
            p.happy += -30;
        }else if(p.curent == 306){
            System.out.println("友人とBBQ");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += 10;
        }else if(p.curent == 307){
            System.out.println("隣人からの騒音被害");
            System.out.println("和解金10,000円もらう");
            p.money += 10000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += -10;
        }else if(p.curent == 308){
            System.out.println("温泉でのんびりする");
            System.out.println("8,000円払う");
            System.out.println("cp3をもらう");
            p.money += 8000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 20;
            p.cp += 3;
        }else if(p.curent == 309){
            System.out.println("外国人に道案内");
            System.out.println("7,000円分もらう");
            p.money += 7000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 310){
            System.out.println("ご近所さんからおすそ分け");
            System.out.println("8,000円もらう");
            p.money += 8000;
            p.happy += 10;
        }else if(p.curent == 311){
            System.out.println("家事代行サービスを使う");
            System.out.println("9,000円払う");
            p.money -= 9000;
            p.happy += 10;
        }else if(p.curent == 312){
            System.out.println("友人に旅行のお土産をもらう");
            System.out.println("6,000円もらう");
            p.money += 6000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 10;
        }else if(p.curent == 313){
            System.out.println("遊園地に行ったら１万人目の客だった");
            System.out.println("25,000円もらう");
            p.money += 25000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 20;
        }else if(p.curent == 314){
            System.out.println("仕事で大手柄");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 20;
        }else if(p.curent == 315){
            System.out.println("迷い猫を発見");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
        }else if(p.curent == 316){
            System.out.println("適当なことを言っていたらいつの間にか占い師になっていた");
            System.out.println("8,000円もらう");
            p.money += 8000;
        }else if(p.curent == 317){
            System.out.println("行きつけの店がドラマの撮影現場になる");
            System.out.println("7,000円もらう");
            p.money += 7000;
            p.happy += 10;
        }else if(p.curent == 318){
            System.out.println("心霊スポットで祟られる");
            System.out.println("13,000円払う");
            p.money += -13000;
            p.happy += -30;
        }else if(p.curent == 319){
            System.out.println("友人の結婚式が続く");
            System.out.println("20,000円払う");
            p.money += -20000;
            p.happy += 10;
        }else if(p.curent == 320){
            System.out.println("同窓会のビンゴ大会で1番になる");
            System.out.println("16,000円もらう");
            p.money += 16000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 321){
            System.out.println("食べ放題で取りすぎる");
            System.out.println("7,000円払う");
            p.money += -7000;
            p.happy += -10;
        }else if(p.curent == 322){
            System.out.println("流行りのNFTで大儲け");
            System.out.println("70,000円もらう");
            p.money += 70000;
            p.happy += 20;
        }else if(p.curent == 323){
            System.out.println("大食いチャレンジが見事成功");
            System.out.println("9,000円もらう");
            p.money += 9000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 10;
        }else if(p.curent == 324){
            System.out.println("未曾有鵜の大寒波で電気代が高騰");
            System.out.println("14,000円払う");
            p.money += -14000;
            p.happy += -20;
        }else if(p.curent == 325){
            System.out.println("ネットカフェでまったり");
            System.out.println("3,000円払う");
            p.money += -3000;
            p.happy += 10;
        }else if(p.curent == 326){
            System.out.println("お年寄りを道案内");
            System.out.println("6,000円もらう");
            p.money += 6000;
        }else if(p.curent == 327){
            System.out.println("家賃滞納");
            System.out.println("15,000円払う");
            p.money += -15000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += -30;
        }else if(p.curent == 328){
            System.out.println("近くのカフェの常連客になりサービスしてもらう");
            System.out.println("8,000円もらう");
            p.money += 8000;
        }else if(p.curent == 329){
            System.out.println("ひったくりを捕まえる");
            System.out.println("お礼に10,000円もらう");
            p.money += 10000;
        }else if(p.curent == 330){
            System.out.println("雪まつりに参加");
            System.out.println("7,000円もらう");
            p.money += 7000;
        }else if(p.curent == 331){
            System.out.println("ダイエット本を出版");
            System.out.println("20,000円もらう");
            p.money += 20000;
        }else if(p.curent == 332){
            System.out.println("面白発明家として近所で有名になる");
            System.out.println("15,000円もらう");
            p.money += 15000;
            p.happy += 10;
        }else if(p.curent == 333){
            System.out.println("サウナに入りすぎて倒れる");
            System.out.println("5,000円払う");
            p.money += -5000;
            p.happy += -20;
        }else if(p.curent == 334){
            System.out.println("富士山登頂");
            System.out.println("9,000円もらう");
            p.money += 9000;
            p.happy += 10;
        }else if(p.curent == 335){
            System.out.println("福引で旅行が当たる");
            System.out.println("18,000円もらう");
            p.money += 18000;
            p.happy += 20;
        }else if(p.curent == 336){
            System.out.println("自転車が盗まれる");
            System.out.println("10,000円払う");
            p.money += -10000;
            p.happy += -30;
        }else if(p.curent == 337){
            System.out.println("スキューバダイビング中に宝箱発見");
            System.out.println("100,000円もらう");
            p.money += 100000;
            System.out.println("cp1もらう");
            p.cp += 1;
            p.happy += 40;
        }else if(p.curent == 338){
            System.out.println("仮想大会で優勝");
            System.out.println("40,000円もらう");
            p.money += 40000;
            p.happy += 10;
        }else if(p.curent == 339){
            System.out.println("絶叫マシンに乗ったら財布を落とした");
            System.out.println("7,000円払う");
            p.money += -7000;
            p.happy += -30;
        }else if(p.curent == 340){
            System.out.println("豪華客船でクルージング");
            System.out.println("70,000円払う");
            p.money += -70000;
            System.out.println("結婚していれば子どもが一人生まれる");
            if(p.pertner == 1){
                p.family += 1;
                p.happy += 50;
            }
            p.happy += 40;
        }else if(p.curent >= 341){
    p.curent = 399;
    }

    }

}