package cn.itcast.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserService();

    @org.junit.Test
    public void add() {
        userService.add();
    }

    @org.junit.Test
    public void del() {
        userService.del();
    }

    @org.junit.Test
    public void update() {
        userService.update();
    }

    @org.junit.Test
    public void query() {
        userService.query();
    }
}