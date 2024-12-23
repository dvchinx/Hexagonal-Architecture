package com.dvchinx.students.infrastructure.adapters.output.persistence.repository;

import com.dvchinx.students.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
