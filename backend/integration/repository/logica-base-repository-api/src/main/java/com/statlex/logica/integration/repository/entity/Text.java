package com.statlex.logica.integration.repository.entity;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.statlex.logica.integration.repository.entity.id.TextId;

/**
 * 
 * Persistent class for TEXTS database table.
 *
 * @author pavel.sychykau
 * @version 0.1 Dec 30, 2014
 */
@Entity
@Table(name = "TEXTS")
public class Text {

	@EmbeddedId
	private TextId textId;

	@Column(name = "TEXT_DESC")
	private String textDescription;

	@MapsId("langId")
	@ManyToOne
	private Language language;

	@MapsId("typeId")
	@ManyToOne
	private TextType type;

	@MapsId("taskId")
	@ManyToOne
	private Task task;

	@OneToMany(mappedBy = "text")
	private Collection<Image> images;

	public TextId getTextId() {
		return textId;
	}

	public void setTextId(TextId textId) {
		this.textId = textId;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public TextType getType() {
		return type;
	}

	public void setType(TextType type) {
		this.type = type;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}

}
