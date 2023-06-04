package com.example.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * /24
 * @JDKVersion 17.0.4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("message_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageInfo {
    private Long msgInfoId;
    private Long targetId;
    private String title;
    private String content;
    private int msgType;
}
