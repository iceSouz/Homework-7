package person;

public class Person {
    public String personInfo(String firstName, String lastName, String city, String phone) {
        return "Зателефонувати громадянинові " + firstName +
                " " + lastName + " з міста " + city +
                " можна за номером " + phone + ".";
    }
}
