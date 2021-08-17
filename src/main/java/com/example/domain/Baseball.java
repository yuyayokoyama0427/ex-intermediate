package com.example.domain;

public class Baseball {
	
	/** ID */
	private Integer id;
	/** リーグ名 */
	private String LeagueName;
	/** 球団名 */
	private String teamName;
	/** 本拠地 */
	private String headquarters;
	/** 発足 */
	private String inauguration;
	/** 歴史 */
	private String history;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeagueName() {
		return LeagueName;
	}
	public void setLeagueName(String leagueName) {
		LeagueName = leagueName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getInauguration() {
		return inauguration;
	}
	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
	@Override
	public String toString() {
		return "ex01Domain [id=" + id + ", LeagueName=" + LeagueName + ", teamName=" + teamName + ", headquarters="
				+ headquarters + ", inauguration=" + inauguration + ", history=" + history + "]";
	}
	

}
