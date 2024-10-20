package org.example.model.smartphone;

import org.example.model.Browser;
import org.example.model.MusicPlayer;
import org.example.model.Phone;
import org.example.model.smartphone.internal.SmartPhoneBrowser;
import org.example.model.smartphone.internal.SmartPhoneMusicPlayer;
import org.example.model.smartphone.internal.SmartPhonePhone;

public class SmartPhone implements MusicPlayer, Phone, Browser {

    private final SmartPhoneMusicPlayer smartPhoneMusicPlayer;
    private final SmartPhonePhone smartPhonePhone;
    private final SmartPhoneBrowser smartPhoneBrowser;

    public SmartPhone(SmartPhoneMusicPlayer smartPhoneMusicPlayer, SmartPhonePhone smartPhonePhone, SmartPhoneBrowser smartPhoneBrowser) {
        this.smartPhoneMusicPlayer = smartPhoneMusicPlayer;
        this.smartPhonePhone = smartPhonePhone;
        this.smartPhoneBrowser = smartPhoneBrowser;
    }


    @Override
    public void play() {
        smartPhoneMusicPlayer.play();
    }

    @Override
    public void pause() {
        smartPhoneMusicPlayer.pause();
    }

    @Override
    public void load(String song) {
        smartPhoneMusicPlayer.load(song);
    }

    @Override
    public void call(String contactOrNumber) {
        smartPhonePhone.call(contactOrNumber);
    }

    @Override
    public void answer(String contactOrNumber) {
        smartPhonePhone.answer(contactOrNumber);
    }

    @Override
    public void checkVoicemail() {
        smartPhonePhone.checkVoicemail();
    }

    @Override
    public void visit(String url) {
        smartPhoneBrowser.visit(url);
    }

    @Override
    public void refresh() {
        smartPhoneBrowser.refresh();
    }

    @Override
    public void back() {
        smartPhoneBrowser.back();
    }
}
