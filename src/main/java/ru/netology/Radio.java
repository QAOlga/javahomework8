package ru.netology;

public class Radio {
    private int currentRadio;
    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    //переключение станции на 1 вперед
    public void setCurrentRadioNext() {
        if (currentRadio == maxRadio) {
            currentRadio = minRadio;
        } else {
            currentRadio = currentRadio + 1;
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

    public void setCurrentRadio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
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
