package com.cold.storage.outbound.api.repository;

import com.cold.storage.outbound.api.model.ColdInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class ColdInfoRepoImpl implements ColdInfoRepo{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<ColdInfo> getColdInfo() {
        return mongoTemplate.findAll(ColdInfo.class);
    }

    @Override
    public List<String > getColdName(String submitterId) {
        Query query = new Query();
        query.fields().include("name");
        query.addCriteria(Criteria.where("name").is(submitterId));
        return mongoTemplate.find(query,String.class);
    }

    @Override
    public List<String> getColdOwner() {
        return null;
    }

    @Override
    public List<String> getColdAddress() {
        return null;
    }

    @Override
    public List<String> getFaceBookUrl() {
        return null;
    }
}
