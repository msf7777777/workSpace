package cn.itcast.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyFactory {
    // 目标类属性
    public Object target;

    // 通过构造方法将目标类传过来
    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    // api: 获取增强类, 就是代理对象
    public Object getProxy() {
        // 第一个参数: 目标类的类加载器
        // 第二个参数: 目标类的接口信息
        // 第三个参数: 指定增强的代码 和 调用目标代码
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("====================================== 开始");
                        // 1 调用业务代码, 目标类的代码
                        Object result = method.invoke(target, args);
                        // 2 调用增强代码
                        // 2.1 获取类名
                        String className = target.getClass().getName();
                        // 2.2 方法名
                        String methodName = method.getName();

                        if(methodName.startsWith("add")) {
                            // 2.3 增强代码, 记日志
                            System.out.println("****jdk动态代理 增强记录日志: " + className + "类" + methodName + "方法执行了 ... ...." );

                        }
                        System.out.println("====================================== 结束");
                        return result;
                    }
                }
        );
    }
}
