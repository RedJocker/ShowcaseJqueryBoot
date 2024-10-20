package org.example;

import org.example.model.smartphone.SmartPhone;
import org.example.model.smartphone.internal.SmartPhoneBrowser;
import org.example.model.smartphone.internal.SmartPhoneMusicPlayer;
import org.example.model.smartphone.internal.SmartPhonePhone;

public class Main {
    public static void main(String[] args) {

        final SmartPhone smartPhone = getSmartPhone();

        smartPhone.visit("www.duckduckgo.com");
        smartPhone.visit("https://duckduckgo.com/?q=dio");
        smartPhone.visit("https://www.dio.me/en");
        smartPhone.back();
        smartPhone.refresh();
        smartPhone.back();
        smartPhone.back();


        smartPhone.play();
        smartPhone.load("Joe Cocker - With a Little Help From My Friends");
        smartPhone.play();
        smartPhone.pause();


        smartPhone.answer("Boss");
        smartPhone.call("Wife");

        smartPhone.play();
        smartPhone.pause();
        smartPhone.pause();
        smartPhone.play();

        smartPhone.checkVoicemail();

    }

    private static SmartPhone getSmartPhone() {
        final SmartPhoneMusicPlayer smartPhoneMusicPlayer = new SmartPhoneMusicPlayer();
        final SmartPhonePhone smartPhonePhone = new SmartPhonePhone();
        final SmartPhoneBrowser smartPhoneBrowser = new SmartPhoneBrowser();


        return new SmartPhone(smartPhoneMusicPlayer, smartPhonePhone, smartPhoneBrowser);
    }
}


