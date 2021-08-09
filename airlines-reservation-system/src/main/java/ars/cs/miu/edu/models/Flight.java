package ars.cs.miu.edu.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Flight {
    @Id
    @GeneratedValue
    private long id;
    @NotBlank(message = "Flight number is mandatory")
    @Size(min=2, max=15)
    private int flightNumber;
    @Positive
    private int capacity;
    @FutureOrPresent
    private LocalDate departureTime;
    @FutureOrPresent
    private LocalDate arrivalTime;

    @ManyToOne(cascade = CascadeType.ALL)
    private Airport arrivalAirport;
    @ManyToOne(cascade = CascadeType.ALL)
    private Airport departureAirport;
    @ManyToOne(cascade = CascadeType.ALL)
    private Airline airline;

}
