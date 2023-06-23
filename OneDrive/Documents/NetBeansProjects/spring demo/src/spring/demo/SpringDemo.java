package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(springconfig.class);
        //student st=new student(1,"sushant hansdah","parsudih");
        studentdao d = context.getBean(studentdao.class);
        //d.insert(st);
        student st = context.getBean(student.class);
        // st.setRoll(1);
        // st.setName("sushant hansdah");
        // st.setAddress("haludbani");
        st.setRoll(1);
        int r = d.delete(st);
        System.out.println("data changed\t" + r);
    }
    
}
