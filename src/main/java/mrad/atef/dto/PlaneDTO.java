package mrad.atef.dto;

import java.time.LocalDate;

public class PlaneDTO {
    private Long id;
    private String model;
    private String brand;
    private LocalDate releaseDate;
    private String status;

    // Constructeurs
    public PlaneDTO() {}

    public PlaneDTO(Long id, String model, String brand, LocalDate releaseDate, String status) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.releaseDate = releaseDate;
        this.status = status;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
