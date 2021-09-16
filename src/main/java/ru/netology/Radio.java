package ru.netology;

public class Radio {
    private int currentRadio;
    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < minRadio) {
            return;
        }
        if (currentRadio > maxRadio) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //переключение станции на 1 вперед
    public void setCurrentRadioNext() {
        currentRadio = currentRadio + 1;
        if (currentRadio > maxRadio) {
            currentRadio = minRadio;
        }
    }

    //переключение станции на 1 назад
    public void setCurrentRadioPrev() {
        if (currentRadio == minRadio) {
            currentRadio = maxRadio;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    //увеличение громкости
    public void setVolumeUp() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    //уменьшение громкости
    public void setVolumeDown() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
