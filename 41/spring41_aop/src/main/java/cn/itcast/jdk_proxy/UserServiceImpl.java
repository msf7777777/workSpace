package cn.itcast.jdk_proxy;

public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println("【UserServiceImpl】的login方法.......");
    }
}
