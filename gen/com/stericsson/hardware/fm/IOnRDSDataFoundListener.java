/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IOnRDSDataFoundListener.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IOnRDSDataFoundListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IOnRDSDataFoundListener {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IOnRDSDataFoundListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IOnRDSDataFoundListener interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IOnRDSDataFoundListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IOnRDSDataFoundListener))) {
                return ((com.stericsson.hardware.fm.IOnRDSDataFoundListener) iin);
            }
            return new com.stericsson.hardware.fm.IOnRDSDataFoundListener.Stub.Proxy(obj);
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
                case TRANSACTION_onRDSDataFound: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    int _arg1;
                    _arg1 = data.readInt();
                    this.onRDSDataFound(_arg0, _arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IOnRDSDataFoundListener {
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
            public void onRDSDataFound(android.os.Bundle options, int frequency) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((options != null)) {
                        _data.writeInt(1);
                        options.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(frequency);
                    mRemote.transact(Stub.TRANSACTION_onRDSDataFound, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onRDSDataFound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public void onRDSDataFound(android.os.Bundle options, int frequency) throws android.os.RemoteException;
}
