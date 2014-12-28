package com.statlex.logica.integration.repository.entity;

import javax.persistence.*;

/**
 * The persistent class for language database table.
 * 
 */
@Entity
@Table(name = "LANGUAGE")
public class Language {

	@Id
	@Column(name = "LANG_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long langId;

	@Column(name = "LANG_DESC")
	private String langDescription;

	public Long getLangId() {
		return langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

	public String getLangDescription() {
		return langDescription;
	}

	public void setLangDescription(String langDescription) {
		this.langDescription = langDescription;
	}

}
