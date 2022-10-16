/*
 * Author Name: Revathi
 * Date: 16-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class AgeVerifier {
    public void verifyAge(int age) throws InvalidAgeException {
        if (age < 13) {
            throw new InvalidAgeException("Age should not be less than 13, can not register on the platform");
        }

    }

}
