package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.UserRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRecordRepository {

    UserRecord save(UserRecord userRecord);

    UserRecord findById(Long id);

    List<UserRecord> findAll();

    void deleteById(Long id);

    List<UserRecord> findByEnterpriseId(String enterprise_id);

    List<UserRecord> findByXAndY(String x, String y);
}



