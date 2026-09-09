package day03;

public class Student {
    // 字段（成员变量）：在堆上，每个对象各一份
    String name;
    int age;
    double score;

    // 构造方法：没有返回值类型，方法名必须与类名相同
    public Student(String name, int age, double score) {
        // this.name 是字段，name 是参数 —— 名字撞了就用 this 区分
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 注意：一旦手写了有参构造，编译器就不再送默认无参构造，需要自己补
    public Student() {
        this("未命名", 18, 0.0);   // this(...) 调用另一个构造方法，必须写在第一行
    }

    // 成员方法：对象的行为
    public String introduce() {
        return "我是" + name + "，" + age + "岁，成绩 " + score;
    }

    public boolean isExcellent() {
        return score >= 90;
    }
}
