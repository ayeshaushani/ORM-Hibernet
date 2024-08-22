package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session= FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Ayesha" ," Ushani");

       Student student = new Student();
       student.setId("1");
       student.setName(fullName);
       student.setAddress("matara");

      Transaction transaction = session.beginTransaction();

      //get, delete,another table


      /* session.save(student);
       transaction.commit();
       session.close();*/

        //delete

       session.delete(student);
       transaction.commit();
       session.close();


    }
}