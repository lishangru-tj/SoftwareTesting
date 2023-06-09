package com.example.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @Date $ $
 * @MethodName $
 * @Description $
 * @Return $
 * @Throw $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("task")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Relative {
    @JsonSerialize(using= ToStringSerializer.class)
    private Long taskId;

    @JsonSerialize(using= ToStringSerializer.class)
    private Long relativeTaskId;
}
