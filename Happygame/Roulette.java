//ルーレットクラス1～10までの乱数を生成
class Roulette{
    public static int r(){
    int r = new java.util.Random().nextInt(10);
    
    return (r +1);
    }
}