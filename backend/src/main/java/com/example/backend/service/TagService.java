package com.example.backend.service;

import com.example.backend.entity.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ * 01/7:16 PM
 * @Description:
 */
@Service
public interface TagService {

    Integer DeleteTag(Long tag_id);

    Long InsertTag(Tag tag);

    List<Map<String,Object>> GetAllTags();

    Tag findTag(Long tag_id);




}
