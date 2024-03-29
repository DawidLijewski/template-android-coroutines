package lijewski.template.presentation.main

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {
    val isLoading = ObservableBoolean(false)

    override fun onCleared() {
    }

}
