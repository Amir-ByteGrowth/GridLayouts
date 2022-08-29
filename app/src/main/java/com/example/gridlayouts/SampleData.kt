package com.example.gridlayouts

class SampleData {
    companion object {
        var gridItemLis = listOf(
            GridItemData(1, "Breathing", R.drawable.breathing),
            GridItemData(2, "Fitness", R.drawable.fitness),
            GridItemData(3, "Holding", R.drawable.holding),
            GridItemData(4, "Standing", R.drawable.standing),
            GridItemData(5, "Stretching", R.drawable.stretching),
            GridItemData(6, "Yoga", R.drawable.yoga),
            GridItemData(1, "Breathing", R.drawable.breathing),
            GridItemData(2, "Fitness", R.drawable.fitness),
            GridItemData(3, "Holding", R.drawable.holding),
            GridItemData(4, "Standing", R.drawable.standing),
            GridItemData(5, "Stretching", R.drawable.stretching),
            GridItemData(6, "Yoga", R.drawable.yoga)
        )
    }
}

data class GridItemData(val id: Int, val name: String, val resourceId: Int)