package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Baseball;
import com.example.repository.BaseballRepository;

/**
 * チーム情報を操作するサービス.
 * 
 * @author yuyayokoyama
 *
 */
@Service
@Transactional
public class BaseballService {
	
	@Autowired
	private BaseballRepository baseballRepository;
	
	
	/**
	 * 野球チーム一覧情報の全件取得.
	 * @return 野球チーム一覧
	 */
	public List<Baseball> showList(){
		List<Baseball> baseballList = baseballRepository.findAll();
		return baseballList;
	}
	
	/**
	 * チーム詳細情報の取得
	 * @param id ID
	 * @return 詳細情報
	 */
	public Baseball showDetail(Integer id) {
		Baseball baseball = baseballRepository.load(id);
		return baseball;
	}

}
