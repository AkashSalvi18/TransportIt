package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="recordentries")
public class RecordEntry {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long record_entry_id;

	    @Column(unique = true, nullable = false)
	    private String lr_no;

	    @Temporal(TemporalType.DATE)
	    private Date date;

	    private String challan_no;
	    private Double weight;

	    @ManyToOne
	    @JoinColumn(name = "vehicle_id", nullable = false)
	    private Vehicles vehicle;  // Assuming you have a Vehicle entity

	    @ManyToOne
	    @JoinColumn(name = "source_company_id")
	    private Companies sourceCompany; // Assuming you have a Company entity

	    @ManyToOne
	    @JoinColumn(name = "dest_company_id")
	    private Companies destCompany; // Assuming you have a Company entity


	    private Double freight;
	    private Double advance;
	    private Double balance;

	    @ManyToOne
	    @JoinColumn(name = "driver_id", nullable = false)
	    private Driver driver;
}
