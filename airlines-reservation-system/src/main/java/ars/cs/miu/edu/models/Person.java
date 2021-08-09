package ars.cs.miu.edu.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type",
        discriminatorType = DiscriminatorType.STRING)
public abstract class Person {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Size(min=2, max=20)
    private String firstName;
    @NotNull
    @Size(min=2, max=20)
    private String lastName;
    @NotNull
    @Email
    private String emailAddress;
    @Column(unique=true)
    private String username;
    @Size(min=6, max=50)
    private String password;
    @Past
    private LocalDate dateOfBirth;
    private Role role;
    @ManyToOne
    private Address address;
    @Column(insertable=false, updatable=false)
    private String person_type;
}
