package com.statlex.logica.integration.repository.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.statlex.logica.integration.repository.entity.id.TaskId;

/**
 * 
 * Persistent class for TASKS database table.
 *
 * @author pavel.sychykau
 * @version 0.1 Dec 30, 2014
 */
@Entity
@Table(name = "TASKS")
public class Task {

	@EmbeddedId
	private TaskId taskId;

	@Column(name = "TASK_ORDER")
	private Integer taskOrder;

	@MapsId("languageId")
	private Language language;

	@MapsId("categoryId")
	private Category category;

	@OneToMany(mappedBy = "task")
	private Collection<Text> texts;

	public TaskId getTaskId() {
		return taskId;
	}

	public void setTaskId(TaskId taskId) {
		this.taskId = taskId;
	}

	public Integer getTaskOrder() {
		return taskOrder;
	}

	public void setTaskOrder(Integer taskOrder) {
		this.taskOrder = taskOrder;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Collection<Text> getTexts() {
		return texts;
	}

	public void setTexts(Collection<Text> texts) {
		this.texts = texts;
	}

}
