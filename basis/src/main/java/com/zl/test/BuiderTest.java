package com.zl.test;

import com.zl.design.buider.buider.ComputerBuider;
import com.zl.design.buider.director.Director;
import com.zl.design.buider.pojo.Computer;
import org.junit.Test;

public class BuiderTest {
    @Test
    public void test(){
        ComputerBuider buider = new ComputerBuider();
        Director director = new Director(buider);
        Computer computer = director.getComputer();
        System.out.println(computer.toString());
    }
}
