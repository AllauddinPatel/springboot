package com.codekul.Java28SeptSpring.Userbank.Repository;

import com.codekul.Java28SeptSpring.Userbank.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Integer> {
}
