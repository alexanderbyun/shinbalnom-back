package com.shinbalnom;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "sneakers")

public class Sneaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;
    @Column(name = "silhouette")
    private String silhouette;
    @Column(name = "colorway")
    private String colorway;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "style_code")
    private String styleCode;
    @Column(name = "description")
    private String description;
//    @Column(name = "release_year")
//    private int releaseYear;
//    @Column(name = "release_month")
//    private int releaseMonth;
//    @Column(name = "release_day")
//    private int releaseDay;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "estimated_retail_price")
    private int estimatedRetailPrice;
    @Column(name = "image")
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSilhouette() {
        return silhouette;
    }

    public void setSilhouette(String silhouette) {
        this.silhouette = silhouette;
    }

    public String getColorway() {
        return colorway;
    }

    public void setColorway(String colorway) {
        this.colorway = colorway;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStyleCode() {
        return styleCode;
    }

    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public int getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(int releaseYear) {
//        this.releaseYear = releaseYear;
//    }
//
//    public int getReleaseMonth() {
//        return releaseMonth;
//    }
//
//    public void setReleaseMonth(int releaseMonth) {
//        this.releaseMonth = releaseMonth;
//    }
//
//    public int getReleaseDay() {
//        return releaseDay;
//    }
//
//    public void setReleaseDay(int releaseDay) {
//        this.releaseDay = releaseDay;
//    }
    public Date getDate() {
        return releaseDate;
    }

    public void setDate(Date Date) {
        this.releaseDate = Date;
    }

    public int getEstimatedRetailPrice() {
        return estimatedRetailPrice;
    }

    public void setEstimatedRetailPrice(int estimatedRetailPrice) {
        this.estimatedRetailPrice = estimatedRetailPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
