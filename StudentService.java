package com.aqu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value="/api/student")
class StudentService{

    @RequestMapping(value="/",method = RequestMethod.GET)
    public HashMap<Long,Student> getAllStudents(){
        return Application.hmStudent;
    }
}