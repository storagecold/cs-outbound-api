package com.cold.storage.outbound.api.repository;

import com.cold.storage.outbound.api.model.Amad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Repository
public class AmadRepoImpl implements AmadRepo {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Amad> getAmads() {
        return mongoTemplate.findAll(Amad.class);
    }

    @Override
    public List<Amad> getAmadByNumber(int amadNo) {
        Query query = new Query();
        query.addCriteria(Criteria.where("amadNo").is(amadNo));
        return mongoTemplate.find(query, Amad.class);
    }

    public List<Amad> getAmadByPartyName(String accountName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("accountName").is(accountName));
        return mongoTemplate.find(query, Amad.class);
    }

    @Override
    public List<Amad> postAmad(Amad amad) {
        Query query = new Query();
        if (amad.getAmadNo() > 0) {
            query.addCriteria(Criteria.where("amadNo").is(amad.getAmadNo()));
        }
        if (StringUtils.hasText(amad.getVillage())) {
            query.addCriteria(Criteria.where("village").is(amad.getVillage()));
        }

        return mongoTemplate.find(query, Amad.class);


    }

}
