package com.example.di.xml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/****
 * @author luanguiming
 * @time 2019年8月27日
 * @function 实现对bean的XMl装配方式的学习
 *  1 使用构造器注入：bean得实现方法需要提供一个带参数的构造方法 在bean元素的子元素
 *    中使用<constructor-arg>来定义构造方法的参数
 *  2 使用Setter方式注入：需要一个默认的无法参数的构造器 和注入属性的setter方法 在
 *    bean元素的子元素中使用<property>为每个属性注入值
 */

public class ComplexUser {
    private String name;
    private List<String> hobbyList;
    private Map<String, String> resideMap;
    private Set<String> aliasSet;
    private String[] array;

    /***
     * 使用构造器注入的时候使用的带参数的构造器
     * @param name
     * @param hobbyList
     * @param resideMap
     * @param aliasSet
     * @param array
     */
    public ComplexUser(String name, List<String> hobbyList, Map<String, String> resideMap, Set<String> aliasSet, String[] array) {
        this.name = name;
        this.hobbyList = hobbyList;
        this.resideMap = resideMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    public ComplexUser() {
        super();
    }

    /***
     * setter注入方式的时候使用的setter方法
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResideMap(Map<String, String> resideMap) {
        this.resideMap = resideMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ComplexUser{" +
                "name='" + name + '\'' +
                ", hobbyList=" + hobbyList +
                ", resideMap=" + resideMap +
                ", aliasSet=" + aliasSet +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
