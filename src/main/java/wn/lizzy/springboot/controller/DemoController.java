package wn.lizzy.springboot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wn.lizzy.springboot.entity.Demo;
import wn.lizzy.springboot.enviroment.LizzySetting;
import wn.lizzy.springboot.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	 @Resource
	 private DemoService demoService;
	 @Autowired 
	 private LizzySetting lizzySetting; 
	 @Resource
	 private Environment env;
	/**
 	返回demo数据:
 *请求地址：http://127.0.0.1:8080/demo/getDemo
 * @return
 */
	@RequestMapping("/getDemo")
	public Demo getDemo(){
	   Demo demo = new Demo();
	   demo.setId(222222);
	   demo.setName("dsdfsdfdssfdfdsssdfs");
	   System.out.println(env.getProperty("spring.datasource.type"));
	   System.out.println(lizzySetting.getName() + "---" +lizzySetting.getGender());
	   return demo;
	}
	
	/**
	 * 测试全局异常处理
	 * @return
	 */
	@RequestMapping("/zeroException")
	public int zeroException (){
	   return 100/0;
	}
	
	/**
     * 测试保存数据方法
     * @return
     */
    @RequestMapping("/save")
    public String save(){
       Demo d = new Demo();
       d.setName("Angel");
       demoService.save(d);//保存数据.
       return "ok.DemoController.save";
    }
    
    /**
     * REST风格
     * 地址：http://127.0.0.1:8080/demo2/getById/2
     * @param id
     * @return
     */
    @RequestMapping("/getById/{id}")
    public Demo getById(@PathVariable("id") long id){
       return demoService.getById(id);
    }
}
