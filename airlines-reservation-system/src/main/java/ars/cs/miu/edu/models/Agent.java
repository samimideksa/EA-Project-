package ars.cs.miu.edu.models;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "Agent")
public class Agent extends Person{
}
