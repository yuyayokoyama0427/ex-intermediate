package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Clothes;

/**
 * clothesテーブルを操作するリポジトリ
 * 
 * @author yuyayokoyama
 *
 */
@Repository
public class ClothesRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Clothes> CLOTHES_ROW_MAPPER = (rs, i) ->{
		
		Clothes clothe = new Clothes();
		clothe.setId(rs.getInt("id"));
		clothe.setCategory(rs.getString("category"));
		clothe.setGenre(rs.getString("genre"));
		clothe.setGender(rs.getInt("gender"));
		clothe.setColor(rs.getString("color"));
		clothe.setPrice(rs.getInt("price"));
		clothe.setSize(rs.getString("size"));
		
		return clothe;
	};
	
	/**
	 * 色と性別の条件に合う衣類情報を取得.
	 * @param color 色
	 * @param gender 性別
	 * @return 衣類情報一覧
	 */
	public List<Clothes> findByColorAndGender(String color, Integer gender){
		String sql = "SELECT id, category, genre, gender, color, price, size FROM clothes WHERE color=:color AND gender=:gender;";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("color", color).addValue("gender", gender);
		
		List<Clothes> clotheList = template.query(sql.toString(), param, CLOTHES_ROW_MAPPER);
		
		return clotheList;
	}

}
