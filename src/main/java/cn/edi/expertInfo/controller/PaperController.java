package cn.edi.expertInfo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PaperController {

//  @Autowired
//  @Qualifier("RainService")
//  private PatentService rainservice;
//
//
//  @Autowired
//  private ExpericenceService documentService;
//
//  // 如果在目录下输入为空，则跳转到指定链接
//  @RequestMapping(value = "/document/")
//  public ModelAndView index2(ModelAndView mv) {
//    mv.setViewName("document/list");
//    return mv;
//  }
//
//  // 如果在目录下输入任何不存在的参数，则跳转到list
//  @RequestMapping(value = "/document/{formName}")
//  public String index2(@PathVariable String formName) {
//    String blank = "/document/list";
//    return blank;
//  }
//
//  @RequestMapping(value = "/document/list", method = RequestMethod.GET)
//  public String index(Model model, String content,int pageNum,int pageSize,
//      HttpSession session) {
//    PageInfo doc = documentService.getDoc(pageNum, pageSize, content);
//    model.addAttribute("list", doc.getList());
//    model.addAttribute("pageInfo",doc);
//    model.addAttribute("userid",session.getAttribute("userid"));
//    return "document/list";
//  }
//
//  @RequestMapping(value = "/document/add", method = RequestMethod.GET)
//  public String add(Model model, Integer id,HttpSession session) {
//    if (id != null) {
//      Document job = rainservice.get_DocumentInfo(id);
//      model.addAttribute("job", job);
//    }
//    System.out.println(session.getAttribute("userid"));
//    model.addAttribute("userId",session.getAttribute("userid"));
//    return "/document/add";
//  }
//
//  @RequestMapping(value = "/document/add", method = RequestMethod.POST)
//  public ModelAndView add(ModelAndView mv, @ModelAttribute Document document, Integer userId,Integer id,
//      HttpSession session
//  )
//      throws Exception {
//    if (id != null) {
//      rainservice.update_DocumentInfo(document);
//    } else {
//      /**
//       * 上传文件
//       */
//      String path = session.getServletContext().getRealPath("/upload/");
//      String filename = document.getFile().getOriginalFilename();
//      path = "E://excel";
//      File tempFile = new File(path + File.separator + filename);
//      tempFile.createNewFile();
//      document.getFile().transferTo(tempFile);
//      document.setFilename(filename);
//      document.setPath(path);
////      rainservice.insert_DocumentInfo(document);
//      documentService.insert(document,userId);
//    }
//    mv.setViewName("redirect:/document/list?pageNum=1&pageSize=6");
//    return mv;
//  }
//
//  @RequestMapping(value = "/document/delete", method = RequestMethod.GET)
//  public void delete(Integer id) {
//    System.out.println(id);
//    if (id != null) {
//      rainservice.delete_DocumentInfo(id);
//    }
//  }
//  @RequestMapping(value = "/document/download",method = RequestMethod.GET)
//  public void download(String path,String filename, HttpServletResponse response) {
//    String realParth = path+"//"+filename;
//    InputStream inStream = null;// 文件的存放路径
//    try {
//      inStream = new FileInputStream(realParth);
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
//    // 设置输出的格式
//    response.reset();
//    response.setContentType("bin");
//    response.addHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
//    // 循环取出流中的数据
//    byte[] b = new byte[100];
//    int len;
//    try {
//      while ((len = inStream.read(b)) > 0)
//        response.getOutputStream().write(b, 0, len);
//      inStream.close();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
}
