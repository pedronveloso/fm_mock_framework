/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IFmReceiver.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IFmReceiver extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IFmReceiver {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IFmReceiver";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IFmReceiver interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IFmReceiver asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IFmReceiver))) {
                return ((com.stericsson.hardware.fm.IFmReceiver) iin);
            }
            return new com.stericsson.hardware.fm.IFmReceiver.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_start: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.FmBand _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = com.stericsson.hardware.fm.FmBand.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.start(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_startAsync: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.FmBand _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = com.stericsson.hardware.fm.FmBand.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.startAsync(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_reset: {
                    data.enforceInterface(DESCRIPTOR);
                    this.reset();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_pause: {
                    data.enforceInterface(DESCRIPTOR);
                    this.pause();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_resume: {
                    data.enforceInterface(DESCRIPTOR);
                    this.resume();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getState: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getState();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getFrequency: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getFrequency();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_setFrequency: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.setFrequency(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_scanUp: {
                    data.enforceInterface(DESCRIPTOR);
                    this.scanUp();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_scanDown: {
                    data.enforceInterface(DESCRIPTOR);
                    this.scanDown();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_startFullScan: {
                    data.enforceInterface(DESCRIPTOR);
                    this.startFullScan();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_stopScan: {
                    data.enforceInterface(DESCRIPTOR);
                    this.stopScan();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_isRDSDataSupported: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isRDSDataSupported();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_isTunedToValidChannel: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isTunedToValidChannel();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_setThreshold: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.setThreshold(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getThreshold: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getThreshold();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getSignalStrength: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getSignalStrength();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_isPlayingInStereo: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isPlayingInStereo();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_setForceMono: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.setForceMono(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setAutomaticAFSwitching: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.setAutomaticAFSwitching(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setAutomaticTASwitching: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.setAutomaticTASwitching(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendExtraCommand: {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String[] _arg1;
                    _arg1 = data.createStringArray();
                    boolean _result = this.sendExtraCommand(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_addOnStateChangedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStateChangedListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStateChangedListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnStateChangedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnStateChangedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStateChangedListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStateChangedListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnStateChangedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnStartedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStartedListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStartedListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnStartedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnStartedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStartedListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStartedListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnStartedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnErrorListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnErrorListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnErrorListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnErrorListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnErrorListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnErrorListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnErrorListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnErrorListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnScanListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnScanListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnScanListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnScanListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnScanListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnScanListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnScanListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnScanListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnForcedPauseListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnForcedPauseListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnForcedPauseListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnForcedPauseListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnForcedPauseListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnForcedPauseListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnForcedPauseListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnForcedPauseListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnForcedResetListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnForcedResetListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnForcedResetListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnForcedResetListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnForcedResetListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnForcedResetListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnForcedResetListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnForcedResetListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnRDSDataFoundListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnRDSDataFoundListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnRDSDataFoundListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnRDSDataFoundListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnRDSDataFoundListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnRDSDataFoundListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnRDSDataFoundListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnRDSDataFoundListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnSignalStrengthChangedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnSignalStrengthListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnSignalStrengthListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnSignalStrengthChangedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnSignalStrengthChangedListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnSignalStrengthListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnSignalStrengthListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnSignalStrengthChangedListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnPlayingInStereoListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStereoListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStereoListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnPlayingInStereoListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnPlayingInStereoListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnStereoListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnStereoListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnPlayingInStereoListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnExtraCommandListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnExtraCommandListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnExtraCommandListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnExtraCommandListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnExtraCommandListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnExtraCommandListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnExtraCommandListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnExtraCommandListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addOnAutomaticSwitchListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnAutomaticSwitchListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnAutomaticSwitchListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnAutomaticSwitchListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnAutomaticSwitchListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnAutomaticSwitchListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnAutomaticSwitchListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnAutomaticSwitchListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IFmReceiver {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public void start(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((band != null)) {
                        _data.writeInt(1);
                        band.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void startAsync(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((band != null)) {
                        _data.writeInt(1);
                        band.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_startAsync, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void reset() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_reset, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void pause() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void resume() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_resume, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getState() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getState, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getFrequency() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getFrequency, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void setFrequency(int frequency) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(frequency);
                    mRemote.transact(Stub.TRANSACTION_setFrequency, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void scanUp() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_scanUp, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void scanDown() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_scanDown, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void startFullScan() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_startFullScan, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void stopScan() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public boolean isRDSDataSupported() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isRDSDataSupported, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public boolean isTunedToValidChannel() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isTunedToValidChannel, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void setThreshold(int threshold) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(threshold);
                    mRemote.transact(Stub.TRANSACTION_setThreshold, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getThreshold() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getThreshold, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getSignalStrength() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getSignalStrength, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public boolean isPlayingInStereo() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isPlayingInStereo, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void setForceMono(boolean forceMono) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((forceMono) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_setForceMono, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void setAutomaticAFSwitching(boolean automatic) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((automatic) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_setAutomaticAFSwitching, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void setAutomaticTASwitching(boolean automatic) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((automatic) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_setAutomaticTASwitching, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public boolean sendExtraCommand(java.lang.String command, java.lang.String[] extras) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(command);
                    _data.writeStringArray(extras);
                    mRemote.transact(Stub.TRANSACTION_sendExtraCommand, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void addOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnStateChangedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnStateChangedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnStartedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnStartedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnErrorListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnErrorListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnScanListener(com.stericsson.hardware.fm.IOnScanListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnScanListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnScanListener(com.stericsson.hardware.fm.IOnScanListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnScanListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnForcedPauseListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnForcedPauseListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnForcedResetListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnForcedResetListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnRDSDataFoundListener(com.stericsson.hardware.fm.IOnRDSDataFoundListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnRDSDataFoundListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnRDSDataFoundListener(com.stericsson.hardware.fm.IOnRDSDataFoundListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnRDSDataFoundListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnSignalStrengthChangedListener(com.stericsson.hardware.fm.IOnSignalStrengthListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnSignalStrengthChangedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnSignalStrengthChangedListener(com.stericsson.hardware.fm.IOnSignalStrengthListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnSignalStrengthChangedListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnPlayingInStereoListener(com.stericsson.hardware.fm.IOnStereoListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnPlayingInStereoListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnPlayingInStereoListener(com.stericsson.hardware.fm.IOnStereoListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnPlayingInStereoListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnExtraCommandListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnExtraCommandListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addOnAutomaticSwitchListener(com.stericsson.hardware.fm.IOnAutomaticSwitchListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnAutomaticSwitchListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnAutomaticSwitchListener(com.stericsson.hardware.fm.IOnAutomaticSwitchListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnAutomaticSwitchListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_startAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_reset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_setFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_scanUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_scanDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_startFullScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_isRDSDataSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_isTunedToValidChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_setThreshold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_getThreshold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_getSignalStrength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_isPlayingInStereo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_setForceMono = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_setAutomaticAFSwitching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_setAutomaticTASwitching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
        static final int TRANSACTION_sendExtraCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_addOnStateChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_removeOnStateChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_addOnStartedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_removeOnStartedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
        static final int TRANSACTION_addOnErrorListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
        static final int TRANSACTION_removeOnErrorListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
        static final int TRANSACTION_addOnScanListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
        static final int TRANSACTION_removeOnScanListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
        static final int TRANSACTION_addOnForcedPauseListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
        static final int TRANSACTION_removeOnForcedPauseListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
        static final int TRANSACTION_addOnForcedResetListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
        static final int TRANSACTION_removeOnForcedResetListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
        static final int TRANSACTION_addOnRDSDataFoundListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
        static final int TRANSACTION_removeOnRDSDataFoundListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
        static final int TRANSACTION_addOnSignalStrengthChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
        static final int TRANSACTION_removeOnSignalStrengthChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
        static final int TRANSACTION_addOnPlayingInStereoListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
        static final int TRANSACTION_removeOnPlayingInStereoListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
        static final int TRANSACTION_addOnExtraCommandListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
        static final int TRANSACTION_removeOnExtraCommandListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
        static final int TRANSACTION_addOnAutomaticSwitchListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
        static final int TRANSACTION_removeOnAutomaticSwitchListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    }

    public void start(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException;

    public void startAsync(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException;

    public void reset() throws android.os.RemoteException;

    public void pause() throws android.os.RemoteException;

    public void resume() throws android.os.RemoteException;

    public int getState() throws android.os.RemoteException;

    public int getFrequency() throws android.os.RemoteException;

    public void setFrequency(int frequency) throws android.os.RemoteException;

    public void scanUp() throws android.os.RemoteException;

    public void scanDown() throws android.os.RemoteException;

    public void startFullScan() throws android.os.RemoteException;

    public void stopScan() throws android.os.RemoteException;

    public boolean isRDSDataSupported() throws android.os.RemoteException;

    public boolean isTunedToValidChannel() throws android.os.RemoteException;

    public void setThreshold(int threshold) throws android.os.RemoteException;

    public int getThreshold() throws android.os.RemoteException;

    public int getSignalStrength() throws android.os.RemoteException;

    public boolean isPlayingInStereo() throws android.os.RemoteException;

    public void setForceMono(boolean forceMono) throws android.os.RemoteException;

    public void setAutomaticAFSwitching(boolean automatic) throws android.os.RemoteException;

    public void setAutomaticTASwitching(boolean automatic) throws android.os.RemoteException;

    public boolean sendExtraCommand(java.lang.String command, java.lang.String[] extras) throws android.os.RemoteException;

    public void addOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException;

    public void removeOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException;

    public void addOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException;

    public void removeOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException;

    public void addOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException;

    public void removeOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException;

    public void addOnScanListener(com.stericsson.hardware.fm.IOnScanListener listener) throws android.os.RemoteException;

    public void removeOnScanListener(com.stericsson.hardware.fm.IOnScanListener listener) throws android.os.RemoteException;

    public void addOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException;

    public void removeOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException;

    public void addOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException;

    public void removeOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException;

    public void addOnRDSDataFoundListener(com.stericsson.hardware.fm.IOnRDSDataFoundListener listener) throws android.os.RemoteException;

    public void removeOnRDSDataFoundListener(com.stericsson.hardware.fm.IOnRDSDataFoundListener listener) throws android.os.RemoteException;

    public void addOnSignalStrengthChangedListener(com.stericsson.hardware.fm.IOnSignalStrengthListener listener) throws android.os.RemoteException;

    public void removeOnSignalStrengthChangedListener(com.stericsson.hardware.fm.IOnSignalStrengthListener listener) throws android.os.RemoteException;

    public void addOnPlayingInStereoListener(com.stericsson.hardware.fm.IOnStereoListener listener) throws android.os.RemoteException;

    public void removeOnPlayingInStereoListener(com.stericsson.hardware.fm.IOnStereoListener listener) throws android.os.RemoteException;

    public void addOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException;

    public void removeOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException;

    public void addOnAutomaticSwitchListener(com.stericsson.hardware.fm.IOnAutomaticSwitchListener listener) throws android.os.RemoteException;

    public void removeOnAutomaticSwitchListener(com.stericsson.hardware.fm.IOnAutomaticSwitchListener listener) throws android.os.RemoteException;
}
