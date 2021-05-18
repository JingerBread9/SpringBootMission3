package SpringBootMission3.Controller;

import SpringBootMission3.Model.MissionData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@Slf4j
@RestController
public class GetController {
    //GET
    //Query String
    //Command Object
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @GetMapping("/mission2-1")
    public String mission2_1(@RequestBody MissionData missionData) throws IOException {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }



    //GET
    //Query String
    //Command Object
    //RequestBody X

    //처리 결과 : ok

    @GetMapping("/mission2-2")
    public String mission2_2(MissionData missionData) throws IOException {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }




    //GET
    //Query String
    //HashMap
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @GetMapping("/mission2-3")
    public String mission2_3(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }


    //GET
    //Query String
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    // name = null
    // age = null
    // address = null
    @GetMapping("/mission2-4")
    public String mission2_4(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }




    //GET
    //form-data
    //CommandObject
    //RequestBody O

    //처리 결과 : 400, "Bad Request"
    //Required request body is missing
    @GetMapping("/mission2-5")
    public String mission2_5(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //form-data
    //CommandObject
    //RequestBody X

    //처리 결과 : ok
    @GetMapping("/mission2-6")
    public String mission2_6(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //form-data
    //HashMap
    //RequestBody O

    //처리 결과 : 400, "Bad request"
    //Required request body is missing.
    @GetMapping("/mission2-7")
    public String mission2_7(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //GET
    //form-data
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //addres = null
    @GetMapping("/mission2-8")
    public String mission2_8(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //GET
    //x-www-form-urlencoded
    //Command Object
    //RequestBody O

    //처리 결과 : 400, "Bad Request"
    //Required request body is missing
    @GetMapping("/mission2-9")
    public String mission2_9(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }


    //GET
    //x-www-form-urlencoded
    //Command Object
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //address = null
    @GetMapping("/mission2-10")
    public String mission2_10(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //x-www-form-urlencoded
    //HashMap
    //RequestBody O

    //처리 결과 : 400, "Bad Request"
    //Required request body is missing.
    @GetMapping("/mission2-11")
    public String mission2_11(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));

        return "ok";
    }

    //GET
    //x-www-form-urlencoded
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //address = null
    @GetMapping("/mission2-12")
    public String mission2_12(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));
        return "ok";
    }

    //GET
    //application/json
    //Command Object
    //RequestBody O

    //처리 결과 : ok
    @GetMapping("/mission2-13")
    public String mission2_13(@RequestBody MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //application/json
    //Command Object
    //RequestBody X

    //처리 결과 : ok
    // name = null
    // age = null
    // address = null
    @GetMapping("/mission2-14")
    public String mission2_14(MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //application/json
    //HashMap
    //RequestBody O

    //처리 결과 : ok
    @GetMapping("/mission2-15")
    public String mission2_15(@RequestBody HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));
        return "ok";
    }

    //GET
    //application/json
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    //name = null
    //age = null
    //addresss = null
    @GetMapping("/mission2-16")
    public String mission2_16(HashMap<String, Object> map) throws IOException  {

        log.info("name = {}",map.get("name"));
        log.info("age = {}",map.get("age"));
        log.info("address = {}",map.get("address"));
        return "ok";
    }




}
