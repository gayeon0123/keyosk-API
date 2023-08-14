package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.UserRecord;
import kiosk.kioskApi.dto.UserRecordRequest;

public interface UserRecordService {
    UserRecord createUserRecord(UserRecordRequest request);
}

