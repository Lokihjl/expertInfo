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

import cn.edi.expertInfo.domain.Expert;
import cn.edi.expertInfo.service.CategoryService;
import cn.edi.expertInfo.service.ExpertService;
import cn.edi.expertInfo.service.PatentService;

@Controller
public class ExpertController {

	@Autowired
	private ExpertService expertService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private   PatentService patentService;

	// 如果在目录下输入为空，则跳转到指定链接
	@RequestMapping(value = "/expert/")
	public ModelAndView index2(ModelAndView mv) {
		mv.setViewName("expert/list");
		return mv;
	}

	// 如果在目录下输入任何不存在的参数，则跳转到list
	@RequestMapping(value = "/expert/{formName}")
	public String index2(@PathVariable String formName) {
		String blank = "/expert/list";
		return blank;
	}

	@RequestMapping(value = "/expert/list", method = RequestMethod.GET)
	public String index(Model model, String content, int pageNum, int pageSize) {
		PageInfo pageInfo = expertService.getExpert(content, pageNum, pageSize);
		System.out.println("111" + pageInfo.getList().size());
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("pageInfo", pageInfo);
		return "expert/list";
	}

	@RequestMapping(value = "/expert/add", method = RequestMethod.GET)
	public String add(Model model, Integer id) {
		
	    model.addAttribute("category_list", categoryService.list());
	    model.addAttribute("user_list", patentService.userList());
		return "/expert/add";
	}

	@RequestMapping(value = "/expert/add", method = RequestMethod.POST)
	public ModelAndView add(ModelAndView mv, @ModelAttribute Expert job, Integer id) {
		if (job.getId() != null) {
			expertService.update(job);
		} else {
			expertService.insert(job);
		}
		mv.setViewName("redirect:/expert/list?pageNum=1&pageSize=6");
		return mv;
	}

	@RequestMapping(value = "/expert/delete", method = RequestMethod.GET)
	public String delete(Integer id) {
		if (id != null) {
			expertService.delete(id);
		}
		return "expert/list";
	}
}
