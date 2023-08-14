package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.UserRecord;
import kiosk.kioskApi.dto.UserRecordRequest;
import kiosk.kioskApi.repository.UserRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRecordServiceImpl {

    private final UserRecordRepository userRecordRepository;

    @Autowired
    public UserRecordServiceImpl(UserRecordRepository userRecordRepository) {
        this.userRecordRepository = userRecordRepository;
    }

    public UserRecord createUserRecord(UserRecordRequest request) {
        // UserRecord 객체를 생성하고 request 데이터를 기반으로 필드를 설정
        UserRecord userRecord = new UserRecord();
        userRecord.setEnterprise_id(request.getEnterprise_id());
        userRecord.setX(request.getX());
        userRecord.setY(request.getY());
        userRecord.setDelay_time(request.getDelay_time());

        // Repository를 통해 데이터베이스에 저장
        return userRecordRepository.save(userRecord);
    }
}


