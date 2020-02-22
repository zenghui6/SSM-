package com.zenghui.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private String name;

    private String subtitle;

    private Float originalprice;

    private Float promoteprice;

    private Integer stock;

    private Integer cid;

    private Date createdate;

    public Product(Integer id, String name, String subtitle, Float originalprice, Float promoteprice, Integer stock, Integer cid, Date createdate) {
        this.id = id;
        this.name = name;
        this.subtitle = subtitle;
        this.originalprice = originalprice;
        this.promoteprice = promoteprice;
        this.stock = stock;
        this.cid = cid;
        this.createdate = createdate;
    }

    public Product() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Float getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Float originalprice) {
        this.originalprice = originalprice;
    }

    public Float getPromoteprice() {
        return promoteprice;
    }

    public void setPromoteprice(Float promoteprice) {
        this.promoteprice = promoteprice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}