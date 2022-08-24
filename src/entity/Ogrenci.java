package entity;

public class Ogrenci {
    private String fistName;
    private String lastName;
    private String university;
    private int age;

    public Ogrenci(String fistName, String lastName, String university, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.university = university;
        this.age = age;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
