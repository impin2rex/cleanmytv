package com.gathin.tvhome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NowPlayingTest {
    // PlaybackState: NONE 0, STOPPED 1, PAUSED 2, PLAYING 3, BUFFERING 6.
    @Test
    public void playingBeatsAnEarlierPausedSession() {
        assertEquals(1, MainActivity.pickSession(new int[] {2, 3}));
        assertEquals(2, MainActivity.pickSession(new int[] {1, 2, 6}));
    }

    @Test
    public void firstPausedWhenNothingPlays() {
        assertEquals(1, MainActivity.pickSession(new int[] {1, 2, 2}));
    }

    @Test
    public void nothingToShow() {
        assertEquals(-1, MainActivity.pickSession(new int[] {0, 1}));
        assertEquals(-1, MainActivity.pickSession(new int[0]));
    }
}
