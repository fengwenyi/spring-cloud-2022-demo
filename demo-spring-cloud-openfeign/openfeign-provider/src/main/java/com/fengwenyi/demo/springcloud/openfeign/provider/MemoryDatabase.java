package com.fengwenyi.demo.springcloud.openfeign.provider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-08
 */
public class MemoryDatabase {

    private static final ConcurrentMap<String, List<Object>> db = new ConcurrentHashMap<>();

    public static void add(String bizKey, Object data) {
        List<Object> list = db.get(bizKey);
        if (Objects.isNull(list)) {
            list = new ArrayList<>();
        }
        list.add(data);
        db.put(bizKey, list);
    }

    public static List<Object> get(String bizKey) {
        List<Object> list = db.get(bizKey);
        if (Objects.isNull(list) || list.isEmpty()) {
            return Collections.emptyList();
        }
        return db.get(bizKey);
    }

    public static void delete(String bizKey, Object data) {
        List<Object> list = db.get(bizKey);
        if (Objects.isNull(list) || list.isEmpty()) {
            return;
        }
        list.remove(data);
        db.remove(bizKey);
        db.put(bizKey, list);
    }

}
