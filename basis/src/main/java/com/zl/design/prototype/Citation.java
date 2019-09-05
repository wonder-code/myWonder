package com.zl.design.prototype;

/**
 * 原型模式
 */
public class Citation  implements Cloneable {
    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public Object clone() throws CloneNotSupportedException {   //重写object类中clone()方法
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
    public String display(){
        return name+info+":"+college;
    }
}
