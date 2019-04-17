package com.chasel.demo.diveinspringboot.service;

/**
 * 计算服务
 *
 * @author XieLongzhen
 * @date 2019/4/16 17:43
 */
public interface CalculateService {

    /**
     * 从多个整数um求和
     *
     * @param values 多个整数
     * @return sum 累加值
     */
    Integer sum(Integer... values);
}
