package com.stericsson.hardware.fm;

import java.io.IOException;

/**
 * User: Pedro Veloso
 * Date: 3/9/13
 * Time: 9:08 PM
 */
public class FakeFmReceiver extends FmReceiver {


    @Override
    public void startAsync(FmBand band) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start(FmBand band) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void pause() throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void reset() throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getState() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isRDSDataSupported() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isTunedToValidChannel() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setThreshold(int threshold) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getThreshold() throws IOException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFrequency() throws IOException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSignalStrength() throws IOException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isPlayingInStereo() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setForceMono(boolean forceMono) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAutomaticAFSwitching(boolean automatic) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAutomaticTASwitching(boolean automatic) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFrequency(int frequency) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void startFullScan() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scanDown() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scanUp() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void stopScan() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean sendExtraCommand(String command, String[] extras) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnStartedListener(OnStartedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnStartedListener(OnStartedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnScanListener(OnScanListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnScanListener(OnScanListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnRDSDataFoundListener(OnRDSDataFoundListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnRDSDataFoundListener(OnRDSDataFoundListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnErrorListener(OnErrorListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnErrorListener(OnErrorListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnSignalStrengthChangedListener(OnSignalStrengthChangedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnSignalStrengthChangedListener(OnSignalStrengthChangedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnPlayingInStereoListener(OnPlayingInStereoListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnPlayingInStereoListener(OnPlayingInStereoListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnForcedPauseListener(OnForcedPauseListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnForcedPauseListener(OnForcedPauseListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnForcedResetListener(OnForcedResetListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnForcedResetListener(OnForcedResetListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnStateChangedListener(OnStateChangedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnStateChangedListener(OnStateChangedListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnExtraCommandListener(OnExtraCommandListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnExtraCommandListener(OnExtraCommandListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addOnAutomaticSwitchListener(OnAutomaticSwitchListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeOnAutomaticSwitchListener(OnAutomaticSwitchListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
