package org.example.model.smartphone.internal;

import org.example.model.Phone;

public class SmartPhonePhone implements Phone {

    private static final String isPhoneRegex =
            "^(\\(?\\d{2}\\)?\\s)?(\\d{4,5}-\\d{4})$"; // https://medium.com/@igorrozani/criando-uma-express%C3%A3o-regular-para-telefone-fef7a8f98828

    public SmartPhonePhone() {
    }

    @Override
    public void call(String contactOrNumber) {
        System.out.printf("calling %s %s%n", callType(contactOrNumber), contactOrNumber);
    }

    @Override
    public void answer(String contactOrNumber) {
        System.out.printf("calling %s %s%n", callType(contactOrNumber), contactOrNumber);
    }

    @Override
    public void checkVoicemail() {
        System.out.println("checking Voicemail");
    }

    private String callType(String contactOrNumber) {
        return isPhoneNumber(contactOrNumber) ? "number" : "contact";
    }

    private boolean isPhoneNumber(String mayBePhoneNumber) {
        return mayBePhoneNumber.matches(isPhoneRegex);
    }
}