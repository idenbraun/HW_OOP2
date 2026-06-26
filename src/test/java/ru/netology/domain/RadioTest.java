package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(-1);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(10);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationToZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationToNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.setCurrentVolume(-1);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.setCurrentVolume(101);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeToZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeToHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}