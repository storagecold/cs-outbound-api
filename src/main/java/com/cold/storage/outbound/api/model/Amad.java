package com.cold.storage.outbound.api.model;

import lombok.Data;

import java.util.Date;
@Data
public class Amad {
    private String coldId;
    private int amadNo;
    private Date entryDate;
    private String accountName;
    private String village;
    private int packets;
    private String commodity;
    private String kism;
    private String lotNo;
    private int year;
    private int chamberNo;
    private int chatta;
    private int gulla;
    private Date createdAt;
    private Date updatedAt;

}
