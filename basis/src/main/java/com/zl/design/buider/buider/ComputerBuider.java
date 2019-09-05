package com.zl.design.buider.buider;

import com.zl.design.buider.abstra.ComputerBuiderBase;
import com.zl.design.buider.pojo.Computer;

public class ComputerBuider extends ComputerBuiderBase {
    public void buildCpu(){
        computer.setCpu("aa");
    }

    public void buildXianka() {
        computer.setXianka("bb");
    }

    public void buildNeicun() {
        computer.setNeicun("cc");
    }
}
