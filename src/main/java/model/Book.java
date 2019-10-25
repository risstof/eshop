package model;

import java.nio.file.Path;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	Integer id;
	String title;
	String author;
	String format;
	String dimension;
	Date publicationDate;
	String publischer;
	String publicationCity;
	String publicationCountry;
	String language;
	String rank;
	String description;
	Path coverPath;

	public Book() {

	}

	public Book(Integer id, String title, String author, String format, String dimension, Date publicationDate,
			String publischer, String publicationCity, String publicationCountry, String language, String rank,
			String description, Path coverPath) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.format = format;
		this.dimension = dimension;
		this.publicationDate = publicationDate;
		this.publischer = publischer;
		this.publicationCity = publicationCity;
		this.publicationCountry = publicationCountry;
		this.language = language;
		this.rank = rank;
		this.description = description;
		this.coverPath = coverPath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPublischer() {
		return publischer;
	}

	public void setPublischer(String publischer) {
		this.publischer = publischer;
	}

	public String getPublicationCity() {
		return publicationCity;
	}

	public void setPublicationCity(String publicationCity) {
		this.publicationCity = publicationCity;
	}

	public String getPublicationCountry() {
		return publicationCountry;
	}

	public void setPublicationCountry(String publicationCountry) {
		this.publicationCountry = publicationCountry;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Path getCoverPath() {
		return coverPath;
	}

	public void setCoverPath(Path coverPath) {
		this.coverPath = coverPath;
	}
}
