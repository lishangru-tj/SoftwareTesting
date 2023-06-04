package com.example.backend.service;

import com.example.backend.entity.Notice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * /28
 * @JDKVersion 17.0.4
 */
@Service
public interface NoticeService {
    Notice getNoticeById(Long noticeId);
    int addNotice(Notice notice);
}
