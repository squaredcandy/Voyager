package cafe.adriel.voyager.sample.androidViewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import cafe.adriel.voyager.sample.sampleItems

class AndroidListViewModel(private val handle: SavedStateHandle) : ViewModel() {

    init {
        handle["items"] = sampleItems
    }

    val items: List<String>
        get() = handle["items"] ?: error("Items not found")
}
