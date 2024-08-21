package com.movies.movies_backend.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_text")
public class FilmText {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "SMALLINT", nullable = false)
    private Long filmtextid;

    @Column(name = "title", columnDefinition = "VARCHAR(255)", nullable = false)
    private String titlefilmtext;

    @Column(name = "description", columnDefinition = "TEXT", nullable = true)
    private String textfilmtext;

    public FilmText() {
    }

    public Long getFilmtextid() {
        return filmtextid;
    }

    public void setFilmtextid(Long filmtextid) {
        this.filmtextid = filmtextid;
    }

    public String getTitlefilmtext() {
        return titlefilmtext;
    }

    public void setTitlefilmtext(String titlefilmtext) {
        this.titlefilmtext = titlefilmtext;
    }

    public String getTextfilmtext() {
        return textfilmtext;
    }

    public void setTextfilmtext(String textfilmtext) {
        this.textfilmtext = textfilmtext;
    }
}
