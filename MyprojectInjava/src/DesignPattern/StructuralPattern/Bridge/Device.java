package StructuralPattern.Bridge;

interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    String getStatus();
    
}
