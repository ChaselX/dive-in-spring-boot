package com.chasel.demo.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java 7 for 循环实现 {@link CalculateService}
 *
 * @author XieLongzhen
 * @date 2019/4/16 19:06
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        int sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java7CalculateService();
        System.out.println(((Java7CalculateService) calculateService).sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
