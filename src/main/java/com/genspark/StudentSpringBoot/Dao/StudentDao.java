package com.genspark.StudentSpringBoot.Dao;

import com.genspark.StudentSpringBoot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>
{

}
