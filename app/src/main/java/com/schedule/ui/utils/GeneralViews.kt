package com.schedule.ui.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import com.schedule.ui.strings.Strings

@Composable
fun FredButton(click: () -> Unit, inf: String, modifier: Modifier = Modifier) {
    Button(click, modifier) { Text(inf, fontFamily = FontFamily.Serif) }
}
@Composable
fun FredIconButton(click: () -> Unit, image: ImageVector, description: String, modifier: Modifier = Modifier){
    IconButton(click, modifier) { Icon(image, description) }
}
@Composable
fun FredTextField(value: String, onChangeNumber: (String) -> Unit, id: String, modifier: Modifier = Modifier) {
    TextField(
        value,
        onChangeNumber,
        modifier,
        label = { Text(id, fontFamily = FontFamily.Serif) },
        shape = MaterialTheme.shapes.medium,
        colors = OutlinedTextFieldDefaults.colors()
    )
}
@Composable
fun FredOTF(value: String, onChangeNumber: (String) -> Unit, id: String, keyboardType: KeyboardType, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onChangeNumber,
        modifier,
        label = { Text(id, fontFamily = FontFamily.Serif) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        shape = MaterialTheme.shapes.medium,
        colors = OutlinedTextFieldDefaults.colors()
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FredSearchBar(
    searchItem: String,
    onSearchItemChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    isActive: Boolean,
    onActiveChange: (Boolean) -> Unit
) {
    SearchBar(
        query = searchItem,
        onQueryChange = onSearchItemChange,
        onSearch = onSearch,
        active = isActive,
        onActiveChange = onActiveChange,
        Modifier.fillMaxWidth(),
        placeholder = { Text(Strings.search) },
        trailingIcon = { Icon(Icons.Default.Search, Strings.search) },
        shape = MaterialTheme.shapes.medium
    ) {

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FredTopBar(header: String, openDrawer: () -> Unit) {
    TopAppBar({ Text(header) }, Modifier.fillMaxWidth(), { FredIconButton(openDrawer, Icons.Default.Menu, Strings.openDrawer) })
}
@Composable
fun FredTextTitle(title: String) {
    Text(
        title,
        fontSize = MaterialTheme.typography.displayMedium.fontSize,
        fontStyle = MaterialTheme.typography.displayMedium.fontStyle,
        fontFamily = FontFamily.SansSerif
    )
}