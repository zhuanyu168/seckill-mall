package day03;

public class OopDemo {
    public static void main(String[] args) {
        // new 做了三件事：堆上开空间 -> 调用构造方法初始化 -> 把地址交给引用 s1
        // 对照 C：Student* s = (Student*)malloc(sizeof(Student)); 再手动初始化
        // Java 的引用 ≈ C 的指针，但只能指向对象，不能做 ++ 等地址运算
        Student s1 = new Student("小明", 20, 92.5);
        Student s2 = new Student("小红", 21, 85);

        System.out.println(s1.introduce());
        System.out.println(s2.introduce());
        System.out.println(s1.name + (s1.isExcellent() ? " 是优等生" : " 还需努力"));

        // 引用赋值：s3 和 s1 指向堆上同一个对象
        // （这是以后理解 == 和 equals 区别的地基，现在先记住现象）
        Student s3 = s1;
        s3.age = 99;
        System.out.println("通过 s3 改 age 后，s1.age = " + s1.age);   // 99，因为是同一个对象
    }
}
