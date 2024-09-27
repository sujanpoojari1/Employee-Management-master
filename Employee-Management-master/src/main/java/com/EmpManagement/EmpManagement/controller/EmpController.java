package com.EmpManagement.EmpManagement.controller;

import com.EmpManagement.EmpManagement.model.EmpInfo;
import com.EmpManagement.EmpManagement.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/papi")
//@CrossOrigin(origins = "", allowedHeaders = "", methods = {RequestMethod.GET, RequestMethod.POST})
public class EmpController
{
    @Autowired
    private EmpRepository empRepository;
    @PostMapping("/create")
    public ResponseEntity<EmpInfo>createProduct(@RequestBody EmpInfo empInfo)
    {
        EmpInfo empInfo1=empRepository.save(empInfo);
        return ResponseEntity.ok().body(empInfo1);

    }
    @GetMapping("/getp")
    public ResponseEntity<List<EmpInfo>>getAllProduct()
    {
        List<EmpInfo> empData=empRepository.findAll();
        return ResponseEntity.ok().body(empData);
    }
    @PostMapping("/id/{id}")
    public ResponseEntity<Optional<EmpInfo>> getById(@PathVariable Long id)
    {
        Optional<EmpInfo> empInfo = empRepository.findById(id);
        if (empInfo.isPresent()) {
            return ResponseEntity.ok().body(empInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id)
    {
        empRepository.deleteById(id);

        return ResponseEntity.ok().body("Deleted");
    }
}

