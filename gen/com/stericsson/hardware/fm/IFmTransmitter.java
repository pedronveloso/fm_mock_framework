/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IFmTransmitter.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IFmTransmitter extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IFmTransmitter {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IFmTransmitter";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IFmTransmitter interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IFmTransmitter asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IFmTransmitter))) {
                return ((com.stericsson.hardware.fm.IFmTransmitter) iin);
            }
            return new com.stericsson.hardware.fm.IFmTransmitter.Stub.Proxy(obj);
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
                case TRANSACTION_isBlockScanSupported: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isBlockScanSupported();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_startBlockScan: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    int _arg1;
                    _arg1 = data.readInt();
                    this.startBlockScan(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_stopScan: {
                    data.enforceInterface(DESCRIPTOR);
                    this.stopScan();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setRdsData: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.setRdsData(_arg0);
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
                case TRANSACTION_addOnBlockScanListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnBlockScanListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnBlockScanListener.Stub.asInterface(data.readStrongBinder());
                    this.addOnBlockScanListener(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_removeOnBlockScanListener: {
                    data.enforceInterface(DESCRIPTOR);
                    com.stericsson.hardware.fm.IOnBlockScanListener _arg0;
                    _arg0 = com.stericsson.hardware.fm.IOnBlockScanListener.Stub.asInterface(data.readStrongBinder());
                    this.removeOnBlockScanListener(_arg0);
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
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IFmTransmitter {
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
            public boolean isBlockScanSupported() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isBlockScanSupported, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void startBlockScan(int startFrequency, int endFrequency) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(startFrequency);
                    _data.writeInt(endFrequency);
                    mRemote.transact(Stub.TRANSACTION_startBlockScan, _data, _reply, 0);
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
            public void setRdsData(android.os.Bundle rdsData) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((rdsData != null)) {
                        _data.writeInt(1);
                        rdsData.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_setRdsData, _data, _reply, 0);
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
            public void addOnBlockScanListener(com.stericsson.hardware.fm.IOnBlockScanListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_addOnBlockScanListener, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void removeOnBlockScanListener(com.stericsson.hardware.fm.IOnBlockScanListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_removeOnBlockScanListener, _data, _reply, 0);
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
        }

        static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_startAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_reset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_setFrequency = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_isBlockScanSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_startBlockScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_setRdsData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_sendExtraCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_addOnStateChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_removeOnStateChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_addOnStartedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_removeOnStartedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_addOnErrorListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_removeOnErrorListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_addOnBlockScanListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_removeOnBlockScanListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
        static final int TRANSACTION_addOnForcedPauseListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_removeOnForcedPauseListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_addOnForcedResetListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_removeOnForcedResetListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_addOnExtraCommandListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
        static final int TRANSACTION_removeOnExtraCommandListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    }

    public void start(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException;

    public void startAsync(com.stericsson.hardware.fm.FmBand band) throws android.os.RemoteException;

    public void reset() throws android.os.RemoteException;

    public void pause() throws android.os.RemoteException;

    public void resume() throws android.os.RemoteException;

    public int getState() throws android.os.RemoteException;

    public int getFrequency() throws android.os.RemoteException;

    public void setFrequency(int frequency) throws android.os.RemoteException;

    public boolean isBlockScanSupported() throws android.os.RemoteException;

    public void startBlockScan(int startFrequency, int endFrequency) throws android.os.RemoteException;

    public void stopScan() throws android.os.RemoteException;

    public void setRdsData(android.os.Bundle rdsData) throws android.os.RemoteException;

    public boolean sendExtraCommand(java.lang.String command, java.lang.String[] extras) throws android.os.RemoteException;

    public void addOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException;

    public void removeOnStateChangedListener(com.stericsson.hardware.fm.IOnStateChangedListener listener) throws android.os.RemoteException;

    public void addOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException;

    public void removeOnStartedListener(com.stericsson.hardware.fm.IOnStartedListener listener) throws android.os.RemoteException;

    public void addOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException;

    public void removeOnErrorListener(com.stericsson.hardware.fm.IOnErrorListener listener) throws android.os.RemoteException;

    public void addOnBlockScanListener(com.stericsson.hardware.fm.IOnBlockScanListener listener) throws android.os.RemoteException;

    public void removeOnBlockScanListener(com.stericsson.hardware.fm.IOnBlockScanListener listener) throws android.os.RemoteException;

    public void addOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException;

    public void removeOnForcedPauseListener(com.stericsson.hardware.fm.IOnForcedPauseListener listener) throws android.os.RemoteException;

    public void addOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException;

    public void removeOnForcedResetListener(com.stericsson.hardware.fm.IOnForcedResetListener listener) throws android.os.RemoteException;

    public void addOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException;

    public void removeOnExtraCommandListener(com.stericsson.hardware.fm.IOnExtraCommandListener listener) throws android.os.RemoteException;
}
