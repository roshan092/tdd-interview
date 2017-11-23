package com.roshan092.tddinterview.service;

import com.roshan092.tddinterview.domain.PropertyData;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    private PropertyRepository propertyRepository;
    private Integer propertyId;

    public PropertyData getPropertyData(Integer propertyId) {
        validateProperty(propertyId);
        return propertyRepository.getPropertyDetails(propertyId);
    }

    private void validateProperty(Integer propertyId) {
        if (propertyId == null) {
            throw new RuntimeException("Property Id id null");
        } else if (propertyId == 0) {
            throw new RuntimeException("Property Id id invalid");
        }
    }
}