package com.springboot.models;

import java.util.List;

/**
 * 04.04.2018
 * UsersDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Students extends Crud<Student> {
    List<Student> findAllByFirstName(String firstName);
}
