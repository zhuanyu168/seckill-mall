package com.zhuanyu.Variable;

public class VariableDemo {

    public static void main(String[] args) {
   /*     微信余额：0元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共多少元？
        问题二：微信收了10元红包，又发了2元红包，余额多少？*/

        //1.定义一个变量表示微信余额
        int a = 0;

        //2.定义一个变量表示支付宝余额
        int b = 10;

        //3.定义一个变量表示银行卡余额
        int c = 20;

        //4.定义一个变量表示总余额
        int d = a + b + c;

        //5.输出总余额
        System.out.println("总余额为：" + d);


        //6.微信收了10元红包，又发了2元红包，微信余额多少？
        int e = a + 10 - 2;
        System.out.println("微信余额为：" + e);


    }
}
