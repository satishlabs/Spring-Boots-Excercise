package com.satishlabs.ticketbookingrest.service;


import com.satishlabs.ticketbookingrest.model.Ticket;

import java.util.List;

public interface TicketBookingService {
    public Ticket createTicket(Ticket ticket);
    public Ticket getTikcetById(Integer ticketId);
    public List<Ticket> getAllTickets();
    public void deleteTicketById(Integer ticketId);
    public Ticket updateTicket(Integer ticketId,String newEmail);
    public Ticket getTicketByEmail(String email);
}
