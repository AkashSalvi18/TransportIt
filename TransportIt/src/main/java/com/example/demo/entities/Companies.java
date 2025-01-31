package com.example.demo.entities;

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
@Table(name="companies")
@Getter
@Setter
@AllArgsConstructor
public class Companies {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    @Column(unique = true, nullable = false)
    private String company_name;

    private String address;

    @OneToMany(mappedBy = "sourceCompany")
    private List<RecordEntry> sourceRecordEntries;

    @OneToMany(mappedBy = "destCompany")
    private List<RecordEntry> destRecordEntries;
	
}
