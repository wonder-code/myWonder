package com.zl.design.proxy.proxy;

import com.zl.design.proxy.impl.Ticket;
import com.zl.design.proxy.intef.Ticketintef;

public class TicketProxy implements Ticketintef {
    private Ticket ticket = new Ticket();

    public void sellTicket() {
        increasePrice();
        ticket.sellTicket();
    }
    public void increasePrice(){
        System.out.println("中间商赚差价...");
        ticket.price+=20;
    }
}
