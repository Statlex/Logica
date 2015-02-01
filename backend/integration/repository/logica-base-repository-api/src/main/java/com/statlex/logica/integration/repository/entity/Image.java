package com.statlex.logica.integration.repository.entity;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 * 
 * Persistent class for IMAGES database table.
 *
 * @author pavel.sychykau
 * @version 0.1 Dec 30, 2014
 */
@Entity
@Table(name = "IMAGES")
public class Image {

	@Id
	@Column(name = "IMAGE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;

	@Column(name = "IMAGE_POSITION")
	private String imagePosition;

	@Column(name = "IMAGE")
	private Blob image;

	@MapsId("textId")
	@ManyToOne
	private Text text;

	@MapsId("langId")
	@ManyToOne
	private Language language;

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImagePosition() {
		return imagePosition;
	}

	public void setImagePosition(String imagePosition) {
		this.imagePosition = imagePosition;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

}
