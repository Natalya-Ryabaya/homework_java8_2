package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void increaseCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0,radio.getCurrentStation());

    }
    @Test
    public void decreaseCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void increaseCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void decreaseCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void CurrentStationAboveMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        radio.increaseCurrentStation();

        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    public void CurrentStationBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        radio.decreaseCurrentStation();
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void CurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void CurrentVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}