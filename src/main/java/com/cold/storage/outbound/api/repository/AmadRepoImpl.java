package com.cold.storage.outbound.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

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
    @Override
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
