package com.app.allyworld.AllyWebSite.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.app.allyworld.AllyWebSite.entity.Profile;

@Controller
public class WebsiteResource {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/addNewProfile")
	public String addNewProfile() {
		return "addNewProfile";
	}

	@RequestMapping("/createNewProfie")
	public String createProfile(@ModelAttribute Profile profile, Model model) {
		restTemplate.postForObject("http://localhost:2013/profiles", profile, Profile.class);
		return "ProfileDetails";
	}

	@RequestMapping("/getAllProfiles")
	public String getAllProfiles(@ModelAttribute Profile profile, Model model) {
		ResponseEntity<List> entity = restTemplate.getForEntity("http://localhost:2013/profiles", List.class);
		model.addAttribute("profiles", entity.getBody());
		return "ProfileDetails";
	}

	@RequestMapping("/getProfileById")
	public String getProfileById() {
		System.out.println("priyanka");
		return "SearchProfileById";
	}

	@RequestMapping("/searchProfileById")
	public String gettingProfileById(@RequestParam("profileId") int profileId, Model model) {
		Profile profile = restTemplate.getForObject("http://localhost:2013/profiles/" + profileId, Profile.class);
		model.addAttribute("profile", profile);
		return "ProfileDetails";

	}

	@RequestMapping("/updateProfileById")
	public String updateProfile() {
		return "UpdateProfileById";
	}

	@RequestMapping("/updateById")
	public String UpadateProfileById(@RequestParam("profileId") int profileId, Model model)

	{
		ResponseEntity<Profile> profile = restTemplate.getForEntity("http://localhost:2013/profiles/" + profileId,
				Profile.class);
		model.addAttribute("profile", profile.getBody());
		return "UpdateDetails";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute Profile profile) {
		restTemplate.put("http://localhost:2013/profiles/",profile);
		return "ProfileDetails";

	}

	@RequestMapping("/deleteProfileId")
	public String delete() {
		return "DeleteForm";
	}

	@RequestMapping("/deleteProfile")
	public String deleteProfile(@RequestParam("profileId") int profileId) {
		restTemplate.delete("http://localhost:2013/profiles/" + profileId);
		return "DisplayDelete";

	}
}
