public class Happy{
    public static void happy(Player p,Player pa,Player pb){
        double [] x = {p.happy,pa.happy,pb.happy};
        String [] y = {p.name,pa.name,pb.name};
        for(int i = 0; i < x.length; i++){ 
            System.out.print(y[i] + "は");
            if(x[i] < 0){
                System.out.println("散々な人生だった");
            }else if((x[i] >= 0) && (x[i] <= 100)){
                System.out.println("貧しくつつましい人生だった");
            }else if((x[i] > 100) && (x[i] <= 300)){
                System.out.println("一般的な幸せをつかんだ");
            }else if((x[i] > 300) && (x[i] <= 800)){
                System.out.println("とてもいい人生だった");
            }else if(x[i] > 800){
                System.out.println("誰もがうらやむ人生だった");
            }
        }
    }
}