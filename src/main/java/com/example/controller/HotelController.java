package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Hotel;
import com.example.form.HotelForm;
import com.example.service.HotelService;

/**
 * ホテル情報を検索する処理のコントローラー.
 * 
 * @author yuyayokoyama
 *
 */

@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	@ModelAttribute
	public HotelForm setupForm() {
		return new HotelForm();
	}
	
	@Autowired
	private HotelService hotelService;
	
	
	/**
	 * 検索画面のフォワード.
	 * @return 検索画面
	 */
	@RequestMapping("/search")
	public String search() {
		return "/hotel/search";
	}
	
	@RequestMapping("/toresult")
	public String tostring(HotelForm form, Model model) {
		List<Hotel> hotelList;
		hotelList = hotelService.searchByLessThanPrice(form.getPrice());
		model.addAttribute("hotelList", hotelList);
		return "hotel/search";
	}
	

}
