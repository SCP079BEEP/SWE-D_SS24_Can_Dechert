package Ex1;

import java.time.LocalDate;

public class developer {
    private String name;
    private LocalDate birthdate;
    private String prefLanguage;
    private LocalDate careerStartDate;
    private int salary;

    public developer() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid input");
        }
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate bdate = birthdate;
        return (today.getYear() - bdate.getYear());
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int day, int month, int year) {
        if (day > 0 && month > 0 && year > 0) {
            this.birthdate = LocalDate.of(year, month, day);
        } else {
            System.out.println("Invalid input");
        }
    }

    public String getPrefLanguage() {
        return prefLanguage;
    }

    public void setPrefLanguage(String prefLanguage) {
        if (prefLanguage != null && !prefLanguage.isEmpty()) {
            this.prefLanguage = prefLanguage;
        } else {
            System.out.println("Invalid input");
        }
    }

    public int getExperienceYears() {
        LocalDate today = LocalDate.now();
        LocalDate careerStart = careerStartDate;
        return (today.getYear() - careerStart.getYear());
    }

    public void setCareerStartDate(int day, int month, int year) {
        if (day > 0 && month > 0 && year > 0) {
            this.careerStartDate = LocalDate.of(year, month, day);
        } else {
            System.out.println("Invalid input");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid input");
        }
    }
}
