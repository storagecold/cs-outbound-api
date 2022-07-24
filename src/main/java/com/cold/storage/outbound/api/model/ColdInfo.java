package com.cold.storage.outbound.api.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "coldInfo")
public class ColdInfo {
    private String submitterId;
    private String name;
    private String owner;
    private String contact;
    private String address;
    private String facebookUrl;
}
