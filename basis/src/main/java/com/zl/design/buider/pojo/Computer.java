package com.zl.design.buider.pojo;

public class Computer {
    private String cpu;
    private String neicun;
    private String xianka;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", neicun='" + neicun + '\'' +
                ", xianka='" + xianka + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getXianka() {
        return xianka;
    }

    public void setXianka(String xianka) {
        this.xianka = xianka;
    }
}
