package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // проверка переключения при макс
    @Test
    void shouldCurrentRadioNextMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.setCurrentRadioNext();
        assertEquals(0, radio.getCurrentRadio());
    }

    // проверка переключения при мин
    @Test
    void shouldCurrentRadioPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.setCurrentRadioPrev();
        assertEquals(9, radio.getCurrentRadio());
    }

    //проверка переключения +
    @Test
    void shouldCurrentRadioNext() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.setCurrentRadioNext();
        assertEquals(6, radio.getCurrentRadio());
    }

    // проверка переключения -
    @Test
    void shouldCurrentRadioPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.setCurrentRadioPrev();
        assertEquals(4, radio.getCurrentRadio());
    }

    // тест на сеттер
    @Test
    void shouldSetCurrentRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        assertEquals(expected, actual);
    }

    //проверка увеличения громкости при макс
    @Test
    void shouldVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости при мин
    @Test
    void shouldVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    //проверка увеличения громкости
    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setVolumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости
    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setVolumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }
}