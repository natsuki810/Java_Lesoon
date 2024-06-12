public class Lesson4_4 {
    public static void main(String[] args) {
        boolean judge = true;
        if (judge == true) {
            int[] array = {1, 2, 3};
            array = null;
            // 参照を切る。参照型変数に代入するとその変数は何も参照しなくなる。
            array[0] = 10;
        }
    }
}
