package classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    private Person person;

    public AgeCalculator(Person person) {
        this.person = person;
    }

    public int getAgeInYears() {
        return Period.between(person.getBirthDate(), LocalDate.now()).getYears();
    }

    public Period getFullAge() {
        return Period.between(person.getBirthDate(), LocalDate.now());
    }

    public String getBirthDayOfWeek() {
        return person.getBirthDate().getDayOfWeek().toString();
    }

    public long getDaysLived() {
        return ChronoUnit.DAYS.between(person.getBirthDate(), LocalDate.now());
    }

    public long getDaysUntilNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = person.getBirthDate().withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, nextBirthday);
    }

    public boolean isBirthdayToday() {
        LocalDate today = LocalDate.now();
        LocalDate birth = person.getBirthDate();

        return today.getDayOfMonth() == birth.getDayOfMonth() && today.getMonth() == birth.getMonth();
    }
}