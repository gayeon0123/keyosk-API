package kiosk.kioskApi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Map;

@Entity
public class UserRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String enterprise_id;

    private Map<String, Map<Integer, Double>> x;

    private Map<String, Map<Integer, Double>> y;

    private Map<String, Integer> delay_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
