package com.statlex.logica.integration.repository.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.statlex.logica.integration.repository.entity.id.CategoryId;

/**
 * Persistent class for CATEGORIES database table.
 * 
 */
@Entity
@Table(name = "CATEGORIES")
public class Category {

	@EmbeddedId
	private CategoryId categoryId;

	@Column(name = "CATEGORY_ORDER")
	private Integer categoryOrder;

	@Column(name = "CATEGORY_DESC")
	private String categoryDescription;

	@MapsId("languageId")
	@ManyToOne
	private Language language;

	@OneToMany(mappedBy = "category")
	private Collection<Task> tasks;

	public CategoryId getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CategoryId categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCategoryOrder() {
		return categoryOrder;
	}

	public void setCategoryOrder(Integer categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

}
