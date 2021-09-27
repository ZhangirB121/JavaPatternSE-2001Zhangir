package com.company;

public interface ZonaNetwork {
    void registerStalker(Zona stalker);
    void unregisterStalker(Zona stalker);
    void notifyAllStalker();
}
