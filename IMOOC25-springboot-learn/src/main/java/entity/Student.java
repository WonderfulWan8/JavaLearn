package entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-08-09 14:07:58
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -79100240511145640L;
    /**
     * 自增 id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

