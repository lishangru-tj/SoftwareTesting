package com.example.backend.service;

import com.example.backend.entity.Address;
import org.springframework.stereotype.Service;

/**
 * @ * /30/1:03 PM
 * @Description:
 */
@Service
public interface AddressService {
    Integer InsertAddress(Address address);
}
