package net.javaguides.departmentservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;
    @NotEmpty(message = "Department Name can't be Empty or Null")
    private String departmentName;
    @NotEmpty(message = "Department Description can't be Empty or Null")
    private String departmentDescription;
    @NotEmpty(message = "Department Code can't be Empty or Null")
    private String departmentCode;
}
