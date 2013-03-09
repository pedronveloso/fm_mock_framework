/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/pedro/emergeWS/FM_mock_framework/src/com/stericsson/hardware/fm/IOnExtraCommandListener.aidl
 */
package com.stericsson.hardware.fm;

/**
 * {@hide}
 */
public interface IOnExtraCommandListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.stericsson.hardware.fm.IOnExtraCommandListener {
        private static final java.lang.String DESCRIPTOR = "com.stericsson.hardware.fm.IOnExtraCommandListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.stericsson.hardware.fm.IOnExtraCommandListener interface,
         * generating a proxy if needed.
         */
        public static com.stericsson.hardware.fm.IOnExtraCommandListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.stericsson.hardware.fm.IOnExtraCommandListener))) {
                return ((com.stericsson.hardware.fm.IOnExtraCommandListener) iin);
            }
            return new com.stericsson.hardware.fm.IOnExtraCommandListener.Stub.Proxy(obj);
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
                case TRANSACTION_onExtraCommand: {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    android.os.Bundle _arg1;
                    if ((0 != data.readInt())) {
                        _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg1 = null;
                    }
                    this.onExtraCommand(_arg0, _arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.stericsson.hardware.fm.IOnExtraCommandListener {
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
            public void onExtraCommand(java.lang.String response, android.os.Bundle extras) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(response);
                    if ((extras != null)) {
                        _data.writeInt(1);
                        extras.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_onExtraCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onExtraCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public void onExtraCommand(java.lang.String response, android.os.Bundle extras) throws android.os.RemoteException;
}
