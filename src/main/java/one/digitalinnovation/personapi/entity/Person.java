package one.digitalinnovation.personapi.entity;

import java.util.List;

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<Phone> phones;
}
