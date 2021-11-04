package com.company.lab1.Task11;

import java.util.LinkedList;
import java.util.List;

public class User extends AbstractPerson {
    private Long idUser;
    List<Order> orders;

    public User(final Long idUser, final String firstName, final String lastName, final double age, final List<Order> orders) {
        this.idUser = idUser;
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.orders = orders;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(final Long idUser) {
        this.idUser = idUser;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(final Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", orders=" + orders +
                "} " + super.toString();
    }
}
