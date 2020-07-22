package cn.itcast.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserService {

    private String username;

    public void fucking() {

        System.out.println("【UserService】の“★★★【fucking方法】★★★”, username = " + username);

    }

    public UserService() {
        System.out.println("【UserService】の“★★★【无参构造方法】★★★”, username = " + username);
    }
}
