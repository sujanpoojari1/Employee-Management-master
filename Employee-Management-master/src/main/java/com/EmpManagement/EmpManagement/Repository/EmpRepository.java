package com.EmpManagement.EmpManagement.Repository;

import com.EmpManagement.EmpManagement.model.EmpInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpInfo,Long>
{

}
