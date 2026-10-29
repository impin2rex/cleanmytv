package com.gathin.tvhome;

import android.service.notification.NotificationListenerService;

/**
 * now_playing: Android hands the media sessions only to a notification listener the user allowed, so this empty
 * one exists to be named in MediaSessionManager.getActiveSessions. Disabled in the manifest; MainActivity turns
 * it on only while now_playing is on, and access is given with
 * adb shell cmd notification allow_listener com.gathin.tvhome/com.gathin.tvhome.NowPlayingListener
 */
public class NowPlayingListener extends NotificationListenerService {
}
