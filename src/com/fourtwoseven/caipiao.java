package com.fourtwoseven;

import java.util.Scanner;

public class caipiao {
    public static void main(String[] args) {

    //彩票中奖

        //1.生成一个七位数的随机数
        int number = (int)(Math.random() * 9000000) + 1000000;
        //2.用户输入一个七位数并判断这个数是否是中奖号码
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个七位数：");
        int userInput = scanner.nextInt();
        boolean isWin = (userInput == number);
        scanner.close();

        //3.输出结果
        System.out.println("彩票号码是：" + number);
        if (isWin) {
            System.out.println("恭喜中奖！");
        } else {
            System.out.println("谢谢参与！");
        }


    }
}
