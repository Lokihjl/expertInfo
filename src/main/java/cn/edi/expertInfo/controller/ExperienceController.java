package cn.edi.expertInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edi.expertInfo.service.ExperienceService;
import cn.edi.expertInfo.service.PatentService;

@Controller
public class ExperienceController {

  @Autowired
  @Qualifier("RainService")
  private PatentService rainservice;

  @Autowired
  private ExperienceService experienceService;

  // 如果在目录下输入为空，则跳转到指定链接
  @RequestMapping(value = "/experience/")
  public ModelAndView index2(ModelAndView mv) {
    mv.setViewName("experience/list");
    return mv;
  }

  // 如果在目录下输入任何不存在的参数，则跳转到list
  @RequestMapping(value = "/experience/{formName}")
  public String index2(@PathVariable String formName) {
//		return formName;
    String blank = "/experience/list";
    return blank;
  }

//  @RequestMapping(value = "/experience/list", method = RequestMethod.GET)
//  public String index(Model model, String content, int pageNum, int pageSize) {
////    PageInfo pageInfo = rainservice.findAllDept(pageNum, pageSize);
////    if (content != null) {
////      pageInfo = rainservice.findAllDept(content, pageNum, pageSize);
////    }
//    PageInfo pageInfo = experienceService.getDepts(content,pageNum,pageSize);
//    model.addAttribute("list", pageInfo.getList());
//    model.addAttribute("pageInfo", pageInfo);
//    return "experience/list";
//  }

//  @RequestMapping(value = "/experience/add", method = RequestMethod.GET)
//  public String add(Model model, Integer id) {
////		System.out.println(id);
//    if (id != null) {
//      Dept dept = rainservice.get_Info(id);
//      model.addAttribute("experience", dept);
////			System.out.println(dept.getName());
//    }
//    return "/experience/add";
//  }

//  @RequestMapping(value = "/experience/add", method = RequestMethod.POST)
//  public ModelAndView add(ModelAndView mv, @ModelAttribute Dept dept, Integer id) {
//    System.out.println(id);
////		System.out.println(dept.getId());
//    if (id != null) {
//      rainservice.update_Info(dept);
//      System.out.println(dept.getId());
//    } else {
//      rainservice.addDept(dept);
//    }
////		System.out.println(dept.getName());
//    mv.setViewName("redirect:/experience/list?pageNum=1&pageSize=6");
//    return mv;
//  }

  @RequestMapping(value = "/experience/delete", method = RequestMethod.GET)
  public void delete(Integer id) {
    System.out.println(id);
    if (id != null) {
      rainservice.delete_Info(id);
    }
  }
}
