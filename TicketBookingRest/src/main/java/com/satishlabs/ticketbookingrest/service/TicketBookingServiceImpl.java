package com.satishlabs.ticketbookingrest.service;

import com.satishlabs.ticketbookingrest.dao.TicketDao;
import com.satishlabs.ticketbookingrest.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketBookingServiceImpl implements TicketBookingService{
    @Autowired
    private TicketDao ticketDao;

    public Ticket createTicket(Ticket ticket){
        return ticketDao.save(ticket);
    }

    @Override
    public Ticket getTikcetById(Integer ticketId) {
        return ticketDao.findById(ticketId).get();
    }

    @Override
    public List<Ticket> getAllTickets() {
        List<Ticket> ticketList = ticketDao.findAll();
        return ticketList;
    }

    @Override
    public void deleteTicketById(Integer ticketId) {
        ticketDao.deleteById(ticketId);
    }

    @Override
    public Ticket updateTicket(Integer ticketId, String newEmail) {
        Ticket ticketFromDb = ticketDao.findById(ticketId).get();
        ticketFromDb.setEmail("ramesh@gmail");
        Ticket updatedTicket = ticketDao.save(ticketFromDb);
        return updatedTicket;
    }

    @Override
    public Ticket getTicketByEmail(String email) {
        return ticketDao.findTicketByEmail(email);
    }


}
