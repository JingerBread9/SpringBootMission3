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
    public String mission1_1(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");

        log.info("name = {}",name);
        log.info("age = {}",age);
        log.info("address = {}",address);

        return "ok";
    }



    //POST
    //Query String
    //Command Object
    //RequestBody X

    //처리 결과 : OK
    @PostMapping("/mission1-2")
    public String mission1_2(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");

        log.info("name = {}",name);
        log.info("age = {}",age);
        log.info("address = {}",address);

        return "ok";
    }




    //POST
    //Query String
    //HashMap
    //RequestBody O

    //처리 결과 : 400, Bad Request
    //Required request body is missing
    @PostMapping("/mission1-3")
    public String mission1_3(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }


    //POST
    //Query String
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    // name = {}
    // age = {}
    // address = {}
    @PostMapping("/mission1-4")
    public String mission1_4(HttpServletRequest request, HttpServletResponse response, HashMap<String, String[]> map, Model model) throws IOException  {

        request.setCharacterEncoding("utf-8");

        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }




    //POST
    //form-data
    //CommandObject
    //RequestBody O

    //처리 결과 : 415, Unsupported Media Type
    @PostMapping("/mission1-5")
    public String mission1_5(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission1_6(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission1_7(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //POST
    //form-data
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    // {missionData=SpringBootMission3.Model.MissionData@6ddb329b, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @PostMapping("/mission1-8")
    public String mission1_8(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //POST
    //x-www-form-urlencoded
    //Command Object
    //RequestBody O

    //처리 결과 : 415, "Unspported Media Type"
    @PostMapping("/mission1-9")
    public String mission1_9(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }


    //POST
    //x-www-form-urlencoded
    //Command Object
    //RequestBody X

    //처리 결과 : OK
    @PostMapping("/mission1-10")
    public String mission1_10(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

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
    public String mission1_11(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //POST
    //x-www-form-urlencoded
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    // {missionData=SpringBootMission3.Model.MissionData@6ddb329b, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @PostMapping("/mission1-12")
    public String mission1_12(HttpServletRequest request, HttpServletResponse response, HashMap<String, String> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //POST
    //application/json
    //Command Object
    //RequestBody O

    //처리 결과 : 500, Internal Server Error
    @PostMapping("/mission1-13")
    public String mission1_13(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //application/json
    //Command Object
    //RequestBody X

    //처리 결과 : OK
    // name = null
    // age = null
    // address = null
    @PostMapping("/mission1-14")
    public String mission1_14(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        log.info("name = {}",missionData.getName());
        log.info("age = {}",missionData.getAge());
        log.info("address = {}",missionData.getAddress());

        return "ok";
    }

    //POST
    //application/json
    //HashMap
    //RequestBody O

    //처리 결과 : 500, "Internal Server Error"
    @PostMapping("/mission1-15")
    public String mission1_15(@RequestBody HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }

    //POST
    //application/json
    //HashMap
    //RequestBody X

    //처리 결과 : OK
    //{missionData=SpringBootMission3.Model.MissionData@45f2351, org.springframework.validation.BindingResult.missionData=org.springframework.validation.BeanPropertyBindingResult: 0 errors}
    @PostMapping("/mission1-16")
    public String mission1_16(HttpServletRequest request, HttpServletResponse response, HashMap<String, Object> map, Model model, MissionData missionData) throws IOException  {

        request.setCharacterEncoding("utf-8");
        log.info("name = {}",map);
        log.info("age = {}",map);
        log.info("address = {}",map);

        return "ok";
    }



}
