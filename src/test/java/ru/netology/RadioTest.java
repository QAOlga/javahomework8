package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // проверка переключения вперед при макс
    @Test
    public void shouldCurrentRadioNextMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.setCurrentRadioNext();
        assertEquals(0, radio.getCurrentRadio());
    }

    // проверка переключения назад при мин
    @Test
    public void shouldCurrentRadioPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.setCurrentRadioPrev();
        assertEquals(9, radio.getCurrentRadio());
    }

    //проверка переключения +
    @Test
    public void shouldCurrentRadioNext() {
        Radio radio = new Radio();
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
        Radio radio = new Radio();
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
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        assertEquals(5, radio.getCurrentRadio());
    }

    // тест на сеттер невалидные значения
    @Test
    public void shouldSetCurrentRadioNotValid() {
        Radio radio = new Radio();

        radio.setCurrentRadio(15);
        assertEquals(0, radio.getCurrentRadio());

        radio.setCurrentRadio(-15);
        assertEquals(0, radio.getCurrentRadio());
    }

    //проверка увеличения громкости при макс
    @Test
    public void shouldVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости при мин
    @Test
    public void shouldVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    //проверка увеличения громкости
    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setVolumeUp();
        assertEquals(6, radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        radio.setVolumeUp();
        assertEquals(2, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        radio.setVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    //проверка установки громкости невалид
    @Test
    public void shouldSetVolumeNotValid() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-30);
        assertEquals(0, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости
    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setVolumeDown();
        assertEquals(4, radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        radio.setVolumeDown();
        assertEquals(8, radio.getCurrentVolume());
    }
}