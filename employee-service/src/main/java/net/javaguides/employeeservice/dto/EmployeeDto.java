package net.javaguides.employeeservice.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    @NotEmpty(message = "First Name cant be Null or Empty")
    private String firstName;
    @NotEmpty(message = "Last name cant be Null or Empty")
    private String lastName;
    @NotEmpty(message = "Email cant be Null or Empty")
    @Email(message = "Enter a valid Email ID")
    private String email;
    private String departmentCode;
}
