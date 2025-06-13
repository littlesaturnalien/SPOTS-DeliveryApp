package org.samm.spots.configs.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseInitializer {
    @Bean
    public FirebaseApp initFirestore() throws IOException {
        InputStream serviceAccount = getClass().getClassLoader().
                getResourceAsStream("spots-google-services.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://firestore.googleapis.com/v1/projects/spots-delivery-app/databases/(default)/")
                .build();

        return FirebaseApp.initializeApp(options);
    }
}
