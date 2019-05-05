package com.epam.hibernatetest.app;

import com.epam.hibernatetest.dto.TaskDTO;
import com.epam.hibernatetest.dto.UserDTO;
import com.epam.hibernatetest.entity.Task;
import com.epam.hibernatetest.entity.User;
import com.epam.hibernatetest.mapper.UserMapper;
import com.epam.hibernatetest.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class App {
    private static void createUserAndChildren(Session session ) {

            User user = new User();
            user.setUserName("Petya");

//            Set<Task> tasks = new HashSet<>();

            Task task = new Task();
            task.setTaskName("Task");
            task.setUser(user);

            Task task1 = new Task();
            task1.setTaskName("Task1");
            task1.setUser(user);

            user.getTasks().add(task);
            user.getTasks().add(task1);

//            user.setTasks(tasks);

            session.save(user);
    }


    private static void getUserAndDeleteChildren() {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {

            // start a transaction
            transaction = session.beginTransaction();
            // save the student object

            User user = (User) session.load(User.class, -8L);
            user.getTasks().clear();
            session.saveOrUpdate(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }

    private static void getUserAndDeleteChildrenAndAddTasks(Session session) {

            User user = (User) session.load(User.class, -6L);
            user.getTasks().clear();

            Task task = new Task();
            task.setTaskName("Task1");
            task.setUser(user);

            Task task1 = new Task();
            task1.setTaskName("Task2");
            task1.setUser(user);

            user.getTasks().add(task);
            user.getTasks().add(task1);
    }

    public static void main(String[] args) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();


            createUserAndChildrenFromDTO(session);

            session.flush();
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    private static void createUserAndChildrenFromDTO(Session session ) {
        UserDTO userDTO = new UserDTO();

        userDTO.setUserName("Petya");

        Set<TaskDTO> tasks = new HashSet<>();

        TaskDTO task1 = new TaskDTO();
        task1.setTaskName("task1");
//        task1.setUser(user);

        TaskDTO task2 = new TaskDTO();
        task2.setTaskName("task2");
//        task1.setUser(user);

        tasks.add(task1);
        tasks.add(task2);

        userDTO.setTasks(tasks);

        User user = UserMapper.INSTANCE.userDTOToUser(userDTO);

        session.save(user);


    }
}
