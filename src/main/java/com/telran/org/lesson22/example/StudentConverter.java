package com.telran.org.lesson22.example;

public class StudentConverter implements Converter<Student, StudentDto> {
    @Override
    public PersonDto toDto(Person person) {
        return null;
    }

    @Override
    public Person toObject(PersonDto personDto) {
        return null;
    }
}
