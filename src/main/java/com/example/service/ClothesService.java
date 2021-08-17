package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Clothes;
import com.example.repository.ClothesRepository;

/**
 * 衣類情報の業務処理を行うサービス.
 * 
 * @author yuyayokoyama
 *
 */

@Service
@Transactional
public class ClothesService {
	
	@Autowired
	private ClothesRepository clotheRepository;
	
	
	public List<Clothes> searchByColorAndGender(String color, Integer gender){
		return clotheRepository.findByColorAndGender(color, gender);
	}
	

}
