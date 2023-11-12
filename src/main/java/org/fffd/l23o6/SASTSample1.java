package org.fffd.l23o6;

public class SASTSample1 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";

        // 模拟对数据库的认证
        authenticate(username, password);
    }

    private static void authenticate(String username, String password) {

        if ("admin".equals(username) && "admin123".equals(password)) {
            System.out.println("认证成功！");
        } else {
            System.out.println("认证失败！");
        }
    }
}
