package com.sandra.pojo;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 不重写toString方法只有一个类名@数字的信息
     * @return
     */
    @Override
    public String toString() {
        return "Address{" +
            "address='" + address + '\'' +
            '}';
    }
}
