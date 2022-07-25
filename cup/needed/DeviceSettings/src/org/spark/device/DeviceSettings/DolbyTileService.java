package com.killcmd.device.DeviceSettings;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

@TargetApi(24)
public class DolbyTileService extends TileService {
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
        getQsTile().setState(DolbySwitch.isCurrentlyEnabled(this, new ComponentName("com.dolby.daxappui", "com.dolby.daxappui.MainActivity")) ? Tile.STATE_INACTIVE : Tile.STATE_UNAVAILABLE);
        getQsTile().updateTile();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }
}
