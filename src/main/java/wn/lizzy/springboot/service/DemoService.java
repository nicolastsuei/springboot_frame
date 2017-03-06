package wn.lizzy.springboot.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import wn.lizzy.springboot.entity.Demo;
import wn.lizzy.springboot.repository.DemoDao;
import wn.lizzy.springboot.repository.DemoRepository;

@Service
public class DemoService {
	@Resource
	private DemoRepository demoRepository;
	 @Resource
     private DemoDao demoDao;
	
	@Transactional
	public void save(Demo demo) {
		demoRepository.save(demo);
	}
	
	public Demo getById(long id){
        return demoDao.getById(id);
	}
}
