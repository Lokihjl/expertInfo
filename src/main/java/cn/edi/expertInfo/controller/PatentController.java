package cn.edi.expertInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.service.PatentService;

@Controller
public class PatentController {

	@Autowired
	PatentService patentService;

	// 如果在目录下输入为空，则跳转到指定链接
	@RequestMapping(value = "/patent/")
	public ModelAndView index2(ModelAndView mv) {
		mv.setViewName("patent/list");
		return mv;
	}

	// 如果在目录下输入任何不存在的参数，则跳转到list
	@RequestMapping(value = "/patent/{formName}")
	public String index2(@PathVariable String formName) {
		String blank = "/patent/list";
		return blank;
	}

	@RequestMapping(value = "/patent/list", method = RequestMethod.GET)
	public String index(Model model, String content, int pageNum, int pageSize) {
		PageInfo pageInfo = patentService.findAll(content, pageNum, pageSize);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("pageInfo", pageInfo);
		return "patent/list";
	}

	@RequestMapping(value = "/patent/add", method = RequestMethod.GET)
	public String add(Model model, Integer id) {

		return "/patent/add";
	}

	@RequestMapping(value = "/patent/add", method = RequestMethod.POST)
	public ModelAndView add(ModelAndView mv, @ModelAttribute Patent patent, Integer id) {
		if (id != null) {
			patentService.update(patent);
		} else {
			patentService.insert(patent);
		}
		mv.setViewName("redirect:/patent/list?pageNum=1&pageSize=6");
		return mv;
	}

}
