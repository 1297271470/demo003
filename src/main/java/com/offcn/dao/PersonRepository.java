package com.offcn.dao;

import com.offcn.mobel.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lgy
 * @version 1.0
 * @date 2019/12/18 20:43
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
