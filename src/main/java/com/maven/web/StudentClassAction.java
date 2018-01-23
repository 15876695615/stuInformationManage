package com.maven.web;

import com.maven.entity.StudentClass;
import com.maven.service.StudentClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */
@Controller
@RequestMapping("/studentClassAction")
public class StudentClassAction {
    @Resource(name = "studentClassService")
    private StudentClassService studentClassService;


    //查询所有班级的方法
    @RequestMapping("/findStudentClassList")
    @ResponseBody
    public List<StudentClass> findStudentClassList(){
        System.out.println("进入查询班级的方法");
        return studentClassService.findStudentClassList();
    }

    //添加班级
    @RequestMapping("/addCls")
    public String addCls(StudentClass scls, RedirectAttributes attr){
        System.out.println("进入添加班级的方法");
        if(scls!=null){
            if(studentClassService.addCls(scls)){
                attr.addAttribute("res","1");
            }else {
                attr.addAttribute("res","-1");
            }
        }
        return "redirect:/addCls.jsp";
    }
    public void setStudentClassService(StudentClassService studentClassService) {
        this.studentClassService = studentClassService;
    }
}
