package spring.demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentdao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(student s) {
        String q = "insert into student(id,name,address)values(?,?,?)";

        int r = this.jdbcTemplate.update(q, s.getRoll(), s.getName(), s.getAddress()); 
        System.out.println("ONE DATA INSERTED SUCCESSFULLY\t");
        System.out.println(r);
        return r;
    }
    public int change(student s)
    {
        String q="update student set name=?,address=? where id=?";
        int r = this.jdbcTemplate.update(q,s.getName(),s.getAddress(),s.getRoll());
        return r;
    }
    public int delete(student s)
    {
        String q="delete from student where id=?";
        int r=this.jdbcTemplate.update(q,s.getRoll());
        System.out.println("ONE DATA DELETED SUCCESSFULLY\t"+r);
        return  r;
    }

}
