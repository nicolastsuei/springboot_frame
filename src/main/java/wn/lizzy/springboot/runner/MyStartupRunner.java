package wn.lizzy.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *  未排序的 服务启动执行
 * MyStartupRunner.java
 * @author cuilj  2017年3月7日--下午1:12:31
 * 如果有排序的，未排序的则在最后。
 */
@Component
public class MyStartupRunner implements CommandLineRunner {

	@Override
	public void run(String...args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
	}
}