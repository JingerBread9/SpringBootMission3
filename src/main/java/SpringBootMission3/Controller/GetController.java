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
    public String mission2_1(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");

        log.info("name = {}",name);
        log.info("age = {}",age);
        log.info("address = {}",address);

        return "ok";
    }



    //GET
    //Query String
    //Command Object
    //RequestBody X

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @GetMapping("/mission2-2")
    public String mission2_2(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");

        log.info("name = {}",name);
        log.info("age = {}",age);
        log.info("address = {}",address);

        return "ok";
    }




    //GET
    //Query String
    //HashMap
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @GetMapping("/mission2-3")
    public String mission2_3(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, String[]> map, Model model) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }


    //GET
    //Query String
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    // name = {}
    // age = {}
    // address = {}
    @GetMapping("/mission2-4")
    public String mission2_4(HttpServletRequest request, HttpServletResponse response, HashMap<String, String[]> map, Model model) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }




    //GET
    //form-data
    //CommandObject
    //RequestBody O

    //처리 결과 : 400, "Bad Request"
    //Required request body is missing
    @GetMapping("/mission2-5")
    public String mission2_5(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission2_6(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission2_7(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //GET
    //form-data
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    // {missionData=SpringBootMission3.Model.MissionData@6ddb329b, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @GetMapping("/mission2-8")
    public String mission2_8(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //GET
    //x-www-form-urlencoded
    //Command Object
    //RequestBody O

    //처리 결과 : 400, "Bad Request"
    //Required request body is missing
    @GetMapping("/mission2-9")
    public String mission2_9(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission2_10(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission2_11(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //GET
    //x-www-form-urlencoded
    //HashMap
    //RequestBody X

    //처리 결과 : ok
    // {missionData=SpringBootMission3.Model.MissionData@6ddb329b, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @GetMapping("/mission2-12")
    public String mission2_12(HttpServletRequest request, HttpServletResponse response, HashMap<String, String> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //GET
    //application/json
    //Command Object
    //RequestBody O

    //처리 결과 : 500, "Internal Server Error"
    @GetMapping("/mission2-13")
    public String mission2_13(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission2_14(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //GET
    //application/json
    //HashMap
    //RequestBody O

    //처리 결과 : 500, "Internal Server Error"
    @GetMapping("/mission2-15")
    public String mission2_15(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //GET
    //application/json
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    //{missionData=SpringBootMission3.Model.MissionData@45f2351, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @GetMapping("/mission2-16")
    public String mission2_16(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }




}
