package io.github.jerrymatera.explore.presentation.home_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import io.github.jerrymatera.explore.domain.model.Country
import io.github.jerrymatera.explore.presentation.ui.theme.ExploreTheme

@Composable
fun CountryItem(
    country: Country,
    onItemClick: (Country) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onItemClick(country) }
            .padding(16.dp)
    ) {
        AsyncImage(
            model = country.flagImage,
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = modifier) {
            Text(
                text = country.name,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
            )
            Text(
                text = country.capital,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
            )
        }
    }
}