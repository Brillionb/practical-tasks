package com.walking.lesson57_stream_collect_collector.task;

import com.walking.lesson57_stream_collect_collector.model.Department;

import java.util.List;
import java.util.Map;

/**
 * Предоставьте информацию о среднем возрасте сотрудников по каждому департаменту.
 */
public class Task14 implements StatisticTask<Map<String, Double>> {
    @Override
    public Map<String, Double> calculate(List<Department> departments) {
        return null;
    }
}