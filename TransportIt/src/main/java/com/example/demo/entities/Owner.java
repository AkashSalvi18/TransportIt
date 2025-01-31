package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="owners")
@Getter
@Setter
@AllArgsConstructor

public class Owner {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long owner_id;

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

	    @OneToOne(mappedBy = "owner") // One-to-one with User
	    private Users user;

}
