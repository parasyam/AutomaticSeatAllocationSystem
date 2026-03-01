package com.autoseat.autoseatallocation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "is_allocated")
    private boolean allocated;

    @Column(name = "allocated_to")
    private String allocatedTo;

    
    public Seat() {}

    public Seat(String seatNumber, boolean allocated, String allocatedTo) {
        this.seatNumber = seatNumber;
        this.allocated = allocated;
        this.allocatedTo = allocatedTo;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }

    public String getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        this.allocatedTo = allocatedTo;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatNumber='" + seatNumber + '\'' +
                ", allocated=" + allocated +
                ", allocatedTo='" + allocatedTo + '\'' +
                '}';
    }
}


