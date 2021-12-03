package com.satishlabs.ticketbookingrest.controller;

import com.satishlabs.ticketbookingrest.model.Ticket;
import com.satishlabs.ticketbookingrest.service.TicketBookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketBookingServiceImpl ticketBookingService;

    @PostMapping("/save")
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping("/ticket/{ticketId}")
    public Ticket getTicketById(@PathVariable Integer ticketId){
        return ticketBookingService.getTikcetById(ticketId);
    }

    @GetMapping("/tickets")
    public List<Ticket> getAllTickets(){
        List<Ticket> ticketList = ticketBookingService.getAllTickets();
        return ticketList;
    }

    @DeleteMapping("/tickets/{ticketId}")
    public void deleteTicketById(@PathVariable Integer ticketId){
        ticketBookingService.deleteTicketById(ticketId);
    }
    
    @PutMapping("/ticket/{ticketId}/email/{newEmail:.+}")
    public Ticket updateTikcet(@PathVariable Integer ticketId,@PathVariable String newEmail){
        return ticketBookingService.updateTicket(ticketId,newEmail);
    }

    @GetMapping("/ticket/{email}")
    public Ticket getTicketByEmail(@PathVariable("email") String email){
        return ticketBookingService.getTicketByEmail(email);
    }
}
