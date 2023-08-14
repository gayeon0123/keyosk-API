package kiosk.kioskApi.dto;

import java.util.Map;

public class UserRecordRequest {

    private String enterprise_id;
    private Map<String, Map<Integer, Double>> x;
    private Map<String, Map<Integer, Double>> y;
    private Map<String, Integer> delay_time;

    public String getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(String enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    public Map<String, Map<Integer, Double>> getX() {
        return x;
    }

    public void setX(Map<String, Map<Integer, Double>> x) {
        this.x = x;
    }

    public Map<String, Map<Integer, Double>> getY() {
        return y;
    }

    public void setY(Map<String, Map<Integer, Double>> y) {
        this.y = y;
    }

    public Map<String, Integer> getDelay_time() {
        return delay_time;
    }

    public void setDelay_time(Map<String, Integer> delay_time) {
        this.delay_time = delay_time;
    }
}

