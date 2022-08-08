import java.util.Scanner;
public class Runkup {
    public static void runk(Player p,Player pa,Player pb){
        int r = Roulette.r();
        int rflag = 0; //会話フラグ
        Roulette.r();
        if(p.cpu == 0){
        do{
        System.out.println("ランクアップか転職をすることができます");
        System.out.println("お手持ちのcpは" + p.cp + "です");
            if(p.cp <= 4){
                System.out.println("cpが足りません");
                rflag +=1;
            }else{
                    System.out.println("1：ランクアップ");
                    System.out.println("2：転職");
                    System.out.println("3：どちらもしない");
                    Scanner scanner = new Scanner(System.in);
    	            int rselect = scanner.nextInt();   //rselect = ランクアップか転職か
                            if (rselect == 1){ 
                                System.out.println("ランクアップしますか？");
                                System.out.println("1:yes 2:no");
                                int yn = new java.util.Scanner(System.in).nextInt();
                                    if(yn == 1){
                                        if(p.cp >= 5)
                                        p.cp -= 5;
                                            if(p.jname == "サラリーマン"){
                                                if(r <= 9){
                                                    p.jname = "部長";
                                                    System.out.println("職業が部長になった！");
                                                }else if(r == 10){
                                                    p.jname = "社長";
                                                    System.out.println("職業が社長になった！");
                                                }
                                            }else if(p.jname == "教師"){
                                                    if(r <= 9){
                                                    p.jname = "校長";
                                                    System.out.println("職業が校長になった！");
                                                    }else if(r == 10){
                                                    p.jname = "大学教授";
                                                    System.out.println("職業が大学教授になった！");
                                                    }
                                            }else if(p.jname == "YouTuber"){
                                                    if(r <= 9){
                                                    p.jname = "トップYouTuber";
                                                    System.out.println("職業がトップYouTuberになった！");
                                                    }else if(r == 10){
                                                    p.jname = "炎上YouTuber";
                                                    System.out.println("職業が炎上YouTuberになった！");
                                                    }
                                            }else if(p.jname == "プログラマー"){
                                                    if(r <= 9){
                                                    p.jname = "天才プログラマー";
                                                    System.out.println("職業が天才プログラマーになった！");
                                                    }else if(r == 10){
                                                    p.jname = "クラッカー";
                                                    System.out.println("職業がクラッカーになった！");
                                                    }
                                            }else if(p.jname == "漫画家"){
                                                    if(r <= 9){
                                                    p.jname = "人気漫画家";
                                                    System.out.println("職業が人気漫画家になった！");
                                                    }else if(r == 10){
                                                    p.jname = "アシスタント";
                                                    System.out.println("職業がアシスタントになった！");
                                                    }
                                            }else if(p.jname == "芸能人"){
                                                    if(r <= 9){
                                                    p.jname = "売れっ子芸能人";
                                                    System.out.println("職業が売れっ子芸能人になった！");
                                                    }else if(r == 10){
                                                    p.jname = "三流芸能人";
                                                    System.out.println("職業が三流芸能人になった！");
                                                    }
                                            }else if(p.jname == "デザイナー"){
                                                    if(r <= 9){
                                                    p.jname = "トップデザイナー";
                                                    System.out.println("職業がトップデザイナーになった！");
                                                    }else if(r == 10){
                                                    p.jname = "盗作デザイナー";
                                                    System.out.println("職業が盗作デザイナーになった！");
                                                    }
                                            }else if(p.jname == "医師"){
                                                    if(r <= 9){
                                                    p.jname = "医院長";
                                                    System.out.println("職業が医院長になった！");
                                                    }else if(r == 10){
                                                    p.jname = "闇医者";
                                                    System.out.println("職業が闇医者になった！");
                                                    }
                                            }else if(p.jname == "作家"){
                                                    if(r <= 9){
                                                    p.jname = "文学賞作家";
                                                    System.out.println("職業が文学賞作家になった！");
                                                    }else if(r == 10){
                                                    p.jname = "ゴーストライター";
                                                    System.out.println("職業がゴーストライターになった！");
                                                    }
                                            }else if(p.jname == "スポーツ選手"){
                                                    if(r <= 9){
                                                    p.jname = "メダリスト";
                                                    System.out.println("職業がメダリストになった！");
                                                    }else if(r == 10){
                                                    p.jname = "ドーピング選手";
                                                    System.out.println("職業がドーピング選手になった！");
                                                    }
                                            }else if(p.jname == "パイロット"){
                                                    if(r <= 9){
                                                    p.jname = "整備士";
                                                    System.out.println("職業が整備士になった！");
                                                    }else if(r == 10){
                                                    p.jname = "宇宙飛行士";
                                                    System.out.println("職業が宇宙飛行士になった！");
                                                    }
                                            }else if(p.jname == "料理人"){
                                                    if(r <= 9){
                                                    p.jname = "三ツ星シェフ";
                                                    System.out.println("職業が三ツ星シェフになった！");
                                                    }else if(r == 10){
                                                    p.jname = "管理栄養士";
                                                    System.out.println("職業が管理栄養士になった！");
                                                    }
                                            }else if(p.jname == "役者"){
                                                    if(r <= 9){
                                                    p.jname = "ハリウッド俳優";
                                                    System.out.println("職業がハリウッド俳優になった！");
                                                    }else if(r == 10){
                                                    p.jname = "熟練フリーター";
                                                    System.out.println("職業が熟練フリーターになった！");
                                                    }
                                            }else if(p.jname == "アイドル"){
                                                    if(r <= 7){
                                                    p.jname = "トップアイドル";
                                                    System.out.println("職業がトップアイドルになった！");
                                                    }else if(r >= 8){
                                                    System.out.println("ランクアップ失敗");
                                                    System.out.println("トップアイドルへの道は遠い");
                                                    p.cp += 5;
                                                    }
                                            }else if(p.jname == "農家"){
                                                    if(r <= 9){
                                                    p.jname = "ブランド農家";
                                                    System.out.println("職業がブランド農家になった！");
                                                    }else if(r == 10){
                                                    p.jname = "不作農家";
                                                    System.out.println("職業が不作農家になった！");
                                                    }
                                            }else if(p.jname == "政治家"){
                                                    if(r <= 9){
                                                    p.jname = "総理大臣";
                                                    System.out.println("職業が総理大臣になった！");
                                                    }else if(r == 10){
                                                    p.jname = "汚職政治家";
                                                    System.out.println("職業が汚職政治家になった！");
                                                    }
                                            }else{
                                                System.out.println("これ以上ランクアップできません");
                                            }
                                            rflag += 1;  
                                            
                                    }else if(yn == 2){
                                    
                                    }
                            }else if(rselect == 2){
                                System.out.println("転職しますか？");
                                System.out.println("1:yes 2:no");
                                int yn = new java.util.Scanner(System.in).nextInt();
                                    if(yn == 1){
                                        System.out.println("次の職業から選んでください");
                                        
                                        System.out.println("1:サラリーマン");
                                        System.out.println("使用cp:5");
                                    
                                        System.out.println("2:教師");
                                        System.out.println("使用cp:5");
                                        
                                        System.out.println("3:YouTuber");
                                        System.out.println("使用cp:5");
                                        
                                        System.out.println("4:プログラマー");
                                        System.out.println("使用cp:7");
                                        
                                        System.out.println("5:漫画家");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("6:芸能人");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("7:デザイナー");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("8:医師");
                                        System.out.println("使用cp:8");
                                        
                                        System.out.println("9:作家");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("10:スポーツ選手");
                                        System.out.println("使用cp:8");
                                        
                                        System.out.println("11:パイロット");
                                        System.out.println("使用cp:7");
                                        
                                        
                                        System.out.println("12:料理人");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("13:役者");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("14:アイドル");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("15:農家");
                                        System.out.println("使用cp:6");
                                        
                                        System.out.println("16:政治家");
                                        System.out.println("使用cp:9");

                                        int cselect = new java.util.Scanner(System.in).nextInt(); //どれに転職するか
                                            if(cselect == 1){
                                                if(p.jname == "サラリーマン"){
                                                    System.out.println("すでにサラリーマンです");
                                                }else{
                                                    if(p.cp <= 4){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 5){
                                                        System.out.println("職業サラリーマンになりました");
                                                        p.jname ="サラリーマン";
                                                        p.cp -= 5;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 2){
                                                if(p.jname == "教師"){
                                                    System.out.println("すでに教師です");
                                                }else{
                                                    if(p.cp <= 4){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 5){
                                                        System.out.println("職業教師になりました");
                                                        p.jname ="教師";
                                                        p.cp -= 5;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 3){
                                                if(p.jname == "YouTuber"){
                                                    System.out.println("すでにYouTuberです");
                                                }else{
                                                    if(p.cp <= 4){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 5){
                                                        System.out.println("職業YouTuberになりました");
                                                        p.jname ="YouTuber";
                                                        p.cp -= 5;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 4){
                                                if(p.jname == "プログラマー"){
                                                    System.out.println("すでにプログラマーです");
                                                }else{
                                                    if(p.cp <= 6){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 7){
                                                        System.out.println("職業プログラマーになりました");
                                                        p.jname ="プログラマー";
                                                        p.cp -= 7;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 5){
                                                if(p.jname == "漫画家"){
                                                    System.out.println("すでに漫画家です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業漫画家になりました");
                                                        p.jname ="漫画家";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 6){
                                                if(p.jname == "芸能人"){
                                                    System.out.println("すでに芸能人です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業芸能人になりました");
                                                        p.jname ="芸能人";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 7){
                                                if(p.jname == "デザイナー"){
                                                    System.out.println("すでにデザイナーです");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業デザイナーになりました");
                                                        p.jname ="デザイナー";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 8){
                                                if(p.jname == "医師"){
                                                    System.out.println("すでに医師です");
                                                }else{
                                                    if(p.cp <= 7){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 8){
                                                        System.out.println("職業医師になりました");
                                                        p.jname ="医師";
                                                        p.cp -= 8;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 9){
                                                if(p.jname == "作家"){
                                                    System.out.println("すでに作家です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業作家になりました");
                                                        p.jname ="作家";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 10){
                                                if(p.jname == "スポーツ選手"){
                                                    System.out.println("すでにスポーツ選手です");
                                                }else{
                                                    if(p.cp <= 7){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 8){
                                                        System.out.println("職業スポーツ選手になりました");
                                                        p.jname ="スポーツ選手";
                                                        p.cp -= 8;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 11){
                                                if(p.jname == "パイロット"){
                                                    System.out.println("すでにパイロットです");
                                                }else{
                                                    if(p.cp <= 6){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 7){
                                                        System.out.println("職業パイロットになりました");
                                                        p.jname ="パイロット";
                                                        p.cp -= 7;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 12){
                                                if(p.jname == "料理人"){
                                                    System.out.println("すでに料理人です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業料理人になりました");
                                                        p.jname ="料理人";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 13){
                                                if(p.jname == "役者"){
                                                    System.out.println("すでに役者です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業役者になりました");
                                                        p.jname ="役者";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 14){
                                                if(p.jname == "アイドル"){
                                                    System.out.println("すでにアイドルです");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業アイドルになりました");
                                                        p.jname ="アイドル";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 15){
                                                if(p.jname == "農家"){
                                                    System.out.println("すでに農家です");
                                                }else{
                                                    if(p.cp <= 5){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 6){
                                                        System.out.println("職業農家になりました");
                                                        p.jname ="農家";
                                                        p.cp -= 6;
                                                        rflag += 1;
                                                    }
                                                }
                                            }else if(cselect == 16){
                                                if(p.jname == "政治家"){
                                                    System.out.println("すでに政治家です");
                                                }else{
                                                    if(p.cp <= 8){
                                                        System.out.println("cpが足りません");
                                                    }else if(p.cp >= 9){
                                                        System.out.println("職業政治家になりました");
                                                        p.jname ="政治家";
                                                        p.cp -= 9;
                                                        rflag += 1;
                                                    }
                                                }
                                            }
                                            
                                    }else if(yn == 2){
                                        
                                    }
                            }else if(rselect ==3){
                                rflag +=1;
                            }
            } //cpが5以上
        }while(rflag == 0); //do while
        } //cpuが0
        
        if(p.cpu == 1){
            System.out.println("ランクアップか転職をすることができます");
            if(p.cp >= 5){
                p.cp -= 5;
                    if(p.jname == "サラリーマン"){
                        if(r <= 9){
                            p.jname = "部長";
                            System.out.println("職業が部長になった！");
                        }else if(r == 10){
                            p.jname = "社長";
                            System.out.println("職業が社長になった！");
                        }
                    }else if(p.jname == "教師"){
                        if(r <= 9){
                            p.jname = "校長";
                            System.out.println("職業が校長になった！");
                        }else if(r == 10){
                            p.jname = "大学教授";
                            System.out.println("職業が大学教授になった！");
                        }
                    }else if(p.jname == "YouTuber"){
                        if(r <= 9){
                            p.jname = "トップYouTuber";
                            System.out.println("職業がトップYouTuberになった！");
                        }else if(r == 10){
                            p.jname = "炎上YouTuber";
                            System.out.println("職業が炎上YouTuberになった！");
                        }
                    }else if(p.jname == "プログラマー"){
                        if(r <= 9){
                            p.jname = "天才プログラマー";
                            System.out.println("職業が天才プログラマーになった！");
                        }else if(r == 10){
                            p.jname = "クラッカー";
                            System.out.println("職業がクラッカーになった！");
                        }
                    }else if(p.jname == "漫画家"){
                        if(r <= 9){
                            p.jname = "人気漫画家";
                            System.out.println("職業が人気漫画家になった！");
                        }else if(r == 10){
                            p.jname = "アシスタント";
                            System.out.println("職業がアシスタントになった！");
                        }
                    }else if(p.jname == "芸能人"){
                        if(r <= 9){
                            p.jname = "売れっ子芸能人";
                            System.out.println("職業が売れっ子芸能人になった！");
                        }else if(r == 10){
                            p.jname = "三流芸能人";
                            System.out.println("職業が三流芸能人になった！");
                        }
                    }else if(p.jname == "デザイナー"){
                        if(r <= 9){
                            p.jname = "トップデザイナー";
                            System.out.println("職業がトップデザイナーになった！");
                        }else if(r == 10){
                            p.jname = "盗作デザイナー";
                            System.out.println("職業が盗作デザイナーになった！");
                        }
                    }else if(p.jname == "医師"){
                        if(r <= 9){
                            p.jname = "医院長";
                            System.out.println("職業が医院長になった！");
                        }else if(r == 10){
                            p.jname = "闇医者";
                            System.out.println("職業が闇医者になった！");
                        }
                    }else if(p.jname == "作家"){
                        if(r <= 9){
                            p.jname = "文学賞作家";
                            System.out.println("職業が文学賞作家になった！");
                        }else if(r == 10){
                            p.jname = "ゴーストライター";
                            System.out.println("職業がゴーストライターになった！");
                        }
                    }else if(p.jname == "スポーツ選手"){
                        if(r <= 9){
                            p.jname = "メダリスト";
                            System.out.println("職業がメダリストになった！");
                        }else if(r == 10){
                            p.jname = "ドーピング選手";
                            System.out.println("職業がドーピング選手になった！");
                        }
                    }else if(p.jname == "パイロット"){
                        if(r <= 9){
                            p.jname = "整備士";
                            System.out.println("職業が整備士になった！");
                        }else if(r == 10){
                            p.jname = "宇宙飛行士";
                            System.out.println("職業が宇宙飛行士になった！");
                        }
                    }else if(p.jname == "料理人"){
                        if(r <= 9){
                            p.jname = "三ツ星シェフ";
                            System.out.println("職業が三ツ星シェフになった！");
                        }else if(r == 10){
                            p.jname = "管理栄養士";
                            System.out.println("職業が管理栄養士になった！");
                        }
                    }else if(p.jname == "役者"){
                        if(r <= 9){
                            p.jname = "ハリウッド俳優";
                            System.out.println("職業がハリウッド俳優になった！");
                        }else if(r == 10){
                            p.jname = "熟練フリーター";
                            System.out.println("職業が熟練フリーターになった！");
                        }
                    }else if(p.jname == "アイドル"){
                        if(r <= 7){
                            p.jname = "トップアイドル";
                            System.out.println("職業がトップアイドルになった！");
                        }else if(r >= 8){
                            System.out.println("ランクアップ失敗");
                            System.out.println("トップアイドルへの道は遠い");
                            p.cp += 5;
                        }
                    }else if(p.jname == "農家"){
                        if(r <= 9){
                            p.jname = "ブランド農家";
                            System.out.println("職業がブランド農家になった！");
                        }else if(r == 10){
                            p.jname = "不作農家";
                            System.out.println("職業が不作農家になった！");
                        }
                    }else if(p.jname == "政治家"){
                        if(r <= 9){
                            p.jname = "総理大臣";
                            System.out.println("職業が総理大臣になった！");
                        }else if(r == 10){
                            p.jname = "汚職政治家";
                            System.out.println("職業が汚職政治家になった！");
                        }
                    }else{
                        System.out.println("これ以上ランクアップできません");
                    }
            }  //cpu1のcpが5以上の動作
        } //cpu1の動作
    } //メソッド
} //クラス