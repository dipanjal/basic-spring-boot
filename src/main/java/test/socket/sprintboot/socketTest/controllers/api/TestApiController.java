package test.socket.sprintboot.socketTest.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test-api")
public class TestApiController {

    @RequestMapping("/")
    public Map hello() {
        Map<String, String> dataMap = new HashMap();
        dataMap.put("name","Dip");
        dataMap.put("age","25");
        dataMap.put("gender","M");
        dataMap.put("email","dipanjalmaitra@gmail.com");

        return dataMap;
    }

}
