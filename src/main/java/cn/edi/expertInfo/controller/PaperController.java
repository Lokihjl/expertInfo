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

import cn.edi.expertInfo.domain.Paper;
import cn.edi.expertInfo.service.PaperService;

@Controller
public class PaperController {

	@Autowired
	private PaperService paperService;

	// 如果在目录下输入为空，则跳转到指定链接
	@RequestMapping(value = "/paper/")
	public ModelAndView index2(ModelAndView mv) {
		mv.setViewName("paper/list");
		return mv;
	}

	// 如果在目录下输入任何不存在的参数，则跳转到list
	@RequestMapping(value = "/paper/{formName}")
	public String index2(@PathVariable String formName) {
		String blank = "/paper/list";
		return blank;
	}

	@RequestMapping(value = "/paper/list", method = RequestMethod.GET)
	public String index(Model model, String content, int pageNum, int pageSize
	// HttpSession session
	) {
		PageInfo paper = paperService.findAll(content, pageNum, pageSize);
		model.addAttribute("list", paper.getList());
		model.addAttribute("pageInfo", paper);
		// model.addAttribute("userid",session.getAttribute("userid"));
		return "paper/list";
	}

	@RequestMapping(value = "/paper/add", method = RequestMethod.GET)
	public String add(Model model, Integer id) {

		return "/paper/add";
	}

	@RequestMapping(value = "/paper/add", method = RequestMethod.POST)
	public ModelAndView add(ModelAndView mv, @ModelAttribute Paper paper, Integer userId, Integer id) throws Exception {
		paperService.insert(paper);

		mv.setViewName("redirect:/paper/list?pageNum=1&pageSize=6");
		return mv;
	}

	@RequestMapping(value = "/paper/delete", method = RequestMethod.GET)
	public void delete(Integer id) {
		System.out.println(id);
		if (id != null) {
			paperService.delete(id);
		}
	}

}
