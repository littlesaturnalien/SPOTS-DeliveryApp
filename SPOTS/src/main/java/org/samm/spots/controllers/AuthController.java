package org.samm.spots.controllers;

import com.google.firebase.auth.FirebaseAuthException;
import org.samm.spots.dto.authentication.TokenRequest;
import org.samm.spots.dto.authentication.UserCredentials;
import org.samm.spots.services.impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthServiceImpl authService;

    @PostMapping("/signUp")
    public String signUp(@RequestBody UserCredentials credentials) throws FirebaseAuthException {
        return authService.signUpWithEmailAndPassword(credentials.email, credentials.password);
    }

    @PostMapping("/verifyIdToken")
    public String verifyIdToken(@RequestBody TokenRequest tokenRequest) throws FirebaseAuthException {
        return authService.veryIdToken(tokenRequest.getToken());
    }
}
