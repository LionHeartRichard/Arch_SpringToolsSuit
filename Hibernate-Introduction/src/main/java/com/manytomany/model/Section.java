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
public class Section {

	public Section() {
	}

	public Section(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String name;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinTable(name = "section_child", joinColumns = @JoinColumn(name = "section_id"), inverseJoinColumns = @JoinColumn(name = "child_id"))
	private List<Child> listChildren;

	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + "]";
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

	public List<Child> getListChildren() {
		return listChildren;
	}

	public void setListChildren(List<Child> listChildren) {
		this.listChildren = listChildren;
	}

	public void addChild(Child child) {
		if (listChildren == null) {
			listChildren = new ArrayList<>();
		}
		listChildren.add(child);
	}

}
