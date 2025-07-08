package classes;

import java.time.LocalDate;

public class Person {
    private LocalDate birthDate;

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}