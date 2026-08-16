package com.example.harsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
    static void main(String[] args) {
        Configuration configuration = new Configuration(); // this is here for making the xml to java readable
    configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // load and buid the session
        Session session = sessionFactory.openSession();

//        Create Operation
//        Transaction transaction = session.beginTransaction();
//        MyDtoUser myDtoUser = new MyDtoUser();
//        myDtoUser.setId(101);
//        myDtoUser.setName("Harsh");
//        myDtoUser.setAge(22);
//        myDtoUser.setBc(1);
//
//        session.save(myDtoUser);
//        transaction.commit();
//
//        // this is here is my Read ooperation
//      // MyDtoUser dto = session.load(MyDtoUser.class,101);
//      //   System.out.println(dto.getId()+" "+dto.getName());
//         output  is 101 , Harsh
//
//
//         //  update operation
//        Transaction transaction = session.beginTransaction();
//        MyDtoUser dto1 = session.load(MyDtoUser.class,101);
//        dto1.setName("Harsh Don");
//        System.out.println(dto1.getId()+" "+dto1.getName());
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
//
//       // Delete operation
//        Transaction transaction = session.beginTransaction();
//        MyDtoUser myDtoUser2 = session.load(MyDtoUser.class,101);
//        session.delete(myDtoUser2);
//        transaction.commit();
//        session.close();
//        sessionFactory.close();





    }
}
