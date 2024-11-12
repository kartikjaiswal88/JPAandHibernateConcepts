package com.kartikjaiswal88.learningJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate; // for using SpringJDBC
    public static String INSERT_QUERY =
            """
                        insert into course(id, name, author) values (1,'Learn React', 'Kartik Jaiswal')  
                    """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
