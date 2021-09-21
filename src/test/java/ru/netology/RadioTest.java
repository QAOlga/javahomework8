package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

//создать 20 станций и установить 15-ую
    @Test
    public void shouldSetNumberStation20() {
        radio.setNumberStation(20);
        radio.setCurrentRadio(15);
        assertEquals(15, radio.getCurrentRadio());
    }


    //проверка установки количества станций по умолчанию
    @Test
    public void shouldSetNumberStationDefault() {
        radio.setNumberStation(10);
        assertEquals(10, radio.getNumberStation());
    }

    //провера установки количества станций
    @Test
    public void shouldSetNumberStation() {
        Radio radio1 = new Radio(12);
        assertEquals(12, radio1.getNumberStation());
    }

    //проверка установки количества станций ниже мин
    @Test
    public void shouldSetNumberStationUnderMin() {
        Radio radio2 = new Radio(-5);
        assertEquals(10, radio2.getNumberStation());
    }

    // проверка переключения вперед при макс
    @Test
    public void shouldCurrentRadioNextMax() {
        radio.setCurrentRadio(9);
        radio.setCurrentRadioNext();
        assertEquals(0, radio.getCurrentRadio());
    }

    // проверка переключения назад при мин
    @Test
    public void shouldCurrentRadioPrevMin() {
        radio.setCurrentRadio(0);
        radio.setCurrentRadioPrev();
        assertEquals(9, radio.getCurrentRadio());
    }

    //проверка переключения +
    @Test
    public void shouldCurrentRadioNext() {
        radio.setCurrentRadio(8);
        radio.setCurrentRadioNext();
        assertEquals(9, radio.getCurrentRadio());

        radio.setCurrentRadio(1);
        radio.setCurrentRadioNext();
        assertEquals(2, radio.getCurrentRadio());

        radio.setCurrentRadio(5);
        radio.setCurrentRadioNext();
        assertEquals(6, radio.getCurrentRadio());
    }

    // проверка переключения -
    @Test
    public void shouldCurrentRadioPrev() {
        radio.setCurrentRadio(5);
        radio.setCurrentRadioPrev();
        assertEquals(4, radio.getCurrentRadio());

        radio.setCurrentRadio(9);
        radio.setCurrentRadioPrev();
        assertEquals(8, radio.getCurrentRadio());

        radio.setCurrentRadio(1);
        radio.setCurrentRadioPrev();
        assertEquals(0, radio.getCurrentRadio());
    }

    // тест на сеттер
    @Test
    public void shouldSetCurrentRadio() {
        radio.setCurrentRadio(5);
        assertEquals(5, radio.getCurrentRadio());
    }

    // тест на сеттер невалидные значения
    @Test
    public void shouldSetCurrentRadioNotValid() {

        radio.setCurrentRadio(15);
        assertEquals(0, radio.getCurrentRadio());

        radio.setCurrentRadio(-15);
        assertEquals(0, radio.getCurrentRadio());
    }

    //проверка увеличения громкости при макс
    @Test
    public void shouldVolumeUpMax() {
        radio.setCurrentVolume(100);
        radio.setVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости при мин
    @Test
    public void shouldVolumeDownMin() {
        radio.setCurrentVolume(0);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    //проверка увеличения громкости
    @Test
    public void shouldVolumeUp() {
        radio.setCurrentVolume(99);
        radio.setVolumeUp();
        assertEquals(100, radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        radio.setVolumeUp();
        assertEquals(2, radio.getCurrentVolume());

        radio.setCurrentVolume(55);
        radio.setVolumeUp();
        assertEquals(56, radio.getCurrentVolume());
    }

    //проверка установки громкости невалид
    @Test
    public void shouldSetVolumeNotValid() {

        radio.setCurrentVolume(130);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-30);
        assertEquals(0, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости
    @Test
    public void shouldVolumeDown() {
        radio.setCurrentVolume(80);
        radio.setVolumeDown();
        assertEquals(79, radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(99);
        radio.setVolumeDown();
        assertEquals(98, radio.getCurrentVolume());
    }
}