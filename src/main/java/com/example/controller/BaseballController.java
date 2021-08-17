package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Baseball;
import com.example.service.BaseballService;

/**
 * チーム情報を検索する処理のコントローラー.
 * 
 * @author yuyayokoyama
 *
 */
@Controller
@RequestMapping("/baseball")
public class BaseballController {
	
	@Autowired
	private BaseballService baseballService;
	
	
	/**
	 * 野球チーム一覧画面を出力.
	 * 
	 * @param model モデル
	 * @return 野球チーム一覧画面
	 */
	@RequestMapping("/showList")
	public String showList(Model model) {
		List<Baseball> baseballList = baseballService.showList();
		model.addAttribute("baseballList", baseballList);
		
		return "/baseball/list";
	}
	
	
	/**
	 * チーム詳細画面の出力.
	 * 
	 * @param id ID
	 * @param model モデル
	 * @return チーム詳細画面
	 */
	@RequestMapping("/showDetail")
	public String showDetail(String id, Model model) {
		Baseball baseball = baseballService.showDetail(Integer.parseInt(id));
		model.addAttribute("baseball", baseball);
		
		return "/baseball/detail";
	}
	
}
