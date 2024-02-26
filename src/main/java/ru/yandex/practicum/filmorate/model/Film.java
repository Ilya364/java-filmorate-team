package ru.yandex.practicum.filmorate.model;

import ru.yandex.practicum.filmorate.validator.AfterDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.*;

/**
 * Film.
 */
@lombok.Data
public class Film {
    private static int filmCount = 0;
    @lombok.NonNull
    @NotBlank
    private final String name;
    @lombok.NonNull
    @Size(max = 200, message = "Длина описания не должна превышать 200 символов")
    private final String description;
    @lombok.NonNull
    @AfterDate(date = "1895-12-28")
    private final LocalDate releaseDate;
    @lombok.NonNull
    private int id;
    @lombok.NonNull
    @Positive
    private int duration;
    private Set<Integer> likes = new HashSet<>();
    private ArrayList<Map<String, Object>> genres = new ArrayList<>();
    private Set<Integer> genreIds = new HashSet<>();
    private Map<String, Object> mpa = new HashMap<>();

    public Film(String name, String description, LocalDate releaseDate, int duration) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

}
