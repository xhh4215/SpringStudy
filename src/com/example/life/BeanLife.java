package com.example.life;

/****
 * @auhtor luanguiming
 * @time 2019年8月27日
 * @function 学习bean的生命周期
 *
 */
public class BeanLife {
    /***
     * 执行自定义的初始化过程
     */
    public void initMyLife() {
        System.out.println("这是bean的初始化的方法");
    }

    /***
     * 执行自定义的销毁过程
     */
    public void destoryMyLife() {
        System.out.println("这是bean的销毁的方法");
    }
}
