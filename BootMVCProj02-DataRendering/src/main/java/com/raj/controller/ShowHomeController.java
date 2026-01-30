package com.raj.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.model.Student;

@Controller
public class ShowHomeController {

//		@RequestMapping("/home")
	/*@RequestMapping("/")
	public String showHomePage() {
	
		//return LVN
		return "welcome";
	}
	*/
	/*@RequestMapping("/")
	public String showHomePage(BindingAwareModelMap map) {

		//set results to sharedMemory as model attributes
		map.addAttribute("sysDate",new Date());
		map.addAttribute("age",new Random().nextInt(40));

		//return LVN
		return "welcome";
	}*/

	/*@RequestMapping("/")
	public String showHomePage(Map<String,Object> map) {

		System.out.println("ShowHomeController.showHomePage():: "+map.getClass());
		//set results to sharedMemory as map attributes
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(40));

		//return LVN
		return "welcome";
	}
	 */

	/*@RequestMapping("/")
	public String showHomePage(Model model) {

		System.out.println("ShowHomeController.showHomePage():: "+model.getClass()+" .... "+model.hashCode());
		//set results to sharedMemory as model attributes
		model.addAttribute("sysDate",new Date());
		model.addAttribute("age",new Random().nextInt(40));

		//return LVN
		return "welcome";
	}*/

	/*@RequestMapping("/home")
	public Model showHomePage() {

		System.out.println("ShowHomeController.showHomePage()");
		//create Shared Memory
		Model model = new BindingAwareModelMap();

		//add model attributes
		model.addAttribute("sysDate",new Date());
		model.addAttribute("age",new Random().nextInt(40));
		return model;
	}*/

	/*@RequestMapping("/home")
	public Map<String,Object> showHomePage() {

		System.out.println("ShowHomeController.showHomePage()");
		//create Shared Memory
		Map<String, Object> map = new HashMap<String, Object>();

		//add model attributes
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(40));
		return map;
	}*/

	/*@RequestMapping("/home")
	public ModelAndView showHomePage() {

		System.out.println("ShowHomeController.showHomePage():: ");
		//create Shared Memory
		ModelAndView mav = new ModelAndView();

		//add model attributes
		mav.addObject("sysDate",new Date());
		mav.addObject("age",new Random().nextInt(40));

		//add LVN
		mav.setViewName("welcome");

		return mav;
	}*/

	/*@RequestMapping("/home")
	public void showHomePage(Map<String,Object> map) {

		System.out.println("ShowHomeController.showHomePage()");
		//create Shared Memory
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(40));
	}*/

	/*@RequestMapping("/home")
	public String showHomePage(Map<String,Object> map) {
	
		System.out.println("ShowHomeController.showHomePage()");
		//create Shared Memory
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(40));
	
		//return LVN
		return null;  
	}
	*/
	
	/*@RequestMapping("/home")
	public String showHomePage(Map<String,Object> map) {
	
		System.out.println("ShowHomeController.showHomePage()");
		//create Shared Memory
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(1000));
	
		//handler method chaining
	//		return "forward:report";
		return "redirect:report?p1=val1&p2=val2";
	}
	
	@RequestMapping("/report")
	public String showReport(Map<String, Object> map) {
		
		System.out.println("ShowHomeController.showReport()");
		//add more model attrbutes
		map.put("favColor", "red");
		
		//return LVN
		return "show_report1";
	}*/
	
	/*@Autowired
	private ServletConfig cgf;
	
	@Autowired
	private ServletContext sc;
	
	@RequestMapping("/home")
	public String showHomePage(Map<String,Object> map,
			                   HttpServletRequest req, 
			                   HttpServletResponse res,
			                   HttpSession ss) {
	
		System.out.println("Ds Logical name:: "+cgf.getServletName());
		System.out.println("Context path:: "+sc.getContextPath());
		System.out.println("ShowHomeController.showHomePage()");
		System.out.println("request url:: "+req.getRequestURI());
		System.out.println("status code:: "+res.getStatus());
		System.out.println("Session Id:: "+ss.getId());
		//create Shared Memory
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(1000));
	
		//handler method chaining
	//	return "forward:report";
		return "welcome";
	}*/
	
	/*@RequestMapping("/report")
	public void showReport(HttpServletResponse res) throws Exception {
		
		System.out.println("ShowHomeController.showReport()");
		
		//give instruction to browser to the response as downloadable content
		res.setHeader("content-disposition", "attachment;fileName=abc.html");
		//set response content type
		res.setContentType("text/html");
		
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		
		//Write the messages
		pw.println("<b> System Date and Time:: "+new Date());
		
		//close stream
		pw.close();
	}*/
	
	@GetMapping("/")
	public String showHome(Map<String, Object> map) {
		
		//add simple values as the model attributes
		map.put("name", "Raja");
		map.put("age", 30);
		map.put("addrs", "Hyd");
		
		//passing arrays and collections as the model attributes
		map.put("favColors", new String[] {"Red","Blue","Green"});
		map.put("friends", List.of("Raja","Rajesh","Priti"));
		map.put("phones",Set.of(5678909L,6787959L,4567869L));
		map.put("idDetails",Map.of("aadhar",567868,"voterid",76567,"panno",456789));
		
		//passing Model class obj as the model attribute
		Student st = new Student(1001,"Raja","Hyd");
		map.put("stud", st);
		
		//passing List of Model class objs as the model attributes
		Student st1 = new Student(1001,"Rajesh","Hyd");
		Student st2 = new Student(1002,"Suresh","Vizag");
		Student st3 = new Student(1003,"Rahul","Hyd");
		List<Student> list = List.of(st1, st2, st3);
		map.put("studList",list);
		
	//	return LVN
		return "welcome";
	}
	
}


