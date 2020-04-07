package com.sandra.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 复杂实体类；
 * 为学习Spring的各种注入方式，涵盖几乎所有的属性类型；
 */
public class Student {

    /**
     * 姓名；
     * 普通字符串类型
     */
    private String name;

    /**
     * 地址；
     * 自定义对象的引用类型
     */
    private Address address;

    /**
     * 书籍；
     * String数组类型
     */
    private String[] books;

    /**
     * 爱好；
     * List类型
     */
    private List<String> hobbies;

    /**
     * 卡；
     * Map类型
     */
    private Map<String, String> card;

    /**
     * 游戏；
     * Set类型
     */
    private Set<String> games;

    /**
     * 妻子；
     * 空指针类型
     */
    private String wife;

    /**
     * 信息；
     * Properties类型
     */
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    /**
     * 对于引用类型，要修改自动生成的toString方法；
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", address=" + address.toString() +
            ", books=" + Arrays.toString(books) +
            ", hobbies=" + hobbies +
            ", card=" + card +
            ", games=" + games +
            ", wife='" + wife + '\'' +
            ", info=" + info +
            '}';
    }
}
