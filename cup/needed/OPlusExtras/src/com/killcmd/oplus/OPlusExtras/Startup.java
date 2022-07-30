/*
* Copyright (C) 2013 The OmniROM Project
* Copyright (C) 2021-2022 The Evolution X Project
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*
*/
package com.killcmd.oplus.OPlusExtras;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import androidx.preference.PreferenceManager;

import com.killcmd.oplus.OPlusExtras.FileUtils;
import com.killcmd.oplus.OPlusExtras.modeswitch.*;
import com.killcmd.oplus.OPlusExtras.preferences.*;
import com.killcmd.oplus.OPlusExtras.services.FPSInfoService;

public class Startup extends BroadcastReceiver {

    private static final String TAG = "BootReceiver";

    @Override
    public void onReceive(final Context context, final Intent bootintent) {

        OPlusExtras.restoreSliderStates(context);
        com.killcmd.oplus.OPlusExtras.doze.DozeUtils.checkDozeService(context);
        com.killcmd.oplus.OPlusExtras.touch.TouchscreenGestureSettings.MainSettingsFragment.restoreTouchscreenGestureStates(context);

        AdrenoBoostPreference.restore(context);
        VibratorStrengthPreference.restore(context);
        RedPreference.restore(context);
        GreenPreference.restore(context);
        BluePreference.restore(context);
        SaturationPreference.restore(context);
        HuePreference.restore(context);
        ValuePreference.restore(context);
        ContrastPreference.restore(context);

        boolean enabled = false;
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_DC_SWITCH, false);
        if (enabled) {
        restore(DCModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_HBM_SWITCH, false);
        if (enabled) {
        restore(HBMModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_FPS_INFO, false);
        if (enabled) {
            context.startService(new Intent(context, FPSInfoService.class));
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_FSYNC_SWITCH, false);
        if (enabled) {
        restore(FSyncModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_POWERSHARE_SWITCH, false);
        if (enabled) {
            restore(PowerShareModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_WIRELESS_CHARGING_SWITCH, false);
        if (enabled) {
            restore(WirelessChargingModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_GAME_SWITCH, false);
        if (enabled) {
            restore(GameModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_TP_EDGE_LIMIT_SWITCH, false);
        if (enabled) {
            restore(TPEdgeLimitModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_TOUCHBOOST_SWITCH, false);
        if (enabled) {
            restore(TouchBoostModeSwitch.getFile(context), enabled);
               }
        enabled = sharedPrefs.getBoolean(OPlusExtras.KEY_USB2_SWITCH, false);
        if (enabled) {
        restore(USB2FastChargeModeSwitch.getFile(context), enabled);
        }
    }

    private void restore(String file, boolean enabled) {
        if (file == null) {
            return;
        }
        if (enabled) {
            FileUtils.writeValue(file, "1");
        }
    }

    private void restore(String file, String value) {
        if (file == null) {
            return;
        }
        FileUtils.writeValue(file, value);
    }
}
