package com.example.demo.entities;

import java.util.List;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="drivers")
@Getter
@Setter
@AllArgsConstructor
public class Driver {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long driver_id;

	    @Column(nullable = false)
	    private String name;

	    private Integer age;

	    @Column(unique = true, nullable = false)
	    private String phone_number;

	    private String address;
	    private String city;
	    private String state;
	    private String pincode;

	    @Column(unique = true, nullable = false)
	    private String aadhar_no;

	    @Column(unique = true, nullable = false)
	    private String license_no;

	    @Column(name = "registration_status")
	    private String registrationStatus = "PENDING";

	    @OneToOne(mappedBy = "driver")
	    private User user; // One-to-one with User

	    @OneToMany(mappedBy = "driver")
	    private List<RecordEntry> recordEntries; // One-to-many with RecordEntry

	    @OneToMany(mappedBy = "driver")
	    private List<VehicleDriverAssignment> vehicleDriverAssignments; // One-to-many with VehicleDriverAssignment

}
