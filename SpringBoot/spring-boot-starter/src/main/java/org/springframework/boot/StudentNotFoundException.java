package org.springframework.boot;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
