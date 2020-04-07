package com.sandra.pojo;

/**
 * @author yitang
 * @date 2020/03/29
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    /**
     * 使用Spring设置属性值必须要有set方法
     * @param str
     */
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
            "str='" + str + '\'' +
            '}';
    }
}
