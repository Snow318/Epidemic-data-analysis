package envlweb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private AppService envService;

    @RequestMapping(value = "/")
    public String index() {
        return "login.html";
    }



    @ResponseBody
    @RequestMapping(value = "/login2")
    public String login() {

        return "sucess";
    }

    //请求方式
    @ResponseBody
    @RequestMapping(value = "/get1")
    public  List<Map<String,Object>> getCategorys(){
        List<Map<String,Object>> list = envService.get1();
        return list;

    }
/*
    @ResponseBody
    @RequestMapping(value = "/get2")
    public Map getTopRating(){
        List<Map<String,Object>> list = envService.get2();
        List key = new ArrayList();
        List val = new ArrayList();

        Map returnMap = new HashMap<String, List>();
        for(Map<String,Object> m:list) {
            key.add(m.get("name"));
            val.add(m.get("value"));

        }
        returnMap.put("key", key);
        returnMap.put("val", val);
        return returnMap;
    }
*/
    @ResponseBody
    @RequestMapping(value = "/get2")
    public  List<Map<String,Object>> getTopRating(){
        List<Map<String,Object>> list = envService.get2();
        return list;
    }
    
    @ResponseBody
    @RequestMapping(value = "/get17")
    public  List<Map<String,Object>> getTopRating2(){
        List<Map<String,Object>> list = envService.get11();
        return list;
    }
    
    @ResponseBody
    @RequestMapping(value = "/get5")
    public Map getTopRating1(){
        List<Map<String,Object>> list = envService.get5();
        List key = new ArrayList();
        List val = new ArrayList();

        Map returnMap = new HashMap<String, List>();
        for(Map<String,Object> m:list) {
            key.add(m.get("name"));
            val.add(m.get("value"));

        }
        returnMap.put("key", key);
        returnMap.put("val", val);
        return returnMap;
    }
    @ResponseBody
    @RequestMapping(value = "/get6")
    public Map getTopRating6(){
        List<Map<String,Object>> list = envService.get6();
        List key = new ArrayList();
        List val = new ArrayList();

        Map returnMap = new HashMap<String, List>();
        for(Map<String,Object> m:list) {
            key.add(m.get("time"));
            val.add(m.get("num"));

        }
        returnMap.put("key", key);
        returnMap.put("val", val);
        return returnMap;
    }
    
    @ResponseBody
    @RequestMapping(value = "/get7")
    public Map getTopRating7(){
        List<Map<String,Object>> list = envService.get7();
        List key = new ArrayList();
        List val = new ArrayList();

        Map returnMap = new HashMap<String, List>();
        for(Map<String,Object> m:list) {
            key.add(m.get("time"));
            val.add(m.get("value"));

        }
        returnMap.put("key", key);
        returnMap.put("val", val);
        return returnMap;
    }
    // 系统类型
    @ResponseBody
    @RequestMapping(value = "/get3")
    public  Map getMoreMove(){
        List<Map<String,Object>> list = envService.get3();
        List key = new ArrayList();
        List val = new ArrayList();
        Map returnMap = new HashMap<String, List>();
        for(Map<String,Object> m:list) {
            key.add(m.get("name"));
            val.add(m.get("value"));

        }
        returnMap.put("key", key);
        returnMap.put("val", val);

        return returnMap;
    }

    

}
