package com.company.lab1.Task11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(final String[] args) {


        final Driver driver1 = new Driver (1234L,"Pedro","Tom",23,380953092);
        final Driver driver2 = new Driver (394L,"Jhon","Great",19,380953097);
        final Driver driver3 = new Driver (594L,"Christina","Smart",25,380900970);

        final List<Driver> driverList1 = new ArrayList<> ();
        driverList1.add(driver1);
        driverList1.add(driver2);

        final List<Driver> driverList2 = new ArrayList<> ();
        driverList2.add(driver3);

        final Car car1 = new Car(35L,"Tesla","Model x", driverList1 );
        System.out.println ("User orders a taxi 1: "+ car1);
        final Car car2 = new Car(35L,"Volkswagen","Passat",  driverList2);

        car2.addDriver(driver2);

        final Order order1 = new Order (120L,323.8, LocalDate.of(2021,9,18),"5 km",car1);
        final Order order2 = new Order (900L,109.77, LocalDate.of(2021,10,9),"4 km",car2);

        final List<Order> orderList1 = new ArrayList<> ();

        orderList1.add(order1);


        final List<Order> orderList2 = new ArrayList<> ();

        orderList2.add(order1);

        final User user1 = new User (561L,"Nazar","Ivanov",34, orderList1);
        final User user2 = new User (591L,"Lily","Post",23, orderList2);
        user2.addOrder(order2);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println ("User orders a taxi 1: "+ user1);
        System.out.println ("================================================================================================" +
                "=====================================================");
        System.out.println ("User orders a taxi 2: "+ user2);



    }

}
