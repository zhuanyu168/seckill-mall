package day02;

public class ArrayAndMethod {
    public static void main(String[] args) {
        // ===== 数组：和 C 的三个不同 =====
        // 1. 数组本质是对象，new 出来放在堆上
        // 2. 有 length 属性（不是函数，没有括号）
        // 3. 越界访问会抛异常直接报错，而不是 C 那样的"未定义行为"
        int[] scores = new int[5];              // 默认值全是 0（C 里是脏数据）
        int[] init = {90, 85, 78, 92, 66};      // 静态初始化
        System.out.println("数组长度: " + init.length);

        System.out.println("最高分: " + maxOf(init));
        System.out.println("平均分: " + avgOf(init));

        // ===== 面试经典：Java 只有值传递 =====
        int a = 1, b = 2;
        swap(a, b);
        System.out.println("swap 后 a=" + a + " b=" + b);   // 没变！方法里交换的只是拷贝

        changeFirst(init);
        System.out.println("changeFirst 后第一个元素: " + init[0]);  // 变了！见下方注释

        // ===== 方法重载：同名不同参，编译器按参数类型自动选择 =====
        System.out.println(add(1, 2));          // 调 int,int 版
        System.out.println(add(1.5, 2.5));      // 调 double,double 版
        System.out.println(add(1, 2, 3));       // 调 int,int,int 版
    }

    static int maxOf(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) m = arr[i];
        }
        return m;
    }

    static double avgOf(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;            // 增强 for：遍历专用，C 没有的好东西
        return (double) sum / arr.length;      // 记得强转！两个 int 相除会丢小数
    }

    // 基本类型传参 = 传值的拷贝，方法里怎么改都不影响外面
    static void swap(int x, int y) {
        int t = x; x = y; y = t;
    }

    // 数组传参 = 传"引用的拷贝"，但拷贝的引用和原引用指向堆上同一个对象，
    // 所以能通过它修改对象内容（但把引用本身指向别处，外面也感知不到）
    static void changeFirst(int[] arr) {
        arr[0] = -1;
    }

    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }
}
