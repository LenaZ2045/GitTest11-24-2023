package com.telran.org.lesson22.example;

public class PersonConverter implements Converter<Person, PersonDto> {
    @Override
    public PersonDto toDto(Person person) {
        return null;
    }

    @Override
    public Person toObject(PersonDto personDto) {
        return null;
    }
}
