package cn.itcast.pojo;

/*
mysql导入：

create table user(
	id int primary key auto_increment,
	name varchar(50),
	age int
);

insert into user(id, name, age) values(null, '赵六', 13);
insert into user(id, name, age) values(null, '李四', 13);
insert into user(id, name, age) values(null, '王五', 13);

 */
import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private int age;
}
