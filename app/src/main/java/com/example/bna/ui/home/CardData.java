package com.example.bna.ui.home;

public class CardData {
    String titleMovie , season , episode , deskripsi;
    int image;

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public CardData(String titleMovie, String season, String episode, String deskripsi, int image) {
        this.titleMovie = titleMovie;
        this.season = season;
        this.episode = episode;
        this.deskripsi = deskripsi;
        this.image = image;
    }
}
