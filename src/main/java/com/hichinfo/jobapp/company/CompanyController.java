package com.hichinfo.jobapp.company;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @PostMapping
    public ResponseEntity<String> addCompany(@RequestBody Company company){
        companyService.createCompany(company);
        return new ResponseEntity<>("Company created successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(
                                @PathVariable Long id,
                                @RequestBody Company updatedCompany){
        boolean updated = companyService.updateCompany(id, updatedCompany);
        if (updated){
            return new ResponseEntity<>("Updated successfully.", HttpStatus.OK);
        }

        return new ResponseEntity<>("Company not found..", HttpStatus.NOT_FOUND);
    }
}
