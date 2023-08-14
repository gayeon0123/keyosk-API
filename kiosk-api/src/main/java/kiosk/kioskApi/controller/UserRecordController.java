package kiosk.kioskApi.controller;

import kiosk.kioskApi.domain.UserRecord;
import kiosk.kioskApi.dto.UserRecordData;
import kiosk.kioskApi.dto.UserRecordRequest;
import kiosk.kioskApi.dto.UserRecordResponse;
import kiosk.kioskApi.service.UserRecordServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user_record")
public class UserRecordController {

    private final UserRecordServiceImpl userRecordService;

    @Autowired
    public UserRecordController(UserRecordServiceImpl userRecordService) {
        this.userRecordService = userRecordService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserRecordResponse> createUserRecord(@RequestBody UserRecordRequest request) {
        UserRecord userRecord = userRecordService.createUserRecord(request);

        UserRecordResponse response = new UserRecordResponse();
        response.setCode(201);
        response.setMessage("데이터 저장");

        UserRecordData userRecordData = new UserRecordData();
        userRecordData.setUserRecord(userRecord);
        response.setData(userRecordData);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
}



