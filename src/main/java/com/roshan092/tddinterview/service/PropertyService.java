package com.roshan092.tddinterview.service;

import com.roshan092.tddinterview.domain.PropertyData;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    private PropertyRepository propertyRepository;
    private Integer propertyId;

    public PropertyData getPropertyData(Integer propertyId) {
        this.propertyId = propertyId;
        validateProperty();
        return propertyRepository.getPropertyDetails(this.propertyId);
    }

    private void validateProperty() {
        if (this.propertyId == null) {
            throw new RuntimeException("Property Id id null");
        } else if (this.propertyId == 0) {
            throw new RuntimeException("Property Id id invalid");
        }
    }
}