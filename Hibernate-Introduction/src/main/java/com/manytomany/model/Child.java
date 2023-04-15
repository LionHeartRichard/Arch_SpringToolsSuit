package com.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Child {

	public Child(String name) {
		this.name = name;
	}

	public Child() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private String name;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH,
			CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "section_child", joinColumns = @JoinColumn(name = "child_id"), inverseJoinColumns = @JoinColumn(name = "section_id"))
	private List<Section> listSection;

	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getListSection() {
		return listSection;
	}

	public void setListSection(List<Section> listSection) {
		this.listSection = listSection;
	}

	public void addSection(Section section) {
		if (listSection == null) {
			listSection = new ArrayList<>();
		}
		listSection.add(section);
	}

}
