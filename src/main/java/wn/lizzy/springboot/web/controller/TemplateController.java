package wn.lizzy.springboot.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板测试
 * TemplateController.java
 * @author nicolas 2017年3月6日--下午10:47:40
 *
 *
 */
@Controller
public class TemplateController {
	 /**
     * 返回thymeleaf html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from Thymeleaf Template Controller.helloHtml");
       return "/helloHtml";
    }
    
    /**
     * 返回freemaker html模板.
     * @param map
     * @return
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
       map.put("hello","from FreeMaker Template Controller.helloHtml");
       return "/freemaker/helloFtl";
    }
}
