package com.ards.heru.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "corona_virus")
public class CoronaVirus {

    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Integer id;

    private String province;

    private String city;

    private Double confirmed;

    private Double died;

    private Double recover;

    private Date updated;

    public CoronaVirus(String province, String city, Double confirmed, Double died, Double recover, Date updated) {
        this.province = province;
        this.city = city;
        this.confirmed = confirmed;
        this.died = died;
        this.recover = recover;
        this.updated = updated;
    }

    public CoronaVirus(){}

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Double confirmed) {
        this.confirmed = confirmed;
    }

    public Double getDied() {
        return died;
    }

    public void setDied(Double died) {
        this.died = died;
    }

    public Double getRecover() {
        return recover;
    }

    public void setRecover(Double recover) {
        this.recover = recover;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "CoronaVirus{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", confirmed=" + confirmed +
                ", died=" + died +
                ", recover=" + recover +
                ", updated=" + updated +
                '}';
    }

}
