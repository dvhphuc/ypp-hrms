package com.hrms.global.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_level_id")
    private Integer id;
    @Column(name = "job_level_name")
    private String jobLevelName;

    public JobLevel(Integer id) {
        this.id = id;
    }
}
