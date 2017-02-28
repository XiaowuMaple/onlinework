package cn.rainstep.entity;

/**
 * Created by Zero on 2017/2/28.
 */
public class Sort {
    private static final String ASC = "ascending";
    private static final String DESC = "descending";

    private String name;
    private String order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public org.springframework.data.domain.Sort getInstance() {
        org.springframework.data.domain.Sort.Direction direction = null;
        if(ASC.equals(this.name)) {
            direction = org.springframework.data.domain.Sort.Direction.ASC;
        } else if(DESC.equals(this.name)) {
            direction = org.springframework.data.domain.Sort.Direction.DESC;
        }
        if(direction == null) return null;
        org.springframework.data.domain.Sort.Order order =
                new org.springframework.data.domain.Sort.Order(direction, this.name);
        org.springframework.data.domain.Sort sort = new org.springframework.data.domain.Sort(order);
        return sort;
    }
}
