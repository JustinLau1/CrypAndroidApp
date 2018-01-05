package cafe.adriel.cryp.view

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatFragment
import com.evernote.android.state.StateSaver

abstract class BaseFragment : MvpAppCompatFragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StateSaver.restoreInstanceState(this, savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        StateSaver.saveInstanceState(this, outState)
    }

}