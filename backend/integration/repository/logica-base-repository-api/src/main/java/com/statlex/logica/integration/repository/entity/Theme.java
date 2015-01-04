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
 * Persistent class for THEMES database table.
 * 
 */
@Entity
@Table(name = "THEMES")
public class Theme {

	@Id
	@Column(name = "THEME_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long themeId;

	@Column(name = "THEME_DESC")
	private String themeDescription;

	@OneToMany(mappedBy = "theme")
	private Collection<UserProfile> userProfiles;

	public Long getThemeId() {
		return themeId;
	}

	public void setThemeId(Long themeId) {
		this.themeId = themeId;
	}

	public String getThemeDescription() {
		return themeDescription;
	}

	public void setThemeDescription(String themeDescription) {
		this.themeDescription = themeDescription;
	}

	public Collection<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Collection<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

}
