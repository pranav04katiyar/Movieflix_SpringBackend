package com.movieflix.dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private Integer movieId;

    @NotBlank(message = "Movie Title is required")
    private String title;

    @NotBlank(message = "Please provide name of the director")
    private String director;

    @NotBlank(message = "Please provide name of the studio")
    private String studio;

    private Set<String> movieCast;

    private Integer releaseYear;

    @NotBlank(message = "Movie Poster is required")
    private String poster;

    @NotBlank(message = "Movie Poster URL is required")
    private String posterUrl;
}
