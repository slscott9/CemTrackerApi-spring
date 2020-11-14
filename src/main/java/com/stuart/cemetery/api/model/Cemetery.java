package com.stuart.cemetery.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Cemetery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cemeteryId;

    private String name;

    private String location;

    private String county;

    private String townShip;

    private String cemRange;

    private String spot;

    private String firstYear;

    private String cemSection;

    private Boolean isSynced;

    private String addedBy;

    private Integer graveCount;


    public Integer getGraveCount() {
        return graveCount;
    }

    public void setGraveCount(Integer graveCount) {
        this.graveCount = graveCount;
    }



    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }


    @OneToMany(mappedBy = "cemetery", cascade = CascadeType.ALL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Set<Grave> graves = new HashSet<>();


    public Long getCemeteryId() {
        return cemeteryId;
    }

    public void setCemeteryId(Long cemeteryId) {
        this.cemeteryId = cemeteryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTownShip() {
        return townShip;
    }

    public void setTownShip(String townShip) {
        this.townShip = townShip;
    }

    public String getRange() {
        return cemRange;
    }

    public void setRange(String range) {
        this.cemRange = range;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(String firstYear) {
        this.firstYear = firstYear;
    }

    public String getSection() {
        return cemSection;
    }

    public void setSection(String section) {
        this.cemSection = section;
    }

    public Boolean getSynced() {
        return isSynced;
    }

    public void setSynced(Boolean synced) {
        isSynced = synced;
    }

    public Set<Grave> getGraves() {
        return graves;
    }

    public void setGraves(Set<Grave> graves) {
        this.graves = graves;
    }
}
