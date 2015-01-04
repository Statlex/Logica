package com.statlex.logica.integration.repository.entity.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * Embeddable class for CATEGORIES table ID.
 *
 * @author pavel.sychykau
 * @version 0.1 Jan 3, 2015
 */
@Embeddable
public class CategoryId implements Serializable {

	private static final long serialVersionUID = -6955029177677920941L;

	@Column(name = "CATEGORY_ID")
	private Long categoryId;

	@Column(name = "LANG_ID")
	private Long languageId;

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result
				+ ((languageId == null) ? 0 : languageId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryId other = (CategoryId) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (languageId == null) {
			if (other.languageId != null)
				return false;
		} else if (!languageId.equals(other.languageId))
			return false;
		return true;
	}

}
