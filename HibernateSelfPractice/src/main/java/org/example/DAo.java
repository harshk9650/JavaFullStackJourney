package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAo {
    static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();  //this is help to read the xml data to the java readable format

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // this is the heavy weight and it help to generate and manage the session object
        Session session = sessionFactory.openSession(); // this is the boss it have all curd operations methos
        Transaction transaction = session.beginTransaction(); // in hibernate auto commit is disabled so we need to tell db to commiy
        UserDto userDto = new UserDto();
        userDto.setId(10);
        userDto.setName("Harsh");
        userDto.setAge(22);

        session.save(userDto);
        transaction.commit(); // here is for the data commit in db
        System.out.println("data is addes succesfully");

    }
}
