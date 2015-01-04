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
 * Persistent class for TEXT_TYPES database table.
 * 
 */
@Entity
@Table(name = "TEXT_TYPES")
public class TextType {

	@Id
	@Column(name = "TYPE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long typeId;

	@Column(name = "TYPE_DESC")
	private String typeDescription;

	@OneToMany(mappedBy = "texts")
	private Collection<Text> texts;

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public Collection<Text> getTexts() {
		return texts;
	}

	public void setTexts(Collection<Text> texts) {
		this.texts = texts;
	}

}
