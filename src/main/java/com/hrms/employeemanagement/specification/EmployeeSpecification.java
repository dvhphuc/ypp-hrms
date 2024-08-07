package com.hrms.employeemanagement.specification;


import com.hrms.employeemanagement.models.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeSpecification {
    static public Specification<Employee> hasJobLevel(Integer jobLevelId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("jobLevel").get("id"), jobLevelId);
    }

    public <T> Specification<T> hasEmployeeId(Integer employeeId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("employee").get("id"), employeeId);
    }

    public <T> Specification<T> hasEmployeeIds(List<Integer> employeeId) {
        return (root, query, criteriaBuilder) -> root.get("employee").get("id").in(employeeId);
    }

    public <T> Specification<T> hasJobLevelId(Integer levelId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("employee").get("jobLevel").get("id"), levelId);
    }

    public <T> Specification<T> hasPositionId(Integer positionId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("employee").get("position").get("id"), positionId);
    }

    public <T> Specification<T> hasDepartmentId(Integer departmentId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("employee").get("department").get("id"), departmentId);
    }
}
