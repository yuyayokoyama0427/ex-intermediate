package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ClothesForm;
import com.example.service.ClothesService;

/**
 * 衣類情報の処理制御を行うコントローラー.
 * 
 * @author yuyayokoyama
 *
 */

@Controller
@RequestMapping("/clothes")
public class ClothesController {
	
	@Autowired
	private ClothesService clotheService;
	
	
	@ModelAttribute
	public ClothesForm setupForm() {
		return new ClothesForm();
	}
	

}
