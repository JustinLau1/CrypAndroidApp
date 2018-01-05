package cafe.adriel.cryp.view

import android.support.annotation.StringRes
import cafe.adriel.cryp.model.entity.MessageType
import com.arellomobile.mvp.MvpView

interface IView : MvpView {

    fun showMessage(@StringRes messageRes: Int, type: MessageType = MessageType.DEFAULT)
    fun showMessage(message: String, type: MessageType = MessageType.DEFAULT)

    fun showProgressDialog(title: String, message: String)
    fun hideProgressDialog()

}