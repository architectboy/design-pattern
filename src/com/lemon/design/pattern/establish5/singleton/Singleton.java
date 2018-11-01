package com.lemon.design.pattern.establish5.singleton;

/**
 * 单例模式
 */
public class Singleton {
    //私有静态实例，防止被引用，此处为null，目的是实现延迟加载
    private static Singleton singleton = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {}

    /**
     * 静态工程方法，创建实例
     * @return
     */
    private static synchronized void syncInit() {
        if (singleton == null) {
            singleton = new Singleton();
        }
    }

    /**
     * 将创建与获得实例分开，既提高了效率也避免了出现错误
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            syncInit();
        }
        return singleton;
    }
}
