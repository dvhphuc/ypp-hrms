package com.hrms.careerpathmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public final class EmployeeSkillMatrixDTO {
    private SkillMatrixDataDTO data;
    private List<EmployeeSkillMatrixDTO> children;
}
