public class Lesson5_6 {
    public static int add (int x, int y){
        return x + y;
    }
    public static double add (double x, double y){
        return x + y;
    }
    public static String add (String x, String y){
        return x + y;
    }
    public static int add(int x, int y, int z){
        return x + y + z;
    }
    public static void main(String[] args){
        System.out.println(add(10, 20));
        System.out.println(add(3.5, 2.7));
        System.out.println(add("Hello", "World"));
        System.out.println(add(10, 20, 30));
    }
}
// オーバーロード=同じ名前のメソッドを複数定義する。仮引数の個数か型が異なる場合。=シグネチャが重複しない場合のみ許される。