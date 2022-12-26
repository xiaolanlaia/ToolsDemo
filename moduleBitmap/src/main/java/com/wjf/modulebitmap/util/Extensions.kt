package com.wjf.modulebitmap

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Environment
import android.util.Base64
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/11/25 17:00
 */

/**
 * Base64字符串转Bitmap
 */
fun String.strToBitmap(): Bitmap? {
    //将字符串转换成Bitmap类型
    var bitmap: Bitmap? = null
    try {
        val bitmapArray: ByteArray = Base64.decode(this, Base64.DEFAULT)
        bitmap = BitmapFactory.decodeByteArray(bitmapArray, 0, bitmapArray.size)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return bitmap
}

/**
 * 保存Bitmap图片到本地
 */
fun Bitmap.saveToLocal(folderName: String, fileName: String) {
    var filePath = Environment.getExternalStorageDirectory().absolutePath
    val file = File(filePath, folderName)
    if (!file.exists()) {
        file.mkdirs()
    }

    try {
        val fos = FileOutputStream(File(file, fileName))
        this.compress(Bitmap.CompressFormat.JPEG, 100, fos)
        fos.flush()
        fos.close()
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}