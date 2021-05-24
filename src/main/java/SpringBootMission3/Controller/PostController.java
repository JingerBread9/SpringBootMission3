package SpringBootMission3.Controller;

import SpringBootMission3.Model.MissionData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Slf4j
@RestController
public class PostController {

    //POST
    //Query String
    //Command Object
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @PostMapping("/mission1-1")
    public String mission1_1(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }



    //POST
    //Query String
    //Command Object
    //RequestBody X

    //처리 결과 : OK
    @PostMapping("/mission1-2")
    public String mission1_2(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }




    //POST
    //Query String
    //HashMap
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @PostMapping("/mission1-3")
    public String mission1_3(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }


    //POST
    //Query String
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    // name = null
    // age = null
    // address = null
    @PostMapping("/mission1-4")
    public String mission1_4(HashMap<String,Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }




    //POST
    //form-data
    //CommandObject
    //RequestBody O

    //처리 결과 : 415, Unsupported Media Type
    @PostMapping("/mission1-5")
    public String mission1_5(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //form-data
    //CommandObject
    //RequestBody X

    //처리 결과 : OK
    @PostMapping("/mission1-6")
    public String mission1_6(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //form-data
    //HashMap
    //RequestBody O

    //처리 결과 : 415, "Unsupported Media Type"
    @PostMapping("/mission1-7")
    public String mission1_7(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //POST
    //form-data
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //address = null
    @PostMapping("/mission1-8")
    public String mission1_8(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //POST
    //x-www-form-urlencoded
    //Command Object
    //RequestBody O

    //처리 결과 : 415, "Unsupported Media Type"
    @PostMapping("/mission1-9")
    public String mission1_9(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }


    //POST
    //x-www-form-urlencoded
    //Command Object
    //RequestBody X

    //처리 결과 : ok
    @PostMapping("/mission1-10")
    public String mission1_10(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //x-www-form-urlencoded
    //HashMap
    //RequestBody O

    //처리 결과 : 415, "Unsupported Media Type"
    @PostMapping("/mission1-11")
    public String mission1_11(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //POST
    //x-www-form-urlencoded
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //address = null
    @PostMapping("/mission1-12")
    public String mission1_12(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //POST
    //application/json
    //Command Object
    //RequestBody O

    //처리 결과 : ok
    @PostMapping("/mission1-13")
    public String mission1_13(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //application/json
    //Command Object
    //RequestBody X

    //처리 결과 : ok
    // name = null
    // age = null
    // address = null
    @PostMapping("/mission1-14")
    public String mission1_14(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //application/json
    //HashMap
    //RequestBody O

    //처리 결과 : ok
    @PostMapping("/mission1-15")
    public String mission1_15(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //POST
    //application/json
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //address = null
    @PostMapping("/mission1-16")
    public String mission1_16(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }



}
