package com.hrms.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<JobAdvert> job_adverts;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Candidate> candidates;
}
