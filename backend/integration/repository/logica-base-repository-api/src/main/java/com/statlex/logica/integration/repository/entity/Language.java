package com.statlex.logica.integration.repository.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * Persistent class for LANGUAGE database table.
 *
 * @author pavel.sychykau
 * @version 0.1 Dec 30, 2014
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

	@OneToMany(mappedBy = "language")
	private Collection<UserProfile> userProfiles;

	@OneToMany(mappedBy = "language")
	private Collection<Category> categories;

	@OneToMany(mappedBy = "language")
	private Collection<Text> texts;

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

	public Collection<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Collection<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public Collection<Category> getCategories() {
		return categories;
	}

	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}

	public Collection<Text> getTexts() {
		return texts;
	}

	public void setTexts(Collection<Text> texts) {
		this.texts = texts;
	}

}
