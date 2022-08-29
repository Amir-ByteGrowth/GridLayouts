package com.example.gridlayouts.grids.lazyverticalgridprep

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gridlayouts.GridItemData
import com.example.gridlayouts.SampleData

@Composable
fun CreateVerticalGridAdaptive(modifier: Modifier = Modifier) {
    val scrollState = rememberLazyGridState()

    LazyVerticalGrid(

        columns = GridCells.Adaptive(100.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier.padding(horizontal = 20.dp, vertical = 20.dp),
        state = scrollState

    ) {

        items(items = SampleData.gridItemLis) { item ->
            VerticalGridItem(item = item)
        }
    }


}
@Composable
fun CreateVerticalGridFixedCell(modifier: Modifier = Modifier) {
    val scrollState = rememberLazyGridState()

    LazyVerticalGrid(

        columns = GridCells.Adaptive(100.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier.padding(horizontal = 20.dp, vertical = 20.dp),
        state = scrollState

    ) {

        items(items = SampleData.gridItemLis) { item ->
            VerticalGridItem(item = item)
        }
    }


}

@Composable
fun VerticalGridItem(modifier: Modifier = Modifier, item: GridItemData) {

    Card(elevation = 2.dp, shape = RoundedCornerShape(10.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = item.resourceId),
                modifier = modifier
                    .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                    .size(120.dp),
                contentScale = ContentScale.Crop,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = item.name, modifier = modifier.padding(bottom = 15.dp, top = 5.dp))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewVerticalGrid() {
    CreateVerticalGridAdaptive()
}

