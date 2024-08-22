package com.movies.movies_backend.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "category_movies")
public class CategoryMovies {

    @EmbeddedId
    CategoryMoviesPK id;

    @ManyToOne
    @JoinColumn(name = "id_movie", referencedColumnName = "id_movie",
    insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category",
    insertable = false, updatable = false)
    private Category category;

    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp lastUpdate;

    public CategoryMovies() {
    }

    public CategoryMoviesPK getId() {
        return id;
    }

    public void setId(CategoryMoviesPK id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}
