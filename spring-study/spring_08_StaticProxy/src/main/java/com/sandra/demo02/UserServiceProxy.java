package com.sandra.demo02;

public class UserServiceProxy implements UserService{

    UserServiceImpl userService = new UserServiceImpl();

    /**
     * 原来我们注入一个对象会使用有参的构造函数；
     * 但Spring推荐使用set方法来注入一个对象；
     * @param userService
     */
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    /**
     * 代理类处理方法之
     *          日志方法
     * @param msg
     */
    private void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
