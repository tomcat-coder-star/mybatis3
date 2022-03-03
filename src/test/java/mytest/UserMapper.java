package mytest;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author :xiaozou
 * @Date : 2022/3/3- 15:05
 **/
@Mapper
public interface UserMapper {

    List<User> findAllUser();

    void addUser(User user);
}
