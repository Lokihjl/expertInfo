package cn.edi.expertInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.domain.response.RewardResDTO;
import cn.edi.expertInfo.service.ExpertService;
import cn.edi.expertInfo.service.RewardService;

@Controller
@RequestMapping("/reward")
public class RewardController {

  @Autowired
  RewardService rewardService;

  @Autowired
  ExpertService employeeService;

  @RequestMapping("/list")
  public String listAll(Model model,int pageNum,int pageSize,String content) {
    PageInfo reward = rewardService.getReward(pageNum, pageSize, content);
    model.addAttribute("pageInfo",reward);
    model.addAttribute("list",reward.getList());
    return "reward/list";

  }

//  @RequestMapping("/toadd")
//  public String add(Model model) {
//    Map<String, Object> info = employeeService.getInfo();
//    model.addAttribute("dept_list", (List<Dept>) info.get("depts"));
//    return "reward/add";
//  }

  @PostMapping("/add")
  public ModelAndView add(@ModelAttribute Reward reward, ModelAndView mv,Integer id) {
	  rewardService.insertOne(reward);
    mv.setViewName("redirect:/reward/list?pageNum=1&pageSize=6");
    return mv;
  }

  @RequestMapping("/toupdate")
  public String toUpdate(Model model,Integer id) {
    RewardResDTO reward = rewardService.getReward(id);
    model.addAttribute("reward",reward);
    return "reward/update";
  }

  @RequestMapping("/delete")
  public void delete(Integer id){
	  rewardService.delete(id);
  }
}
