package com.satishlabs.ticketbookingrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id", nullable = false)
    private Integer ticketId;

    @Column(name = "passenger_name",nullable = false)
    private String passengerName;

    @Column(name = "booking_date",nullable = false)
    private Date bookDate;

    @Column(name="source_station",nullable=false)
    private String sourceStation;

    @Column(name="dest_station",nullable=false)
    private String destStation;

    @Column(name="email",unique=true)
    private String email;
}
