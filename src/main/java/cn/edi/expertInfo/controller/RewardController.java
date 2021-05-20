package cn.edi.expertInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.service.ExpertService;
import cn.edi.expertInfo.service.RewardService;

@Controller
@RequestMapping("/reward")
public class RewardController {

	@Autowired
	RewardService rewardService;

	@Autowired
	ExpertService employeeService;

	@Autowired
	private ExpertService expertService;

	@RequestMapping("/list")
	public String listAll(Model model, int pageNum, int pageSize, String content) {
		PageInfo reward = rewardService.getReward(pageNum, pageSize, content);
		model.addAttribute("pageInfo", reward);
		model.addAttribute("list", reward.getList());
		return "reward/list";

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		 
		model.addAttribute("expert_list", expertService.allList());
		return "reward/add";
	}

	@PostMapping("/add")
	public ModelAndView add(@ModelAttribute Reward reward, ModelAndView mv, Integer id) {
		rewardService.insert(reward);
		mv.setViewName("redirect:/reward/list?pageNum=1&pageSize=6");
		return mv;
	}

	@RequestMapping("/toupdate")
	public String toUpdate(Model model, Integer id) {
		Reward reward = rewardService.getReward(id);
		model.addAttribute("reward", reward);
		return "reward/update";
	}

	@RequestMapping("/delete")
	public void delete(Integer id) {
		rewardService.delete(id);
	}
}
