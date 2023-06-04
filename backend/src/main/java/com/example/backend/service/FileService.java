package com.example.backend.service;

import com.example.backend.entity.File;
import com.example.backend.entity.Notice;
import org.springframework.stereotype.Service;

/**
 * 
 * 3
 * @JDKVersion 17.0.4
 */
@Service
public interface FileService {
    File getFileInfoById(Long fileId);
}
