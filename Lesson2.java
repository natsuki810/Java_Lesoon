public class Lesson2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String ans = "x+yは" + x + y;
        System.out.println(ans);

        //X+xは15と表示させたい

        int a = 5;
        int b = 10;
        String ans_2 = "x+yは" + (x + y);
        //()をつけて優先的に計算する（評価優先順位を上げる
        System.out.println(ans_2);
    }
}
