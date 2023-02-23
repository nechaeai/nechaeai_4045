package com.plantplaces;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;




@Controller
public class HomeController {
	

	@Autowired
	private ISpecimenService  specimenServiceStub;

	@RequestMapping(value="/savespecimen")
	public String saveSpecimen(SpecimenDTO specimenDTO) {
		specimenDTO.setPlantId(13);
		return "start";
	}
	
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	
	
	
	
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers={"content-type=text/json"})
	@ResponseBody
	public SpecimenDTO readJSON(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return specimenDTO;
		
	}

	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		model.addAttribute("specimenDTO", new SpecimenDTO());
		return "start";
	}
 
	@RequestMapping(value="/addspecimen", method=RequestMethod.GET)
	public String addSpecimen(Model model, @RequestParam(value="latitude", required=false, defaultValue="0.0") String latitude) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		specimenDTO.setLatitude(latitude); 
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	
	
		
	
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver() {

		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
	@RequestMapping("/searchPlants")
public String searchPlants(@RequestParam(value="searchTerm", required=false, defaultValue="0.0")String searchTerm ){
	String enhancedTerm = searchTerm + "";
	return "start";
}
	
	@RequestMapping("/searchPlantsAll")
public String searchPlantsAll(@RequestParam Map<String,String> requestParams){
int params = requestParams.size();
requestParams.get("searchTerm");
		return "start";
}
	}