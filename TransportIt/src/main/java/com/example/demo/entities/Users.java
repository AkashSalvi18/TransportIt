package com.example.demo.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@ManyToOne
	@JoinColumn(name="role_id",nullable = false)
	private Role role;
	
	@Column(unique = true)
	private String username;
	
	@OneToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	
	@OneToOne
	@Column(name="driver_id")
	private Driver driver;
	
	private String password;
	
	
	private String account_status="PENDING";
	

}
