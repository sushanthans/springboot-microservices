package net.javaguides.departmentservice.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

//    Save department API
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody @Valid DepartmentDto departmentDto){
         DepartmentDto savedDepartment= departmentService.saveDepartment(departmentDto);
         return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);

    }


//    Get Department by Code
    @GetMapping("{departmentCode}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("departmentCode") String departmentCode){
        DepartmentDto getDepartmentByCode = departmentService.getDepartmentByCode(departmentCode);
        return ResponseEntity.ok(getDepartmentByCode);
    }
}
