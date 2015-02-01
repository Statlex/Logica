package com.statlex.logica.integration.repository.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import com.statlex.logica.integration.repository.entity.id.UserProfileId;

/**
 * 
 * Persistent class for USER_PROFILES database table.
 *
 * @author pavel.sychykau
 * @version 0.1 Dec 30, 2014
 */
@Entity
@Table(name = "USER_PROFILES")
public class UserProfile {

	@EmbeddedId
	private UserProfileId userId;

	@Column(name = "DEVICE_TOCKEN")
	private String deviceToken;

	@Column(name = "IS_ADS_FREE")
	private Boolean adsFree;

	@MapsId("themeId")
	@ManyToOne
	private Theme theme;

	@MapsId("langId")
	@ManyToOne
	private Language language;

	public UserProfileId getUserId() {
		return userId;
	}

	public void setUserId(UserProfileId userId) {
		this.userId = userId;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public Boolean getAdsFree() {
		return adsFree;
	}

	public void setAdsFree(Boolean adsFree) {
		this.adsFree = adsFree;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}
