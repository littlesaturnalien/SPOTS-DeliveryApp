package org.samm.spots.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ErrorDetails {
    private String errorCode;
    private String message;
}
