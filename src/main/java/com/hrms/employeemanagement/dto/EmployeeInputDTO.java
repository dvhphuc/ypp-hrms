package com.hrms.employeemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInputDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String joinedDate;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;
    private Integer currentContract;
    private String profileBio;
    private String facebookLink;
    private String twitterLink;
    private String linkedinLink;
    private String instagramLink;
    private Integer positionId;
    private Integer jobLevelId;
    private Integer departmentId;
    private List<EmergencyContactInputDTO> emergencyContacts;
}
