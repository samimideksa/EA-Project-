package ars.cs.miu.edu.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Address {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Size(min=3, max=30)
    private String street;
    @NotNull
    @Size(min=3, max=30)
    private String city;
    @NotNull
    @Size(min=3, max=30)
    private String state;
    @NotNull
    @Size(min=3, max=30)
    private String zip;
}
