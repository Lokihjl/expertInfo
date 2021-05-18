package cn.edi.expertInfo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Category;
import cn.edi.expertInfo.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// 如果在目录下输入为空，则跳转到指定链接
	@RequestMapping(value = "/category/")
	public ModelAndView index2(ModelAndView mv) {
		mv.setViewName("category/list?pageNum=1&pageSize=6");
		return mv;
	}

	// 如果在目录下输入任何不存在的参数，则跳转到list
	@RequestMapping(value = "/category/{formName}")
	public String index2(@PathVariable String formName) {
		String blank = "/category/list?pageNum=1&pageSize=6";
		return blank;
	}

	@RequestMapping(value = "/category/list", method = RequestMethod.GET)
	public String index(Model model, String content, int pageNum, int pageSize, HttpSession session) {
		PageInfo category = categoryService.getCategorys(pageNum, pageSize, content);
		model.addAttribute("list", category.getList());
		model.addAttribute("pageInfo", category);
		model.addAttribute("userid", session.getAttribute("userid"));
		return "category/list";
	}

	@RequestMapping(value = "/category/add", method = RequestMethod.GET)
	public String add(Model model) {

		return "/category/add";
	}

	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public ModelAndView add(ModelAndView mv, @ModelAttribute Category category) {
		categoryService.insert(category);
		mv.setViewName("redirect:/category/list?pageNum=1&pageSize=6");
		return mv;
	}

	@RequestMapping(value = "/category/delete", method = RequestMethod.GET)
	public void delete(Integer id) {
		System.out.println(id);
		if (id != null) {
			categoryService.del(id);
		}
	}
}
