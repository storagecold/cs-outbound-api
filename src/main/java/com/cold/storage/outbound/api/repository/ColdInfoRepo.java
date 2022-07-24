package com.cold.storage.outbound.api.repository;

import com.cold.storage.outbound.api.model.ColdInfo;

import java.util.List;

public interface ColdInfoRepo {
    List<ColdInfo> getColdInfo();
    List<String> getColdName(String submitterId);
    List<String> getColdOwner();
    List<String> getColdAddress();
    List<String> getFaceBookUrl();
}
