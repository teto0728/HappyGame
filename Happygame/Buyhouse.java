public class Buyhouse {
    public static void buy(Player p,Player pa,Player pb,Home ha,Home hb,Home hc,Home hd,Home he,Home hf,Home hg){
        
        //―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― HOMEインスタンス化
        
        //―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― 
        
        int hflag = 0; //家購入の会話フラグ　0なら以下の会話をループ
                if (p.cpu == 0){
                    do{
                        System.out.println("家を購入することができます");
                        System.out.println("1:一軒家A/50,000円");
                        System.out.println("2:一軒家B/80,000円");
                        System.out.println("3:一軒家C/150,000円");
                        System.out.println("4:マンションD/50,000円");
                        System.out.println("5:マンションE/100,000円");
                        System.out.println("6:マンションF/200,000円");
                        System.out.println("7:豪邸G/500,000円");
                        System.out.println("8:購入しない");
                        int homeselect = Yn.yn();
                            if (homeselect == 1){ //このynは1～8までの家の選択でyes,noではない
                                if (ha.owner == 0){
                                    System.out.println(ha.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(ha.name + "を購入します");
                                             p.money -= 50000;
                                             ha.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (ha.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 2){ //このynは1～8までの家の選択でyes,noではない
                                if (hb.owner == 0){
                                    System.out.println(hb.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(hb.name + "を購入します");
                                             p.money -= 80000;
                                             hb.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (hb.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 3){ //このynは1～8までの家の選択でyes,noではない
                                if (hc.owner == 0){
                                    System.out.println(hc.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(hc.name + "を購入します");
                                             p.money -= 150000;
                                             hc.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (hc.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 4){ //このynは1～8までの家の選択でyes,noではない
                                if (hd.owner == 0){
                                    System.out.println(hd.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(hd.name + "を購入します");
                                             p.money -= 50000;
                                             hd.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (hd.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 5){ //このynは1～8までの家の選択でyes,noではない
                                if (he.owner == 0){
                                    System.out.println(he.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(he.name + "を購入します");
                                             p.money -= 100000;
                                             he.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (he.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 6){ //このynは1～8までの家の選択でyes,noではない
                                if (hf.owner == 0){
                                    System.out.println(hf.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(hf.name + "を購入します");
                                             p.money -= 200000;
                                             hf.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (hf.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else if (homeselect == 7){ //このynは1～8までの家の選択でyes,noではない
                                if (hg.owner == 0){
                                    System.out.println(hg.name + "を購入しますか？");
                                    System.out.println("1:yes 2:no");
                                    int yn = Yn.yn();
                                        if (yn == 1){
                                             System.out.println(hg.name + "を購入します");
                                             p.money -= 500000;
                                             hg.owner += 1;
                                             hflag += 1;
                                        }
                                }else if (hg.owner >= 1){
                                    System.out.println("この物件は既に購入されています");
                                }
                            }else {
                                System.out.println("購入しません");
                                hflag += 1;
                            }
                    }while(hflag == 0);
                    hflag = 0;
                    
                }else if (p.cpu == 1){
                    if ((p.money > 70000) && (p.money <= 100000) && (ha.owner == 0)){ //a
                        System.out.println(ha.name + "を購入します");
                        p.money -= 50000;
                        ha.owner += 1;
                        hflag += 1;
                    } else if ((p.money > 100000) && (p.money <= 13000) && (hb.owner == 0)){ //b
                        System.out.println(hb.name + "を購入します");
                        p.money -= 80000;
                        hb.owner += 1;
                        hflag += 1; 
                    } else if ((p.money > 130000) && (p.money <= 18000) && (hc.owner == 0)){ //c
                        System.out.println(hc.name + "を購入します");
                        p.money -= 150000;
                        hc.owner += 1;
                        hflag += 1;            
                    } else if ((p.money > 70000) && (p.money <= 130000) && (hd.owner == 0)){ //d
                        System.out.println(hd.name + "を購入します");
                        p.money -= 50000;
                        hd.owner += 1;
                        hflag += 1;            
                    } else if ((p.money > 130000) && (p.money <= 230000) && (he.owner == 0)){ //e
                        System.out.println(he.name + "を購入します");
                        p.money -= 50000;
                        he.owner += 1;
                        hflag += 1;            
                    } else if ((p.money > 230000) && (p.money <= 600000) && (hf.owner == 0)){ //f
                        System.out.println(hf.name + "を購入します");
                        p.money -= 200000;
                        hf.owner += 1;
                        hflag += 1;            
                    } else if ((p.money > 600000) && (hg.owner == 0)){ //g
                        System.out.println(hg.name + "を購入します");
                        p.money -= 500000;
                        hg.owner += 1;
                        hflag += 1;  
                    }
                }
    }

}