import java.lang.ProcessHandle.Info;

public class Behavior {
    public static void d(){
        
        //プレイヤー1定義
        Player p1 = new Player();

        //プレイヤー2定義
        Player p2 = new Player();
    
        //プレイヤー3定義
        Player p3 = new Player();
        
        //順番を決め該当番以外をCPU操作に位置付ける
    System.out.println("順番を決めます");
    System.out.println("ルーレットを回してください");
    int n = new java.util.Random().nextInt(3); //以下2行で順番決めの変数ｎの定義
    int no = n + 1;
    System.out.println(no);
    System.out.println("あなたの順番は" + no + "番目です");

        if(no == 1){
            p2.cpu =1;
            p3.cpu =1;
        }else if (no == 2){
            p1.cpu =1;
            p3.cpu =1;
        }else if (no == 3){
            p1.cpu =1;
            p2.cpu =1;
        }
        
        //プレイヤー名の設定
        if(p1.cpu == 0){
            p1.name ="あなた";
            p2.name ="プレイヤー1";
            p3.name ="プレイヤー2";
        }else if (p2.cpu == 0){
            p1.name ="プレイヤー1";
            p2.name ="あなた";
            p3.name ="プレイヤー2";
        }else if(p3.cpu == 0){
            p1.name ="プレイヤー1";
            p2.name ="プレイヤー2";
            p3.name ="あなた";
        }
        
        //―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― HOMEインスタンス化
        Home ha = new Home();
        ha.name = "一軒家A";
        ha.value = 50000;
        ha.owner = 0;
        ha.ownername = "あなた";
        
        Home hb = new Home();
        hb.name = "一軒家B";
        hb.value = 80000;
        hb.owner = 0;
        hb.ownername = "プレイヤー1";
        
        Home hc = new Home();
        hc.name = "一軒家C";
        hc.value = 150000;
        hc.owner = 0;
        hc.ownername = "-";
        
        Home hd = new Home();
        hd.name = "マンションD";
        hd.value = 50000;
        hd.owner = 0;
        hd.ownername = "-";
        
        Home he = new Home();
        he.name = "マンションE";
        he.value = 100000;
        he.owner = 0;
        he.ownername = "-";
        
        Home hf = new Home();
        hf.name = "マンションF";
        hf.value = 200000;
        hf.owner = 0;
        hf.ownername = "-";
        
        Home hg = new Home();
        hg.name = "豪邸G";
        hg.value = 500000;
        hg.owner = 0;
        hg.ownername = "-";

        int i = 0; //ターン数を図るi
    
        do{
        System.out.println("-----------------------"+ i +"ターン目----------------------");           
        //同クラス内のddメソッドで動作させる。フィールド最大数を変更したとき変更する
        dd(p1,p2,p3,ha,hb,hc,hd,he,hf,hg);  //三人のデータを入れるのはハッカーなどで手番以外の情報がいるため
        System.out.println("");
        
        dd(p2,p1,p3,ha,hb,hc,hd,he,hf,hg);
        System.out.println("");
        
        dd(p3,p1,p2,ha,hb,hc,hd,he,hf,hg);
        System.out.println("");

        i++;
        }while((p1.curent <= 9999)||(p2.curent <= 9999)||(p3.curent <= 9999));
        
        Scores.scores(p1,p2,p3);
        System.out.println("");
        
        Happy.happy(p1,p2,p3);
        
        System.out.println("おわり");
        
    }

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――

//pa=手番でないプレイヤー1  pb=手番でないプレイヤー2 クラッカーで使用
//yn=選択肢yes,no
//ci=自動車保険
        //↑のdメソッドから受け取るddメソッド
    public static void dd(Player p,Player pa,Player pb,Home ha,Home hb,Home hc,Home hd,Home he,Home hf,Home hg){
        int r = Roulette.r();
        System.out.println(p.name +"の番です");  

        if(p.name == "あなた"){
            Action.a(p);
        }


//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
            if ((p.curent >= 600)&&(p.curent <= 617)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field7.f600(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
//―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
//600~641
            }else if ((p.curent >= 500)&&(p.curent <= 541)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field6.f500(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
//―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
            }else if ((p.curent >= 400)&&(p.curent <= 441)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field5.f400(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
//―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
            }else if ((p.curent >= 300)&&(p.curent <= 341)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field4.f300(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
//―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
    
            }else if ((p.curent >= 200)&&(p.curent <= 241)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field3.f200(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――                
                
                //stopマス以降のルート 2
            }else if ((p.curent >= 100)&&(p.curent <= 141)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field2.f100(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
            //堅実コース
    
            } else if ((p.curent >= 0)&&(p.curent <= 17)){    
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field.f0(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
            //職人コース
    
            }else if((p.curent >= 40)&&(p.curent <= 65)){
                p.curent += r; //ルーレットで進む
                System.out.println(r +"すすむ");
                Field.f40(p,pa,pb);    //f9=ストップマス以前のマップ
                System.out.println(p.name + "の所持金は" + p.money + "です");
                System.out.println("");
            } 

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
//給料日1           
        if(p.curent == 99){
            System.out.println("給料日!");
            Job.job(p,pa,pb);
            System.out.println("5,000円で生命保険に入れます");
            System.out.println("生命保険に入りますか？");
            System.out.println("1:yes 2:no");
                
                if(p.cpu == 0){
                    int yn = Yn.yn();
                        if(yn == 1){
                            System.out.println("生命保険に入ります");
                            p.li = 1;
                            p.money -= 5000;
                            System.out.println(p.name + "の所持金は" + p.money + "です");
                        }else{
                            System.out.println("生命保険に入りません");
                        }

                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 8){
                            System.out.println("生命保険に入ります");
                            p.li = 1;
                            p.money -= 5000;
                            System.out.println(p.name + "の所持金は" + p.money + "です");
                        }else{
                            System.out.println("生命保険に入りません");
                        }
                }
            p.curent = 100;
        }
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//結婚マス           
        if(p.curent == 199){
            Marriage.m(p,pa,pb);
        
            Buyhouse.buy(p,pa,pb,ha,hb,hc,hd,he,hf,hg);             
            

            p.curent = 200; //200へ
        }
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
//給料日2        
        if(p.curent == 299){
            System.out.println("給料日!");
            Job.job(p,pa,pb);
            Buyhouse.buy(p,pa,pb,ha,hb,hc,hd,he,hf,hg);
            Runkup.runk(p,pa,pb);
            p.curent = 300;
        }
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
//給料日3       
        if(p.curent == 399){
            System.out.println("給料日!");
            Job.job(p,pa,pb);
            Buyhouse.buy(p,pa,pb,ha,hb,hc,hd,he,hf,hg);
            Runkup.runk(p,pa,pb);
            p.curent = 400;
        }
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
//給料日4       
        if(p.curent == 499){
            System.out.println("給料日!");
            Job.job(p,pa,pb);
            Buyhouse.buy(p,pa,pb,ha,hb,hc,hd,he,hf,hg);
            Runkup.runk(p,pa,pb);
            p.curent = 500;
        }

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
//決算       
        if(p.curent == 599){
            System.out.println("決算");
            Job.job(p,pa,pb);
            Retirement.retire(p,ha,hb,hc,hd,he,hf,hg);
            
            p.curent = 600;
        }
//幸福値――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
        if(p.money <= 0){
            p.happy = p.happy*0.9;
        }
        if(p.house == 1){
            p.happy = p.happy*1.5;
        }else if(p.house >= 2){
            p.happy = p.happy*2;
        }  
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――


          //スタート動作　初めに戻るマスを考慮して0とは分けたほうがいいかも  
        if (p.curent == 9998){ 
            System.out.println("所持金10,000円からのスタートです"); 
            System.out.println("自動車保険に3000円で入れます");
            System.out.println("自動車保険に入りますか？");
            System.out.println("1:yes 2:no");
                
                if(p.cpu == 0){
                    int yn = Yn.yn();
                        if(yn == 1){
                            System.out.println("自動車保険に入ります");
                            p.ci = 1;
                            p.money -= 3000;
                            System.out.println(p.name + "の所持金は" + p.money + "です");
                        }else{
                            System.out.println("自動車保険に入りません");
                        }
                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 7){
                            System.out.println("自動車保険に入ります");
                            p.ci = 1;
                            p.money -= 3000;
                            System.out.println(p.name + "の所持金は" + p.money + "です");  
                        }else{
                            System.out.println("自動車保険に入りません");
                        }
                }       

            p.curent = 9997;
        }
//―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
//保険処理のないスタートマス
        if(p.curent == 9997){
            System.out.println("どちらの職業コースに進むかルーレットで決めてください"); 
            System.out.println("1～5なら堅実サラリーマンコース"); 
            System.out.println("6～10なら夢追い人コース"); 
            System.out.println(r);
                if (r <= 5){
                    System.out.println("堅実サラリーマンコースです");
                    p.curent = 0; 
                }else if (r >= 6){
                    System.out.println("夢追い人コースです");
                    p.curent = 40; 
                }
        }

//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――            
            
            //一度目にゴールしたときの処理(以降は100の位置で処理する)
        if(p.curent == 9999){
            System.out.println(p.name + "はゴールしました");
            System.out.println(p.name + "の所持金は" + p.money + "です");
            System.out.println("");
            p.curent = 10000;
        }
                
//――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――                
            //ゴール以降はここの位置で処理する  3人以上になったときで二位以上を決める際の一位の扱い  
        if(p.curent == 10000){
            System.out.println("ルーレットで出た数×1000円もらえます");
            p.money += (r * 1000);
            System.out.println(r);
            System.out.println(r*1000 +"円もらう");
            System.out.println(p.name + "の所持金は" + p.money + "です");
            System.out.println();
        }
    }
}