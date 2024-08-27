package com.hichinfo.jobapp.company;

import java.util.List;

public interface CompanyService {
     List<Company> getAllCompanies();
     Company getCompany(Long id);
     void createCompany(Company company);
     boolean updateCompany(Long id, Company company);
     boolean deleteById(Long id);



}
