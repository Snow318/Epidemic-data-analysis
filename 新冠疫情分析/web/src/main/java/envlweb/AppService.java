package envlweb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AppService {
	
	@Autowired
	private AppDao envDao;
	public List<Map<String,Object>> get1(){
		return envDao.get1();
	}

	public List<Map<String,Object>> get2(){
		return envDao.get2();
	}
	public List<Map<String,Object>> get11(){
		return envDao.get11();
	}
	public List<Map<String,Object>> get5(){
		return envDao.get5();
	}

	public List<Map<String,Object>> get3(){
		return envDao.get3();
	}

	public List<Map<String,Object>> get4(String city) {
		List<Map<String,Object>> list = envDao.get4(city);
		return list;
	}
	public List<Map<String,Object>> getCiyun(){
        return envDao.getCiyun();
    }
	public List<Map<String,Object>> get6(){
		return envDao.get6();
	}
	public List<Map<String,Object>> get7(){
		return envDao.get6();
	}
}
