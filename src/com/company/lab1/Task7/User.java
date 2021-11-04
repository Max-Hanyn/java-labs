package com.company.lab1.Task7;

public class User {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String email;

    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    public static void main(final String[] args) {
        final User user1 = new User("Hanyn", "Maks", 19, "maxhanyn@gmail");
        final User user2 = new User("Test", "Acc", 12, "testacc@email");
        System.out.println(user1.equals(user2));
        System.out.println(user2.hashCode());
    }

}
