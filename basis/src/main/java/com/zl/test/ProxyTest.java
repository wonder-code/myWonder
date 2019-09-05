package com.zl.test;

import com.zl.design.proxy.impl.Ticket;
import com.zl.design.proxy.proxy.TicketProxy;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void test(){
        Ticket ticket = new Ticket();
        ticket.sellTicket();
        TicketProxy ticketProxy = new TicketProxy();
        ticketProxy.sellTicket();
        Ticket ticket1 = new Ticket();
        ticket1.sellTicket();
        TicketProxy ticketProxy1 = new TicketProxy();
        ticketProxy1.sellTicket();
    }
}
