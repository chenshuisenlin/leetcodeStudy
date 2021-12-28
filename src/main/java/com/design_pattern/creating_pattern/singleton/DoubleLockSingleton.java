package com.design_pattern.creating_pattern.singleton;

public class DoubleLockSingleton {
    /*
    乍一看这个双重锁与懒汉模式没什么区别，但是其实双重锁的执行效率更高，而且并发效果更好。

这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没必要了。
双重锁模式中双重判断加同步的方式，比第一个例子中的效率大大提升，因为如果单层if判断，在服务器允许的情况下，假设有一百个线程，耗费的时间为100*（同步判断时间+if判断时间），而如果双重if判断，100的线程可以同时if判断，理论消耗的时间只有一个if判断的时间。所以如果面对高并发的情况，而且采用的是懒汉模式，最好的选择就是双重判断加同步的方式。

以上三个方式执行效果都是使对象只有一个实例，然而在实际的业务需求中，并不是所有人都按照你所制定的规则玩游戏(就连吃鸡都有人开挂呢……)。
     */
    private static volatile DoubleLockSingleton doubleLockSingleton;
    private DoubleLockSingleton(){}
    public static DoubleLockSingleton getInstance(){
        if(doubleLockSingleton == null){
            synchronized (DoubleLockSingleton.class){
                if(doubleLockSingleton == null){
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
