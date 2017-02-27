package cn.rainstep.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zero on 2017/2/25.
 */
public class BaseController {
    public Map<String, Object> succeed() {
        return this.wrap(null, "操作成功", true);
    }

    public Map<String, Object> succeed(Object data) {
        return this.wrap(data, "操作成功", true);
    }

    public Map<String, Object> succeed(Object data, String message) {
        return this.wrap(data, message, true);
    }

    public Map<String, Object> fail() {
        return this.wrap(null, "操作失败, 请联系管理员", false);
    }

    public Map<String, Object> fail(Object data) {
        return this.wrap(data, "操作失败, 请联系管理员", false);
    }

    public Map<String, Object> fail(Object data, String message) {
        return this.wrap(data, message, false);
    }

    public Map<String, Object> wrap(Object data, String message, boolean result) {
        Map<String, Object> wrapData = new HashMap<>();
        wrapData.put("result", result);
        wrapData.put("data", data);
        wrapData.put("message", message);
        return wrapData;
    }

}
