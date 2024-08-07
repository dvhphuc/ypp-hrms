package com.hrms.careerpathmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiffPercentDTO {
    private Float first;
    private Float second;
    private Float diffPercent;
    private Boolean isIncreased;
}
