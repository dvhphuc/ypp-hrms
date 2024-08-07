package com.hrms.search.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class EmployeeDocument {
    @Id
    private String id;

    @Field(name = "full_name")
    private String fullName;

}