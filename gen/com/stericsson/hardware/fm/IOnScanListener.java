/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IOnScanListener.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IOnScanListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IOnScanListener {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IOnScanListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IOnScanListener interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IOnScanListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IOnScanListener))) {
                return ((com.stericsson.hardware.fm.IOnScanListener) iin);
            }
            return new com.stericsson.hardware.fm.IOnScanListener.Stub.Proxy(obj);
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
                case TRANSACTION_onScan: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    boolean _arg3;
                    _arg3 = (0 != data.readInt());
                    this.onScan(_arg0, _arg1, _arg2, _arg3);
                    return true;
                }
                case TRANSACTION_onFullScan: {
                    data.enforceInterface(DESCRIPTOR);
                    int[] _arg0;
                    _arg0 = data.createIntArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    boolean _arg2;
                    _arg2 = (0 != data.readInt());
                    this.onFullScan(_arg0, _arg1, _arg2);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IOnScanListener {
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
            public void onScan(int tunedFrequency, int signalLevel, int scanDirection, boolean aborted) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(tunedFrequency);
                    _data.writeInt(signalLevel);
                    _data.writeInt(scanDirection);
                    _data.writeInt(((aborted) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_onScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }

            @Override
            public void onFullScan(int[] frequency, int[] signalLevel, boolean aborted) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeIntArray(frequency);
                    _data.writeIntArray(signalLevel);
                    _data.writeInt(((aborted) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_onFullScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_onFullScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public void onScan(int tunedFrequency, int signalLevel, int scanDirection, boolean aborted) throws android.os.RemoteException;

    public void onFullScan(int[] frequency, int[] signalLevel, boolean aborted) throws android.os.RemoteException;
}
