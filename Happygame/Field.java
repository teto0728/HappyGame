//フィールドクラス　フィールドの効果
//決算や結婚のストップマスを作りたい

//j=Job c=現在地　k=金額

class Field {
    public static void f0(Player p,Player pa,Player pb){
        int r = Roulette.r();
        if(p.curent == 1){
            System.out.println("先輩に夕食をおごってもらう");
            System.out.println("2,000円もらう");
            p.money += 2000;
        }else if(p.curent == 2){
            System.out.println("教師になれる");
            System.out.println("気に入れば職業「教師」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("教師になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("教師になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99;
                        }else{
                            System.out.println("教師になりません");
                        }
                }   
        }else if(p.curent == 3){
            System.out.println("友人とピザパーティーをする");
            System.out.println("3,000円払う");
            p.money -= 3000;
        }else if(p.curent == 4){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 5){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 6){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 7){
            System.out.println("証明写真を何度も取り直す");
            System.out.println("4000円払う");
            p.money -= 4000;
        }else if(p.curent == 8){
            System.out.println("教師になれる");
            System.out.println("気に入れば職業「教師」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("教師になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("教師になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99;
                        }else{
                            System.out.println("教師になりません");
                        }
                }   
        }else if(p.curent == 9){
            System.out.println("英会話教室に通う");
            System.out.println("5,000円払いCPを1もらう");
            p.money -= 5000;
            p.cp += 1;
        }else if(p.curent == 10){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 11){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 12){
            System.out.println("教師");
            System.out.println("気に入れば職業「教師」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("教師になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("教師になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99;
                        }else{
                            System.out.println("教師になりません");
                        }
                }   
        }else if(p.curent == 13){
            System.out.println("大学を卒業　盛大に祝ってもらう");
            System.out.println("20,000円もらう");
            p.money += 20000;
        }else if(p.curent == 14){
            System.out.println("大学を留年する");
            System.out.println("10,000円払いスタートまで戻る");
            p.money -= 10000;
            p.curent = 0;
        }else if(p.curent == 15){
            System.out.println("サラリーマンになれる");
            System.out.println("気に入れば職業「サラリーマン」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("サラリーマンになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            p.jname = "サラリーマン";
                            System.out.println("サラリーマンになります");
                            p.curent = 99;
                        }else{
                            System.out.println("サラリーマンになりません");
                        }
                }   
        }else if(p.curent == 16){
            System.out.println("教師");
            System.out.println("気に入れば職業「教師」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("教師になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("教師になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 10){
                            p.jname = "教師";
                            System.out.println("教師になります");
                            p.curent = 99;
                        }else{
                            System.out.println("教師になりません");
                        }
                }   
        }else if(p.curent >= 17){
            p.curent = 99;
        }

    }
    
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――      
    public static void f40(Player p,Player pa,Player pb){
        int r = Roulette.r();
            if(p.curent == 41){
                System.out.println("成人式で羽目を外す");
                System.out.println("3,000円払う");
                p.money -= 3000;
                p.happy += 10;
            }else if(p.curent == 42){
                System.out.println("YouTuberになれる");
                System.out.println("気に入れば職業「YouTuber」になり");
                System.out.println("給料日まで進む");
                System.out.println("");
                System.out.println("YouTuberになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "YouTuber";
                            System.out.println("YouTuberになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("Youtuberになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "YouTuber";
                            System.out.println("YouTuberになります");
                            p.curent = 99;
                        }else{
                            System.out.println("YouTuberになりません");
                        }
                }   
        }else if(p.curent == 43){
            System.out.println("プログラマーになれる");
            System.out.println("気に入れば職業「プログラマー」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("プログラマーになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "プログラマー";
                            System.out.println("プログラマーになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("プログラマーになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "プログラマー";
                            System.out.println("プログラマーになります");
                            p.curent = 99;
                        }else{
                            System.out.println("プログラマーになりません");
                        }
                }   
    }else if(p.curent == 44){
            System.out.println("漫画家になれる");
            System.out.println("気に入れば職業「漫画家」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("漫画家になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "漫画家";
                            System.out.println("漫画家になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("サラリーマン漫画家になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "漫画家";
                            System.out.println("漫画家になります");
                            p.curent = 99;
                        }else{
                            System.out.println("漫画家になりません");
                        }
                }   
    }else if(p.curent == 45){
            System.out.println("マルチ商法に引っかかる");
            System.out.println("5,000円払う");
            p.money -= 5000;
            p.happy += -20;
    }else if(p.curent == 46){
            System.out.println("芸能人になれる");
            System.out.println("気に入れば職業「芸能人」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("芸能人になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "芸能人";
                            System.out.println("芸能人になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("芸能人になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "芸能人";
                            System.out.println("芸能人になります");
                            p.curent = 99;
                        }else{
                            System.out.println("芸能人になりません");
                        }
                }   
    }else if(p.curent == 47){
            System.out.println("実家から大量に仕送りがくる");
            System.out.println("5,000円もらう");
            p.money += 5000;
            p.happy += 10;
    }else if(p.curent == 48){
            System.out.println("財布を拾って交番に届ける");
            System.out.println("5,000円もらう");
            p.money += 5000;
    }else if(p.curent == 49){
            System.out.println("デザイナーになれる");
            System.out.println("気に入れば職業「デザイナー」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("デザイナーになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "デザイナー";
                            System.out.println("デザイナーになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("デザイナーになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "デザイナー";
                            System.out.println("デザイナーになります");
                            p.curent = 99;
                        }else{
                            System.out.println("デザイナーになりません");
                        }
                }   
    }else if(p.curent == 50){
            System.out.println("割のいいバイトを紹介してもらう");
            System.out.println("10,000円もらう");
            p.money += 10000;
            p.happy += 15;
    }else if(p.curent == 51){
            System.out.println("作家になれる");
            System.out.println("気に入れば職業「作家」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("作家になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "作家";
                            System.out.println("作家になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("作家になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "作家";
                            System.out.println("作家になります");
                            p.curent = 99;
                        }else{
                            System.out.println("作家になりません");
                        }
                }   
    }else if(p.curent == 52){
            System.out.println("医師になれる");
            System.out.println("気に入れば職業「医師」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("医師になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "医師";
                            System.out.println("医師になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("医師になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "医師";
                            System.out.println("医師になります");
                            p.curent = 99;
                        }else{
                            System.out.println("医師になりません");
                        }
                }   
    }else if(p.curent == 53){
            System.out.println("プログラマーになれる");
            System.out.println("気に入れば職業「プログラマー」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("プログラマーになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "プログラマー";
                            System.out.println("プログラマーになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("プログラマーになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "プログラマー";
                            System.out.println("プログラマーになります");
                            p.curent = 99;
                        }else{
                            System.out.println("プログラマーになりません");
                        }
                }   
    }else if(p.curent == 54){
            System.out.println("スポーツ選手になれる");
            System.out.println("気に入れば職業「スポーツ選手」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("スポーツ選手になりますか？");
            if(p.cpu == 0){
                System.out.println("1:yes 2:no");
                int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "スポーツ選手";
                            System.out.println("スポーツ選手になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("スポーツ選手になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "スポーツ選手";
                            System.out.println("スポーツ選手になります");
                            p.curent = 99;
                        }else{
                            System.out.println("スポーツ選手になりません");
                        }
                }   
    }else if(p.curent == 55){
            System.out.println("タンスの角に指をぶつける");
            System.out.println("治療費4,000円払う");
            p.money -= 4000;
            p.happy += -10;
    }else if(p.curent == 56){
            System.out.println("パイロット");
            System.out.println("気に入れば職業「パイロット」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("パイロットになりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "パイロット";
                            System.out.println("パイロットになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("パイロットになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "パイロット";
                            System.out.println("パイロットになります");
                            p.curent = 99;
                        }else{
                            System.out.println("パイロットになりません");
                        }
                }   
    }else if(p.curent == 57){
            System.out.println("料理人になれる");
            System.out.println("気に入れば職業「料理人」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("料理人になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "料理人";
                            System.out.println("料理人になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("料理人になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "料理人";
                            System.out.println("料理人になります");
                            p.curent = 99;
                        }else{
                            System.out.println("料理人になりません");
                        }
                }   
    }else if(p.curent == 58){
        System.out.println("サプライズパーティーを仕掛ける");
        System.out.println("4,000円払う");
        p.money -=4000;
        p.happy += 20;
    }else if(p.curent == 59){
        System.out.println("ウォーターサーバーの勧誘に負け契約する");
        System.out.println("7,000円払う");
        p.money -= 7000;
        p.happy += -30;
    }else if(p.curent == 60){
        System.out.println("役者になれる");
        System.out.println("気に入れば職業「役者」になり");
        System.out.println("給料日まで進む");
        System.out.println("");
        System.out.println("役者になりますか？");
            if(p.cpu == 0){
                System.out.println("1:yes 2:no");
                int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "役者";
                            System.out.println("役者になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("役者になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "役者";
                            System.out.println("役者になります");
                            p.curent = 99;
                        }else{
                            System.out.println("役者になりません");
                        }
                }   
    }else if(p.curent == 61){
        System.out.println("アイドルになれる");
        System.out.println("気に入れば職業「アイドル」になり");
        System.out.println("給料日まで進む");
        System.out.println("");
        System.out.println("アイドルになりますか？");
            if(p.cpu == 0){
                System.out.println("1:yes 2:no");
                int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "アイドル";
                            System.out.println("アイドルになります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("アイドルになりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "アイドル";
                            System.out.println("アイドルになります");
                            p.curent = 99;
                        }else{
                            System.out.println("アイドルになりません");
                        }
                }   
    }else if(p.curent == 62){
            System.out.println("農家になれる");
            System.out.println("気に入れば職業「農家」になり");
            System.out.println("給料日まで進む");
            System.out.println("");
            System.out.println("農家になりますか？");
                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "農家";
                            System.out.println("農家になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("農家になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "農家";
                            System.out.println("農家になります");
                            p.curent = 99;
                        }else{
                            System.out.println("農家になりません");
                        }
                }   
    }else if(p.curent == 63){
        System.out.println("モテ期到来！");
        System.out.println("8,000円もらう");
        p.money += 8000;
        p.happy += 50;
    }else if(p.curent == 64){
        System.out.println("政治家になれる");
        System.out.println("気に入れば職業「政治家」になり");
        System.out.println("給料日まで進む");
        System.out.println("");
        System.out.println("政治家になりますか？");
            if(p.cpu == 0){
                System.out.println("1:yes 2:no");
                int yn = Yn.yn();
                        if(yn == 1){
                            p.jname = "政治家";
                            System.out.println("政治家になります");
                            p.curent = 99; //第一給料日
                        }else{
                            System.out.println("政治家になりません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            p.jname = "政治家";
                            System.out.println("政治家になります");
                            p.curent = 99;
                        }else{
                            System.out.println("政治家になりません");
                        }
                }   
    }else if(p.curent >= 65){
        p.curent = 99;
    }
}

}