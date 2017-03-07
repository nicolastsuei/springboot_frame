package wn.lizzy.springboot.repository;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import wn.lizzy.springboot.entity.Demo;

/**
 * 使用JdbcTemplate操作数据库.
 * DemoDao.java
 * @author cuilj  2017年3月6日--下午4:19:10
 *
 */
@Repository
public class DemoDao {
	@Resource
    private JdbcTemplate jdbcTemplate;
	
	public Demo getById(long id){
	       String sql = "select *from Demo where id=?";
	       BeanPropertyRowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
	       return jdbcTemplate.queryForObject(sql, rowMapper,id);
	    }
}
