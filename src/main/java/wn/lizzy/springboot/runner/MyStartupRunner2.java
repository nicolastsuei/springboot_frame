package wn.lizzy.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  排序的 服务启动执行
 * MyStartupRunner.java
 * @author cuilj  2017年3月7日--下午1:12:31
 *  args就是程序启动的时候进行设置的: SpringApplication.run(App.class, new String[]{"hello,","林峰"});
 */
@Component
@Order(value=1)
public class MyStartupRunner2 implements CommandLineRunner {

	@Override
	public void run(String...args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 1111111111<<<<<<<<<<<<<");
	}
}