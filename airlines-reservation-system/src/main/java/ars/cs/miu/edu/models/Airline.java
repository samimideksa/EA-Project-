package ars.cs.miu.edu.models;

import javax.persistence.*;

@Entity
@Table(name = "Airline")
@SecondaryTable(name = "History", )
public class Airline {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private String name;
    @SecondaryTable(name="History")
    private String history;
}
