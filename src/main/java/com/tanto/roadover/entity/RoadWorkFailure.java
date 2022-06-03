package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class RoadWorkFailure {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double height;

    @Column
    private Double roadSiteLength;

    @JoinColumn(nullable = false)
    @OneToOne
    private Report report;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getRoadSiteLength() {
        return roadSiteLength;
    }

    public void setRoadSiteLength(Double roadSiteLength) {
        this.roadSiteLength = roadSiteLength;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
