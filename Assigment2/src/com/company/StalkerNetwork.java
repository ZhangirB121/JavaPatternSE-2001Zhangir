package com.company;

import java.util.ArrayList;
import java.util.List;

public class StalkerNetwork implements ZonaNetwork{

    private List<String> events = new ArrayList<>();
    private List<Zona> stalkers = new ArrayList<>();

    public void addEvent(String event){
        this.events.add(event);
        notifyAllStalker();
    }

    public void removeEvent(String event){
        this.events.remove(event);
        notifyAllStalker();
    }

    @Override
    public void registerStalker(Zona stalker) {
        this.stalkers.add(stalker);
    }

    @Override
    public void unregisterStalker(Zona stalker) {
        this.stalkers.remove(stalker);
    }

    @Override
    public void notifyAllStalker() {
        for(Zona stalker:stalkers){
            stalker.update(this.events);
        }
    }
}
