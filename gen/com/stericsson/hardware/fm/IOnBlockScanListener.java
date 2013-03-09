/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IOnBlockScanListener.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IOnBlockScanListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IOnBlockScanListener {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IOnBlockScanListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IOnBlockScanListener interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IOnBlockScanListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IOnBlockScanListener))) {
                return ((com.stericsson.hardware.fm.IOnBlockScanListener) iin);
            }
            return new com.stericsson.hardware.fm.IOnBlockScanListener.Stub.Proxy(obj);
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
                case TRANSACTION_onBlockScan: {
                    data.enforceInterface(DESCRIPTOR);
                    int[] _arg0;
                    _arg0 = data.createIntArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    boolean _arg2;
                    _arg2 = (0 != data.readInt());
                    this.onBlockScan(_arg0, _arg1, _arg2);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IOnBlockScanListener {
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
            public void onBlockScan(int[] frequency, int[] signalLevel, boolean aborted) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeIntArray(frequency);
                    _data.writeIntArray(signalLevel);
                    _data.writeInt(((aborted) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_onBlockScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onBlockScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public void onBlockScan(int[] frequency, int[] signalLevel, boolean aborted) throws android.os.RemoteException;
}
