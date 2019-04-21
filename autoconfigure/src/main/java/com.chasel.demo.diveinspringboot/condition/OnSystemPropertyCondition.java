package com.chasel.demo.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性条件判断
 *
 * @author XieLongzhen
 * @date 2019/4/17 18:37
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String prepertyName = String.valueOf(attributes.get("name"));

        String prepertyValue = String.valueOf(attributes.get("value"));

        String javaPropertyValue = System.getProperty(prepertyName);

        return prepertyValue.equals(javaPropertyValue);
    }
}
