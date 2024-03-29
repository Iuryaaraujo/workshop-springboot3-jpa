package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
