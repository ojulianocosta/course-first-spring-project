package com.springbootproject.course.repositories;

import com.springbootproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
