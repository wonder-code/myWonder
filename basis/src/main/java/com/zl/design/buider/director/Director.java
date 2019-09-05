package com.zl.design.buider.director;

import com.zl.design.buider.buider.ComputerBuider;
import com.zl.design.buider.pojo.Computer;

public class Director {
    private ComputerBuider buider;
    public Director(ComputerBuider buider){
        this.buider = buider;
    }
    public Computer getComputer(){
        //buider.buildCpu();
        buider.buildNeicun();
        buider.buildXianka();
        return buider.getComputer();
    }
}
