/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.util;

import java.util.Random;


/**
 *
 * @author hmia
 */
public class PasswordEncrypter {

    private final static int A_ASCII_CODE = 65;
    private final static int Z_ASCII_CODE = 90;
    private final static int NUMBER_OF_LETTERS = Z_ASCII_CODE - A_ASCII_CODE
            + 1;

    private PasswordEncrypter() {
    }

    private final static String generateRandomSalt() {

        Random randomGenerator = new Random();
        byte[] saltAsByteArray = new byte[2];
        String salt;
        saltAsByteArray[0] = (byte) (randomGenerator.nextInt(NUMBER_OF_LETTERS) + A_ASCII_CODE);
        saltAsByteArray[1] = (byte) (randomGenerator.nextInt(NUMBER_OF_LETTERS) + A_ASCII_CODE);
        salt = new String(saltAsByteArray);

        return salt;

    }

    public final static String crypt(String clearPassword) {
        String salt = generateRandomSalt();
        //return jcrypt.crypt(salt, clearPassword);
        return "";
    }

    public final static boolean isClearPasswordCorrect(String clearPassword,
        String encryptedPassword) {
        String salt = encryptedPassword.substring(0, 2);
        ///String encryptedClearPassword = jcrypt.crypt(salt, clearPassword);
        String encryptedClearPassword = "";
        return encryptedClearPassword.equals(encryptedPassword);
    }

}
