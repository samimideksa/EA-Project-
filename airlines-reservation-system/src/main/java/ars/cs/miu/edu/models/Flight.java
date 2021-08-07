package ars.cs.miu.edu.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    private long id;
    private int flightNumber;
    private int capacity;
    private LocalDate departureTime;
    private LocalDate arrivalTime;

    @ManyToOne(cascade = CascadeType.ALL)
    private Airport arrivalAirport;
    @ManyToOne(cascade = CascadeType.ALL)
    private Airport departureAirport;
    @ManyToOne(cascade = CascadeType.ALL)
    private Airline airline;

}
