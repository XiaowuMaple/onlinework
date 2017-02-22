package cn.rainstep.entity;

import javax.persistence.Entity;

/**
 * Created by Zero on 2017/2/21.
 */
@Entity
public class School extends Base {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
