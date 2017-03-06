package wn.lizzy.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wn.lizzy.springboot.entity.Demo;
/**
 * 接口，没有具体的实现，这就是JPA
 * DemoRepository.java
 * @author cuilj  2017年3月6日--下午4:02:17
 *
 *在CrudRepository自带常用的crud方法.一个基本dao就写完了
 */
@Repository
public interface DemoRepository extends CrudRepository<Demo,Long>{}

