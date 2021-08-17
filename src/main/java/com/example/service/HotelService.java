package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

/**
 * ホテル情報を操作するサービス.
 * 
 * @author yuyayokoyama
 *
 */
@Service
@Transactional
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	/**
	 * 一定の価格以下のホテル情報を取得.
	 * @param price 価格
	 * @return ホテル情報
	 */
	public List<Hotel> searchByLessThanPrice(String price){
		if("" .equals(price)) {
			return hotelRepository.findAll();
		}else {
			return hotelRepository.searchByLessThanPrice(Integer.parseInt(price));
			
		}
		
		
	}

}
