package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="vehicledriverassignment")
public class VehicleDriverAssignment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long assignment_id;

	    @ManyToOne
	    @JoinColumn(name = "vehicle_id")
	    private Vehicles vehicle;

	    @ManyToOne
	    @JoinColumn(name = "driver_id")
	    private Driver driver;

	    private Date start_date;
	    private Date end_date;
}
