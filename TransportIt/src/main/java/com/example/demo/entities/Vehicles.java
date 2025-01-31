package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="vehicles")
@Getter
@Setter
@AllArgsConstructor
public class Vehicles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;

    @Column(unique = true, nullable = false)
    private String vehicle_number;

    private String name;        // Vehicle model or make
    private Double load_capacity;

    @Column(name = "registration_status")
    private String registrationStatus = "PENDING"; // Default value

    @OneToMany(mappedBy = "vehicle")
    private List<RecordEntry> recordEntries;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleDriverAssignment> vehicleDriverAssignments;
}
