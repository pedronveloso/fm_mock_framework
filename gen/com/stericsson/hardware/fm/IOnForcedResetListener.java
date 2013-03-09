/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IOnForcedResetListener.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IOnForcedResetListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IOnForcedResetListener {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IOnForcedResetListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IOnForcedResetListener interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IOnForcedResetListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IOnForcedResetListener))) {
                return ((com.stericsson.hardware.fm.IOnForcedResetListener) iin);
            }
            return new com.stericsson.hardware.fm.IOnForcedResetListener.Stub.Proxy(obj);
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
                case TRANSACTION_onForcedReset: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.onForcedReset(_arg0);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IOnForcedResetListener {
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
            public void onForcedReset(int reason) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(reason);
                    mRemote.transact(Stub.TRANSACTION_onForcedReset, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onForcedReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public void onForcedReset(int reason) throws android.os.RemoteException;
}
