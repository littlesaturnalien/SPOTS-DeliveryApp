package org.samm.spots.services.interfaces;

import com.google.firebase.auth.FirebaseAuthException;

public interface AuthService {
    String signUpWithEmailAndPassword(String email, String password) throws FirebaseAuthException;
    String veryIdToken(String token) throws FirebaseAuthException;
}
