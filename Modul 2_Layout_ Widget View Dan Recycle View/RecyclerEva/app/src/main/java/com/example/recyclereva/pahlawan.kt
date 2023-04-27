package com.example.recyclereva

import android.os.Parcel
import android.os.Parcelable

data class pahlawan(val image:Int, val name:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<pahlawan> {
        override fun createFromParcel(parcel: Parcel): pahlawan {
            return pahlawan(parcel)
        }

        override fun newArray(size: Int): Array<pahlawan?> {
            return arrayOfNulls(size)
        }
    }
}
