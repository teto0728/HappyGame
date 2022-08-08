public class Marriage {
    public static void m(Player p,Player pa,Player pb){
        int r = Roulette.r();
        System.out.println("結婚マス!");
            System.out.println("結婚チャレンジを行い");
            System.out.println("ルーレットで1～8がでれば");
            System.out.println("結婚することができます");
            System.out.println("結婚チャレンジを行いますか？");

                if(p.cpu == 0){
                    System.out.println("1:yes 2:no");
                    int yn =Yn.yn();
                        if(yn == 1){
                            System.out.println("結婚チャレンジを行います");
                            Roulette.r();
                            System.out.println(r);
                                if((r >= 1)&&(r <= 8)){
                                    System.out.println("おめでとう!");
                                    System.out.println("結婚できました");
                                    p.pertner = 1;
                                    System.out.println("ご祝儀で他のプレイヤーから10,000円ずつもらえます");
                                    p.money += 10000;
                                    pa.money -= 10000;
                                    pb.money -= 10000;
                                    System.out.println(p.name + "の所持金は" + p.money + "です");
                                    System.out.println(pa.name + "の所持金は" + pa.money + "です");
                                    System.out.println(pb.name + "の所持金は" + pb.money + "です");
                                }else{
                                    System.out.println("残念");
                                    System.out.println("結婚できませんでした");
                                }
                        }else{
                            System.out.println("結婚チャレンジを行いません");
                        }

                }else if (p.cpu == 1){ //CPUの場合
                    Roulette.r();
                        if(r <= 9){
                            System.out.println("結婚チャレンジを行います");
                            Roulette.r();
                            System.out.println(r);
                                if((r >= 1)&&(r <= 8)){
                                    System.out.println("おめでとう!");
                                    System.out.println("結婚できました");
                                    p.pertner = 1;
                                    System.out.println("ご祝儀で他のプレイヤーから10,000円ずつもらえます");
                                    p.money += 10000;
                                    pa.money -= 10000;
                                    pb.money -= 10000;
                                    System.out.println(p.name + "の所持金は" + p.money + "です");
                                    System.out.println(pa.name + "の所持金は" + pa.money + "です");
                                    System.out.println(pb.name + "の所持金は" + pb.money + "です");
                                }else{
                                    System.out.println("残念");
                                    System.out.println("結婚できませんでした");
                                }
                        }else{
                            System.out.println("結婚しません");
                        }
                }
    }

}