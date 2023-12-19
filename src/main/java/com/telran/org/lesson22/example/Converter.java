package com.telran.org.lesson22.example;

public interface Converter<Entity, DTO> { // make interface for each Object or may be written like <T, U>

    DTO             Entity
    PersonDto toDto(Person person);

    Entity          DTO
    Person toObject(PersonDto personDto);
}
