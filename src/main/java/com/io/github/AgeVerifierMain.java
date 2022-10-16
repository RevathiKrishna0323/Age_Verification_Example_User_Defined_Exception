package com.io.github;

public class AgeVerifierMain {
    public static void main(String[] args) {
        AgeVerifier ageVerifier = new AgeVerifier();
        try {
            ageVerifier.verifyAge(12);
        } catch (InvalidAgeException exception) {
            exception.getMessage();
            System.out.println(exception.getMessage());
        }
    }
}

