package ru.netology;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume =10;
    private int currentVolume;
    private boolean on;

    public int getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public void setMaxStation(int maxStation){
    this.maxStation = maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation){
            currentStation =minStation;
        }
        if (currentStation < minStation){
            currentStation = maxStation;
        }
        this.currentStation = currentStation;

    }
    public void increaseCurrentStation(){
        setCurrentStation(currentStation+1);
        return;
    }
    public void decreaseCurrentStation(){
        setCurrentStation(currentStation-1);
        return;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume> maxVolume){
            return;
        }
        if (currentVolume < minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseCurrentVolume(){
        setCurrentVolume(currentVolume+1);
        return;
    }
    public void decreaseCurrentVolume(){
        setCurrentVolume(currentVolume-1);
        return;
    }

}


