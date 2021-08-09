package ars.cs.miu.edu.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Airport {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Size(min=3, max=3)
    private String code;
    @NotBlank(message = "Name is mandatory")
    @Size(min=2, max=60)
    private String name;
    @OneToOne
    private Address address;
}
