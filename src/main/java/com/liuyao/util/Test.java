package com.liuyao.util;

/**
 * @program: web
 * @description: 输出null的测试过程
 * @author: LiuB
 * @create: 2018-09-30 09:48
 **/
public class Test {
    public static void main(String[] args) {
        Base b = new Sub();
        b.callName();
        }
    }
    class Base {
        private String basename="base";
        public Base(){
            callName();
        }
        public void callName() {
            System.out.println(basename);
        }
    }
    class Sub extends Base{
        private String basename= "sub";
        @Override
        public void callName() {
         System.out.println(basename);
        }
}
