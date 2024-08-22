package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Book;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Ayesha","Ushani");
        Student student = new Student();
        student.setId("2");
        student.setName(fullName);
        student.setAddress("Galle");

        Transaction transaction = session.beginTransaction();

        //Save
        session.save(student);
        //Delete
        session.delete(student);
        //Get
        Student student1 = session.get(Student.class,2);
        System.out.println(student1.toString());

       Book book = new Book();


       book.setId("1");
       book.setName("ABC");
       book.setAuthor("perera");
        session.save(book);

        transaction.commit();
        session.close();



    }
}